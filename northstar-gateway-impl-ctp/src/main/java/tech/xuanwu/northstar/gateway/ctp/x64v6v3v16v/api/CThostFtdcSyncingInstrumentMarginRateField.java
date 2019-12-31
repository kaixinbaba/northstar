/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcSyncingInstrumentMarginRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingInstrumentMarginRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInstrumentMarginRateField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcSyncingInstrumentMarginRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return jctpv6v3v16x64apiJNI.CThostFtdcSyncingInstrumentMarginRateField_IsRelative_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInstrumentMarginRateField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcSyncingInstrumentMarginRateField(), true);
  }

}
