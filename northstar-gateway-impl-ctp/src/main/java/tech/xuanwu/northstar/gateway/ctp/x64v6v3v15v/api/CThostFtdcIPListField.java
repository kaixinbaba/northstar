/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v15v.api;

public class CThostFtdcIPListField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcIPListField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcIPListField obj) {
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
        jctpv6v3v15x64apiJNI.delete_CThostFtdcIPListField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setIPAddress(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcIPListField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v15x64apiJNI.CThostFtdcIPListField_IPAddress_get(swigCPtr, this);
  }

  public void setIsWhite(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcIPListField_IsWhite_set(swigCPtr, this, value);
  }

  public int getIsWhite() {
    return jctpv6v3v15x64apiJNI.CThostFtdcIPListField_IsWhite_get(swigCPtr, this);
  }

  public CThostFtdcIPListField() {
    this(jctpv6v3v15x64apiJNI.new_CThostFtdcIPListField(), true);
  }

}
