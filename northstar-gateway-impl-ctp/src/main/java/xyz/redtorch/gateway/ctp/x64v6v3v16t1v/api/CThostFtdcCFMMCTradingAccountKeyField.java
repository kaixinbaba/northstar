/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcCFMMCTradingAccountKeyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCFMMCTradingAccountKeyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCFMMCTradingAccountKeyField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcCFMMCTradingAccountKeyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCTradingAccountKeyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCTradingAccountKeyField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCTradingAccountKeyField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCTradingAccountKeyField_ParticipantID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCTradingAccountKeyField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCTradingAccountKeyField_AccountID_get(swigCPtr, this);
  }

  public void setKeyID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCTradingAccountKeyField_KeyID_set(swigCPtr, this, value);
  }

  public int getKeyID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCTradingAccountKeyField_KeyID_get(swigCPtr, this);
  }

  public void setCurrentKey(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCTradingAccountKeyField_CurrentKey_set(swigCPtr, this, value);
  }

  public String getCurrentKey() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcCFMMCTradingAccountKeyField_CurrentKey_get(swigCPtr, this);
  }

  public CThostFtdcCFMMCTradingAccountKeyField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcCFMMCTradingAccountKeyField(), true);
  }

}
