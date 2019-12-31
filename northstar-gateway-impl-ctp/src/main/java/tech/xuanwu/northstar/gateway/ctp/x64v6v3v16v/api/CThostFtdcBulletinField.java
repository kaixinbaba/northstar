/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.xuanwu.northstar.gateway.ctp.x64v6v3v16v.api;

public class CThostFtdcBulletinField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBulletinField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBulletinField obj) {
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
        jctpv6v3v16x64apiJNI.delete_CThostFtdcBulletinField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_TradingDay_get(swigCPtr, this);
  }

  public void setBulletinID(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_BulletinID_set(swigCPtr, this, value);
  }

  public int getBulletinID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_BulletinID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_SequenceNo_get(swigCPtr, this);
  }

  public void setNewsType(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_NewsType_set(swigCPtr, this, value);
  }

  public String getNewsType() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_NewsType_get(swigCPtr, this);
  }

  public void setNewsUrgency(char value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_NewsUrgency_set(swigCPtr, this, value);
  }

  public char getNewsUrgency() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_NewsUrgency_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_SendTime_get(swigCPtr, this);
  }

  public void setAbstract(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_Abstract_set(swigCPtr, this, value);
  }

  public String getAbstract() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_Abstract_get(swigCPtr, this);
  }

  public void setComeFrom(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_ComeFrom_set(swigCPtr, this, value);
  }

  public String getComeFrom() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_ComeFrom_get(swigCPtr, this);
  }

  public void setContent(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_Content_set(swigCPtr, this, value);
  }

  public String getContent() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_Content_get(swigCPtr, this);
  }

  public void setURLLink(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_URLLink_set(swigCPtr, this, value);
  }

  public String getURLLink() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_URLLink_get(swigCPtr, this);
  }

  public void setMarketID(String value) {
    jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_MarketID_set(swigCPtr, this, value);
  }

  public String getMarketID() {
    return jctpv6v3v16x64apiJNI.CThostFtdcBulletinField_MarketID_get(swigCPtr, this);
  }

  public CThostFtdcBulletinField() {
    this(jctpv6v3v16x64apiJNI.new_CThostFtdcBulletinField(), true);
  }

}
