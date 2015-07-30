
package org.gp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The definition of a SCP81 keyset.
 * 
 * <p>Java class for SCP81KeySetProfile_KeySetDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCP81KeySetProfile_KeySetDescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}KeySetDescriptionType">
 *       &lt;sequence>
 *         &lt;element name="PSKTLSKeyLength" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}PSKTLSKeyLengthType"/>
 *         &lt;element name="DEKProfile" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCP81KeySetProfile_KeySetDescriptionType", propOrder = {
    "psktlsKeyLength",
    "dekProfile"
})
public class SCP81KeySetProfileKeySetDescriptionType
    extends KeySetDescriptionType
{

    @XmlElement(name = "PSKTLSKeyLength")
    protected int psktlsKeyLength;
    @XmlElement(name = "DEKProfile", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dekProfile;

    /**
     * Gets the value of the psktlsKeyLength property.
     * 
     */
    public int getPSKTLSKeyLength() {
        return psktlsKeyLength;
    }

    /**
     * Sets the value of the psktlsKeyLength property.
     * 
     */
    public void setPSKTLSKeyLength(int value) {
        this.psktlsKeyLength = value;
    }

    /**
     * Gets the value of the dekProfile property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDEKProfile() {
        return dekProfile;
    }

    /**
     * Sets the value of the dekProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDEKProfile(BigInteger value) {
        this.dekProfile = value;
    }

}
