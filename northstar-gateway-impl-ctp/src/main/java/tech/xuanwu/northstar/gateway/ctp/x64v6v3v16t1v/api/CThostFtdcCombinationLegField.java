/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcCombinationLegField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCombinationLegField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCombinationLegField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcCombinationLegField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCombInstrumentID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setLegID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_LegID_set(swigCPtr, this, value);
  }

  public int getLegID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_LegID_get(swigCPtr, this);
  }

  public void setLegInstrumentID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_LegInstrumentID_set(swigCPtr, this, value);
  }

  public String getLegInstrumentID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_LegInstrumentID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_Direction_get(swigCPtr, this);
  }

  public void setLegMultiple(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_LegMultiple_set(swigCPtr, this, value);
  }

  public int getLegMultiple() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_LegMultiple_get(swigCPtr, this);
  }

  public void setImplyLevel(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_ImplyLevel_set(swigCPtr, this, value);
  }

  public int getImplyLevel() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCombinationLegField_ImplyLevel_get(swigCPtr, this);
  }

  public CThostFtdcCombinationLegField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcCombinationLegField(), true);
  }

}
