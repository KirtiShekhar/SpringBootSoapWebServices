package com.springboot.apachecxf.soap.webservices.db.crud.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlType(name = "CoursesUpdateResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class CoursesUpdateResponse 
{
	@XmlElement(name = "courseId")
	private Long courseId;
	@XmlElement(name = "courseName")
	private String courseName;
	@XmlElement(name = "courseCategory")
	private String courseCategory;
	@XmlElement(name = "courseDescription")
	private String courseDescription;
	@XmlElement(name = "coursePrice")
	private Double coursePrice;
	@XmlElement(name = "courseUpdateResponseMessage")
	private String courseUpdateResponseMessage;
}
