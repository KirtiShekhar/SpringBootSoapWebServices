package com.springboot.apachecxf.soap.webservices.db.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
@XmlType(name = "Courses")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "Courses")
public class Courses
{
	@Id
	@XmlAttribute(name = "courseId")
	@Column(name = "courseId")
	private Long courseId;	
	@XmlElement(name = "courseName")
	@Column(name = "courseName")
	private String courseName;
	@XmlElement(name = "courseCategory")
	@Column(name = "courseCategory")
	private String courseCategory;
	@XmlElement(name = "courseDescription")
	@Column(name = "courseDescription")
	private String courseDescription;
	@XmlElement(name = "coursePrice")
	@Column(name = "coursePrice")
	private Double coursePrice;
		
}


