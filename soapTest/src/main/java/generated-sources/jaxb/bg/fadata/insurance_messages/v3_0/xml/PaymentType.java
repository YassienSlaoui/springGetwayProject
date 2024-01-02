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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payment_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PaymentID"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ReportID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ClaimID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}RequestNo" minOccurs="0"/>
 *         &lt;element name="BenefType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ManID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaymentNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PaymentWay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaySum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment_Type", propOrder = {
    "paymentID",
    "reportID",
    "claimID",
    "requestNo",
    "benefType",
    "manID",
    "paymentNum",
    "paymentWay",
    "paySum",
    "currency"
})
public class PaymentType {

    @XmlElement(name = "PaymentID")
    protected long paymentID;
    @XmlElement(name = "ReportID")
    protected Long reportID;
    @XmlElement(name = "ClaimID")
    protected String claimID;
    @XmlElement(name = "RequestNo")
    protected BigInteger requestNo;
    @XmlElement(name = "BenefType")
    protected int benefType;
    @XmlElement(name = "ManID")
    protected long manID;
    @XmlElement(name = "PaymentNum")
    protected int paymentNum;
    @XmlElement(name = "PaymentWay", required = true)
    protected String paymentWay;
    @XmlElement(name = "PaySum")
    protected double paySum;
    @XmlElement(name = "Currency", required = true)
    protected String currency;

    /**
     * Gets the value of the paymentID property.
     * 
     */
    public long getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     */
    public void setPaymentID(long value) {
        this.paymentID = value;
    }

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
     */
    public long getManID() {
        return manID;
    }

    /**
     * Sets the value of the manID property.
     * 
     */
    public void setManID(long value) {
        this.manID = value;
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
     */
    public double getPaySum() {
        return paySum;
    }

    /**
     * Sets the value of the paySum property.
     * 
     */
    public void setPaySum(double value) {
        this.paySum = value;
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

}
