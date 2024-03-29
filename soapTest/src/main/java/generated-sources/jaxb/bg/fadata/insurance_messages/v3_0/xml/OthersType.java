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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Others_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Others_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}People_Data_Group"/>
 *         &lt;element name="OthersData" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ChangeOthersData_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Others_Type", propOrder = {
    "entity",
    "addresses",
    "contacts",
    "bankAccounts",
    "creditCards",
    "othersData"
})
public class OthersType {

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
    @XmlElement(name = "OthersData")
    protected ChangeOthersDataType othersData;

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
     * Gets the value of the othersData property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeOthersDataType }
     *     
     */
    public ChangeOthersDataType getOthersData() {
        return othersData;
    }

    /**
     * Sets the value of the othersData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOthersDataType }
     *     
     */
    public void setOthersData(ChangeOthersDataType value) {
        this.othersData = value;
    }

}
