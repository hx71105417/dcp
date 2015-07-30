
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The response to the CCMScenario1UsingPK_CreateFirstSSDKeysetCommandRequest SE Command
 * 
 * <p>Java class for CCMScenario1UsingPK_CreateFirstSSDKeysetCommandResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCMScenario1UsingPK_CreateFirstSSDKeysetCommandResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CreateFirstSSDKeysetCommandResponseType">
 *       &lt;sequence>
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
@XmlType(name = "CCMScenario1UsingPK_CreateFirstSSDKeysetCommandResponseType", propOrder = {
    "keyGenerationMode",
    "encryptedKeyValue",
    "signature"
})
public class CCMScenario1UsingPKCreateFirstSSDKeysetCommandResponseType
    extends CreateFirstSSDKeysetCommandResponseType
{

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
