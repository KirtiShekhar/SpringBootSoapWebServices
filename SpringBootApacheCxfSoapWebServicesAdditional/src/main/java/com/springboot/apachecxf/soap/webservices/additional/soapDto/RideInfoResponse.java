package com.springboot.apachecxf.soap.webservices.additional.soapDto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "RideInfoResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class RideInfoResponse 
{
	@XmlElement(name = "rideAccepted")
	private boolean rideAccepted;

	public boolean isRideAccepted() {
		return rideAccepted;
	}

	public void setRideAccepted(boolean rideAccepted) {
		this.rideAccepted = rideAccepted;
	}

	
}
