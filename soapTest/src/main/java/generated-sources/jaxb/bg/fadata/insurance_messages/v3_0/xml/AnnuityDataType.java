//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.28 at 08:49:50 AM WEST 
//


package bg.fadata.insurance_messages.v3_0.xml;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AnnuityData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnuityData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnuityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AnnuityReason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AnnuityPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="GuarantyPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ModalAnnuityAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AnnualAnnuityAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LumpSum" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ReserveCalcMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicalInterest" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReserveAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnuityData_Type", propOrder = {
    "annuityType",
    "annuityReason",
    "annuityPeriod",
    "guarantyPeriod",
    "beginDate",
    "endDate",
    "paymentMode",
    "modalAnnuityAmnt",
    "currency",
    "annualAnnuityAmnt",
    "lumpSum",
    "reserveCalcMode",
    "technicalInterest",
    "reserveAmount"
})
public class AnnuityDataType {

    @XmlElement(name = "AnnuityType", required = true)
    protected String annuityType;
    @XmlElement(name = "AnnuityReason")
    protected Integer annuityReason;
    @XmlElement(name = "AnnuityPeriod")
    protected BigInteger annuityPeriod;
    @XmlElement(name = "GuarantyPeriod")
    protected BigInteger guarantyPeriod;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "PaymentMode")
    protected int paymentMode;
    @XmlElement(name = "ModalAnnuityAmnt", required = true)
    protected BigDecimal modalAnnuityAmnt;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "AnnualAnnuityAmnt")
    protected BigDecimal annualAnnuityAmnt;
    @XmlElement(name = "LumpSum")
    protected BigDecimal lumpSum;
    @XmlElement(name = "ReserveCalcMode")
    protected String reserveCalcMode;
    @XmlElement(name = "TechnicalInterest")
    protected Integer technicalInterest;
    @XmlElement(name = "ReserveAmount")
    protected BigDecimal reserveAmount;

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
     * Gets the value of the annuityReason property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnnuityReason() {
        return annuityReason;
    }

    /**
     * Sets the value of the annuityReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnnuityReason(Integer value) {
        this.annuityReason = value;
    }

    /**
     * Gets the value of the annuityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnnuityPeriod() {
        return annuityPeriod;
    }

    /**
     * Sets the value of the annuityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnnuityPeriod(BigInteger value) {
        this.annuityPeriod = value;
    }

    /**
     * Gets the value of the guarantyPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGuarantyPeriod() {
        return guarantyPeriod;
    }

    /**
     * Sets the value of the guarantyPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGuarantyPeriod(BigInteger value) {
        this.guarantyPeriod = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     */
    public int getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     */
    public void setPaymentMode(int value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the modalAnnuityAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getModalAnnuityAmnt() {
        return modalAnnuityAmnt;
    }

    /**
     * Sets the value of the modalAnnuityAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setModalAnnuityAmnt(BigDecimal value) {
        this.modalAnnuityAmnt = value;
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
     * Gets the value of the annualAnnuityAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualAnnuityAmnt() {
        return annualAnnuityAmnt;
    }

    /**
     * Sets the value of the annualAnnuityAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualAnnuityAmnt(BigDecimal value) {
        this.annualAnnuityAmnt = value;
    }

    /**
     * Gets the value of the lumpSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLumpSum() {
        return lumpSum;
    }

    /**
     * Sets the value of the lumpSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLumpSum(BigDecimal value) {
        this.lumpSum = value;
    }

    /**
     * Gets the value of the reserveCalcMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveCalcMode() {
        return reserveCalcMode;
    }

    /**
     * Sets the value of the reserveCalcMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveCalcMode(String value) {
        this.reserveCalcMode = value;
    }

    /**
     * Gets the value of the technicalInterest property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTechnicalInterest() {
        return technicalInterest;
    }

    /**
     * Sets the value of the technicalInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTechnicalInterest(Integer value) {
        this.technicalInterest = value;
    }

    /**
     * Gets the value of the reserveAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReserveAmount() {
        return reserveAmount;
    }

    /**
     * Sets the value of the reserveAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReserveAmount(BigDecimal value) {
        this.reserveAmount = value;
    }

}
