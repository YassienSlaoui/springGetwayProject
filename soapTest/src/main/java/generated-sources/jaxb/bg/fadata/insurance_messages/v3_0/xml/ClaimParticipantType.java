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
 * <p>Java class for ClaimParticipant_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimParticipant_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParticipantID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ClaimID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}RequestNo" minOccurs="0"/>
 *         &lt;group ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}People_Data_Group"/>
 *         &lt;element name="ParticipantRole" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Rank" minOccurs="0"/>
 *         &lt;element name="AppointmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Percentage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedBy" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedOn" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CustomProperties" minOccurs="0"/>
 *         &lt;element name="Additions" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ClaimParticipantAdditions_Type" minOccurs="0"/>
 *         &lt;element name="ClaimBankAccounts" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ClaimBankAccounts_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimParticipant_Type", propOrder = {
    "participantID",
    "claimID",
    "requestNo",
    "entity",
    "addresses",
    "contacts",
    "bankAccounts",
    "creditCards",
    "participantRole",
    "rank",
    "appointmentDate",
    "reportNo",
    "reportDate",
    "percentage",
    "notes",
    "updatedBy",
    "updatedOn",
    "customProperties",
    "additions",
    "claimBankAccounts"
})
public class ClaimParticipantType {

    @XmlElement(name = "ParticipantID")
    protected Long participantID;
    @XmlElement(name = "ClaimID")
    protected String claimID;
    @XmlElement(name = "RequestNo")
    protected BigInteger requestNo;
    @XmlElement(name = "Entity", required = true)
    protected EntityType entity;
    @XmlElement(name = "Addresses")
    protected AddressesType addresses;
    @XmlElement(name = "Contacts")
    protected ContactsType contacts;
    @XmlElement(name = "BankAccounts")
    protected BankAccntsType bankAccounts;
    @XmlElement(name = "CreditCards")
    protected CreditCardsType creditCards;
    @XmlElement(name = "ParticipantRole", required = true)
    protected String participantRole;
    @XmlElement(name = "Rank")
    protected String rank;
    @XmlElement(name = "AppointmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar appointmentDate;
    @XmlElement(name = "ReportNo")
    protected String reportNo;
    @XmlElement(name = "ReportDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportDate;
    @XmlElement(name = "Percentage")
    protected BigDecimal percentage;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "UpdatedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedOn;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;
    @XmlElement(name = "Additions")
    protected ClaimParticipantAdditionsType additions;
    @XmlElement(name = "ClaimBankAccounts")
    protected ClaimBankAccountsType claimBankAccounts;

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
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntity(EntityType value) {
        this.entity = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link AddressesType }
     *     
     */
    public AddressesType getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressesType }
     *     
     */
    public void setAddresses(AddressesType value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ContactsType }
     *     
     */
    public ContactsType getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactsType }
     *     
     */
    public void setContacts(ContactsType value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the bankAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccntsType }
     *     
     */
    public BankAccntsType getBankAccounts() {
        return bankAccounts;
    }

    /**
     * Sets the value of the bankAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccntsType }
     *     
     */
    public void setBankAccounts(BankAccntsType value) {
        this.bankAccounts = value;
    }

    /**
     * Gets the value of the creditCards property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardsType }
     *     
     */
    public CreditCardsType getCreditCards() {
        return creditCards;
    }

    /**
     * Sets the value of the creditCards property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardsType }
     *     
     */
    public void setCreditCards(CreditCardsType value) {
        this.creditCards = value;
    }

    /**
     * Gets the value of the participantRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantRole() {
        return participantRole;
    }

    /**
     * Sets the value of the participantRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantRole(String value) {
        this.participantRole = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * Gets the value of the appointmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Sets the value of the appointmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentDate(XMLGregorianCalendar value) {
        this.appointmentDate = value;
    }

    /**
     * Gets the value of the reportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportNo() {
        return reportNo;
    }

    /**
     * Sets the value of the reportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportNo(String value) {
        this.reportNo = value;
    }

    /**
     * Gets the value of the reportDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDate() {
        return reportDate;
    }

    /**
     * Sets the value of the reportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDate(XMLGregorianCalendar value) {
        this.reportDate = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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
     * Gets the value of the additions property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimParticipantAdditionsType }
     *     
     */
    public ClaimParticipantAdditionsType getAdditions() {
        return additions;
    }

    /**
     * Sets the value of the additions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimParticipantAdditionsType }
     *     
     */
    public void setAdditions(ClaimParticipantAdditionsType value) {
        this.additions = value;
    }

    /**
     * Gets the value of the claimBankAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimBankAccountsType }
     *     
     */
    public ClaimBankAccountsType getClaimBankAccounts() {
        return claimBankAccounts;
    }

    /**
     * Sets the value of the claimBankAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimBankAccountsType }
     *     
     */
    public void setClaimBankAccounts(ClaimBankAccountsType value) {
        this.claimBankAccounts = value;
    }

}
