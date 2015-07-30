
package org.gp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the CheckGlobalEligibilityRequest message, in case or successful processing of the function
 * 
 * <p>Java class for CheckGlobalEligibilityResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckGlobalEligibilityResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Eligible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NonEligibilityReason" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckGlobalEligibilityResponseDataType", propOrder = {
    "eligible",
    "nonEligibilityReason"
})
public class CheckGlobalEligibilityResponseDataType {

    @XmlElement(name = "Eligible")
    protected boolean eligible;
    @XmlElement(name = "NonEligibilityReason")
    protected List<BigInteger> nonEligibilityReason;

    /**
     * Gets the value of the eligible property.
     * 
     */
    public boolean isEligible() {
        return eligible;
    }

    /**
     * Sets the value of the eligible property.
     * 
     */
    public void setEligible(boolean value) {
        this.eligible = value;
    }

    /**
     * Gets the value of the nonEligibilityReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonEligibilityReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonEligibilityReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getNonEligibilityReason() {
        if (nonEligibilityReason == null) {
            nonEligibilityReason = new ArrayList<BigInteger>();
        }
        return this.nonEligibilityReason;
    }

}
