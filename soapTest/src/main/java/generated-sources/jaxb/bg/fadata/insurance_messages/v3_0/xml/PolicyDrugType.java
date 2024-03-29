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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PolicyDrug_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyDrug_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolDrugID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}DrugID" minOccurs="0"/>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}DrugCode"/>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}DrugName" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}DrugGroupID" minOccurs="0"/>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}DrugGroupCode"/>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}DrugGroupName" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}GeogAreaCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}GeogAreaName" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ProviderID" minOccurs="0"/>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ProviderCode"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}NetworkID" minOccurs="0"/>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}NetworkCode"/>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}NetworkName" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CoverageType" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ClaimType" minOccurs="0"/>
 *         &lt;element name="SettlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}NetworkCoverage" minOccurs="0"/>
 *         &lt;element name="DrugLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Currency" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CoverCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}InsuredObjectID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}GroupID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}AnnexID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}AuxAnnexID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}InsrBegin" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}InsrEnd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyDrug_Type", propOrder = {
    "polDrugID",
    "drugID",
    "drugCode",
    "drugName",
    "drugGroupID",
    "drugGroupCode",
    "drugGroupName",
    "geogAreaCode",
    "geogAreaName",
    "providerID",
    "providerCode",
    "networkID",
    "networkCode",
    "networkName",
    "coverageType",
    "claimType",
    "settlementType",
    "networkCoverage",
    "drugLimit",
    "currency",
    "coverCode",
    "insuredObjectID",
    "groupID",
    "annexID",
    "auxAnnexID",
    "insrBegin",
    "insrEnd"
})
public class PolicyDrugType {

    @XmlElement(name = "PolDrugID")
    protected Long polDrugID;
    @XmlElement(name = "DrugID")
    protected Long drugID;
    @XmlElement(name = "DrugCode")
    protected String drugCode;
    @XmlElement(name = "DrugName")
    protected String drugName;
    @XmlElement(name = "DrugGroupID")
    protected Long drugGroupID;
    @XmlElement(name = "DrugGroupCode")
    protected String drugGroupCode;
    @XmlElement(name = "DrugGroupName")
    protected String drugGroupName;
    @XmlElement(name = "GeogAreaCode")
    protected String geogAreaCode;
    @XmlElement(name = "GeogAreaName")
    protected String geogAreaName;
    @XmlElement(name = "ProviderID")
    protected Long providerID;
    @XmlElement(name = "ProviderCode")
    protected String providerCode;
    @XmlElement(name = "NetworkID")
    protected Long networkID;
    @XmlElement(name = "NetworkCode")
    protected String networkCode;
    @XmlElement(name = "NetworkName")
    protected String networkName;
    @XmlElement(name = "CoverageType")
    protected String coverageType;
    @XmlElement(name = "ClaimType")
    protected String claimType;
    @XmlElement(name = "SettlementType")
    protected String settlementType;
    @XmlElement(name = "NetworkCoverage")
    protected String networkCoverage;
    @XmlElement(name = "DrugLimit")
    protected BigDecimal drugLimit;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "CoverCode")
    protected String coverCode;
    @XmlElement(name = "InsuredObjectID")
    protected Long insuredObjectID;
    @XmlElement(name = "GroupID")
    protected Long groupID;
    @XmlElement(name = "AnnexID")
    protected BigInteger annexID;
    @XmlElement(name = "AuxAnnexID")
    protected BigInteger auxAnnexID;
    @XmlElement(name = "InsrBegin")
    protected String insrBegin;
    @XmlElement(name = "InsrEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar insrEnd;

    /**
     * Gets the value of the polDrugID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolDrugID() {
        return polDrugID;
    }

    /**
     * Sets the value of the polDrugID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolDrugID(Long value) {
        this.polDrugID = value;
    }

    /**
     * Gets the value of the drugID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDrugID() {
        return drugID;
    }

    /**
     * Sets the value of the drugID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDrugID(Long value) {
        this.drugID = value;
    }

    /**
     * Gets the value of the drugCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * Sets the value of the drugCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugCode(String value) {
        this.drugCode = value;
    }

    /**
     * Gets the value of the drugName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * Sets the value of the drugName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugName(String value) {
        this.drugName = value;
    }

    /**
     * Gets the value of the drugGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDrugGroupID() {
        return drugGroupID;
    }

    /**
     * Sets the value of the drugGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDrugGroupID(Long value) {
        this.drugGroupID = value;
    }

    /**
     * Gets the value of the drugGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugGroupCode() {
        return drugGroupCode;
    }

    /**
     * Sets the value of the drugGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugGroupCode(String value) {
        this.drugGroupCode = value;
    }

    /**
     * Gets the value of the drugGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugGroupName() {
        return drugGroupName;
    }

    /**
     * Sets the value of the drugGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugGroupName(String value) {
        this.drugGroupName = value;
    }

    /**
     * Gets the value of the geogAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogAreaCode() {
        return geogAreaCode;
    }

    /**
     * Sets the value of the geogAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeogAreaCode(String value) {
        this.geogAreaCode = value;
    }

    /**
     * Gets the value of the geogAreaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogAreaName() {
        return geogAreaName;
    }

    /**
     * Sets the value of the geogAreaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeogAreaName(String value) {
        this.geogAreaName = value;
    }

    /**
     * Gets the value of the providerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProviderID() {
        return providerID;
    }

    /**
     * Sets the value of the providerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProviderID(Long value) {
        this.providerID = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the networkID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNetworkID(Long value) {
        this.networkID = value;
    }

    /**
     * Gets the value of the networkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkCode() {
        return networkCode;
    }

    /**
     * Sets the value of the networkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkCode(String value) {
        this.networkCode = value;
    }

    /**
     * Gets the value of the networkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkName() {
        return networkName;
    }

    /**
     * Sets the value of the networkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkName(String value) {
        this.networkName = value;
    }

    /**
     * Gets the value of the coverageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageType() {
        return coverageType;
    }

    /**
     * Sets the value of the coverageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageType(String value) {
        this.coverageType = value;
    }

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimType(String value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementType(String value) {
        this.settlementType = value;
    }

    /**
     * Gets the value of the networkCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkCoverage() {
        return networkCoverage;
    }

    /**
     * Sets the value of the networkCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkCoverage(String value) {
        this.networkCoverage = value;
    }

    /**
     * Gets the value of the drugLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDrugLimit() {
        return drugLimit;
    }

    /**
     * Sets the value of the drugLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDrugLimit(BigDecimal value) {
        this.drugLimit = value;
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
     * Gets the value of the insuredObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInsuredObjectID() {
        return insuredObjectID;
    }

    /**
     * Sets the value of the insuredObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInsuredObjectID(Long value) {
        this.insuredObjectID = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupID(Long value) {
        this.groupID = value;
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
     * Gets the value of the auxAnnexID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuxAnnexID() {
        return auxAnnexID;
    }

    /**
     * Sets the value of the auxAnnexID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuxAnnexID(BigInteger value) {
        this.auxAnnexID = value;
    }

    /**
     * Gets the value of the insrBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsrBegin() {
        return insrBegin;
    }

    /**
     * Sets the value of the insrBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsrBegin(String value) {
        this.insrBegin = value;
    }

    /**
     * Gets the value of the insrEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsrEnd() {
        return insrEnd;
    }

    /**
     * Sets the value of the insrEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsrEnd(XMLGregorianCalendar value) {
        this.insrEnd = value;
    }

}
