/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcSecAgentCheckModeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSecAgentCheckModeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSecAgentCheckModeField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcSecAgentCheckModeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSecAgentCheckModeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSecAgentCheckModeField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSecAgentCheckModeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSecAgentCheckModeField_BrokerID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSecAgentCheckModeField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSecAgentCheckModeField_CurrencyID_get(swigCPtr, this);
  }

  public void setBrokerSecAgentID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSecAgentCheckModeField_BrokerSecAgentID_set(swigCPtr, this, value);
  }

  public String getBrokerSecAgentID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSecAgentCheckModeField_BrokerSecAgentID_get(swigCPtr, this);
  }

  public void setCheckSelfAccount(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSecAgentCheckModeField_CheckSelfAccount_set(swigCPtr, this, value);
  }

  public int getCheckSelfAccount() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSecAgentCheckModeField_CheckSelfAccount_get(swigCPtr, this);
  }

  public CThostFtdcSecAgentCheckModeField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcSecAgentCheckModeField(), true);
  }

}
