package com.springboot.apachecxf.soap.code.first.webservices.soapWebService;

import com.springboot.apachecxf.soap.code.first.webservices.soapDto.RideInfoRequest;
import com.springboot.apachecxf.soap.code.first.webservices.soapDto.RideInfoResponse;

public class RideProcessorImplementation implements RideProcessor {

	@Override
	public RideInfoResponse bookRide(RideInfoRequest rideInfoRequest) {
		RideInfoResponse rideInfoResponse = new RideInfoResponse();
		// Business Logic or a call to a Business Logic Class Goes Here.
		rideInfoResponse.setRideAccepted(true);
		return rideInfoResponse;
	}

}
