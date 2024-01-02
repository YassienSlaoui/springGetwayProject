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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCar_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCar_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CarType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CarSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Make" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Modification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Chassis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Engine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CCMTon" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CarUsage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="SeatsNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DoorNum" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PaintType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProdYear" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="CarAge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CarColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnginePower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BonusMalus" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Tonage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EngineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FuelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DriveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CarBodyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WindowColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Modified" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}BOOLEAN_NUMBER_TYPE"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Notes" minOccurs="0"/>
 *         &lt;element name="VehicleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "OCar_Type", propOrder = {
    "regNo",
    "carType",
    "carSubtype",
    "model",
    "make",
    "modification",
    "chassis",
    "engine",
    "ccmTon",
    "carUsage",
    "seatsNum",
    "doorNum",
    "paintType",
    "prodYear",
    "carAge",
    "prodType",
    "carColor",
    "regType",
    "enginePower",
    "bonusMalus",
    "tonage",
    "engineType",
    "fuelType",
    "driveType",
    "carBodyType",
    "windowColor",
    "modified",
    "notes",
    "vehicleKey",
    "customProperties",
    "supplementaryEquipment",
    "creditors"
})
public class OCarType {

    @XmlElement(name = "RegNo", required = true)
    protected String regNo;
    @XmlElement(name = "CarType", required = true)
    protected String carType;
    @XmlElement(name = "CarSubtype")
    protected String carSubtype;
    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "Make", required = true)
    protected String make;
    @XmlElement(name = "Modification")
    protected String modification;
    @XmlElement(name = "Chassis", required = true)
    protected String chassis;
    @XmlElement(name = "Engine", required = true)
    protected String engine;
    @XmlElement(name = "CCMTon")
    protected BigDecimal ccmTon;
    @XmlElement(name = "CarUsage")
    protected BigInteger carUsage;
    @XmlElement(name = "SeatsNum")
    protected BigInteger seatsNum;
    @XmlElement(name = "DoorNum")
    protected BigInteger doorNum;
    @XmlElement(name = "PaintType", required = true)
    protected String paintType;
    @XmlElement(name = "ProdYear")
    protected BigInteger prodYear;
    @XmlElement(name = "CarAge")
    protected BigDecimal carAge;
    @XmlElement(name = "ProdType", required = true)
    protected String prodType;
    @XmlElement(name = "CarColor")
    protected String carColor;
    @XmlElement(name = "RegType")
    protected String regType;
    @XmlElement(name = "EnginePower")
    protected BigDecimal enginePower;
    @XmlElement(name = "BonusMalus")
    protected BigDecimal bonusMalus;
    @XmlElement(name = "Tonage")
    protected BigDecimal tonage;
    @XmlElement(name = "EngineType")
    protected String engineType;
    @XmlElement(name = "FuelType")
    protected String fuelType;
    @XmlElement(name = "DriveType")
    protected String driveType;
    @XmlElement(name = "CarBodyType")
    protected String carBodyType;
    @XmlElement(name = "WindowColor")
    protected String windowColor;
    @XmlElement(name = "Modified", required = true)
    protected String modified;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "VehicleKey")
    protected String vehicleKey;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;
    @XmlElement(name = "SupplementaryEquipment")
    protected OCarType.SupplementaryEquipment supplementaryEquipment;
    @XmlElement(name = "Creditors")
    protected ObjectsCreditedType creditors;

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
     * Gets the value of the carType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarType() {
        return carType;
    }

    /**
     * Sets the value of the carType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarType(String value) {
        this.carType = value;
    }

    /**
     * Gets the value of the carSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarSubtype() {
        return carSubtype;
    }

    /**
     * Sets the value of the carSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarSubtype(String value) {
        this.carSubtype = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModification(String value) {
        this.modification = value;
    }

    /**
     * Gets the value of the chassis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassis() {
        return chassis;
    }

    /**
     * Sets the value of the chassis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassis(String value) {
        this.chassis = value;
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
     * Gets the value of the ccmTon property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCCMTon() {
        return ccmTon;
    }

    /**
     * Sets the value of the ccmTon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCCMTon(BigDecimal value) {
        this.ccmTon = value;
    }

    /**
     * Gets the value of the carUsage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarUsage() {
        return carUsage;
    }

    /**
     * Sets the value of the carUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarUsage(BigInteger value) {
        this.carUsage = value;
    }

    /**
     * Gets the value of the seatsNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatsNum() {
        return seatsNum;
    }

    /**
     * Sets the value of the seatsNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeatsNum(BigInteger value) {
        this.seatsNum = value;
    }

    /**
     * Gets the value of the doorNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoorNum() {
        return doorNum;
    }

    /**
     * Sets the value of the doorNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoorNum(BigInteger value) {
        this.doorNum = value;
    }

    /**
     * Gets the value of the paintType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaintType() {
        return paintType;
    }

    /**
     * Sets the value of the paintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaintType(String value) {
        this.paintType = value;
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
     * Gets the value of the carAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarAge() {
        return carAge;
    }

    /**
     * Sets the value of the carAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarAge(BigDecimal value) {
        this.carAge = value;
    }

    /**
     * Gets the value of the prodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdType() {
        return prodType;
    }

    /**
     * Sets the value of the prodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdType(String value) {
        this.prodType = value;
    }

    /**
     * Gets the value of the carColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarColor() {
        return carColor;
    }

    /**
     * Sets the value of the carColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarColor(String value) {
        this.carColor = value;
    }

    /**
     * Gets the value of the regType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegType() {
        return regType;
    }

    /**
     * Sets the value of the regType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegType(String value) {
        this.regType = value;
    }

    /**
     * Gets the value of the enginePower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnginePower() {
        return enginePower;
    }

    /**
     * Sets the value of the enginePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnginePower(BigDecimal value) {
        this.enginePower = value;
    }

    /**
     * Gets the value of the bonusMalus property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBonusMalus() {
        return bonusMalus;
    }

    /**
     * Sets the value of the bonusMalus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBonusMalus(BigDecimal value) {
        this.bonusMalus = value;
    }

    /**
     * Gets the value of the tonage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTonage() {
        return tonage;
    }

    /**
     * Sets the value of the tonage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTonage(BigDecimal value) {
        this.tonage = value;
    }

    /**
     * Gets the value of the engineType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * Sets the value of the engineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineType(String value) {
        this.engineType = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuelType(String value) {
        this.fuelType = value;
    }

    /**
     * Gets the value of the driveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveType() {
        return driveType;
    }

    /**
     * Sets the value of the driveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveType(String value) {
        this.driveType = value;
    }

    /**
     * Gets the value of the carBodyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarBodyType() {
        return carBodyType;
    }

    /**
     * Sets the value of the carBodyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarBodyType(String value) {
        this.carBodyType = value;
    }

    /**
     * Gets the value of the windowColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowColor() {
        return windowColor;
    }

    /**
     * Sets the value of the windowColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowColor(String value) {
        this.windowColor = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModified(String value) {
        this.modified = value;
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
     * Gets the value of the vehicleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleKey() {
        return vehicleKey;
    }

    /**
     * Sets the value of the vehicleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleKey(String value) {
        this.vehicleKey = value;
    }

    /**
     * Possible custom properties for car
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
     *     {@link OCarType.SupplementaryEquipment }
     *     
     */
    public OCarType.SupplementaryEquipment getSupplementaryEquipment() {
        return supplementaryEquipment;
    }

    /**
     * Sets the value of the supplementaryEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCarType.SupplementaryEquipment }
     *     
     */
    public void setSupplementaryEquipment(OCarType.SupplementaryEquipment value) {
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