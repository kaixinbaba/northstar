/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcSettlementInfoConfirmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSettlementInfoConfirmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSettlementInfoConfirmField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcSettlementInfoConfirmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_InvestorID_get(swigCPtr, this);
  }

  public void setConfirmDate(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_ConfirmDate_set(swigCPtr, this, value);
  }

  public String getConfirmDate() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_ConfirmDate_get(swigCPtr, this);
  }

  public void setConfirmTime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_ConfirmTime_set(swigCPtr, this, value);
  }

  public String getConfirmTime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_ConfirmTime_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_SettlementID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSettlementInfoConfirmField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcSettlementInfoConfirmField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcSettlementInfoConfirmField(), true);
  }

}
