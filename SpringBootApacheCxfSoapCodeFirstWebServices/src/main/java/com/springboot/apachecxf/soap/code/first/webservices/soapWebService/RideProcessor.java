package com.springboot.apachecxf.soap.code.first.webservices.soapWebService;

import org.apache.cxf.feature.Features;

import com.springboot.apachecxf.soap.code.first.webservices.soapDto.RideInfoRequest;
import com.springboot.apachecxf.soap.code.first.webservices.soapDto.RideInfoResponse;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(name = "RideProcessor",serviceName = "RideProcessorService")
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public interface RideProcessor 
{
	@WebMethod(operationName = "bookRide")
	public @WebResult(name = "rideStatus") RideInfoResponse bookRide(@WebParam(name ="RideInfoRequest")  RideInfoRequest rideInfoRequest);
}
