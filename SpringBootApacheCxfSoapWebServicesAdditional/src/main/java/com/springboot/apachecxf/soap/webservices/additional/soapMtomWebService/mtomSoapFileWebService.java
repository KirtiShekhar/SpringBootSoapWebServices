package com.springboot.apachecxf.soap.webservices.additional.soapMtomWebService;

import org.apache.cxf.feature.Features;

import jakarta.activation.DataHandler;
import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.WebParam;

@WebService(name = "mtomSoapFileWebServiceAdditional",serviceName = "mtomSoapFileAdditionalService")
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public interface mtomSoapFileWebService 
{
	@WebMethod(operationName = "mtomSoapFileAdditionalUploadAttachment")
	void uploadFileAttachment(@WebParam(name = "fileAttachment") DataHandler fileAttachmentHandler);
	
	@WebMethod(operationName = "mtomSoapFileAdditionalDownloadAttachment")
	@WebResult(name = "mtomSoapFileAdditionalDownloadAttachmentStatus")	DataHandler downloadFileAttachment();
}
