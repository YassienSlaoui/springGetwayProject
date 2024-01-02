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
 * <p>Java class for ClaimPayment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimPayment_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ReportID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ClaimID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}RequestNo" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PaymentID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ClaimExpenseSeq" minOccurs="0"/>
 *         &lt;element name="BenefType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ManID"/>
 *           &lt;group ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PID_Data_Group"/>
 *         &lt;/choice>
 *         &lt;element name="PaymentNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentWay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaySum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExpenseSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IndemSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Currency"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedBy" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedOn" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CustomProperties" minOccurs="0"/>
 *         &lt;element name="OverrideIndemnity" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}OverrideIndemnity_Type" minOccurs="0"/>
 *         &lt;element name="PaymentDetails" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PaymentDetails_Type" minOccurs="0"/>
 *         &lt;element name="Expenses" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ClaimPaymExpenses_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimPayment_Type", propOrder = {
    "reportID",
    "claimID",
    "requestNo",
    "paymentID",
    "claimExpenseSeq",
    "benefType",
    "manID",
    "pid",
    "entityType",
    "paymentNum",
    "paymentWay",
    "paySum",
    "expenseSum",
    "indemSum",
    "currency",
    "updatedBy",
    "updatedOn",
    "customProperties",
    "overrideIndemnity",
    "paymentDetails",
    "expenses"
})
public class ClaimPaymentType {

    @XmlElement(name = "ReportID")
    protected Long reportID;
    @XmlElement(name = "ClaimID")
    protected String claimID;
    @XmlElement(name = "RequestNo")
    protected BigInteger requestNo;
    @XmlElement(name = "PaymentID")
    protected Long paymentID;
    @XmlElement(name = "ClaimExpenseSeq")
    protected Long claimExpenseSeq;
    @XmlElement(name = "BenefType")
    protected int benefType;
    @XmlElement(name = "ManID")
    protected Long manID;
    @XmlElement(name = "PID")
    protected String pid;
    @XmlElement(name = "EntityType")
    protected BigInteger entityType;
    @XmlElement(name = "PaymentNum")
    protected int paymentNum;
    @XmlElement(name = "PaymentWay", required = true)
    protected String paymentWay;
    @XmlElement(name = "PaySum")
    protected Double paySum;
    @XmlElement(name = "ExpenseSum")
    protected Double expenseSum;
    @XmlElement(name = "IndemSum")
    protected Double indemSum;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "UpdatedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedOn;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;
    @XmlElement(name = "OverrideIndemnity")
    protected OverrideIndemnityType overrideIndemnity;
    @XmlElement(name = "PaymentDetails")
    protected PaymentDetailsType paymentDetails;
    @XmlElement(name = "Expenses")
    protected ClaimPaymExpensesType expenses;

    /**
     * Gets the value of the reportID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReportID() {
        return reportID;
    }

    /**
     * Sets the value of the reportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReportID(Long value) {
        this.reportID = value;
    }

    /**
     * Gets the value of the claimID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimID() {
        return claimID;
    }

    /**
     * Sets the value of the claimID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimID(String value) {
        this.claimID = value;
    }

    /**
     * Gets the value of the requestNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestNo() {
        return requestNo;
    }

    /**
     * Sets the value of the requestNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestNo(BigInteger value) {
        this.requestNo = value;
    }

    /**
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPaymentID(Long value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the claimExpenseSeq property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClaimExpenseSeq() {
        return claimExpenseSeq;
    }

    /**
     * Sets the value of the claimExpenseSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClaimExpenseSeq(Long value) {
        this.claimExpenseSeq = value;
    }

    /**
     * Gets the value of the benefType property.
     * 
     */
    public int getBenefType() {
        return benefType;
    }

    /**
     * Sets the value of the benefType property.
     * 
     */
    public void setBenefType(int value) {
        this.benefType = value;
    }

    /**
     * Gets the value of the manID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManID() {
        return manID;
    }

    /**
     * Sets the value of the manID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManID(Long value) {
        this.manID = value;
    }

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
     * Gets the value of the paymentNum property.
     * 
     */
    public int getPaymentNum() {
        return paymentNum;
    }

    /**
     * Sets the value of the paymentNum property.
     * 
     */
    public void setPaymentNum(int value) {
        this.paymentNum = value;
    }

    /**
     * Gets the value of the paymentWay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentWay() {
        return paymentWay;
    }

    /**
     * Sets the value of the paymentWay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentWay(String value) {
        this.paymentWay = value;
    }

    /**
     * Gets the value of the paySum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPaySum() {
        return paySum;
    }

    /**
     * Sets the value of the paySum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPaySum(Double value) {
        this.paySum = value;
    }

    /**
     * Gets the value of the expenseSum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpenseSum() {
        return expenseSum;
    }

    /**
     * Sets the value of the expenseSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpenseSum(Double value) {
        this.expenseSum = value;
    }

    /**
     * Gets the value of the indemSum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIndemSum() {
        return indemSum;
    }

    /**
     * Sets the value of the indemSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIndemSum(Double value) {
        this.indemSum = value;
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

    /**
     * Gets the value of the overrideIndemnity property.
     * 
     * @return
     *     possible object is
     *     {@link OverrideIndemnityType }
     *     
     */
    public OverrideIndemnityType getOverrideIndemnity() {
        return overrideIndemnity;
    }

    /**
     * Sets the value of the overrideIndemnity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverrideIndemnityType }
     *     
     */
    public void setOverrideIndemnity(OverrideIndemnityType value) {
        this.overrideIndemnity = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsType }
     *     
     */
    public PaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsType }
     *     
     */
    public void setPaymentDetails(PaymentDetailsType value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the expenses property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimPaymExpensesType }
     *     
     */
    public ClaimPaymExpensesType getExpenses() {
        return expenses;
    }

    /**
     * Sets the value of the expenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimPaymExpensesType }
     *     
     */
    public void setExpenses(ClaimPaymExpensesType value) {
        this.expenses = value;
    }

}