package com.springboot.apachecxf.soap.webservices.db.crud.soapWebService;

import java.util.List;

import org.apache.cxf.feature.Features;

import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesCreateRequest;
import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesCreateResponse;
import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesDeleteRequest;
import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesDeleteResponse;
import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesUpdateRequest;
import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesUpdateResponse;
import com.springboot.apachecxf.soap.webservices.db.crud.entity.Courses;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(name = "Course",serviceName = "CourseSoapWebService")
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public interface CourseSoapWebService 
{
	@WebMethod(operationName = "getAllCourses")
	@WebResult(name = "courseList") List<Courses> getAllCourses();
	
	@WebMethod(operationName = "getCourse")
	@WebResult(name = "Courses") Courses getCourse(@WebParam(name ="courseId") Long courseId);
	
	@WebMethod(operationName = "createCourse")
	@WebResult(name = "CoursesCreateResponse") CoursesCreateResponse createCourse(@WebParam(name ="coursesCreateRequest") CoursesCreateRequest coursesCreateRequest);	
	
	@WebMethod(operationName = "updateCourse")
	@WebResult(name = "CoursesUpdateResponse") CoursesUpdateResponse updateCourse(@WebParam(name ="coursesUpdateRequest") CoursesUpdateRequest coursesUpdateRequest);
	
	@WebMethod(operationName = "deleteCourse")
	@WebResult(name = "CoursesDeleteResponse") CoursesDeleteResponse deleteCourse(@WebParam(name ="coursesDeleteRequest") CoursesDeleteRequest coursesDeleteRequest);
}
