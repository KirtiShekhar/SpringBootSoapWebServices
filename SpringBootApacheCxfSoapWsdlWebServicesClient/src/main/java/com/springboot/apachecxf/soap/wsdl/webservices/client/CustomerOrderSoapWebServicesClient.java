package com.springboot.apachecxf.soap.wsdl.webservices.client;

import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.cxf.feature.Features;
import org.example.customerorders.CreateOrdersRequest;
import org.example.customerorders.CreateOrdersResponse;
import org.example.customerorders.CustomerOrdersPortType;
import org.example.customerorders.GetOrdersRequest;
import org.example.customerorders.GetOrdersResponse;
import org.example.customerorders.Order;
import com.springboot.apachecxf.soap.wsdl.webservices.service.CustomerOrdersSoapWebServiceImplementationService;

@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class CustomerOrderSoapWebServicesClient 
{

	public static void main(String[] args) throws MalformedURLException
	{
		CustomerOrdersSoapWebServiceImplementationService service = new CustomerOrdersSoapWebServiceImplementationService(
				new URL("http://localhost:9669/customerOrdersWsdlSoap/customerOrderService?wsdl"));
		CustomerOrdersPortType customerOrdersPort = service.getCustomerOrdersSoapWebServiceImplementationPort();
		
		GetOrdersRequest request = new GetOrdersRequest();
		request.setCustomerId(BigInteger.valueOf(1));
		GetOrdersResponse response = customerOrdersPort.getOrders(request);
		List<Order> orders = response.getOrder();
		System.out.println("Number of Orders for customer are :  " + orders.size());
		
		CreateOrdersRequest createRequest = new CreateOrdersRequest();
		createRequest.setCustomerId(BigInteger.valueOf(2));
		CreateOrdersResponse createResponse = customerOrdersPort.createOrders(createRequest);
		
		System.out.println("Orders for new customer created :  " + createResponse.isResult());
	}

}
