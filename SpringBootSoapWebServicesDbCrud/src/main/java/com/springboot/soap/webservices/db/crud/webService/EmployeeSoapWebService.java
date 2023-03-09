package com.springboot.soap.webservices.db.crud.webService;

import java.util.List;

import com.springboot.soap.webservices.db.crud.dto.CreateEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.CreateEmployeeResponse;
import com.springboot.soap.webservices.db.crud.dto.DeleteEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.DeleteEmployeeResponse;
import com.springboot.soap.webservices.db.crud.dto.GetEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.GetEmployeeResponse;
import com.springboot.soap.webservices.db.crud.dto.UpdateEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.UpdateEmployeeResponse;
import com.springboot.soap.webservices.db.crud.entity.Employee;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;

@WebService(name = "Employee",serviceName = "EmployeeSoapWebService")
public interface EmployeeSoapWebService 
{
	@WebMethod(operationName = "getAllEmployee")
	@WebResult(name = "courseList") List<Employee> getAllEmployee();
	
	@WebMethod(operationName = "getEmployee")
	@WebResult(name = "Courses") GetEmployeeResponse getEmployee(@WebParam(name ="employeeGetRequest") GetEmployeeRequest employeeGetRequest);
	
	@WebMethod(operationName = "createEmployee")
	@WebResult(name = "CoursesCreateResponse") CreateEmployeeResponse createEmployee(@WebParam(name ="employeeCreateRequest") CreateEmployeeRequest employeeCreateRequest);	
	
	@WebMethod(operationName = "updateEmployee")
	@WebResult(name = "CoursesUpdateResponse") UpdateEmployeeResponse updateEmployee(@WebParam(name ="employeeUpdateRequest") UpdateEmployeeRequest employeeUpdateRequest);
	
	@WebMethod(operationName = "deleteEmployee")
	@WebResult(name = "CoursesDeleteResponse") DeleteEmployeeResponse deleteEmployee(@WebParam(name ="employeeDeleteRequest") DeleteEmployeeRequest employeeDeleteRequest);
}
