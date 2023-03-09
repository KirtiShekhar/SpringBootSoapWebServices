//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.09 at 09:39:03 AM IST 
//


package com.springboot.soap.webservices.db.crud.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createCompanyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCompanyResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyLocationState" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyLocationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="companyWebsite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createCompanyResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCompanyResponse", propOrder = {
    "companyId",
    "companyName",
    "companyLocationState",
    "companyLocationAddress",
    "companyWebsite",
    "createCompanyResponseMessage"
})
public class CreateCompanyResponse {

    protected long companyId;
    @XmlElement(required = true)
    protected String companyName;
    @XmlElement(required = true)
    protected String companyLocationState;
    @XmlElement(required = true)
    protected String companyLocationAddress;
    @XmlElement(required = true)
    protected String companyWebsite;
    @XmlElement(required = true)
    protected String createCompanyResponseMessage;

    /**
     * Gets the value of the companyId property.
     * 
     */
    public long getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     */
    public void setCompanyId(long value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyLocationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLocationState() {
        return companyLocationState;
    }

    /**
     * Sets the value of the companyLocationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLocationState(String value) {
        this.companyLocationState = value;
    }

    /**
     * Gets the value of the companyLocationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLocationAddress() {
        return companyLocationAddress;
    }

    /**
     * Sets the value of the companyLocationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLocationAddress(String value) {
        this.companyLocationAddress = value;
    }

    /**
     * Gets the value of the companyWebsite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyWebsite() {
        return companyWebsite;
    }

    /**
     * Sets the value of the companyWebsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyWebsite(String value) {
        this.companyWebsite = value;
    }

    /**
     * Gets the value of the createCompanyResponseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateCompanyResponseMessage() {
        return createCompanyResponseMessage;
    }

    /**
     * Sets the value of the createCompanyResponseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateCompanyResponseMessage(String value) {
        this.createCompanyResponseMessage = value;
    }

}
