//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.28 at 08:49:50 AM WEST 
//


package bg.fadata.insurance_messages.v3_0.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ParticipantAddition_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantAddition_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParticipantAddID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ParticipantID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ObjectID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="LendDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           &lt;element name="Note1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           &lt;element name="Note2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Note3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantAddition_Type", propOrder = {
    "participantAddID",
    "participantID",
    "objectID",
    "amount",
    "currency",
    "status",
    "lendDate",
    "note1",
    "expireDate",
    "note2",
    "note3",
    "note4"
})
public class ParticipantAdditionType {

    @XmlElement(name = "ParticipantAddID")
    protected Long participantAddID;
    @XmlElement(name = "ParticipantID")
    protected Long participantID;
    @XmlElement(name = "ObjectID")
    protected Long objectID;
    @XmlElement(name = "Amount")
    protected double amount;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "LendDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lendDate;
    @XmlElement(name = "Note1")
    protected String note1;
    @XmlElement(name = "ExpireDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    @XmlElement(name = "Note2")
    protected String note2;
    @XmlElement(name = "Note3")
    protected String note3;
    @XmlElement(name = "Note4")
    protected String note4;

    /**
     * Gets the value of the participantAddID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParticipantAddID() {
        return participantAddID;
    }

    /**
     * Sets the value of the participantAddID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParticipantAddID(Long value) {
        this.participantAddID = value;
    }

    /**
     * Gets the value of the participantID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParticipantID() {
        return participantID;
    }

    /**
     * Sets the value of the participantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParticipantID(Long value) {
        this.participantID = value;
    }

    /**
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setObjectID(Long value) {
        this.objectID = value;
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

    /**
     * Gets the value of the lendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLendDate() {
        return lendDate;
    }

    /**
     * Sets the value of the lendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLendDate(XMLGregorianCalendar value) {
        this.lendDate = value;
    }

    /**
     * Gets the value of the note1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote1() {
        return note1;
    }

    /**
     * Sets the value of the note1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote1(String value) {
        this.note1 = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the note2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote2() {
        return note2;
    }

    /**
     * Sets the value of the note2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote2(String value) {
        this.note2 = value;
    }

    /**
     * Gets the value of the note3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote3() {
        return note3;
    }

    /**
     * Sets the value of the note3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote3(String value) {
        this.note3 = value;
    }

    /**
     * Gets the value of the note4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote4() {
        return note4;
    }

    /**
     * Sets the value of the note4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote4(String value) {
        this.note4 = value;
    }

}
