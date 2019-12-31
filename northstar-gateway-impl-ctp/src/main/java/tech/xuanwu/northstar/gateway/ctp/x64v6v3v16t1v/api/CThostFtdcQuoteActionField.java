/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcQuoteActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQuoteActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQuoteActionField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcQuoteActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_InvestorID_get(swigCPtr, this);
  }

  public void setQuoteActionRef(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_QuoteActionRef_set(swigCPtr, this, value);
  }

  public int getQuoteActionRef() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_QuoteActionRef_get(swigCPtr, this);
  }

  public void setQuoteRef(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_QuoteRef_set(swigCPtr, this, value);
  }

  public String getQuoteRef() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_QuoteRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_QuoteSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_InstallID_get(swigCPtr, this);
  }

  public void setQuoteLocalID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_QuoteLocalID_set(swigCPtr, this, value);
  }

  public String getQuoteLocalID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_QuoteLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_UserID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcQuoteActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcQuoteActionField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcQuoteActionField(), true);
  }

}
