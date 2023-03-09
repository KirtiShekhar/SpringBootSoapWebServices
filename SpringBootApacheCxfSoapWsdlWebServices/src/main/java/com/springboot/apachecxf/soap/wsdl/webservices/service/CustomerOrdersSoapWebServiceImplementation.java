package com.springboot.apachecxf.soap.wsdl.webservices.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.cxf.feature.Features;
import org.example.customerorders.CreateOrdersRequest;
import org.example.customerorders.CreateOrdersResponse;
import org.example.customerorders.CustomerOrdersPortType;
import org.example.customerorders.GetOrdersRequest;
import org.example.customerorders.GetOrdersResponse;
import org.example.customerorders.Order;
import org.example.customerorders.Product;

@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class CustomerOrdersSoapWebServiceImplementation implements CustomerOrdersPortType 
{
	Map<BigInteger,List<Order>> customerOrders = new HashMap<>();
	int currentOrderId;

	public CustomerOrdersSoapWebServiceImplementation()
	{
		serviceInitMethod();
	}

	public void serviceInitMethod()
	{
		List<Order> orders = new ArrayList<>();
		Order order = new Order();
		order.setOrderId(BigInteger.valueOf(1));

		Product product = new Product();
		product.setProductId(String.valueOf(1));
		product.setProductName("Samsung S6");
		product.setProductDescription("Samsung Good Phone");
		product.setProductQuantity(BigInteger.valueOf(600));
		order.getProduct().add(product);

		orders.add(order);

		customerOrders.put(BigInteger.valueOf(++currentOrderId), orders);
	}

	@Override
	public GetOrdersResponse getOrders(GetOrdersRequest request) 
	{
		BigInteger customerId = request.getCustomerId();
		List<Order> getOrders = customerOrders.get(customerId);
		
		GetOrdersResponse response = new GetOrdersResponse();
		response.getOrder().addAll(getOrders);
		return response;
	}

	@Override
	public CreateOrdersResponse createOrders(CreateOrdersRequest request) 
	{
		BigInteger customerId = request.getCustomerId();
		Order order = request.getOrder();
		
		List<Order> orders = customerOrders.get(customerId);
		orders.add(order);
		
		CreateOrdersResponse response = new CreateOrdersResponse();
		response.setResult(true);
		
		return response;
	}

}
