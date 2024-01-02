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
 * <p>Java class for LetterOfCredit_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterOfCredit_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LcID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReferenceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="UsedAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LinkAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyRate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="IssuingBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvisingBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InsuranceReqs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterOfCredit_Type", propOrder = {
    "lcID",
    "referenceNo",
    "issueDate",
    "beginDate",
    "endDate",
    "amount",
    "usedAmount",
    "linkAmount",
    "currency",
    "currencyRate",
    "issuingBank",
    "advisingBank",
    "insuranceReqs",
    "status"
})
public class LetterOfCreditType {

    @XmlElement(name = "LcID")
    protected Long lcID;
    @XmlElement(name = "ReferenceNo", required = true)
    protected String referenceNo;
    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "UsedAmount")
    protected Double usedAmount;
    @XmlElement(name = "LinkAmount")
    protected Double linkAmount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "CurrencyRate", required = true)
    protected BigInteger currencyRate;
    @XmlElement(name = "IssuingBank")
    protected String issuingBank;
    @XmlElement(name = "AdvisingBank")
    protected String advisingBank;
    @XmlElement(name = "InsuranceReqs")
    protected String insuranceReqs;
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Gets the value of the lcID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLcID() {
        return lcID;
    }

    /**
     * Sets the value of the lcID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLcID(Long value) {
        this.lcID = value;
    }

    /**
     * Gets the value of the referenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNo() {
        return referenceNo;
    }

    /**
     * Sets the value of the referenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNo(String value) {
        this.referenceNo = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
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
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the usedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsedAmount() {
        return usedAmount;
    }

    /**
     * Sets the value of the usedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsedAmount(Double value) {
        this.usedAmount = value;
    }

    /**
     * Gets the value of the linkAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLinkAmount() {
        return linkAmount;
    }

    /**
     * Sets the value of the linkAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLinkAmount(Double value) {
        this.linkAmount = value;
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
     * Gets the value of the currencyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrencyRate() {
        return currencyRate;
    }

    /**
     * Sets the value of the currencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrencyRate(BigInteger value) {
        this.currencyRate = value;
    }

    /**
     * Gets the value of the issuingBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBank() {
        return issuingBank;
    }

    /**
     * Sets the value of the issuingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBank(String value) {
        this.issuingBank = value;
    }

    /**
     * Gets the value of the advisingBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisingBank() {
        return advisingBank;
    }

    /**
     * Sets the value of the advisingBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisingBank(String value) {
        this.advisingBank = value;
    }

    /**
     * Gets the value of the insuranceReqs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceReqs() {
        return insuranceReqs;
    }

    /**
     * Sets the value of the insuranceReqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceReqs(String value) {
        this.insuranceReqs = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}