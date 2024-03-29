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
 * <p>Java class for Coverage_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coverage_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoverageID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CoverageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Placement" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PlacementDim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Premium" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PremiumDim" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Currency"/>
 *         &lt;element name="AggregatedLimit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AggregatedDeductible" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Retention" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Limit" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}RegistrationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedBy" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedOn" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CustomProperties" minOccurs="0"/>
 *         &lt;element name="Retrocession" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Retrocession_Type" minOccurs="0"/>
 *         &lt;element name="Assignment" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CoverageAssign_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coverage_Type", propOrder = {
    "coverageID",
    "coverageName",
    "placement",
    "placementDim",
    "premium",
    "premiumDim",
    "currency",
    "aggregatedLimit",
    "aggregatedDeductible",
    "retention",
    "limit",
    "username",
    "registrationDate",
    "updatedBy",
    "updatedOn",
    "customProperties",
    "retrocession",
    "assignment"
})
public class CoverageType {

    @XmlElement(name = "CoverageID")
    protected Long coverageID;
    @XmlElement(name = "CoverageName", required = true)
    protected String coverageName;
    @XmlElement(name = "Placement")
    protected double placement;
    @XmlElement(name = "PlacementDim", required = true)
    protected String placementDim;
    @XmlElement(name = "Premium")
    protected double premium;
    @XmlElement(name = "PremiumDim", required = true)
    protected String premiumDim;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "AggregatedLimit")
    protected Double aggregatedLimit;
    @XmlElement(name = "AggregatedDeductible")
    protected Double aggregatedDeductible;
    @XmlElement(name = "Retention")
    protected Double retention;
    @XmlElement(name = "Limit")
    protected Double limit;
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
    @XmlElement(name = "Retrocession")
    protected RetrocessionType retrocession;
    @XmlElement(name = "Assignment")
    protected CoverageAssignType assignment;

    /**
     * Gets the value of the coverageID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCoverageID() {
        return coverageID;
    }

    /**
     * Sets the value of the coverageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCoverageID(Long value) {
        this.coverageID = value;
    }

    /**
     * Gets the value of the coverageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageName() {
        return coverageName;
    }

    /**
     * Sets the value of the coverageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageName(String value) {
        this.coverageName = value;
    }

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
     * Gets the value of the aggregatedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAggregatedLimit() {
        return aggregatedLimit;
    }

    /**
     * Sets the value of the aggregatedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAggregatedLimit(Double value) {
        this.aggregatedLimit = value;
    }

    /**
     * Gets the value of the aggregatedDeductible property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAggregatedDeductible() {
        return aggregatedDeductible;
    }

    /**
     * Sets the value of the aggregatedDeductible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAggregatedDeductible(Double value) {
        this.aggregatedDeductible = value;
    }

    /**
     * Gets the value of the retention property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetention() {
        return retention;
    }

    /**
     * Sets the value of the retention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetention(Double value) {
        this.retention = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLimit(Double value) {
        this.limit = value;
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

    /**
     * Gets the value of the retrocession property.
     * 
     * @return
     *     possible object is
     *     {@link RetrocessionType }
     *     
     */
    public RetrocessionType getRetrocession() {
        return retrocession;
    }

    /**
     * Sets the value of the retrocession property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrocessionType }
     *     
     */
    public void setRetrocession(RetrocessionType value) {
        this.retrocession = value;
    }

    /**
     * Gets the value of the assignment property.
     * 
     * @return
     *     possible object is
     *     {@link CoverageAssignType }
     *     
     */
    public CoverageAssignType getAssignment() {
        return assignment;
    }

    /**
     * Sets the value of the assignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverageAssignType }
     *     
     */
    public void setAssignment(CoverageAssignType value) {
        this.assignment = value;
    }

}
