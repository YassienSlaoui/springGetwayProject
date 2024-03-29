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
 * <p>Java class for OInsuredGroups_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OInsuredGroups_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrpSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "OInsuredGroups_Type", propOrder = {
    "grpType",
    "grpSubtype",
    "description",
    "riskLocationID",
    "customProperties",
    "creditors"
})
public class OInsuredGroupsType {

    @XmlElement(name = "GrpType")
    protected String grpType;
    @XmlElement(name = "GrpSubtype")
    protected String grpSubtype;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "RiskLocationID")
    protected String riskLocationID;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;
    @XmlElement(name = "Creditors")
    protected ObjectsCreditedType creditors;

    /**
     * Gets the value of the grpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpType() {
        return grpType;
    }

    /**
     * Sets the value of the grpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpType(String value) {
        this.grpType = value;
    }

    /**
     * Gets the value of the grpSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpSubtype() {
        return grpSubtype;
    }

    /**
     * Sets the value of the grpSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpSubtype(String value) {
        this.grpSubtype = value;
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
     * Possible custom properties for insured
     *                                       groups (FiledName | Description | Product
     *                                       Code):
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
