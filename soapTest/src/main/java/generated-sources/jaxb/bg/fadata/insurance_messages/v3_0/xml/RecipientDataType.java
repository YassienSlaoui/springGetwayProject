//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.28 at 08:49:50 AM WEST 
//


package bg.fadata.insurance_messages.v3_0.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecipientData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}AuxAnnexID"/>
 *         &lt;element name="AnnuityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnualAmnt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AnnuityClaimAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InstallmentAmnt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Currency"/>
 *         &lt;element name="AnnuityStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AnnuityDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DurationDim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeathDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="GuarantyPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GuarantyDim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDay" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientData_Type", propOrder = {
    "auxAnnexID",
    "annuityType",
    "recipientState",
    "annualAmnt",
    "annuityClaimAmount",
    "installmentAmnt",
    "currency",
    "annuityStartDate",
    "annuityDuration",
    "durationDim",
    "age",
    "gender",
    "deathDate",
    "guarantyPeriod",
    "guarantyDim",
    "paymentDay",
    "paymentMode"
})
public class RecipientDataType {

    @XmlElement(name = "AuxAnnexID", required = true)
    protected BigInteger auxAnnexID;
    @XmlElement(name = "AnnuityType")
    protected String annuityType;
    @XmlElement(name = "RecipientState")
    protected String recipientState;
    @XmlElement(name = "AnnualAmnt")
    protected Double annualAmnt;
    @XmlElement(name = "AnnuityClaimAmount")
    protected double annuityClaimAmount;
    @XmlElement(name = "InstallmentAmnt")
    protected Double installmentAmnt;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "AnnuityStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar annuityStartDate;
    @XmlElement(name = "AnnuityDuration")
    protected Integer annuityDuration;
    @XmlElement(name = "DurationDim")
    protected String durationDim;
    @XmlElement(name = "Age")
    protected Integer age;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "DeathDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deathDate;
    @XmlElement(name = "GuarantyPeriod")
    protected Integer guarantyPeriod;
    @XmlElement(name = "GuarantyDim")
    protected String guarantyDim;
    @XmlElement(name = "PaymentDay")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDay;
    @XmlElement(name = "PaymentMode")
    protected Integer paymentMode;

    /**
     * Gets the value of the auxAnnexID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuxAnnexID() {
        return auxAnnexID;
    }

    /**
     * Sets the value of the auxAnnexID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuxAnnexID(BigInteger value) {
        this.auxAnnexID = value;
    }

    /**
     * Gets the value of the annuityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnuityType() {
        return annuityType;
    }

    /**
     * Sets the value of the annuityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnuityType(String value) {
        this.annuityType = value;
    }

    /**
     * Gets the value of the recipientState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientState() {
        return recipientState;
    }

    /**
     * Sets the value of the recipientState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientState(String value) {
        this.recipientState = value;
    }

    /**
     * Gets the value of the annualAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAnnualAmnt() {
        return annualAmnt;
    }

    /**
     * Sets the value of the annualAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAnnualAmnt(Double value) {
        this.annualAmnt = value;
    }

    /**
     * Gets the value of the annuityClaimAmount property.
     * 
     */
    public double getAnnuityClaimAmount() {
        return annuityClaimAmount;
    }

    /**
     * Sets the value of the annuityClaimAmount property.
     * 
     */
    public void setAnnuityClaimAmount(double value) {
        this.annuityClaimAmount = value;
    }

    /**
     * Gets the value of the installmentAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInstallmentAmnt() {
        return installmentAmnt;
    }

    /**
     * Sets the value of the installmentAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInstallmentAmnt(Double value) {
        this.installmentAmnt = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the annuityStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnuityStartDate() {
        return annuityStartDate;
    }

    /**
     * Sets the value of the annuityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnnuityStartDate(XMLGregorianCalendar value) {
        this.annuityStartDate = value;
    }

    /**
     * Gets the value of the annuityDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnnuityDuration() {
        return annuityDuration;
    }

    /**
     * Sets the value of the annuityDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnnuityDuration(Integer value) {
        this.annuityDuration = value;
    }

    /**
     * Gets the value of the durationDim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationDim() {
        return durationDim;
    }

    /**
     * Sets the value of the durationDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationDim(String value) {
        this.durationDim = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the deathDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeathDate() {
        return deathDate;
    }

    /**
     * Sets the value of the deathDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeathDate(XMLGregorianCalendar value) {
        this.deathDate = value;
    }

    /**
     * Gets the value of the guarantyPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuarantyPeriod() {
        return guarantyPeriod;
    }

    /**
     * Sets the value of the guarantyPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuarantyPeriod(Integer value) {
        this.guarantyPeriod = value;
    }

    /**
     * Gets the value of the guarantyDim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuarantyDim() {
        return guarantyDim;
    }

    /**
     * Sets the value of the guarantyDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuarantyDim(String value) {
        this.guarantyDim = value;
    }

    /**
     * Gets the value of the paymentDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDay() {
        return paymentDay;
    }

    /**
     * Sets the value of the paymentDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDay(XMLGregorianCalendar value) {
        this.paymentDay = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentMode(Integer value) {
        this.paymentMode = value;
    }

}
