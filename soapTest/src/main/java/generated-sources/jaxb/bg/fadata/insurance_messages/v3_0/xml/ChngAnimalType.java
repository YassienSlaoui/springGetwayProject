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
 * <p>Java class for ChngAnimal_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChngAnimal_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnimalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnimalSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Breed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distinction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ChngAnimal_Type", propOrder = {
    "animalType",
    "animalSubtype",
    "breed",
    "name",
    "distinction",
    "customProperties",
    "creditors"
})
public class ChngAnimalType {

    @XmlElement(name = "AnimalType")
    protected String animalType;
    @XmlElement(name = "AnimalSubtype")
    protected String animalSubtype;
    @XmlElement(name = "Breed")
    protected String breed;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Distinction")
    protected String distinction;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;
    @XmlElement(name = "Creditors")
    protected ObjectsCreditedType creditors;

    /**
     * Gets the value of the animalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     * Sets the value of the animalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimalType(String value) {
        this.animalType = value;
    }

    /**
     * Gets the value of the animalSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimalSubtype() {
        return animalSubtype;
    }

    /**
     * Sets the value of the animalSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimalSubtype(String value) {
        this.animalSubtype = value;
    }

    /**
     * Gets the value of the breed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the value of the breed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreed(String value) {
        this.breed = value;
    }

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
     * Gets the value of the distinction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistinction() {
        return distinction;
    }

    /**
     * Sets the value of the distinction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistinction(String value) {
        this.distinction = value;
    }

    /**
     * Possible custom properties for animal (FiledName |
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