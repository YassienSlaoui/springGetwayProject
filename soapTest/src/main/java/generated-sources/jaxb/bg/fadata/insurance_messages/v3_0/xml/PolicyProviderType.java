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
 * <p>Java class for PolicyProvider_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyProvider_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyProviderID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContractID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ProviderID" minOccurs="0"/>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ProviderCode"/>
 *             &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ProviderName" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="ProviderGroupID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *             &lt;element name="ProviderGroupCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *             &lt;element name="ProviderGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="SettlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CoverageType" minOccurs="0"/>
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
@XmlType(name = "PolicyProvider_Type", propOrder = {
    "policyProviderID",
    "contractID",
    "contractNo",
    "providerID",
    "providerCode",
    "providerName",
    "providerGroupID",
    "providerGroupCode",
    "providerGroupName",
    "settlementType",
    "coverageType",
    "coverCode",
    "insuredObjectID",
    "groupID",
    "annexID",
    "auxAnnexID",
    "insrBegin",
    "insrEnd"
})
public class PolicyProviderType {

    @XmlElement(name = "PolicyProviderID")
    protected Long policyProviderID;
    @XmlElement(name = "ContractID")
    protected Long contractID;
    @XmlElement(name = "ContractNo")
    protected String contractNo;
    @XmlElement(name = "ProviderID")
    protected Long providerID;
    @XmlElement(name = "ProviderCode")
    protected String providerCode;
    @XmlElement(name = "ProviderName")
    protected String providerName;
    @XmlElement(name = "ProviderGroupID")
    protected Long providerGroupID;
    @XmlElement(name = "ProviderGroupCode")
    protected String providerGroupCode;
    @XmlElement(name = "ProviderGroupName")
    protected String providerGroupName;
    @XmlElement(name = "SettlementType")
    protected String settlementType;
    @XmlElement(name = "CoverageType")
    protected String coverageType;
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
     * Gets the value of the policyProviderID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPolicyProviderID() {
        return policyProviderID;
    }

    /**
     * Sets the value of the policyProviderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPolicyProviderID(Long value) {
        this.policyProviderID = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractID(Long value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
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
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the providerGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProviderGroupID() {
        return providerGroupID;
    }

    /**
     * Sets the value of the providerGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProviderGroupID(Long value) {
        this.providerGroupID = value;
    }

    /**
     * Gets the value of the providerGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderGroupCode() {
        return providerGroupCode;
    }

    /**
     * Sets the value of the providerGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderGroupCode(String value) {
        this.providerGroupCode = value;
    }

    /**
     * Gets the value of the providerGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderGroupName() {
        return providerGroupName;
    }

    /**
     * Sets the value of the providerGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderGroupName(String value) {
        this.providerGroupName = value;
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
