/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcRspAuthenticateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspAuthenticateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspAuthenticateField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcRspAuthenticateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspAuthenticateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspAuthenticateField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspAuthenticateField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspAuthenticateField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspAuthenticateField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspAuthenticateField_UserProductInfo_get(swigCPtr, this);
  }

  public void setAppID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspAuthenticateField_AppID_set(swigCPtr, this, value);
  }

  public String getAppID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspAuthenticateField_AppID_get(swigCPtr, this);
  }

  public void setAppType(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcRspAuthenticateField_AppType_set(swigCPtr, this, value);
  }

  public char getAppType() {
    return jctpv6v3v16x64apiJNI.CThostFtdcRspAuthenticateField_AppType_get(swigCPtr, this);
  }

  public CThostFtdcRspAuthenticateField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcRspAuthenticateField(), true);
  }

}
