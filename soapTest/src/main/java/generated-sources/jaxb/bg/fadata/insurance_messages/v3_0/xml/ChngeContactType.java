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
 * <p>Java class for ChngeContact_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChngeContact_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ContactID" minOccurs="0"/>
 *           &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="ContactNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="PrimaryFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidFrom" minOccurs="0"/>
 *           &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidFromTime" minOccurs="0"/>
 *           &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidTo" minOccurs="0"/>
 *           &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ValidToTime" minOccurs="0"/>
 *           &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Language" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChngeContact_Type", propOrder = {
    "contactID",
    "type",
    "details",
    "contactNote",
    "primaryFlag",
    "validFrom",
    "validFromTime",
    "validTo",
    "validToTime",
    "language"
})
public class ChngeContactType {

    @XmlElement(name = "ContactID")
    protected BigInteger contactID;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Details")
    protected String details;
    @XmlElement(name = "ContactNote")
    protected String contactNote;
    @XmlElement(name = "PrimaryFlag")
    protected String primaryFlag;
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
    @XmlElement(name = "Language")
    protected String language;

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContactID(BigInteger value) {
        this.contactID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the contactNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNote() {
        return contactNote;
    }

    /**
     * Sets the value of the contactNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNote(String value) {
        this.contactNote = value;
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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
