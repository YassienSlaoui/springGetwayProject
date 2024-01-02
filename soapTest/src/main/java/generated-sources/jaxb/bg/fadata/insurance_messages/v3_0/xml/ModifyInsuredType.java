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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure holding details for insured object or
 *                               person. The contained data elements are Insured
 *                               Entity (person or object), Insured Value and Covers
 * 
 * <p>Java class for ModifyInsured_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyInsured_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Insured_Ref_Group" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}InsuredObjectID"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}GroupID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}SubGroupID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}AnnexID" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ObjectNum" minOccurs="0"/>
 *         &lt;element name="InsuredEntity" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ModifyInsuredEntity_Type" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}InsuredAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Currency" minOccurs="0"/>
 *         &lt;element name="ActualValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AVCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IVBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IVType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DurDimension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}CustomProperties" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Supplementaries" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="CoverPackages" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ModifyCoverPackages_Type" minOccurs="0"/>
 *           &lt;element name="Covers" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ModifyCovers_Type" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Discounts" minOccurs="0"/>
 *         &lt;element ref="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Drivers" minOccurs="0"/>
 *         &lt;element name="Billings" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PolicyBillings_Type" minOccurs="0"/>
 *         &lt;element name="Questionary" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Questionary_Type" minOccurs="0"/>
 *         &lt;element name="Documents" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}DocDocuments_Type" minOccurs="0"/>
 *         &lt;element name="Limits" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Limits_Type" minOccurs="0"/>
 *         &lt;element name="LettersOfCredit" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}OperLettersOfCredit_Type" minOccurs="0"/>
 *         &lt;element name="Territories" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Territories_Type" minOccurs="0"/>
 *         &lt;element name="Participants" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}Participants_Type" minOccurs="0"/>
 *         &lt;element name="PreexistingConditions" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PreexistingConditions_Type" minOccurs="0"/>
 *         &lt;element name="ApprovalRequirements" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PolicyParRequirements_Type" minOccurs="0"/>
 *         &lt;element name="GeographicalAreas" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PolicyGeogAreas_Type" minOccurs="0"/>
 *         &lt;element name="PolicyDiagnoses" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PolicyDiagnoses_Type" minOccurs="0"/>
 *         &lt;element name="PolicyServices" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PolicyServices_Type" minOccurs="0"/>
 *         &lt;element name="Drugs" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PolicyDrugs_Type" minOccurs="0"/>
 *         &lt;element name="Networks" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PolicyNetworks_Type" minOccurs="0"/>
 *         &lt;element name="Providers" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PolicyProviders_Type" minOccurs="0"/>
 *         &lt;element name="Gatekeepers" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}PolicyGatekeepers_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="riId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyInsured_Type", propOrder = {
    "groupSeqNum",
    "attachToGroup",
    "insuredObjectID",
    "groupID",
    "subGroupID",
    "annexID",
    "objectNum",
    "insuredEntity",
    "insuredAmount",
    "currency",
    "actualValue",
    "avCurrency",
    "ivBase",
    "ivType",
    "duration",
    "durDimension",
    "customProperties",
    "supplementaries",
    "coverPackages",
    "covers",
    "discounts",
    "drivers",
    "billings",
    "questionary",
    "documents",
    "limits",
    "lettersOfCredit",
    "territories",
    "participants",
    "preexistingConditions",
    "approvalRequirements",
    "geographicalAreas",
    "policyDiagnoses",
    "policyServices",
    "drugs",
    "networks",
    "providers",
    "gatekeepers"
})
public class ModifyInsuredType {

