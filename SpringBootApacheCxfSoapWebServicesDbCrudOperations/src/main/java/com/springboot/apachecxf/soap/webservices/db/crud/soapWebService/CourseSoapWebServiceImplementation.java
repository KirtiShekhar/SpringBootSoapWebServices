package com.springboot.apachecxf.soap.webservices.db.crud.soapWebService;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesCreateRequest;
import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesCreateResponse;
import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesDeleteRequest;
import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesDeleteResponse;
import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesUpdateRequest;
import com.springboot.apachecxf.soap.webservices.db.crud.dto.CoursesUpdateResponse;
import com.springboot.apachecxf.soap.webservices.db.crud.entity.Courses;
import com.springboot.apachecxf.soap.webservices.db.crud.repository.CourseRepository;

@Service
public class CourseSoapWebServiceImplementation implements CourseSoapWebService 
{
	@Autowired
	private CourseRepository courseRepository;	

	@Override
	public List<Courses> getAllCourses() 
	{
		return courseRepository.findAll();
	}

	@Override
	public Courses getCourse(Long courseId) 
	{
		return courseRepository.findById(courseId).get();
	}

	@Override
	public CoursesCreateResponse createCourse(CoursesCreateRequest coursesCreateRequest) 
	{
		Courses courses = new Courses();
		CoursesCreateResponse coursesCreateResponse = new CoursesCreateResponse();
		BeanUtils.copyProperties(coursesCreateRequest, courses);
		Courses savedCourse = courseRepository.save(courses);
		BeanUtils.copyProperties(savedCourse,coursesCreateResponse);
		coursesCreateResponse.setCourseCreateResponseMessage("New Course Saved Successfully");
		return coursesCreateResponse;
	}

	@Override
	public CoursesUpdateResponse updateCourse(CoursesUpdateRequest coursesUpdateRequest) 
	{
		Courses courses = new Courses();
		CoursesUpdateResponse coursesUpdateResponse = new CoursesUpdateResponse();
		BeanUtils.copyProperties(coursesUpdateRequest, courses);
		Courses savedCourse = courseRepository.save(courses);
		BeanUtils.copyProperties(savedCourse,coursesUpdateResponse);
		coursesUpdateResponse.setCourseUpdateResponseMessage("Course Updated Successfully");
		return coursesUpdateResponse;
	}

	@Override
	public CoursesDeleteResponse deleteCourse(CoursesDeleteRequest coursesDeleteRequest) 
	{
		CoursesDeleteResponse coursesDeleteResponse = new CoursesDeleteResponse();
		courseRepository.deleteById(coursesDeleteRequest.getCourseId());
		coursesDeleteResponse.setCourseId(coursesDeleteRequest.getCourseId());
		coursesDeleteResponse.setCourseDeleteResponseMessage("Course Deleted Successfully with courseId : " + coursesDeleteRequest.getCourseId());
		return coursesDeleteResponse;
	}
}