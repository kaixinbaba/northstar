/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcCFMMCTradingAccountTokenField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCFMMCTradingAccountTokenField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCFMMCTradingAccountTokenField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcCFMMCTradingAccountTokenField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcCFMMCTradingAccountTokenField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcCFMMCTradingAccountTokenField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcCFMMCTradingAccountTokenField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcCFMMCTradingAccountTokenField_ParticipantID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcCFMMCTradingAccountTokenField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcCFMMCTradingAccountTokenField_AccountID_get(swigCPtr, this);
  }

  public void setKeyID(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcCFMMCTradingAccountTokenField_KeyID_set(swigCPtr, this, value);
  }

  public int getKeyID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcCFMMCTradingAccountTokenField_KeyID_get(swigCPtr, this);
  }

  public void setToken(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcCFMMCTradingAccountTokenField_Token_set(swigCPtr, this, value);
  }

  public String getToken() {
    return jctpv6v3v16x64apiJNI.CThostFtdcCFMMCTradingAccountTokenField_Token_get(swigCPtr, this);
  }

  public CThostFtdcCFMMCTradingAccountTokenField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcCFMMCTradingAccountTokenField(), true);
  }

}
