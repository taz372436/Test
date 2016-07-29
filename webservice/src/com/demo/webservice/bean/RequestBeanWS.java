package com.demo.webservice.bean;

import java.io.Serializable;
/**
 * webservice 接口请求通用bean
 * @author AB049399
 *
 */
public class RequestBeanWS implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String requestID;
	public String serviceN;
	public String functionN;
	public String userCode;
	public String password;
	public String others1;
	public String others2;
	public String others3;
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getServiceN() {
		return serviceN;
	}
	public void setServiceN(String serviceN) {
		this.serviceN = serviceN;
	}
	public String getFunctionN() {
		return functionN;
	}
	public void setFunctionN(String functionN) {
		this.functionN = functionN;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOthers1() {
		return others1;
	}
	public void setOthers1(String others1) {
		this.others1 = others1;
	}
	public String getOthers2() {
		return others2;
	}
	public void setOthers2(String others2) {
		this.others2 = others2;
	}
	public String getOthers3() {
		return others3;
	}
	public void setOthers3(String others3) {
		this.others3 = others3;
	}
	

}
