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
 * <p>Java class for LinkedCover_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedCover_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CoverCode"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CoverInstanceDscr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedCover_Type", propOrder = {
    "coverCode",
    "coverInstanceDscr"
})
public class LinkedCoverType {

    @XmlElement(name = "CoverCode", required = true)
    protected String coverCode;
    @XmlElement(name = "CoverInstanceDscr")
    protected String coverInstanceDscr;

    /**
     * Gets the value of the coverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverCode() {
        return coverCode;
    }

    /**
     * Sets the value of the coverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverCode(String value) {
        this.coverCode = value;
    }

    /**
     * Gets the value of the coverInstanceDscr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverInstanceDscr() {
        return coverInstanceDscr;
    }

    /**
     * Sets the value of the coverInstanceDscr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverInstanceDscr(String value) {
        this.coverInstanceDscr = value;
    }

}
