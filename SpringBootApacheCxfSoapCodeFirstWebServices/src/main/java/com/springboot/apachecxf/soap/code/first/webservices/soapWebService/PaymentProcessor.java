package com.springboot.apachecxf.soap.code.first.webservices.soapWebService;

import org.apache.cxf.feature.Features;

import com.springboot.apachecxf.soap.code.first.webservices.soapDto.PaymentProcessorRequest;
import com.springboot.apachecxf.soap.code.first.webservices.soapDto.PaymentProcessorResponse;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(name = "PaymentProcessor",serviceName = "PaymentProcessorService")
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public interface PaymentProcessor 
{
	@WebMethod(operationName = "processPayment")
	public @WebResult(name = "response") PaymentProcessorResponse processPayment(@WebParam(name ="PaymentProcessorRequest")  PaymentProcessorRequest paymentProcessorRequest);
}
