package com.demo.webservice.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

import com.demo.webservice.bean.RequestBeanWS;
import com.demo.webservice.bean.ResponseBeanWS;

public class WebserviceTestLocal {
	
//	public static void main(String[] args) {
//		Endpoint.publish("http://localhost:8080/ab/service/SayHi", new WebserviceSerImp());
//		
//	}
	/**
	 * webservice 接口demo测试 client
	 * @author AB049399
	 *
	 */
	public static void main(String[] args) { 
//		try {
////		String endpoint = "http://localhost:8080/ab/services/webservice";
//			String endpoint = "http://localhost:8080/webservice/services/AgentInfoServer";
//		Service service = new Service();
//		Call call;
//		call = (Call)service.createCall();
//		
////		call.setOperationName(new QName("http://webService.bbdh.ab.com/", "testWebsServiceOne"));//
////		call.setOperationName(new QName("http://webService.bbdh.ab.com/", "testWebsServiceNull"));
//		call.setOperationName(new QName("http://impl.webService.bbdh.ab.com", "testWebsServiceNull"));
//		call.setTargetEndpointAddress(new URL(endpoint));//HashMap.class
////		XSD_ANYTYPE
//		
////		call.addParameter("inputs",org.apache.axis.encoding.XMLType.SOAP_MAP,javax.xml.rpc.ParameterMode.IN) ;
////		call.addParameter("inputs",org.apache.axis.encoding.XMLType.XSD_ANYTYPE,javax.xml.rpc.ParameterMode.IN) ;
////		call.addParameter("age",org.apache.axis.encoding.XMLType.XSD_INT,javax.xml.rpc.ParameterMode.IN) ;
////		call.setReturnType(XMLType.XSD_INT) ;
//		
////		call.setProperty("userName", "sunny");
////		call.setProperty("password", "sunny");
//
////		call.setUseSOAPAction(true);
//        //call.setSOAPActionURI("http://impl.webservice.hs.com");
//		call.invoke(new Object[]{});
////		System.out.println(res.toString());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
//			String endpoint = "http://localhost:8080/ab/services/webservice";
				String endpoint = "http://localhost:8888/webservice/services/demoServer";
			Service service = new Service();
			Call call;
			call = (Call)service.createCall();
			
//			call.setOperationName(new QName("http://webService.bbdh.ab.com/", "testWebsServiceOne"));//
//			call.setOperationName(new QName("http://webService.bbdh.ab.com/", "testWebsServiceNull"));
			call.setOperationName(new QName("http://cn.com.demoServer", "testWebsServiceTwo"));
//			call.setOperationName(new QName("http://impl.webService.bbdh.ab.com", "testWebsServicetwo"));
			call.setTargetEndpointAddress(new URL(endpoint));//HashMap.class
			
			QName qn = new QName("http://cn.com.demoServer", "CxBBSlsRelaBean" );                  
//			call.registerTypeMapping(CxBBSlsRelaBean.class,qn,  
//			       new BeanSerializerFactory(CxBBSlsRelaBean.class, qn),  
//			       new BeanDeserializerFactory(CxBBSlsRelaBean.class, qn));  
			               
			QName qn2 = new QName("http://cn.com.demoServer", "RequestBeanWS" );    
			call.registerTypeMapping(RequestBeanWS.class,qn2,  
			      new BeanSerializerFactory(RequestBeanWS.class, qn2),  
			      new BeanDeserializerFactory(RequestBeanWS.class, qn2));  
			              
			QName qn3 = new QName("http://cn.com.demoServer", "ResponseBeanWS" );    
			call.registerTypeMapping(ResponseBeanWS.class,qn3,  
			      new BeanSerializerFactory(ResponseBeanWS.class, qn3),  
			      new BeanDeserializerFactory(ResponseBeanWS.class, qn3));

//			XSD_ANYTYPE
			
//			call.addParameter("inputs",org.apache.axis.encoding.XMLType.SOAP_MAP,javax.xml.rpc.ParameterMode.IN) ;
//			call.addParameter("inputs",org.apache.axis.encoding.XMLType.XSD_ANYTYPE,javax.xml.rpc.ParameterMode.IN) ;
//			call.addParameter("age",org.apache.axis.encoding.XMLType.XSD_INT,javax.xml.rpc.ParameterMode.IN) ;
			call.addParameter( "inputs", qn2, ParameterMode.IN );  
//			call.setReturnType(XMLType.XSD_INT) ;
			call.setReturnClass(ResponseBeanWS.class);
			
//			call.setProperty("userName", "sunny");
//			call.setProperty("password", "sunny");

//			call.setUseSOAPAction(true);
	        //call.setSOAPActionURI("http://impl.webservice.hs.com");
			
			RequestBeanWS input = new RequestBeanWS();
			input.setUserCode("sunny1");
			input.setServiceN("sunny2");
			input.setFunctionN("sunny3");
			input.setPassword("sunny4");
			
			ResponseBeanWS res=(ResponseBeanWS)call.invoke(new Object[]{input});
			System.out.println(res.toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
//		try {
////			String endpoint = "http://localhost:8080/ab/services/webservice";
//				String endpoint = "http://localhost:8080/webservice/services/CxBBSlsRelaInputServer";
//			Service service = new Service();
//			Call call;
//			call = (Call)service.createCall();
//			
////			call.setOperationName(new QName("http://webService.bbdh.ab.com/", "testWebsServiceOne"));//
////			call.setOperationName(new QName("http://webService.bbdh.ab.com/", "testWebsServiceNull"));
//			call.setOperationName(new QName("http://localhost:8080/webservice/services/CxBBSlsRelaInputServer", "testWebsServiceTwo"));
//			
////			call.setOperationName(new QName("http://localhost:8080/webservice/services/CxBBSlsRelaInputServer", "testWebsServiceOne"));
////			call.setOperationName(new QName("http://impl.webService.bbdh.ab.com", "testWebsServicetwo"));
//			call.setTargetEndpointAddress(new URL(endpoint));//HashMap.class
//			
//			
//			               
//			QName qn2 = new QName("http://localhost:8080/webservice/services/CxBBSlsRelaInputServer", "RequestBeanWS" );    
//			call.registerTypeMapping(RequestBeanWS.class,qn2,  
//			      new BeanSerializerFactory(RequestBeanWS.class, qn2),  
//			      new BeanDeserializerFactory(RequestBeanWS.class, qn2));  
//			              
//			QName qn3 = new QName("http://localhost:8080/webservice/services/CxBBSlsRelaInputServer", "ResponseBeanWS" );    
//			call.registerTypeMapping(ResponseBeanWS.class,qn3,  
//			      new BeanSerializerFactory(ResponseBeanWS.class, qn3),  
//			      new BeanDeserializerFactory(ResponseBeanWS.class, qn3));
//			
//			QName qn = new QName("http://localhost:8080/webservice/services/CxBBSlsRelaInputServer", "CxBBSlsRelaBean" );                  
//			call.registerTypeMapping(CxBBSlsRelaBean.class,qn,  
//			       new BeanSerializerFactory(CxBBSlsRelaBean.class, qn),  
//			       new BeanDeserializerFactory(CxBBSlsRelaBean.class, qn));  
//
////			XSD_ANYTYPE
//			
////			call.addParameter("inputs",org.apache.axis.encoding.XMLType.SOAP_MAP,javax.xml.rpc.ParameterMode.IN) ;
////			call.addParameter("inputs",org.apache.axis.encoding.XMLType.XSD_ANYTYPE,javax.xml.rpc.ParameterMode.IN) ;
////			call.addParameter("age",org.apache.axis.encoding.XMLType.XSD_INT,javax.xml.rpc.ParameterMode.IN) ;
//			call.addParameter( "inputs", qn, ParameterMode.IN );  
////			call.setReturnType(XMLType.XSD_INT) ;
//			call.setReturnClass(ResponseBeanWS.class);
//			
////			call.setProperty("userName", "sunny");
////			call.setProperty("password", "sunny");
//
////			call.setUseSOAPAction(true);
//	        //call.setSOAPActionURI("http://impl.webservice.hs.com");
//			
//			CxBBSlsRelaBean input = new CxBBSlsRelaBean();
//			
//			RequestBeanWS inputresq = new RequestBeanWS();
//			inputresq.setUserCode("sunny1");
//			inputresq.setServiceN("sunny2");
//			inputresq.setFunctionN("sunny3");
//			
//			input.setPassword("sunny4");
//			input.setUserName("sunny");
//			input.setRequestWs(inputresq);
//			call.invoke(new Object[]{input});
////			System.out.println(res.toString());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}

}
