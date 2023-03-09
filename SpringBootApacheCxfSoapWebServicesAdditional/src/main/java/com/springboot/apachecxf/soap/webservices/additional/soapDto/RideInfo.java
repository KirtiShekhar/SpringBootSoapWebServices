package com.springboot.apachecxf.soap.webservices.additional.soapDto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "RideInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class RideInfo 
{
	@XmlAttribute(name = "id")
	String rideId;
	@XmlElement(name = "from")
	String from;
	@XmlElement(name = "to")
	String to;
	@XmlElement(name = "cost")
	Double cost;
	public String getRideId() {
		return rideId;
	}
	public void setRideId(String rideId) {
		this.rideId = rideId;
	}
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
}
