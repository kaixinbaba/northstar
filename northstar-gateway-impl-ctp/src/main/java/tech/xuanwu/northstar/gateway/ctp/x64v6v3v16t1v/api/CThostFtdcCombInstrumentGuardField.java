/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcCombInstrumentGuardField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCombInstrumentGuardField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCombInstrumentGuardField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcCombInstrumentGuardField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCombInstrumentGuardField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCombInstrumentGuardField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCombInstrumentGuardField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCombInstrumentGuardField_InstrumentID_get(swigCPtr, this);
  }

  public void setGuarantRatio(double value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCombInstrumentGuardField_GuarantRatio_set(swigCPtr, this, value);
  }

  public double getGuarantRatio() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCombInstrumentGuardField_GuarantRatio_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCombInstrumentGuardField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCombInstrumentGuardField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcCombInstrumentGuardField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcCombInstrumentGuardField(), true);
  }

}
