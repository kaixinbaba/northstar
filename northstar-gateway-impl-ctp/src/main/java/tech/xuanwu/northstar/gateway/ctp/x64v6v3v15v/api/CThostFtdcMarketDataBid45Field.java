/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v15v.api;

public class CThostFtdcMarketDataBid45Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataBid45Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBid45Field obj) {
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
        jctpv6v3v15x64apiJNI.delete_CThostFtdcMarketDataBid45Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBidPrice4(double value) {
    jctpv6v3v15x64apiJNI.CThostFtdcMarketDataBid45Field_BidPrice4_set(swigCPtr, this, value);
  }

  public double getBidPrice4() {
    return jctpv6v3v15x64apiJNI.CThostFtdcMarketDataBid45Field_BidPrice4_get(swigCPtr, this);
  }

  public void setBidVolume4(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcMarketDataBid45Field_BidVolume4_set(swigCPtr, this, value);
  }

  public int getBidVolume4() {
    return jctpv6v3v15x64apiJNI.CThostFtdcMarketDataBid45Field_BidVolume4_get(swigCPtr, this);
  }

  public void setBidPrice5(double value) {
    jctpv6v3v15x64apiJNI.CThostFtdcMarketDataBid45Field_BidPrice5_set(swigCPtr, this, value);
  }

  public double getBidPrice5() {
    return jctpv6v3v15x64apiJNI.CThostFtdcMarketDataBid45Field_BidPrice5_get(swigCPtr, this);
  }

  public void setBidVolume5(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcMarketDataBid45Field_BidVolume5_set(swigCPtr, this, value);
  }

  public int getBidVolume5() {
    return jctpv6v3v15x64apiJNI.CThostFtdcMarketDataBid45Field_BidVolume5_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBid45Field() {
    this(jctpv6v3v15x64apiJNI.new_CThostFtdcMarketDataBid45Field(), true);
  }

}
