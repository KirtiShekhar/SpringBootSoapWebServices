package com.springboot.soap.webservices.db.crud.webService;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.soap.webservices.db.crud.dto.CreateEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.CreateEmployeeResponse;
import com.springboot.soap.webservices.db.crud.dto.DeleteEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.DeleteEmployeeResponse;
import com.springboot.soap.webservices.db.crud.dto.GetEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.GetEmployeeResponse;
import com.springboot.soap.webservices.db.crud.dto.UpdateEmployeeRequest;
import com.springboot.soap.webservices.db.crud.dto.UpdateEmployeeResponse;
import com.springboot.soap.webservices.db.crud.entity.Employee;
import com.springboot.soap.webservices.db.crud.repository.EmployeeRepository;

@Service
public class EmployeeSoapWebServiceImplementation implements EmployeeSoapWebService 
{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public GetEmployeeResponse getEmployee(GetEmployeeRequest employeeGetRequest) 
	{
		GetEmployeeResponse getEmployeeResponse = new GetEmployeeResponse();
		Employee optionalEmployee = employeeRepository.findById(employeeGetRequest.getEmployeeId()).get();
		BeanUtils.copyProperties(optionalEmployee, getEmployeeResponse);
		return getEmployeeResponse;
	}

	@Override
	public CreateEmployeeResponse createEmployee(CreateEmployeeRequest employeeCreateRequest) {
		Employee employee = new Employee();
		CreateEmployeeResponse createEmployeeResponse = new CreateEmployeeResponse();
		BeanUtils.copyProperties(employeeCreateRequest, employee);
		Employee savedEmployee = employeeRepository.save(employee);
		BeanUtils.copyProperties(savedEmployee,createEmployeeResponse);
		createEmployeeResponse.setCreateEmployeeResponseMessage("New Employee Saved Successfully");
		return createEmployeeResponse;
	}

	@Override
	public UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest employeeUpdateRequest) {
		Employee employee = new Employee();
		UpdateEmployeeResponse updateEmployeeResponse = new UpdateEmployeeResponse();
		BeanUtils.copyProperties(employeeUpdateRequest, employee);
		Employee savedEmployee = employeeRepository.save(employee);
		BeanUtils.copyProperties(savedEmployee,updateEmployeeResponse);
		updateEmployeeResponse.setUpdateEmployeeResponseMessage("Existing Employee Updated Successfully");
		return updateEmployeeResponse;
	}

	@Override
	public DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest employeeDeleteRequest) {
		DeleteEmployeeResponse deleteEmployeeResponse = new DeleteEmployeeResponse();
		employeeRepository.deleteById(employeeDeleteRequest.getEmployeeId());
		deleteEmployeeResponse.setEmployeeId(employeeDeleteRequest.getEmployeeId());
		deleteEmployeeResponse.setDeleteEmployeeResponseMessage("Employee Deleted Successfully with employeeId : " + employeeDeleteRequest.getEmployeeId());
		return deleteEmployeeResponse;
	}

}
