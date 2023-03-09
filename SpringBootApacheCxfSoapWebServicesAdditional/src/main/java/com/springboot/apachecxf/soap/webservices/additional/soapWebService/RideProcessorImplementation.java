package com.springboot.apachecxf.soap.webservices.additional.soapWebService;

import com.springboot.apachecxf.soap.webservices.additional.soapDto.RideInfoRequest;
import com.springboot.apachecxf.soap.webservices.additional.soapDto.RideInfoResponse;
import com.springboot.apachecxf.soap.webservices.additional.soapException.SoapServiceException;

public class RideProcessorImplementation implements RideProcessor {

	@Override
	public RideInfoResponse bookRide(RideInfoRequest rideInfoRequest) throws SoapServiceException{
		RideInfoResponse rideInfoResponse = new RideInfoResponse();
		if (rideInfoRequest.getRideInfo().getFrom() == null || rideInfoRequest.getRideInfo().getTo().length() == 0
				|| rideInfoRequest.getRideInfo().getCost() == 0) {
			throw new SoapServiceException("invalid input");
		}
		// Business Logic or a call to a Business Logic Class Goes Here.
		rideInfoResponse.setRideAccepted(true);
		return rideInfoResponse;
	}

}
