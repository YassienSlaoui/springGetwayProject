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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClientData_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClientData_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorporateIcStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IcStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfficialStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profitability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Segment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientData_Type", propOrder = {
    "corporateIcStatus",
    "customerType",
    "employeeStatus",
    "icStatus",
    "officialStatus",
    "profitability",
    "riskRating",
    "segment",
    "clientId"
})
public class ClientDataType {

    @XmlElement(name = "CorporateIcStatus")
    protected String corporateIcStatus;
    @XmlElement(name = "CustomerType")
    protected String customerType;
    @XmlElement(name = "EmployeeStatus")
    protected String employeeStatus;
    @XmlElement(name = "IcStatus")
    protected String icStatus;
    @XmlElement(name = "OfficialStatus")
    protected String officialStatus;
    @XmlElement(name = "Profitability")
    protected String profitability;
    @XmlElement(name = "RiskRating")
    protected String riskRating;
    @XmlElement(name = "Segment")
    protected String segment;
    @XmlElement(name = "ClientId")
    protected BigInteger clientId;

    /**
     * Gets the value of the corporateIcStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateIcStatus() {
        return corporateIcStatus;
    }

    /**
     * Sets the value of the corporateIcStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateIcStatus(String value) {
        this.corporateIcStatus = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the employeeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeStatus() {
        return employeeStatus;
    }

    /**
     * Sets the value of the employeeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeStatus(String value) {
        this.employeeStatus = value;
    }

    /**
     * Gets the value of the icStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcStatus() {
        return icStatus;
    }

    /**
     * Sets the value of the icStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcStatus(String value) {
        this.icStatus = value;
    }

    /**
     * Gets the value of the officialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialStatus() {
        return officialStatus;
    }

    /**
     * Sets the value of the officialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialStatus(String value) {
        this.officialStatus = value;
    }

    /**
     * Gets the value of the profitability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitability() {
        return profitability;
    }

    /**
     * Sets the value of the profitability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitability(String value) {
        this.profitability = value;
    }

    /**
     * Gets the value of the riskRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskRating() {
        return riskRating;
    }

    /**
     * Sets the value of the riskRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskRating(String value) {
        this.riskRating = value;
    }

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClientId(BigInteger value) {
        this.clientId = value;
    }

}
