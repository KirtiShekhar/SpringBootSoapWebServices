package com.springboot.apachecxf.soap.wsdl.webservices.configuration;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import jakarta.xml.ws.Endpoint;
import com.springboot.apachecxf.soap.wsdl.webservices.service.CustomerOrdersSoapWebServiceImplementation;

@Configuration
public class CustomerOrderSoapWebServiceConfiguration 
{
	@Autowired
	private Bus bus;

	@Bean
    public Endpoint endpoint()
    {
        Endpoint endpoint = new EndpointImpl(bus, new CustomerOrdersSoapWebServiceImplementation());
        endpoint.publish("/customerOrderService");
        return endpoint;
    }

}
