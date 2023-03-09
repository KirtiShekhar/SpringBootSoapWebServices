package com.springboot.apachecxf.soap.webservices.db.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.apachecxf.soap.webservices.db.crud.entity.Courses;

public interface CourseRepository extends JpaRepository<Courses,Long> 
{
	//
}
