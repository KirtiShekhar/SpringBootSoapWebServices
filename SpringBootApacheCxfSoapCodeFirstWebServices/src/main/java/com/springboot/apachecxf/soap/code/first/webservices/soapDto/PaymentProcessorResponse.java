package com.springboot.apachecxf.soap.code.first.webservices.soapDto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "PaymentProcessorResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class PaymentProcessorResponse 
{
	@XmlElement(name = "result")
	private boolean result;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
}
