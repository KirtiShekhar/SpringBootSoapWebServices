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
@XmlType(name = "CoursesDeleteResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class CoursesDeleteResponse 
{
	@XmlElement(name = "courseId")
	private Long courseId;
	@XmlElement(name = "courseDeleteResponseMessage")
	private String courseDeleteResponseMessage;
}
