/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v15v.api;

public class CThostFtdcReturnResultField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReturnResultField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReturnResultField obj) {
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
        jctpv6v3v15x64apiJNI.delete_CThostFtdcReturnResultField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReturnCode(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcReturnResultField_ReturnCode_set(swigCPtr, this, value);
  }

  public String getReturnCode() {
    return jctpv6v3v15x64apiJNI.CThostFtdcReturnResultField_ReturnCode_get(swigCPtr, this);
  }

  public void setDescrInfoForReturnCode(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcReturnResultField_DescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getDescrInfoForReturnCode() {
    return jctpv6v3v15x64apiJNI.CThostFtdcReturnResultField_DescrInfoForReturnCode_get(swigCPtr, this);
  }

  public CThostFtdcReturnResultField() {
    this(jctpv6v3v15x64apiJNI.new_CThostFtdcReturnResultField(), true);
  }

}
