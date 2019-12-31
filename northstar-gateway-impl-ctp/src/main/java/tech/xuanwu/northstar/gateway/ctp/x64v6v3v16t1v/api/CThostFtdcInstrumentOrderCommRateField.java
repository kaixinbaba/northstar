/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcInstrumentOrderCommRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentOrderCommRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentOrderCommRateField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcInstrumentOrderCommRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setOrderCommByVolume(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_OrderCommByVolume_set(swigCPtr, this, value);
  }

  public double getOrderCommByVolume() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_OrderCommByVolume_get(swigCPtr, this);
  }

  public void setOrderActionCommByVolume(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_OrderActionCommByVolume_set(swigCPtr, this, value);
  }

  public double getOrderActionCommByVolume() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_OrderActionCommByVolume_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcInstrumentOrderCommRateField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentOrderCommRateField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcInstrumentOrderCommRateField(), true);
  }

}
