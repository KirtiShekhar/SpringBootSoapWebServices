package com.springboot.soap.webservices.db.crud.webService;

import java.util.List;

import com.springboot.soap.webservices.db.crud.dto.CreateCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.CreateCompanyResponse;
import com.springboot.soap.webservices.db.crud.dto.DeleteCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.DeleteCompanyResponse;
import com.springboot.soap.webservices.db.crud.dto.GetCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.GetCompanyResponse;
import com.springboot.soap.webservices.db.crud.dto.UpdateCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.UpdateCompanyResponse;
import com.springboot.soap.webservices.db.crud.entity.Company;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(name = "Company",serviceName = "CompanySoapWebService")
public interface CompanySoapWebService 
{
	@WebMethod(operationName = "getAllCompany")
	@WebResult(name = "companyList") List<Company> getAllCompany();
	
	@WebMethod(operationName = "getCompany")
	@WebResult(name = "GetCompanyResponse") GetCompanyResponse getCompany(@WebParam(name ="CompanyGetRequest") GetCompanyRequest companyGetRequest);
	
	@WebMethod(operationName = "createCompany")
	@WebResult(name = "CreateCompanyResponse") CreateCompanyResponse createCompany(@WebParam(name ="CompanyCreateRequest") CreateCompanyRequest companyCreateRequest);	
	
	@WebMethod(operationName = "updateCompany")
	@WebResult(name = "UpdateCompanyResponse") UpdateCompanyResponse updateCompany(@WebParam(name ="CompanyUpdateRequest") UpdateCompanyRequest companyUpdateRequest);
	
	@WebMethod(operationName = "deleteCompany")
	@WebResult(name = "DeleteCompanyResponse") DeleteCompanyResponse deleteCompany(@WebParam(name ="CompanyDeleteRequest") DeleteCompanyRequest companyDeleteRequest);
}
