package com.springboot.apachecxf.soap.webservices.db.crud.configuration;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.apachecxf.soap.webservices.db.crud.soapWebService.CourseSoapWebService;

import jakarta.xml.ws.Endpoint;

@Configuration
public class SoapWebServiceCrudConfiguration 
{
	@Autowired
	private Bus bus;
	
	@Autowired
	private CourseSoapWebService courseSoapWebService;
	
	@Bean
	public Endpoint courseCrudEndpoint()
    {
        Endpoint courseCrudEndpoint = new EndpointImpl(bus, courseSoapWebService);
        courseCrudEndpoint.publish("/courseSoapCrud");
        return courseCrudEndpoint;
    }
}
