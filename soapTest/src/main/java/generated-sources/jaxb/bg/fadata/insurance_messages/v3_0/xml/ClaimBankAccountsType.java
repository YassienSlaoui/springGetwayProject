//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.28 at 08:49:50 AM WEST 
//


package bg.fadata.insurance_messages.v3_0.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimBankAccounts_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimBankAccounts_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimBankAccount" type="{http://www.fadata.bg/Insurance_Messages/v3.0/xml/}ClaimBankAccount_Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimBankAccounts_Type", propOrder = {
    "claimBankAccount"
})
public class ClaimBankAccountsType {

    @XmlElement(name = "ClaimBankAccount", required = true)
    protected List<ClaimBankAccountType> claimBankAccount;

    /**
     * Gets the value of the claimBankAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimBankAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimBankAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimBankAccountType }
     * 
     * 
     */
    public List<ClaimBankAccountType> getClaimBankAccount() {
        if (claimBankAccount == null) {
            claimBankAccount = new ArrayList<ClaimBankAccountType>();
        }
        return this.claimBankAccount;
    }

}
