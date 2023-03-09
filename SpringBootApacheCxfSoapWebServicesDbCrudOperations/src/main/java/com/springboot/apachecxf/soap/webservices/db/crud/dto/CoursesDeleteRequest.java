package com.springboot.apachecxf.soap.webservices.db.crud.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlType(name = "CoursesDeleteRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class CoursesDeleteRequest 
{
	@XmlAttribute(name = "courseId")
	private Long courseId;
}
