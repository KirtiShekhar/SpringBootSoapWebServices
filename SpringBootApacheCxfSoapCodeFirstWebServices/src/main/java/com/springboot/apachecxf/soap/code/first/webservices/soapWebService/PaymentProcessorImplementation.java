package com.springboot.apachecxf.soap.code.first.webservices.soapWebService;

import com.springboot.apachecxf.soap.code.first.webservices.soapDto.PaymentProcessorRequest;
import com.springboot.apachecxf.soap.code.first.webservices.soapDto.PaymentProcessorResponse;

public class PaymentProcessorImplementation implements PaymentProcessor {

	public PaymentProcessorResponse processPayment(PaymentProcessorRequest paymentProcessorRequest) {
		PaymentProcessorResponse paymentProcessorResponse = new PaymentProcessorResponse();
		// Business Logic or a call to a Business Logic Class Goes Here.
		paymentProcessorResponse.setResult(true);
		return paymentProcessorResponse;
	}

}
