/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcMarketDataLastMatchField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataLastMatchField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataLastMatchField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcMarketDataLastMatchField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLastPrice(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataLastMatchField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataLastMatchField_LastPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataLastMatchField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataLastMatchField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataLastMatchField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataLastMatchField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataLastMatchField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcMarketDataLastMatchField_OpenInterest_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataLastMatchField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcMarketDataLastMatchField(), true);
  }

}
