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
 * <p>Java class for ClaimDamage_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimDamage_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DamageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LossPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RequestedQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RequestedAmnt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfirmedQty" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConfirmedAmnt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedBy" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedOn" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CustomProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimDamage_Type", propOrder = {
    "damageID",
    "description",
    "lossPercent",
    "requestedQty",
    "requestedAmnt",
    "price",
    "currency",
    "confirmedQty",
    "confirmedAmnt",
    "updatedBy",
    "updatedOn",
    "customProperties"
})
public class ClaimDamageType {

    @XmlElement(name = "DamageID", required = true)
    protected String damageID;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "LossPercent")
    protected Double lossPercent;
    @XmlElement(name = "RequestedQty")
    protected Integer requestedQty;
    @XmlElement(name = "RequestedAmnt")
    protected Double requestedAmnt;
    @XmlElement(name = "Price")
    protected Double price;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "ConfirmedQty")
    protected Integer confirmedQty;
    @XmlElement(name = "ConfirmedAmnt")
    protected Double confirmedAmnt;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "UpdatedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedOn;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;

    /**
     * Gets the value of the damageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamageID() {
        return damageID;
    }

    /**
     * Sets the value of the damageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamageID(String value) {
        this.damageID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the lossPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLossPercent() {
        return lossPercent;
    }

    /**
     * Sets the value of the lossPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLossPercent(Double value) {
        this.lossPercent = value;
    }

    /**
     * Gets the value of the requestedQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestedQty() {
        return requestedQty;
    }

    /**
     * Sets the value of the requestedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestedQty(Integer value) {
        this.requestedQty = value;
    }

    /**
     * Gets the value of the requestedAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRequestedAmnt() {
        return requestedAmnt;
    }

    /**
     * Sets the value of the requestedAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRequestedAmnt(Double value) {
        this.requestedAmnt = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice(Double value) {
        this.price = value;
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
     * Gets the value of the confirmedQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfirmedQty() {
        return confirmedQty;
    }

    /**
     * Sets the value of the confirmedQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfirmedQty(Integer value) {
        this.confirmedQty = value;
    }

    /**
     * Gets the value of the confirmedAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConfirmedAmnt() {
        return confirmedAmnt;
    }

    /**
     * Sets the value of the confirmedAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConfirmedAmnt(Double value) {
        this.confirmedAmnt = value;
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

}
