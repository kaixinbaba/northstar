/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcInvestorWithdrawAlgorithmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorWithdrawAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorWithdrawAlgorithmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcInvestorWithdrawAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_InvestorID_get(swigCPtr, this);
  }

  public void setUsingRatio(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio_set(swigCPtr, this, value);
  }

  public double getUsingRatio() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_UsingRatio_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_CurrencyID_get(swigCPtr, this);
  }

  public void setFundMortgageRatio(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_FundMortgageRatio_set(swigCPtr, this, value);
  }

  public double getFundMortgageRatio() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInvestorWithdrawAlgorithmField_FundMortgageRatio_get(swigCPtr, this);
  }

  public CThostFtdcInvestorWithdrawAlgorithmField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcInvestorWithdrawAlgorithmField(), true);
  }

}
