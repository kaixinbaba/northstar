/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v15v.api;

public class CThostFtdcSuperUserField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSuperUserField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSuperUserField obj) {
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
        jctpv6v3v15x64apiJNI.delete_CThostFtdcSuperUserField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcSuperUserField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcSuperUserField_UserID_get(swigCPtr, this);
  }

  public void setUserName(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcSuperUserField_UserName_set(swigCPtr, this, value);
  }

  public String getUserName() {
    return jctpv6v3v15x64apiJNI.CThostFtdcSuperUserField_UserName_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcSuperUserField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v3v15x64apiJNI.CThostFtdcSuperUserField_Password_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcSuperUserField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return jctpv6v3v15x64apiJNI.CThostFtdcSuperUserField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcSuperUserField() {
    this(jctpv6v3v15x64apiJNI.new_CThostFtdcSuperUserField(), true);
  }

}
