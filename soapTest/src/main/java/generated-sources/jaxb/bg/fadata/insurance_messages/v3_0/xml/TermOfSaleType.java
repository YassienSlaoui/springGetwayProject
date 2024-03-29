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
 * <p>Java class for TermOfSale_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermOfSale_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Loading" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="LoadingDim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddLoading" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AddLoadingDim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtraLoading" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ExtraLoadingDim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Apply" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermOfSale_Type", propOrder = {
    "code",
    "loading",
    "loadingDim",
    "addLoading",
    "addLoadingDim",
    "extraLoading",
    "extraLoadingDim",
    "apply"
})
public class TermOfSaleType {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Loading")
    protected Double loading;
    @XmlElement(name = "LoadingDim")
    protected String loadingDim;
    @XmlElement(name = "AddLoading")
    protected Double addLoading;
    @XmlElement(name = "AddLoadingDim")
    protected String addLoadingDim;
    @XmlElement(name = "ExtraLoading")
    protected Double extraLoading;
    @XmlElement(name = "ExtraLoadingDim")
    protected String extraLoadingDim;
    @XmlElement(name = "Apply")
    protected Integer apply;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the loading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLoading() {
        return loading;
    }

    /**
     * Sets the value of the loading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLoading(Double value) {
        this.loading = value;
    }

    /**
     * Gets the value of the loadingDim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadingDim() {
        return loadingDim;
    }

    /**
     * Sets the value of the loadingDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadingDim(String value) {
        this.loadingDim = value;
    }

    /**
     * Gets the value of the addLoading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAddLoading() {
        return addLoading;
    }

    /**
     * Sets the value of the addLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAddLoading(Double value) {
        this.addLoading = value;
    }

    /**
     * Gets the value of the addLoadingDim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddLoadingDim() {
        return addLoadingDim;
    }

    /**
     * Sets the value of the addLoadingDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddLoadingDim(String value) {
        this.addLoadingDim = value;
    }

    /**
     * Gets the value of the extraLoading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExtraLoading() {
        return extraLoading;
    }

    /**
     * Sets the value of the extraLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExtraLoading(Double value) {
        this.extraLoading = value;
    }

    /**
     * Gets the value of the extraLoadingDim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraLoadingDim() {
        return extraLoadingDim;
    }

    /**
     * Sets the value of the extraLoadingDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraLoadingDim(String value) {
        this.extraLoadingDim = value;
    }

    /**
     * Gets the value of the apply property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApply() {
        return apply;
    }

    /**
     * Sets the value of the apply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApply(Integer value) {
        this.apply = value;
    }

}
