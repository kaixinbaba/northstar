/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcVerifyCustInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcVerifyCustInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcVerifyCustInfoField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcVerifyCustInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCustomerName(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcVerifyCustInfoField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcVerifyCustInfoField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcVerifyCustInfoField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcVerifyCustInfoField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcVerifyCustInfoField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcVerifyCustInfoField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcVerifyCustInfoField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcVerifyCustInfoField_CustType_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcVerifyCustInfoField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcVerifyCustInfoField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcVerifyCustInfoField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcVerifyCustInfoField(), true);
  }

}
