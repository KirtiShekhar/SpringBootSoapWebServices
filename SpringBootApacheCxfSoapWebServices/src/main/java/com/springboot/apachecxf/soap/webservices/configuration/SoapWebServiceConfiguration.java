package com.springboot.apachecxf.soap.webservices.configuration;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import jakarta.xml.ws.Endpoint;
import com.springboot.apachecxf.soap.webservices.soapController.HelloSoapWebService;

@Configuration
public class SoapWebServiceConfiguration 
{
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint endpoint()
    {
        Endpoint endpoint = new EndpointImpl(bus, new HelloSoapWebService());
        endpoint.publish("/hello");
        return endpoint;
    }
}
