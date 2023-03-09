package com.springboot.apachecxf.soap.webservices.additional.soapWebService;

import org.apache.cxf.feature.Features;

import com.springboot.apachecxf.soap.webservices.additional.soapDto.RideInfoRequest;
import com.springboot.apachecxf.soap.webservices.additional.soapDto.RideInfoResponse;
import com.springboot.apachecxf.soap.webservices.additional.soapException.SoapServiceException;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(name = "RideProcessorAdditional", serviceName = "RideProcessorAdditionalService")
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public interface RideProcessor {
	@WebMethod(operationName = "bookRideAdditional")
	public @WebResult(name = "rideStatus") RideInfoResponse bookRide(
			@WebParam(name = "RideInfoRequest") RideInfoRequest rideInfoRequest) throws SoapServiceException;
}
