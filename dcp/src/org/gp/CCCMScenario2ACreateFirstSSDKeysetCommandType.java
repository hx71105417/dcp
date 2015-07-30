
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This SE Command requests the creation of the first keyset of a Supplementary Security Domain in "CCCM Schenario 2A" mode.
 * 
 * <p>Java class for CCCMScenario2A_CreateFirstSSDKeysetCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCMScenario2A_CreateFirstSSDKeysetCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CreateFirstSSDKeysetCommandType">
 *       &lt;sequence>
 *         &lt;element name="SDIN" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SDINType" minOccurs="0"/>
 *         &lt;element name="SSDOwnerCertificate" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="KeyGenerationMode" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}KeyGenerationModeType" minOccurs="0"/>
 *         &lt;element name="EncryptedKeyValue" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCMScenario2A_CreateFirstSSDKeysetCommandType", propOrder = {
    "sdin",
    "ssdOwnerCertificate",
    "keyGenerationMode",
    "encryptedKeyValue",
    "signature"
})
public class CCCMScenario2ACreateFirstSSDKeysetCommandType
    extends CreateFirstSSDKeysetCommandType
{

    @XmlElement(name = "SDIN")
    protected String sdin;
    @XmlElement(name = "SSDOwnerCertificate", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] ssdOwnerCertificate;
    @XmlElement(name = "KeyGenerationMode")
    protected String keyGenerationMode;
    @XmlElement(name = "EncryptedKeyValue", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] encryptedKeyValue;
    @XmlElement(name = "Signature", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] signature;

    /**
     * Gets the value of the sdin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDIN() {
        return sdin;
    }

    /**
     * Sets the value of the sdin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDIN(String value) {
        this.sdin = value;
    }

    /**
     * Gets the value of the ssdOwnerCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSSDOwnerCertificate() {
        return ssdOwnerCertificate;
    }

    /**
     * Sets the value of the ssdOwnerCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSDOwnerCertificate(byte[] value) {
        this.ssdOwnerCertificate = value;
    }

    /**
     * Gets the value of the keyGenerationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyGenerationMode() {
        return keyGenerationMode;
    }

    /**
     * Sets the value of the keyGenerationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyGenerationMode(String value) {
        this.keyGenerationMode = value;
    }

    /**
     * Gets the value of the encryptedKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEncryptedKeyValue() {
        return encryptedKeyValue;
    }

    /**
     * Sets the value of the encryptedKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedKeyValue(byte[] value) {
        this.encryptedKeyValue = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

}
