/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcQryUserSessionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryUserSessionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryUserSessionField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcQryUserSessionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryUserSessionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryUserSessionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryUserSessionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryUserSessionField_SessionID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryUserSessionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryUserSessionField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcQryUserSessionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcQryUserSessionField_UserID_get(swigCPtr, this);
  }

  public CThostFtdcQryUserSessionField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcQryUserSessionField(), true);
  }

}
