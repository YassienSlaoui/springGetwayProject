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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChngPropBri_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChngPropBri_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Construction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConstructionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}AddressID"/>
 *           &lt;element name="NewAddress" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Object_Address_Type"/>
 *         &lt;/choice>
 *         &lt;element name="BriDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskLocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CustomProperties" minOccurs="0"/>
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
@XmlType(name = "ChngPropBri_Type", propOrder = {
    "construction",
    "constructionType",
    "area",
    "addressID",
    "newAddress",
    "briDescription",
    "riskLocationID",
    "customProperties",
    "creditors"
})
public class ChngPropBriType {

    @XmlElement(name = "Construction")
    protected String construction;
    @XmlElement(name = "ConstructionType")
    protected String constructionType;
    @XmlElement(name = "Area")
    protected BigDecimal area;
    @XmlElement(name = "AddressID")
    protected BigInteger addressID;
    @XmlElement(name = "NewAddress")
    protected ObjectAddressType newAddress;
    @XmlElement(name = "BriDescription")
    protected String briDescription;
    @XmlElement(name = "RiskLocationID")
    protected String riskLocationID;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;
    @XmlElement(name = "Creditors")
    protected ObjectsCreditedType creditors;

    /**
     * Gets the value of the construction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstruction() {
        return construction;
    }

    /**
     * Sets the value of the construction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstruction(String value) {
        this.construction = value;
    }

    /**
     * Gets the value of the constructionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionType() {
        return constructionType;
    }

    /**
     * Sets the value of the constructionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionType(String value) {
        this.constructionType = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArea(BigDecimal value) {
        this.area = value;
    }

    /**
     * Gets the value of the addressID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddressID() {
        return addressID;
    }

    /**
     * Sets the value of the addressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddressID(BigInteger value) {
        this.addressID = value;
    }

    /**
     * Gets the value of the newAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectAddressType }
     *     
     */
    public ObjectAddressType getNewAddress() {
        return newAddress;
    }

    /**
     * Sets the value of the newAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectAddressType }
     *     
     */
    public void setNewAddress(ObjectAddressType value) {
        this.newAddress = value;
    }

    /**
     * Gets the value of the briDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBriDescription() {
        return briDescription;
    }

    /**
     * Sets the value of the briDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBriDescription(String value) {
        this.briDescription = value;
    }

    /**
     * Gets the value of the riskLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskLocationID() {
        return riskLocationID;
    }

    /**
     * Sets the value of the riskLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskLocationID(String value) {
        this.riskLocationID = value;
    }

    /**
     * Possible custom properties for buildings under
     *                         construction (FiledName | Description | Product Code):
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
