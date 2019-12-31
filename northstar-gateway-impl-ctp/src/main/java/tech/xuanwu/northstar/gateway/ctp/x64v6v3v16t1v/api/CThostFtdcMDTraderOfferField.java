/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcMDTraderOfferField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMDTraderOfferField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMDTraderOfferField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcMDTraderOfferField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_TraderID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ParticipantID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_OrderLocalID_get(swigCPtr, this);
  }

  public void setTraderConnectStatus(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_TraderConnectStatus_set(swigCPtr, this, value);
  }

  public char getTraderConnectStatus() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_TraderConnectStatus_get(swigCPtr, this);
  }

  public void setConnectRequestDate(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ConnectRequestDate_set(swigCPtr, this, value);
  }

  public String getConnectRequestDate() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ConnectRequestDate_get(swigCPtr, this);
  }

  public void setConnectRequestTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ConnectRequestTime_set(swigCPtr, this, value);
  }

  public String getConnectRequestTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ConnectRequestTime_get(swigCPtr, this);
  }

  public void setLastReportDate(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_LastReportDate_set(swigCPtr, this, value);
  }

  public String getLastReportDate() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_LastReportDate_get(swigCPtr, this);
  }

  public void setLastReportTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_LastReportTime_set(swigCPtr, this, value);
  }

  public String getLastReportTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_LastReportTime_get(swigCPtr, this);
  }

  public void setConnectDate(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ConnectDate_set(swigCPtr, this, value);
  }

  public String getConnectDate() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ConnectDate_get(swigCPtr, this);
  }

  public void setConnectTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ConnectTime_set(swigCPtr, this, value);
  }

  public String getConnectTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_ConnectTime_get(swigCPtr, this);
  }

  public void setStartDate(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_StartDate_set(swigCPtr, this, value);
  }

  public String getStartDate() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_StartDate_get(swigCPtr, this);
  }

  public void setStartTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_StartTime_set(swigCPtr, this, value);
  }

  public String getStartTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_StartTime_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_BrokerID_get(swigCPtr, this);
  }

  public void setMaxTradeID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_MaxTradeID_set(swigCPtr, this, value);
  }

  public String getMaxTradeID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_MaxTradeID_get(swigCPtr, this);
  }

  public void setMaxOrderMessageReference(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_MaxOrderMessageReference_set(swigCPtr, this, value);
  }

  public String getMaxOrderMessageReference() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMDTraderOfferField_MaxOrderMessageReference_get(swigCPtr, this);
  }

  public CThostFtdcMDTraderOfferField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcMDTraderOfferField(), true);
  }

}
