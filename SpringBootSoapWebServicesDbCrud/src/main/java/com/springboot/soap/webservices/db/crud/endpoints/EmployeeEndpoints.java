package com.springboot.soap.webservices.db.crud.endpoints;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import com.springboot.soap.webservices.db.crud.dto.CreateEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.CreateEmployeeResponse;
import com.springboot.soap.webservices.db.crud.dto.DeleteEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.DeleteEmployeeResponse;
import com.springboot.soap.webservices.db.crud.dto.GetEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.GetEmployeeResponse;
import com.springboot.soap.webservices.db.crud.dto.UpdateEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.UpdateEmployeeResponse;
import com.springboot.soap.webservices.db.crud.entity.Employee;
import com.springboot.soap.webservices.db.crud.webService.EmployeeSoapWebService;

@Endpoint
public class EmployeeEndpoints 
{
	@Autowired
	private EmployeeSoapWebService employeeSoapWebService;
	
	@PayloadRoot(namespace = "http://crud.db.webservices.soap.springboot.com/dto",localPart = "getAllEmployee")
	@ResponsePayload
	public List<Employee> getAllEmployee() {
		return employeeSoapWebService.getAllEmployee();
	}

	@PayloadRoot(namespace = "http://crud.db.webservices.soap.springboot.com/dto",localPart = "getEmployee")
	@ResponsePayload
	public GetEmployeeResponse getEmployee(@RequestPayload GetEmployeeRequest employeeGetRequest) {
		return employeeSoapWebService.getEmployee(employeeGetRequest);
	}

	@PayloadRoot(namespace = "http://crud.db.webservices.soap.springboot.com/dto",localPart = "createEmployee")
	@ResponsePayload
	public CreateEmployeeResponse createEmployee(@RequestPayload CreateEmployeeRequest employeeCreateRequest) {
		return employeeSoapWebService.createEmployee(employeeCreateRequest);
	}

	@PayloadRoot(namespace = "http://crud.db.webservices.soap.springboot.com/dto",localPart = "updateEmployee")
	@ResponsePayload
	public UpdateEmployeeResponse updateEmployee(@RequestPayload UpdateEmployeeRequest employeeUpdateRequest) {
		return employeeSoapWebService.updateEmployee(employeeUpdateRequest);
	}

	@PayloadRoot(namespace = "http://crud.db.webservices.soap.springboot.com/dto",localPart = "deleteEmployee")
	@ResponsePayload
	public DeleteEmployeeResponse deleteEmployee(@RequestPayload DeleteEmployeeRequest employeeDeleteRequest) {
		return employeeSoapWebService.deleteEmployee(employeeDeleteRequest);
	}

}
