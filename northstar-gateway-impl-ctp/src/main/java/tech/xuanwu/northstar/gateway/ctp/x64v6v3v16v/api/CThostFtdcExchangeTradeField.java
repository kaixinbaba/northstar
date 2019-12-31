/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcExchangeTradeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeTradeField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcExchangeTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradeID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_Direction_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_OrderSysID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_ClientID_get(swigCPtr, this);
  }

  public void setTradingRole(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradingRole_set(swigCPtr, this, value);
  }

  public char getTradingRole() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradingRole_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_Price_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_Volume_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradeType_get(swigCPtr, this);
  }

  public void setPriceSource(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_PriceSource_set(swigCPtr, this, value);
  }

  public char getPriceSource() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_PriceSource_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TraderID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_OrderLocalID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_ClearingPartID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_BusinessUnit_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_SequenceNo_get(swigCPtr, this);
  }

  public void setTradeSource(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradeSource_set(swigCPtr, this, value);
  }

  public char getTradeSource() {
    return jctpv6v3v16x64apiJNI.CThostFtdcExchangeTradeField_TradeSource_get(swigCPtr, this);
  }

  public CThostFtdcExchangeTradeField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcExchangeTradeField(), true);
  }

}
