/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcCFMMCBrokerKeyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCFMMCBrokerKeyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCFMMCBrokerKeyField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcCFMMCBrokerKeyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_ParticipantID_get(swigCPtr, this);
  }

  public void setCreateDate(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_CreateDate_set(swigCPtr, this, value);
  }

  public String getCreateDate() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_CreateDate_get(swigCPtr, this);
  }

  public void setCreateTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_CreateTime_set(swigCPtr, this, value);
  }

  public String getCreateTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_CreateTime_get(swigCPtr, this);
  }

  public void setKeyID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_KeyID_set(swigCPtr, this, value);
  }

  public int getKeyID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_KeyID_get(swigCPtr, this);
  }

  public void setCurrentKey(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_CurrentKey_set(swigCPtr, this, value);
  }

  public String getCurrentKey() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_CurrentKey_get(swigCPtr, this);
  }

  public void setKeyKind(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_KeyKind_set(swigCPtr, this, value);
  }

  public char getKeyKind() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCBrokerKeyField_KeyKind_get(swigCPtr, this);
  }

  public CThostFtdcCFMMCBrokerKeyField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcCFMMCBrokerKeyField(), true);
  }

}
