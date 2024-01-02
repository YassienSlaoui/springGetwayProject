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
 * <p>Java class for AnnuityRecipient_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnuityRecipient_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PID_Data_Group"/>
 *         &lt;element name="RecipientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}AuxAnnexID" minOccurs="0"/>
 *         &lt;element name="AnnuityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnualAmnt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AnnuityClaimAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InstallmentAmnt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Currency" minOccurs="0"/>
 *         &lt;element name="AnnuityStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AnnuityDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DurationDim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeathDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="GuarantyPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GuarantyDim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidFrom" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidFromTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidTo" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidToTime" minOccurs="0"/>
 *         &lt;element name="AnnuityRecID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedBy" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedOn" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CustomProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnuityRecipient_Type", propOrder = {
    "pid",
    "entityType",
    "recipientName",
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
    "paymentMode",
    "validFrom",
    "validFromTime",
    "validTo",
    "validToTime",
    "annuityRecID",
    "updatedBy",
    "updatedOn",
    "customProperties"
})
public class AnnuityRecipientType {

    @XmlElement(name = "PID", required = true)
    protected String pid;
    @XmlElement(name = "EntityType")
    protected BigInteger entityType;
    @XmlElement(name = "RecipientName")
    protected String recipientName;
    @XmlElement(name = "AuxAnnexID")
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
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "AnnuityStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar annuityStartDate;
    @XmlElement(name = "AnnuityDuration")
    protected int annuityDuration;
    @XmlElement(name = "DurationDim", required = true)
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
    protected Integer paymentDay;
    @XmlElement(name = "PaymentMode")
    protected Integer paymentMode;
    @XmlElement(name = "ValidFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlElement(name = "ValidFromTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar validFromTime;
    @XmlElement(name = "ValidTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validTo;
    @XmlElement(name = "ValidToTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar validToTime;
    @XmlElement(name = "AnnuityRecID")
    protected BigInteger annuityRecID;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "UpdatedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedOn;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPID() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPID(String value) {
        this.pid = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEntityType(BigInteger value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the recipientName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

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
     */
    public int getAnnuityDuration() {
        return annuityDuration;
    }

    /**
     * Sets the value of the annuityDuration property.
     * 
     */
    public void setAnnuityDuration(int value) {
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
     *     {@link Integer }
     *     
     */
    public Integer getPaymentDay() {
        return paymentDay;
    }

    /**
     * Sets the value of the paymentDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentDay(Integer value) {
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

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFromTime() {
        return validFromTime;
    }

    /**
     * Sets the value of the validFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFromTime(XMLGregorianCalendar value) {
        this.validFromTime = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the validToTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidToTime() {
        return validToTime;
    }

    /**
     * Sets the value of the validToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidToTime(XMLGregorianCalendar value) {
        this.validToTime = value;
    }

    /**
     * Gets the value of the annuityRecID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnnuityRecID() {
        return annuityRecID;
    }

    /**
     * Sets the value of the annuityRecID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnnuityRecID(BigInteger value) {
        this.annuityRecID = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the updatedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Sets the value of the updatedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedOn(XMLGregorianCalendar value) {
        this.updatedOn = value;
    }

    /**
     * Gets the value of the customProperties property.
     * 
     * @return
     *     possible object is
     *     {@link CustomPropertiesType }
     *     
     */
    public CustomPropertiesType getCustomProperties() {
        return customProperties;
    }

    /**
     * Sets the value of the customProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomPropertiesType }
     *     
     */
    public void setCustomProperties(CustomPropertiesType value) {
        this.customProperties = value;
    }

}
