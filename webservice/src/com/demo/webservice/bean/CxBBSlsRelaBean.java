package com.demo.webservice.bean;

import java.io.Serializable;

public class CxBBSlsRelaBean implements Serializable {
 
    private static final long serialVersionUID = 1L;

	String userName;
	String password;
	
	RequestBeanWS requestWs;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public CxBBSlsRelaBean(String userName,String password){  
		  this.userName = userName;  
		  this.password = password;  
	}
	
	public CxBBSlsRelaBean(){        
	}
	public RequestBeanWS getRequestWs() {
		return requestWs;
	}
	public void setRequestWs(RequestBeanWS requestWs) {
		this.requestWs = requestWs;
	} 

}
