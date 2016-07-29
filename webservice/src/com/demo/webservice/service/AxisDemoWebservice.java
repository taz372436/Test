package com.demo.webservice.service;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.demo.webservice.bean.RequestBeanWS;
import com.demo.webservice.bean.ResponseBeanWS;

/**
 * webservice 接口---邦邦搭伙平台
 * @author AB049399
 *
 */
//@WebService
//@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface AxisDemoWebservice {

//	@WebMethod
//	public void testWebsServiceNull();
	
//	@WebMethod@WebParam(name = "inputs")
//    public void testWebsServiceOne(CxBBSlsRelaBean inputs);
//	public void testWebsServiceOne(CxBBSlsRelaBean inputs);
	
//	@WebMethod
//	@WebResult(name = "results")
//    public String testWebsServiceTwo(CxBBSlsRelaBean inputs);
	public ResponseBeanWS testWebsServiceTwo(RequestBeanWS inputs);
}
