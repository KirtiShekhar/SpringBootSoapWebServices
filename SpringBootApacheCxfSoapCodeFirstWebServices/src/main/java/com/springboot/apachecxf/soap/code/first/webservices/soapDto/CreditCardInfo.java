package com.springboot.apachecxf.soap.code.first.webservices.soapDto;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "CreditCardInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCardInfo 
{
	@XmlElement(name = "cardNumber")
	String cardNumber;
	@XmlElement(name = "expirtyDate")
	private Date expirtyDate;
	@XmlElement(name = "firstName")
	String firstName;
	@XmlElement(name = "lastName")
	String lastName;
	@XmlElement(name = "secCode")
	String secCode;
	@XmlElement(name = "Address")
	String Address;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getExpirtyDate() {
		return expirtyDate;
	}
	public void setExpirtyDate(Date expirtyDate) {
		this.expirtyDate = expirtyDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSecCode() {
		return secCode;
	}
	public void setSecCode(String secCode) {
		this.secCode = secCode;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
