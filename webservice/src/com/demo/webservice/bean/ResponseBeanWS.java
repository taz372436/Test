package com.demo.webservice.bean;

import java.io.Serializable;

public class ResponseBeanWS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String requestID;
	
	public int returnFlag;//处理结果标识 (1：处理成功     0：处理失败)
	public String returnCode;//返回结果编号 由应用自行定义
	public String returnMessage; //返回结果信息 由应用自行定义，可放入提示、警告或错误信息描述
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public int getReturnFlag() {
		return returnFlag;
	}
	public void setReturnFlag(int returnFlag) {
		this.returnFlag = returnFlag;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnMessage() {
		return returnMessage;
	}
	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String toString() {
		return "requestID="+requestID+",returnFlag="+returnFlag+",returnCode="+returnCode+",returnMessage="+returnMessage;
	}

}
