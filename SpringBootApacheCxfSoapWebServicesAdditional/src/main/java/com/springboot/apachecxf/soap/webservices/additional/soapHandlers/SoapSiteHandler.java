package com.springboot.apachecxf.soap.webservices.additional.soapHandlers;

import java.util.Iterator;
import java.util.Set;
import javax.xml.namespace.QName;
import jakarta.xml.soap.Node;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.soap.SOAPMessage;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

public class SoapSiteHandler implements SOAPHandler<SOAPMessageContext> 
{

	@Override
	public boolean handleMessage(SOAPMessageContext context) 
	{
		System.out.println("handleMessage");
		
		Boolean isResponse = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(!isResponse)
		{
			SOAPMessage soapMsg = context.getMessage();
			try
			{
				SOAPEnvelope envelope = soapMsg.getSOAPPart().getEnvelope();
				SOAPHeader header = envelope.getHeader();
				Iterator childElements = header.getChildElements();
				while(childElements.hasNext())
				{
					Node eachNode = (Node) childElements.next();
					
					String serviceName = eachNode.getLocalName();
					if(serviceName != null && serviceName.equals("SiteName"))
					{
						System.out.println("Site Name is =====> " + eachNode.getValue());
					}
				}
			}
			catch(SOAPException soape)
			{
				soape.printStackTrace();
			}
		}
		
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("handleFault");
		return false;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("close");

	}

	@Override
	public Set<QName> getHeaders() {
		System.out.println("getHeaders");
		return null;
	}

}
