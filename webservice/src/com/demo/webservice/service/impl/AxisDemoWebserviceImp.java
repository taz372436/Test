package com.demo.webservice.service.impl;

import com.demo.webservice.bean.RequestBeanWS;
import com.demo.webservice.bean.ResponseBeanWS;
import com.demo.webservice.service.AxisDemoWebservice;

/**
 * webservice 接口demo测试 接口 实现类
 * @author AB049399
 *
 */
//@WebService(endpointInterface = "com.ab.bbdh.webService.CxBBSlsRelaInputWebservice")
//@SOAPBinding(style = SOAPBinding.Style.RPC)
public class AxisDemoWebserviceImp implements AxisDemoWebservice {

//	public void testWebsServiceNull() {
//		
//		 System.out.println("Hi, World!");
//	}

//	public void testWebsServiceOne(RequestBeanWS inputs) {
//		// TODO Auto-generated method stub
//		if(inputs == null){
//			System.out.println("输入参数为空!");
//		}
//		String userName = (String) inputs.getUserCode();
//		String password = (String) inputs.getPassword();
//		
////		RequestBeanWS resq = inputs.getRequestID();
//		
////		String ServiceN = resq.getServiceN();
//		System.out.println("@用户名为："+userName+"\n@密码是："+password
//				+"\n@ServiceN=");
//	}

	public ResponseBeanWS testWebsServiceTwo(RequestBeanWS inputs) {
		// TODO Auto-generated method stub
		String functionN = (String) inputs.getFunctionN();
		String serviceN = (String) inputs.getServiceN();
		String userCode = (String) inputs.getUserCode();
		String password = (String) inputs.getPassword();
		System.out.println("@userCode为："+userCode+"\n@密码password是："+password+
				"\n@方法名functionN是："+functionN+"\n@服务名serviceN是："+serviceN);
		
		ResponseBeanWS res = new ResponseBeanWS();
		res.setReturnCode("CXBB00001");
		res.setReturnFlag(1);
		res.setReturnMessage("恭喜你，webservice demo调用成功！");
		return res;
	}

}
