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
 * <p>Java class for BankAccnt_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccnt_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}BankAccID" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BankPID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Currency"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}AccountState" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidFrom" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidFromTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidTo" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidToTime" minOccurs="0"/>
 *         &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccnt_Type", propOrder = {
    "bankAccID",
    "bankName",
    "bankPID",
    "accountNo",
    "currency",
    "accountState",
    "validFrom",
    "validFromTime",
    "validTo",
    "validToTime",
    "primaryFlag"
})
public class BankAccntType {

    @XmlElement(name = "BankAccID")
    protected BigInteger bankAccID;
    @XmlElement(name = "BankName", required = true)
    protected String bankName;
    @XmlElement(name = "BankPID", required = true)
    protected String bankPID;
    @XmlElement(name = "AccountNo", required = true)
    protected String accountNo;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "AccountState")
    protected Integer accountState;
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
    @XmlElement(name = "PrimaryFlag")
    protected String primaryFlag;

    /**
     * Gets the value of the bankAccID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBankAccID() {
        return bankAccID;
    }

    /**
     * Sets the value of the bankAccID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBankAccID(BigInteger value) {
        this.bankAccID = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the bankPID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankPID() {
        return bankPID;
    }

    /**
     * Sets the value of the bankPID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankPID(String value) {
        this.bankPID = value;
    }

    /**
     * Gets the value of the accountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Sets the value of the accountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
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
     * Gets the value of the accountState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountState() {
        return accountState;
    }

    /**
     * Sets the value of the accountState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountState(Integer value) {
        this.accountState = value;
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
     * Gets the value of the primaryFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryFlag() {
        return primaryFlag;
    }

    /**
     * Sets the value of the primaryFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryFlag(String value) {
        this.primaryFlag = value;
    }

}
