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
 * <p>Java class for ChngAccidentInsured_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChngAccidentInsured_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="PersonID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PID"/>
 *           &lt;group ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}People_Data_Group"/>
 *         &lt;/choice>
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AccinsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccinsSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CustomProperties" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}GENDER_VALUE_TYPE" minOccurs="0"/>
 *         &lt;element name="DependentOn" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}DependentOn_Type" minOccurs="0"/>
 *         &lt;element name="Creditors" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ObjectsCredited_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChngAccidentInsured_Type", propOrder = {
    "personID",
    "pid",
    "entity",
    "addresses",
    "contacts",
    "bankAccounts",
    "creditCards",
    "age",
    "accinsType",
    "accinsSubtype",
    "customProperties",
    "gender",
    "dependentOn",
    "creditors"
})
public class ChngAccidentInsuredType {

    @XmlElement(name = "PersonID")
    protected Long personID;
    @XmlElement(name = "PID")
    protected String pid;
    @XmlElement(name = "Entity")
    protected EntityType entity;
    @XmlElement(name = "Addresses")
    protected AddressesType addresses;
    @XmlElement(name = "Contacts")
    protected ContactsType contacts;
    @XmlElement(name = "BankAccounts")
    protected BankAccntsType bankAccounts;
    @XmlElement(name = "CreditCards")
    protected CreditCardsType creditCards;
    @XmlElement(name = "Age")
    protected BigInteger age;
    @XmlElement(name = "AccinsType")
    protected String accinsType;
    @XmlElement(name = "AccinsSubtype")
    protected String accinsSubtype;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;
    @XmlElement(name = "Gender")
    protected BigInteger gender;
    @XmlElement(name = "DependentOn")
    protected DependentOnType dependentOn;
    @XmlElement(name = "Creditors")
    protected ObjectsCreditedType creditors;

    /**
     * Gets the value of the personID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonID(Long value) {
        this.personID = value;
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
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * Gets the value of the accinsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccinsType() {
        return accinsType;
    }

    /**
     * Sets the value of the accinsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccinsType(String value) {
        this.accinsType = value;
    }

    /**
     * Gets the value of the accinsSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccinsSubtype() {
        return accinsSubtype;
    }

    /**
     * Sets the value of the accinsSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccinsSubtype(String value) {
        this.accinsSubtype = value;
    }

    /**
     * Possible custom properties for insured. (FiledName |
     *                         Description | Product Code):
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
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGender(BigInteger value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dependentOn property.
     * 
     * @return
     *     possible object is
     *     {@link DependentOnType }
     *     
     */
    public DependentOnType getDependentOn() {
        return dependentOn;
    }

    /**
     * Sets the value of the dependentOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependentOnType }
     *     
     */
    public void setDependentOn(DependentOnType value) {
        this.dependentOn = value;
    }

    /**
     * Gets the value of the creditors property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectsCreditedType }
     *     
     */
    public ObjectsCreditedType getCreditors() {
        return creditors;
    }

    /**
     * Sets the value of the creditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectsCreditedType }
     *     
     */
    public void setCreditors(ObjectsCreditedType value) {
        this.creditors = value;
    }

}
