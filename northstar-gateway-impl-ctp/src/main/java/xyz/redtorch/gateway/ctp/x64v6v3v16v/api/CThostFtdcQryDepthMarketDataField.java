/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcQryDepthMarketDataField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryDepthMarketDataField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryDepthMarketDataField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcQryDepthMarketDataField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryDepthMarketDataField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryDepthMarketDataField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryDepthMarketDataField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryDepthMarketDataField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcQryDepthMarketDataField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcQryDepthMarketDataField(), true);
  }

}
