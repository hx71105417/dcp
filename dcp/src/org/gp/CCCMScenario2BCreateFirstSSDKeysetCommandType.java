
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This SE Command requests the creation of the first keyset of a Supplementary Security Domain in "CCCM Schenario 2B" mode.
 * 
 * <p>Java class for CCCMScenario2B_CreateFirstSSDKeysetCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCMScenario2B_CreateFirstSSDKeysetCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CreateFirstSSDKeysetCommandType">
 *       &lt;sequence>
 *         &lt;element name="SDIN" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SDINType" minOccurs="0"/>
 *         &lt;element name="KeyGenerationMode" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}KeyGenerationModeType" minOccurs="0"/>
 *         &lt;element name="EncryptedKeyValue" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCMScenario2B_CreateFirstSSDKeysetCommandType", propOrder = {
    "sdin",
    "keyGenerationMode",
    "encryptedKeyValue"
})
public class CCCMScenario2BCreateFirstSSDKeysetCommandType
    extends CreateFirstSSDKeysetCommandType
{

    @XmlElement(name = "SDIN")
    protected String sdin;
    @XmlElement(name = "KeyGenerationMode")
    protected String keyGenerationMode;
    @XmlElement(name = "EncryptedKeyValue", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] encryptedKeyValue;

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

}
