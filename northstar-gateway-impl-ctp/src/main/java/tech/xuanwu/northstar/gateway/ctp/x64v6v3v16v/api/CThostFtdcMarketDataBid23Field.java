/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcMarketDataBid23Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataBid23Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBid23Field obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcMarketDataBid23Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBidPrice2(double value) {
    jctpv6v3v16x64apiJNI.CThostFtdcMarketDataBid23Field_BidPrice2_set(swigCPtr, this, value);
  }

  public double getBidPrice2() {
    return jctpv6v3v16x64apiJNI.CThostFtdcMarketDataBid23Field_BidPrice2_get(swigCPtr, this);
  }

  public void setBidVolume2(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcMarketDataBid23Field_BidVolume2_set(swigCPtr, this, value);
  }

  public int getBidVolume2() {
    return jctpv6v3v16x64apiJNI.CThostFtdcMarketDataBid23Field_BidVolume2_get(swigCPtr, this);
  }

  public void setBidPrice3(double value) {
    jctpv6v3v16x64apiJNI.CThostFtdcMarketDataBid23Field_BidPrice3_set(swigCPtr, this, value);
  }

  public double getBidPrice3() {
    return jctpv6v3v16x64apiJNI.CThostFtdcMarketDataBid23Field_BidPrice3_get(swigCPtr, this);
  }

  public void setBidVolume3(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcMarketDataBid23Field_BidVolume3_set(swigCPtr, this, value);
  }

  public int getBidVolume3() {
    return jctpv6v3v16x64apiJNI.CThostFtdcMarketDataBid23Field_BidVolume3_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBid23Field() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcMarketDataBid23Field(), true);
  }

}
