package com.springboot.apachecxf.soap.code.first.webservices.soapConfiguration;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springboot.apachecxf.soap.code.first.webservices.soapWebService.PaymentProcessorImplementation;
import com.springboot.apachecxf.soap.code.first.webservices.soapWebService.RideProcessorImplementation;

import jakarta.xml.ws.Endpoint;

@Configuration
public class SoapCodeFirstConfiguration
{
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint paymentProcessorEndpoint()
    {
        Endpoint paymentProcessorEndpoint = new EndpointImpl(bus, new PaymentProcessorImplementation());
        paymentProcessorEndpoint.publish("/paymentProcessor");
        return paymentProcessorEndpoint;
    }
	
	@Bean
	public Endpoint rideStatusEndpoint()
    {
        Endpoint rideStatusEndpoint = new EndpointImpl(bus, new RideProcessorImplementation());
        rideStatusEndpoint.publish("/bookRide");
        return rideStatusEndpoint;
    }
}
