package com.springboot.soap.webservices.db.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.soap.webservices.db.crud.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
