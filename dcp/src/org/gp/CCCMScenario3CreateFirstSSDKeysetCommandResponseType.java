
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The response to the CCCMScenario3_CreateFirstSSDKeysetCommandRequest SE Command
 * 
 * <p>Java class for CCCMScenario3_CreateFirstSSDKeysetCommandResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCMScenario3_CreateFirstSSDKeysetCommandResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CreateFirstSSDKeysetCommandResponseType">
 *       &lt;sequence>
 *         &lt;element name="StoredData" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="DerivationRandom" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="Receipt" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCMScenario3_CreateFirstSSDKeysetCommandResponseType", propOrder = {
    "storedData",
    "derivationRandom",
    "receipt"
})
public class CCCMScenario3CreateFirstSSDKeysetCommandResponseType
    extends CreateFirstSSDKeysetCommandResponseType
{

    @XmlElement(name = "StoredData", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] storedData;
    @XmlElement(name = "DerivationRandom", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] derivationRandom;
    @XmlElement(name = "Receipt", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] receipt;

    /**
     * Gets the value of the storedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getStoredData() {
        return storedData;
    }

    /**
     * Sets the value of the storedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoredData(byte[] value) {
        this.storedData = value;
    }

    /**
     * Gets the value of the derivationRandom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getDerivationRandom() {
        return derivationRandom;
    }

    /**
     * Sets the value of the derivationRandom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivationRandom(byte[] value) {
        this.derivationRandom = value;
    }

    /**
     * Gets the value of the receipt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceipt(byte[] value) {
        this.receipt = value;
    }

}
