package com.springboot.soap.webservices.db.crud.endpoints;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.springboot.soap.webservices.db.crud.dto.CreateCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.CreateCompanyResponse;
import com.springboot.soap.webservices.db.crud.dto.DeleteCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.DeleteCompanyResponse;
import com.springboot.soap.webservices.db.crud.dto.GetCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.GetCompanyResponse;
import com.springboot.soap.webservices.db.crud.dto.UpdateCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.UpdateCompanyResponse;
import com.springboot.soap.webservices.db.crud.entity.Company;
import com.springboot.soap.webservices.db.crud.webService.CompanySoapWebService;

public class CompanyEndpoints 
{
	@Autowired
	private CompanySoapWebService companySoapWebService;

	@PayloadRoot(namespace = "http://crud.db.webservices.soap.springboot.com/dto",localPart = "getAllCompany")
	@ResponsePayload
	public List<Company> getAllCompany() {
		return companySoapWebService.getAllCompany();
	}

	@PayloadRoot(namespace = "http://crud.db.webservices.soap.springboot.com/dto",localPart = "getCompany")
	@ResponsePayload
	public GetCompanyResponse getCompany(@RequestPayload GetCompanyRequest companyGetRequest) {
		return companySoapWebService.getCompany(companyGetRequest);
	}

	@PayloadRoot(namespace = "http://crud.db.webservices.soap.springboot.com/dto",localPart = "createCompany")
	@ResponsePayload
	public CreateCompanyResponse createCompany(@RequestPayload CreateCompanyRequest companyCreateRequest) {
		return companySoapWebService.createCompany(companyCreateRequest);
	}

	@PayloadRoot(namespace = "http://crud.db.webservices.soap.springboot.com/dto",localPart = "updateCompany")
	@ResponsePayload
	public UpdateCompanyResponse updateCompany(@RequestPayload UpdateCompanyRequest companyUpdateRequest) {
		return companySoapWebService.updateCompany(companyUpdateRequest);
	}

	@PayloadRoot(namespace = "http://crud.db.webservices.soap.springboot.com/dto",localPart = "deleteCompany")
	@ResponsePayload
	public DeleteCompanyResponse deleteCompany(@RequestPayload DeleteCompanyRequest companyDeleteRequest) {
		return companySoapWebService.deleteCompany(companyDeleteRequest);
	}

}
