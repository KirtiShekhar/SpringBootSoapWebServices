package com.springboot.soap.webservices.db.crud.webService;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.soap.webservices.db.crud.dto.CreateCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.CreateCompanyResponse;
import com.springboot.soap.webservices.db.crud.dto.DeleteCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.DeleteCompanyResponse;
import com.springboot.soap.webservices.db.crud.dto.GetCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.GetCompanyResponse;
import com.springboot.soap.webservices.db.crud.dto.UpdateCompanyRequest;
import com.springboot.soap.webservices.db.crud.dto.UpdateCompanyResponse;
import com.springboot.soap.webservices.db.crud.entity.Company;
import com.springboot.soap.webservices.db.crud.repository.CompanyRepository;

@Service
public class CompanySoapWebServiceImplementation implements CompanySoapWebService 
{
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public List<Company> getAllCompany() {
		return companyRepository.findAll();
	}

	@Override
	public GetCompanyResponse getCompany(GetCompanyRequest companyGetRequest) 
	{
		GetCompanyResponse getCompanyResponse = new GetCompanyResponse();
		Company optionalCompany = companyRepository.findById(companyGetRequest.getCompanyId()).get();
		BeanUtils.copyProperties(optionalCompany, getCompanyResponse);
		return getCompanyResponse;
	}

	@Override
	public CreateCompanyResponse createCompany(CreateCompanyRequest companyCreateRequest) {
		Company company = new Company();
		CreateCompanyResponse createCompanyResponse = new CreateCompanyResponse();
		BeanUtils.copyProperties(companyCreateRequest, company);
		Company savedCompany = companyRepository.save(company);
		BeanUtils.copyProperties(savedCompany,createCompanyResponse);
		createCompanyResponse.setCreateCompanyResponseMessage("New Company Saved Successfully");
		return createCompanyResponse;
	}

	@Override
	public UpdateCompanyResponse updateCompany(UpdateCompanyRequest companyUpdateRequest) {
		Company company = new Company();
		UpdateCompanyResponse updateEmployeeResponse = new UpdateCompanyResponse();
		BeanUtils.copyProperties(companyUpdateRequest, company);
		Company savedCompany = companyRepository.save(company);
		BeanUtils.copyProperties(savedCompany,updateEmployeeResponse);
		updateEmployeeResponse.setUpdateCompanyResponseMessage("Existing Company Updated Successfully");
		return updateEmployeeResponse;
	}

	@Override
	public DeleteCompanyResponse deleteCompany(DeleteCompanyRequest companyDeleteRequest) {
		DeleteCompanyResponse deleteCompanyResponse = new DeleteCompanyResponse();
		companyRepository.deleteById(companyDeleteRequest.getCompanyId());
		deleteCompanyResponse.setCompanyId(companyDeleteRequest.getCompanyId());
		deleteCompanyResponse.setDeleteCompanyResponseMessage("Company Deleted Successfully with companyId : " + companyDeleteRequest.getCompanyId());
		return deleteCompanyResponse;
	}

}
