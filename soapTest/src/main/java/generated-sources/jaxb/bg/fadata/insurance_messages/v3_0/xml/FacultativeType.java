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
 * <p>Java class for Facultative_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Facultative_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="InOutFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FacType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TreatyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FacNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FacAnnexID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FacAuxAnnexID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FacDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="InwardLeaderFlag" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}BOOLEAN_STRING_TYPE" minOccurs="0"/>
 *         &lt;element name="InwardPlacement" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PolicyID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}AnnexID" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}RegistrationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedBy" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}UpdatedOn" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CustomProperties" minOccurs="0"/>
 *         &lt;element name="InsurerGroups" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}InsurerGroups_Type" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}FacFees_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Facultative_Type", propOrder = {
    "facID",
    "inOutFlag",
    "facType",
    "treatyType",
    "facNo",
    "facAnnexID",
    "facAuxAnnexID",
    "facDescription",
    "beginDate",
    "endDate",
    "inwardLeaderFlag",
    "inwardPlacement",
    "status",
    "policyID",
    "annexID",
    "username",
    "registrationDate",
    "updatedBy",
    "updatedOn",
    "customProperties",
    "insurerGroups",
    "fees"
})
public class FacultativeType {

    @XmlElement(name = "FacID")
    protected Long facID;
    @XmlElement(name = "InOutFlag", required = true)
    protected String inOutFlag;
    @XmlElement(name = "FacType", required = true)
    protected String facType;
    @XmlElement(name = "TreatyType", required = true)
    protected String treatyType;
    @XmlElement(name = "FacNo", required = true)
    protected String facNo;
    @XmlElement(name = "FacAnnexID")
    protected int facAnnexID;
    @XmlElement(name = "FacAuxAnnexID")
    protected Integer facAuxAnnexID;
    @XmlElement(name = "FacDescription")
    protected String facDescription;
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "InwardLeaderFlag")
    protected String inwardLeaderFlag;
    @XmlElement(name = "InwardPlacement")
    protected Double inwardPlacement;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "PolicyID")
    protected Long policyID;
    @XmlElement(name = "AnnexID")
    protected BigInteger annexID;
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
    @XmlElement(name = "InsurerGroups")
    protected InsurerGroupsType insurerGroups;
    @XmlElement(name = "Fees")
    protected FacFeesType fees;

    /**
     * Gets the value of the facID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFacID() {
        return facID;
    }

    /**
     * Sets the value of the facID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFacID(Long value) {
        this.facID = value;
    }

    /**
     * Gets the value of the inOutFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOutFlag() {
        return inOutFlag;
    }

    /**
     * Sets the value of the inOutFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOutFlag(String value) {
        this.inOutFlag = value;
    }

    /**
     * Gets the value of the facType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacType() {
        return facType;
    }

    /**
     * Sets the value of the facType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacType(String value) {
        this.facType = value;
    }

    /**
     * Gets the value of the treatyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatyType() {
        return treatyType;
    }

    /**
     * Sets the value of the treatyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatyType(String value) {
        this.treatyType = value;
    }

    /**
     * Gets the value of the facNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacNo() {
        return facNo;
    }

    /**
     * Sets the value of the facNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacNo(String value) {
        this.facNo = value;
    }

    /**
     * Gets the value of the facAnnexID property.
     * 
     */
    public int getFacAnnexID() {
        return facAnnexID;
    }

    /**
     * Sets the value of the facAnnexID property.
     * 
     */
    public void setFacAnnexID(int value) {
        this.facAnnexID = value;
    }

    /**
     * Gets the value of the facAuxAnnexID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFacAuxAnnexID() {
        return facAuxAnnexID;
    }

    /**
     * Sets the value of the facAuxAnnexID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFacAuxAnnexID(Integer value) {
        this.facAuxAnnexID = value;
    }

    /**
     * Gets the value of the facDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacDescription() {
        return facDescription;
    }

    /**
     * Sets the value of the facDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacDescription(String value) {
        this.facDescription = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the inwardLeaderFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInwardLeaderFlag() {
        return inwardLeaderFlag;
    }

    /**
     * Sets the value of the inwardLeaderFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInwardLeaderFlag(String value) {
        this.inwardLeaderFlag = value;
    }

    /**
     * Gets the value of the inwardPlacement property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInwardPlacement() {
        return inwardPlacement;
    }

    /**
     * Sets the value of the inwardPlacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInwardPlacement(Double value) {
        this.inwardPlacement = value;
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
     * Gets the value of the policyID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolicyID() {
        return policyID;
    }

    /**
     * Sets the value of the policyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolicyID(Long value) {
        this.policyID = value;
    }

    /**
     * Gets the value of the annexID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnnexID() {
        return annexID;
    }

    /**
     * Sets the value of the annexID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnnexID(BigInteger value) {
        this.annexID = value;
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
     * Gets the value of the insurerGroups property.
     * 
     * @return
     *     possible object is
     *     {@link InsurerGroupsType }
     *     
     */
    public InsurerGroupsType getInsurerGroups() {
        return insurerGroups;
    }

    /**
     * Sets the value of the insurerGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsurerGroupsType }
     *     
     */
    public void setInsurerGroups(InsurerGroupsType value) {
        this.insurerGroups = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FacFeesType }
     *     
     */
    public FacFeesType getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacFeesType }
     *     
     */
    public void setFees(FacFeesType value) {
        this.fees = value;
    }

}
