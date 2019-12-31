/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcInputOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputOrderActionField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcInputOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInputOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputOrderActionField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcInputOrderActionField(), true);
  }

}
