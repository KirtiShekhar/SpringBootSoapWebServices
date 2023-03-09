package com.springboot.apachecxf.soap.webservices.soapController;

import org.apache.cxf.feature.Features;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloSoapWebService 
{
	@WebMethod
	public String hello()
    {
        return "Hello";
    }
}
