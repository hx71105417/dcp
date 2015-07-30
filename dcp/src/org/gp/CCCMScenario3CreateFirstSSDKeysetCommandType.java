
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This SE Command requests the creation of the first keyset of a Supplementary Security Domain in "CCCM Schenario 3" mode.
 * 
 * <p>Java class for CCCMScenario3_CreateFirstSSDKeysetCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCCMScenario3_CreateFirstSSDKeysetCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CreateFirstSSDKeysetCommandType">
 *       &lt;sequence>
 *         &lt;element name="SDIN" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SDINType" minOccurs="0"/>
 *         &lt;element name="KeyGenerationMode" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}KeyGenerationModeType"/>
 *         &lt;element name="ECCKeyLength" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ECCKeyLengthType"/>
 *         &lt;element name="ScenarioParameter" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="HostID" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="SSDOwnerEphemeralPublicKey" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCCMScenario3_CreateFirstSSDKeysetCommandType", propOrder = {
    "sdin",
    "keyGenerationMode",
    "eccKeyLength",
    "scenarioParameter",
    "hostID",
    "ssdOwnerEphemeralPublicKey"
})
public class CCCMScenario3CreateFirstSSDKeysetCommandType
    extends CreateFirstSSDKeysetCommandType
{

    @XmlElement(name = "SDIN")
    protected String sdin;
    @XmlElement(name = "KeyGenerationMode", required = true)
    protected String keyGenerationMode;
    @XmlElement(name = "ECCKeyLength", required = true)
    protected ECCKeyLengthType eccKeyLength;
    @XmlElement(name = "ScenarioParameter")
    protected byte scenarioParameter;
    @XmlElement(name = "HostID", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] hostID;
    @XmlElement(name = "SSDOwnerEphemeralPublicKey", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] ssdOwnerEphemeralPublicKey;

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
     * Gets the value of the eccKeyLength property.
     * 
     * @return
     *     possible object is
     *     {@link ECCKeyLengthType }
     *     
     */
    public ECCKeyLengthType getECCKeyLength() {
        return eccKeyLength;
    }

    /**
     * Sets the value of the eccKeyLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECCKeyLengthType }
     *     
     */
    public void setECCKeyLength(ECCKeyLengthType value) {
        this.eccKeyLength = value;
    }

    /**
     * Gets the value of the scenarioParameter property.
     * 
     */
    public byte getScenarioParameter() {
        return scenarioParameter;
    }

    /**
     * Sets the value of the scenarioParameter property.
     * 
     */
    public void setScenarioParameter(byte value) {
        this.scenarioParameter = value;
    }

    /**
     * Gets the value of the hostID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getHostID() {
        return hostID;
    }

    /**
     * Sets the value of the hostID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostID(byte[] value) {
        this.hostID = value;
    }

    /**
     * Gets the value of the ssdOwnerEphemeralPublicKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSSDOwnerEphemeralPublicKey() {
        return ssdOwnerEphemeralPublicKey;
    }

    /**
     * Sets the value of the ssdOwnerEphemeralPublicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSDOwnerEphemeralPublicKey(byte[] value) {
        this.ssdOwnerEphemeralPublicKey = value;
    }

}