    @XmlElement(name = "GroupSeqNum")
    protected Integer groupSeqNum;
    @XmlElement(name = "AttachToGroup")
    protected AttachToGroupType attachToGroup;
    @XmlElement(name = "InsuredObjectID")
    protected long insuredObjectID;
    @XmlElement(name = "GroupID")
    protected Long groupID;
    @XmlElement(name = "SubGroupID")
    protected Long subGroupID;
    @XmlElement(name = "AnnexID")
    protected BigInteger annexID;
    @XmlElement(name = "ObjectNum")
    protected BigInteger objectNum;
    @XmlElement(name = "InsuredEntity")
    protected ModifyInsuredEntityType insuredEntity;
    @XmlElement(name = "InsuredAmount")
    protected BigDecimal insuredAmount;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "ActualValue")
    protected BigDecimal actualValue;
    @XmlElement(name = "AVCurrency")
    protected String avCurrency;
    @XmlElement(name = "IVBase")
    protected String ivBase;
    @XmlElement(name = "IVType")
    protected String ivType;
    @XmlElement(name = "Duration")
    protected BigDecimal duration;
    @XmlElement(name = "DurDimension")
    protected String durDimension;
    @XmlElement(name = "CustomProperties")
    protected CustomPropertiesType customProperties;
    @XmlElement(name = "Supplementaries")
    protected SupplementariesType supplementaries;
    @XmlElement(name = "CoverPackages")
    protected ModifyCoverPackagesType coverPackages;
    @XmlElement(name = "Covers")
    protected ModifyCoversType covers;
    @XmlElement(name = "Discounts")
    protected DiscountsType discounts;
    @XmlElement(name = "Drivers")
    protected DriversType drivers;
    @XmlElement(name = "Billings")
    protected PolicyBillingsType billings;
    @XmlElement(name = "Questionary")
    protected QuestionaryType questionary;
    @XmlElement(name = "Documents")
    protected DocDocumentsType documents;
    @XmlElement(name = "Limits")
    protected LimitsType limits;
    @XmlElement(name = "LettersOfCredit")
    protected OperLettersOfCreditType lettersOfCredit;
    @XmlElement(name = "Territories")
    protected TerritoriesType territories;
    @XmlElement(name = "Participants")
    protected ParticipantsType participants;
    @XmlElement(name = "PreexistingConditions")
    protected PreexistingConditionsType preexistingConditions;
    @XmlElement(name = "ApprovalRequirements")
    protected PolicyParRequirementsType approvalRequirements;
    @XmlElement(name = "GeographicalAreas")
    protected PolicyGeogAreasType geographicalAreas;
    @XmlElement(name = "PolicyDiagnoses")
    protected PolicyDiagnosesType policyDiagnoses;
    @XmlElement(name = "PolicyServices")
    protected PolicyServicesType policyServices;
    @XmlElement(name = "Drugs")
    protected PolicyDrugsType drugs;
    @XmlElement(name = "Networks")
    protected PolicyNetworksType networks;
    @XmlElement(name = "Providers")
    protected PolicyProvidersType providers;
    @XmlElement(name = "Gatekeepers")
    protected PolicyGatekeepersType gatekeepers;
    @XmlAttribute
    protected Integer riId;

    /**
     * Gets the value of the groupSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupSeqNum() {
        return groupSeqNum;
    }

    /**
     * Sets the value of the groupSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupSeqNum(Integer value) {
        this.groupSeqNum = value;
    }

    /**
     * Gets the value of the attachToGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AttachToGroupType }
     *     
     */
    public AttachToGroupType getAttachToGroup() {
        return attachToGroup;
    }

    /**
     * Sets the value of the attachToGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachToGroupType }
     *     
     */
    public void setAttachToGroup(AttachToGroupType value) {
        this.attachToGroup = value;
    }

    /**
     * Gets the value of the insuredObjectID property.
     * 
     */
    public long getInsuredObjectID() {
        return insuredObjectID;
    }

    /**
     * Sets the value of the insuredObjectID property.
     * 
     */
    public void setInsuredObjectID(long value) {
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
     * Gets the value of the subGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubGroupID() {
        return subGroupID;
    }

    /**
     * Sets the value of the subGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubGroupID(Long value) {
        this.subGroupID = value;
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
     * Gets the value of the objectNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectNum() {
        return objectNum;
    }

    /**
     * Sets the value of the objectNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectNum(BigInteger value) {
        this.objectNum = value;
    }

    /**
     * Gets the value of the insuredEntity property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyInsuredEntityType }
     *     
     */
    public ModifyInsuredEntityType getInsuredEntity() {
        return insuredEntity;
    }

    /**
     * Sets the value of the insuredEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyInsuredEntityType }
     *     
     */
    public void setInsuredEntity(ModifyInsuredEntityType value) {
        this.insuredEntity = value;
    }

    /**
     * Gets the value of the insuredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsuredAmount() {
        return insuredAmount;
    }

    /**
     * Sets the value of the insuredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsuredAmount(BigDecimal value) {
        this.insuredAmount = value;
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
     * Gets the value of the actualValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualValue() {
        return actualValue;
    }

    /**
     * Sets the value of the actualValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualValue(BigDecimal value) {
        this.actualValue = value;
    }

    /**
     * Gets the value of the avCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVCurrency() {
        return avCurrency;
    }

    /**
     * Sets the value of the avCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVCurrency(String value) {
        this.avCurrency = value;
    }

    /**
     * Gets the value of the ivBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVBase() {
        return ivBase;
    }

    /**
     * Sets the value of the ivBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVBase(String value) {
        this.ivBase = value;
    }

    /**
     * Gets the value of the ivType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIVType() {
        return ivType;
    }

    /**
     * Sets the value of the ivType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIVType(String value) {
        this.ivType = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDuration(BigDecimal value) {
        this.duration = value;
    }

    /**
     * Gets the value of the durDimension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurDimension() {
        return durDimension;
    }

    /**
     * Sets the value of the durDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurDimension(String value) {
        this.durDimension = value;
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
     * Gets the value of the supplementaries property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementariesType }
     *     
     */
    public SupplementariesType getSupplementaries() {
        return supplementaries;
    }

    /**
     * Sets the value of the supplementaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementariesType }
     *     
     */
    public void setSupplementaries(SupplementariesType value) {
        this.supplementaries = value;
    }

    /**
     * Gets the value of the coverPackages property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyCoverPackagesType }
     *     
     */
    public ModifyCoverPackagesType getCoverPackages() {
        return coverPackages;
    }

    /**
     * Sets the value of the coverPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyCoverPackagesType }
     *     
     */
    public void setCoverPackages(ModifyCoverPackagesType value) {
        this.coverPackages = value;
    }

    /**
     * Gets the value of the covers property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyCoversType }
     *     
     */
    public ModifyCoversType getCovers() {
        return covers;
    }

    /**
     * Sets the value of the covers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyCoversType }
     *     
     */
    public void setCovers(ModifyCoversType value) {
        this.covers = value;
    }

    /**
     * Gets the value of the discounts property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountsType }
     *     
     */
    public DiscountsType getDiscounts() {
        return discounts;
    }

    /**
     * Sets the value of the discounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountsType }
     *     
     */
    public void setDiscounts(DiscountsType value) {
        this.discounts = value;
    }

    /**
     * Gets the value of the drivers property.
     * 
     * @return
     *     possible object is
     *     {@link DriversType }
     *     
     */
    public DriversType getDrivers() {
        return drivers;
    }

    /**
     * Sets the value of the drivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriversType }
     *     
     */
    public void setDrivers(DriversType value) {
        this.drivers = value;
    }

    /**
     * Gets the value of the billings property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyBillingsType }
     *     
     */
    public PolicyBillingsType getBillings() {
        return billings;
    }

    /**
     * Sets the value of the billings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyBillingsType }
     *     
     */
    public void setBillings(PolicyBillingsType value) {
        this.billings = value;
    }

    /**
     * Gets the value of the questionary property.
     * 
     * @return
     *     possible object is
     *     {@link QuestionaryType }
     *     
     */
    public QuestionaryType getQuestionary() {
        return questionary;
    }

    /**
     * Sets the value of the questionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuestionaryType }
     *     
     */
    public void setQuestionary(QuestionaryType value) {
        this.questionary = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link DocDocumentsType }
     *     
     */
    public DocDocumentsType getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDocumentsType }
     *     
     */
    public void setDocuments(DocDocumentsType value) {
        this.documents = value;
    }

    /**
     * Gets the value of the limits property.
     * 
     * @return
     *     possible object is
     *     {@link LimitsType }
     *     
     */
    public LimitsType getLimits() {
        return limits;
    }

    /**
     * Sets the value of the limits property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitsType }
     *     
     */
    public void setLimits(LimitsType value) {
        this.limits = value;
    }

    /**
     * Gets the value of the lettersOfCredit property.
     * 
     * @return
     *     possible object is
     *     {@link OperLettersOfCreditType }
     *     
     */
    public OperLettersOfCreditType getLettersOfCredit() {
        return lettersOfCredit;
    }

    /**
     * Sets the value of the lettersOfCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperLettersOfCreditType }
     *     
     */
    public void setLettersOfCredit(OperLettersOfCreditType value) {
        this.lettersOfCredit = value;
    }

    /**
     * Gets the value of the territories property.
     * 
     * @return
     *     possible object is
     *     {@link TerritoriesType }
     *     
     */
    public TerritoriesType getTerritories() {
        return territories;
    }

    /**
     * Sets the value of the territories property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerritoriesType }
     *     
     */
    public void setTerritories(TerritoriesType value) {
        this.territories = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantsType }
     *     
     */
    public ParticipantsType getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantsType }
     *     
     */
    public void setParticipants(ParticipantsType value) {
        this.participants = value;
    }

    /**
     * Gets the value of the preexistingConditions property.
     * 
     * @return
     *     possible object is
     *     {@link PreexistingConditionsType }
     *     
     */
    public PreexistingConditionsType getPreexistingConditions() {
        return preexistingConditions;
    }

    /**
     * Sets the value of the preexistingConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreexistingConditionsType }
     *     
     */
    public void setPreexistingConditions(PreexistingConditionsType value) {
        this.preexistingConditions = value;
    }

    /**
     * Gets the value of the approvalRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyParRequirementsType }
     *     
     */
    public PolicyParRequirementsType getApprovalRequirements() {
        return approvalRequirements;
    }

    /**
     * Sets the value of the approvalRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyParRequirementsType }
     *     
     */
    public void setApprovalRequirements(PolicyParRequirementsType value) {
        this.approvalRequirements = value;
    }

    /**
     * Gets the value of the geographicalAreas property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyGeogAreasType }
     *     
     */
    public PolicyGeogAreasType getGeographicalAreas() {
        return geographicalAreas;
    }

    /**
     * Sets the value of the geographicalAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyGeogAreasType }
     *     
     */
    public void setGeographicalAreas(PolicyGeogAreasType value) {
        this.geographicalAreas = value;
    }

    /**
     * Gets the value of the policyDiagnoses property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyDiagnosesType }
     *     
     */
    public PolicyDiagnosesType getPolicyDiagnoses() {
        return policyDiagnoses;
    }

    /**
     * Sets the value of the policyDiagnoses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyDiagnosesType }
     *     
     */
    public void setPolicyDiagnoses(PolicyDiagnosesType value) {
        this.policyDiagnoses = value;
    }

    /**
     * Gets the value of the policyServices property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyServicesType }
     *     
     */
    public PolicyServicesType getPolicyServices() {
        return policyServices;
    }

    /**
     * Sets the value of the policyServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyServicesType }
     *     
     */
    public void setPolicyServices(PolicyServicesType value) {
        this.policyServices = value;
    }

    /**
     * Gets the value of the drugs property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyDrugsType }
     *     
     */
    public PolicyDrugsType getDrugs() {
        return drugs;
    }

    /**
     * Sets the value of the drugs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyDrugsType }
     *     
     */
    public void setDrugs(PolicyDrugsType value) {
        this.drugs = value;
    }

    /**
     * Gets the value of the networks property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyNetworksType }
     *     
     */
    public PolicyNetworksType getNetworks() {
        return networks;
    }

    /**
     * Sets the value of the networks property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyNetworksType }
     *     
     */
    public void setNetworks(PolicyNetworksType value) {
        this.networks = value;
    }

    /**
     * Gets the value of the providers property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyProvidersType }
     *     
     */
    public PolicyProvidersType getProviders() {
        return providers;
    }

    /**
     * Sets the value of the providers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyProvidersType }
     *     
     */
    public void setProviders(PolicyProvidersType value) {
        this.providers = value;
    }

    /**
     * Gets the value of the gatekeepers property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyGatekeepersType }
     *     
     */
    public PolicyGatekeepersType getGatekeepers() {
        return gatekeepers;
    }

    /**
     * Sets the value of the gatekeepers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyGatekeepersType }
     *     
     */
    public void setGatekeepers(PolicyGatekeepersType value) {
        this.gatekeepers = value;
    }

    /**
     * Gets the value of the riId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRiId() {
        return riId;
    }

    /**
     * Sets the value of the riId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRiId(Integer value) {
        this.riId = value;
    }

}
