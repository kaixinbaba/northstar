/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcQueryMaxOrderVolumeWithPriceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQueryMaxOrderVolumeWithPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQueryMaxOrderVolumeWithPriceField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcQueryMaxOrderVolumeWithPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InstrumentID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Direction_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_HedgeFlag_get(swigCPtr, this);
  }

  public void setMaxVolume(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_MaxVolume_set(swigCPtr, this, value);
  }

  public int getMaxVolume() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_MaxVolume_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_Price_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQueryMaxOrderVolumeWithPriceField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcQueryMaxOrderVolumeWithPriceField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcQueryMaxOrderVolumeWithPriceField(), true);
  }

}
