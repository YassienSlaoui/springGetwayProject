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
 * <p>Java class for Retrocession_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Retrocession_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Placement" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PlacementDim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Premium" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PremiumDim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Commission" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CommissionDim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Currency"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}RegistrationDate" minOccurs="0"/>
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
@XmlType(name = "Retrocession_Type", propOrder = {
    "placement",
    "placementDim",
    "premium",
    "premiumDim",
    "commission",
    "commissionDim",
    "currency",
    "username",
    "registrationDate",
    "updatedBy",
    "updatedOn",
    "customProperties"
})
public class RetrocessionType {

    @XmlElement(name = "Placement")
    protected double placement;
    @XmlElement(name = "PlacementDim", required = true)
    protected String placementDim;
    @XmlElement(name = "Premium")
    protected double premium;
    @XmlElement(name = "PremiumDim", required = true)
    protected String premiumDim;
    @XmlElement(name = "Commission")
    protected double commission;
    @XmlElement(name = "CommissionDim", required = true)
    protected String commissionDim;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "RegistrationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "UpdatedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedOn;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;

    /**
     * Gets the value of the placement property.
     * 
     */
    public double getPlacement() {
        return placement;
    }

    /**
     * Sets the value of the placement property.
     * 
     */
    public void setPlacement(double value) {
        this.placement = value;
    }

    /**
     * Gets the value of the placementDim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementDim() {
        return placementDim;
    }

    /**
     * Sets the value of the placementDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementDim(String value) {
        this.placementDim = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     */
    public double getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     */
    public void setPremium(double value) {
        this.premium = value;
    }

    /**
     * Gets the value of the premiumDim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumDim() {
        return premiumDim;
    }

    /**
     * Sets the value of the premiumDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumDim(String value) {
        this.premiumDim = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     */
    public void setCommission(double value) {
        this.commission = value;
    }

    /**
     * Gets the value of the commissionDim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommissionDim() {
        return commissionDim;
    }

    /**
     * Sets the value of the commissionDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommissionDim(String value) {
        this.commissionDim = value;
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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
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