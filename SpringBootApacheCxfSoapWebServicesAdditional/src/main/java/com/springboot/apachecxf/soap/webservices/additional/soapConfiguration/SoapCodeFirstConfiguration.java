package com.springboot.apachecxf.soap.webservices.additional.soapConfiguration;

import java.util.HashMap;
import java.util.Map;
import jakarta.xml.ws.handler.Handler;
import java.util.ArrayList;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.wss4j.common.ConfigurationConstants;
import org.apache.wss4j.dom.WSConstants;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.apachecxf.soap.webservices.additional.soapHandlers.SoapSiteHandler;
import com.springboot.apachecxf.soap.webservices.additional.soapMtomWebService.mtomSoapFileWebServiceImplementation;
import com.springboot.apachecxf.soap.webservices.additional.soapWebService.RideProcessorImplementation;
import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.soap.SOAPBinding;

@Configuration
public class SoapCodeFirstConfiguration
{
	@Autowired
	private Bus bus;
	
	@Bean
	public Endpoint rideStatusEndpoint()
    {
		EndpointImpl rideStatusEndpoint = new EndpointImpl(bus, new RideProcessorImplementation());
        rideStatusEndpoint.publish("/bookRideAdditional");
        
        Map<String,Object> securityProperties = new HashMap<>();
        securityProperties.put(ConfigurationConstants.ACTION,ConfigurationConstants.USERNAME_TOKEN);
        securityProperties.put(ConfigurationConstants.PASSWORD_TYPE,WSConstants.PW_TEXT);
        securityProperties.put(ConfigurationConstants.PW_CALLBACK_CLASS,SoapSecurityPasswordCallback.class.getName());
        
        WSS4JInInterceptor securityWss4jInInterceptor = new WSS4JInInterceptor(securityProperties);
        rideStatusEndpoint.getInInterceptors().add(securityWss4jInInterceptor);
        
        SOAPBinding handlerSoapBinding = (SOAPBinding) rideStatusEndpoint.getBinding();
        ArrayList<Handler> handlerChain = new ArrayList<>();
        handlerChain.add(new SoapSiteHandler());
        handlerSoapBinding.setHandlerChain(handlerChain);
        
        return rideStatusEndpoint;
    }
	
	@Bean
	public Endpoint mtomFileAttachmentEndpoint()
    {
		Endpoint mtomFileAttachmentEndpoint = new EndpointImpl(bus, new mtomSoapFileWebServiceImplementation());
        mtomFileAttachmentEndpoint.publish("/mtomFileAttachmentAdditional");
        
        SOAPBinding mtomFileSoapBinding = (SOAPBinding) mtomFileAttachmentEndpoint.getBinding();
        mtomFileSoapBinding.setMTOMEnabled(true);
        return mtomFileAttachmentEndpoint;       
    }
}
