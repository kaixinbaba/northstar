/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcQryExchangeRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryExchangeRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeRateField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcQryExchangeRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryExchangeRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryExchangeRateField_BrokerID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryExchangeRateField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryExchangeRateField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryExchangeRateField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryExchangeRateField_ToCurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeRateField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcQryExchangeRateField(), true);
  }

}
