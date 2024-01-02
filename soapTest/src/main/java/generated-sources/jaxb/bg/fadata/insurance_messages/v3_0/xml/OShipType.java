//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.28 at 08:49:50 AM WEST 
//


package bg.fadata.insurance_messages.v3_0.xml;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OShip_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OShip_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShipClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShipSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrossTonage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetTonage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OwnerClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Wide" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Wade" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DeadWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreviousInsurer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassengerNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CrewNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LastMaintenanceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Engine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProdYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Producer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClaimInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CustomProperties" minOccurs="0"/>
 *         &lt;element name="SupplementaryEquipment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}OAdditionalEquipment" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "OShip_Type", propOrder = {
    "name",
    "shipClass",
    "shipType",
    "shipSubtype",
    "regNo",
    "regPort",
    "grossTonage",
    "netTonage",
    "ownerClass",
    "length",
    "height",
    "wide",
    "wade",
    "deadWeight",
    "region",
    "previousInsurer",
    "passengerNum",
    "crewNum",
    "lastMaintenanceDate",
    "engine",
    "prodInfo",
    "prodYear",
    "producer",
    "claimInfo",
    "customProperties",
    "supplementaryEquipment",
    "creditors"
})
public class OShipType {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "ShipClass")
    protected String shipClass;
    @XmlElement(name = "ShipType")
    protected String shipType;
    @XmlElement(name = "ShipSubtype")
    protected String shipSubtype;
    @XmlElement(name = "RegNo", required = true)
    protected String regNo;
    @XmlElement(name = "RegPort")
    protected String regPort;
    @XmlElement(name = "GrossTonage")
    protected BigDecimal grossTonage;
    @XmlElement(name = "NetTonage")
    protected BigDecimal netTonage;
    @XmlElement(name = "OwnerClass")
    protected String ownerClass;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "Wide")
    protected BigDecimal wide;
    @XmlElement(name = "Wade")
    protected BigDecimal wade;
    @XmlElement(name = "DeadWeight")
    protected BigDecimal deadWeight;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "PreviousInsurer")
    protected String previousInsurer;
    @XmlElement(name = "PassengerNum")
    protected BigInteger passengerNum;
    @XmlElement(name = "CrewNum")
    protected BigInteger crewNum;
    @XmlElement(name = "LastMaintenanceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastMaintenanceDate;
    @XmlElement(name = "Engine")
    protected String engine;
    @XmlElement(name = "ProdInfo")
    protected String prodInfo;
    @XmlElement(name = "ProdYear")
    protected BigInteger prodYear;
    @XmlElement(name = "Producer")
    protected String producer;
    @XmlElement(name = "ClaimInfo")
    protected String claimInfo;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;
    @XmlElement(name = "SupplementaryEquipment")
    protected OShipType.SupplementaryEquipment supplementaryEquipment;
    @XmlElement(name = "Creditors")
    protected ObjectsCreditedType creditors;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shipClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipClass() {
        return shipClass;
    }

    /**
     * Sets the value of the shipClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipClass(String value) {
        this.shipClass = value;
    }

    /**
     * Gets the value of the shipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipType() {
        return shipType;
    }

    /**
     * Sets the value of the shipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipType(String value) {
        this.shipType = value;
    }

    /**
     * Gets the value of the shipSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipSubtype() {
        return shipSubtype;
    }

    /**
     * Sets the value of the shipSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipSubtype(String value) {
        this.shipSubtype = value;
    }

    /**
     * Gets the value of the regNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * Sets the value of the regNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegNo(String value) {
        this.regNo = value;
    }

    /**
     * Gets the value of the regPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegPort() {
        return regPort;
    }

    /**
     * Sets the value of the regPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegPort(String value) {
        this.regPort = value;
    }

    /**
     * Gets the value of the grossTonage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossTonage() {
        return grossTonage;
    }

    /**
     * Sets the value of the grossTonage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossTonage(BigDecimal value) {
        this.grossTonage = value;
    }

    /**
     * Gets the value of the netTonage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetTonage() {
        return netTonage;
    }

    /**
     * Sets the value of the netTonage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetTonage(BigDecimal value) {
        this.netTonage = value;
    }

    /**
     * Gets the value of the ownerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerClass() {
        return ownerClass;
    }

    /**
     * Sets the value of the ownerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerClass(String value) {
        this.ownerClass = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Gets the value of the wide property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWide() {
        return wide;
    }

    /**
     * Sets the value of the wide property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWide(BigDecimal value) {
        this.wide = value;
    }

    /**
     * Gets the value of the wade property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWade() {
        return wade;
    }

    /**
     * Sets the value of the wade property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWade(BigDecimal value) {
        this.wade = value;
    }

    /**
     * Gets the value of the deadWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeadWeight() {
        return deadWeight;
    }

    /**
     * Sets the value of the deadWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeadWeight(BigDecimal value) {
        this.deadWeight = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the previousInsurer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousInsurer() {
        return previousInsurer;
    }

    /**
     * Sets the value of the previousInsurer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousInsurer(String value) {
        this.previousInsurer = value;
    }

    /**
     * Gets the value of the passengerNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengerNum() {
        return passengerNum;
    }

    /**
     * Sets the value of the passengerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengerNum(BigInteger value) {
        this.passengerNum = value;
    }

    /**
     * Gets the value of the crewNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCrewNum() {
        return crewNum;
    }

    /**
     * Sets the value of the crewNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCrewNum(BigInteger value) {
        this.crewNum = value;
    }

    /**
     * Gets the value of the lastMaintenanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    /**
     * Sets the value of the lastMaintenanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastMaintenanceDate(XMLGregorianCalendar value) {
        this.lastMaintenanceDate = value;
    }

    /**
     * Gets the value of the engine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Sets the value of the engine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngine(String value) {
        this.engine = value;
    }

    /**
     * Gets the value of the prodInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdInfo() {
        return prodInfo;
    }

    /**
     * Sets the value of the prodInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdInfo(String value) {
        this.prodInfo = value;
    }

    /**
     * Gets the value of the prodYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProdYear() {
        return prodYear;
    }

    /**
     * Sets the value of the prodYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProdYear(BigInteger value) {
        this.prodYear = value;
    }

    /**
     * Gets the value of the producer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Sets the value of the producer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducer(String value) {
        this.producer = value;
    }

    /**
     * Gets the value of the claimInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimInfo() {
        return claimInfo;
    }

    /**
     * Sets the value of the claimInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimInfo(String value) {
        this.claimInfo = value;
    }

    /**
     * Possible custom properties for ship
     *                                       (FiledName | Description | Product Code):
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
     * Gets the value of the supplementaryEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link OShipType.SupplementaryEquipment }
     *     
     */
    public OShipType.SupplementaryEquipment getSupplementaryEquipment() {
        return supplementaryEquipment;
    }

    /**
     * Sets the value of the supplementaryEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OShipType.SupplementaryEquipment }
     *     
     */
    public void setSupplementaryEquipment(OShipType.SupplementaryEquipment value) {
        this.supplementaryEquipment = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}OAdditionalEquipment" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "oAdditionalEquipment"
    })
    public static class SupplementaryEquipment {

        @XmlElement(name = "OAdditionalEquipment", required = true)
        protected List<OAdditionalEquipmentType> oAdditionalEquipment;

        /**
         * Gets the value of the oAdditionalEquipment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oAdditionalEquipment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOAdditionalEquipment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OAdditionalEquipmentType }
         * 
         * 
         */
        public List<OAdditionalEquipmentType> getOAdditionalEquipment() {
            if (oAdditionalEquipment == null) {
                oAdditionalEquipment = new ArrayList<OAdditionalEquipmentType>();
            }
            return this.oAdditionalEquipment;
        }

    }

}
