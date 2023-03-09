package com.springboot.apachecxf.soap.webservices.additional.soapDto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "RideInfoRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class RideInfoRequest 
{
	@XmlElement(name = "rideInfo",required = true)
	private RideInfo rideInfo;
	@XmlElement(name = "amount")
	private Double amount;
	
	
	public RideInfo getRideInfo() {
		return rideInfo;
	}
	public void setRideInfo(RideInfo rideInfo) {
		this.rideInfo = rideInfo;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
