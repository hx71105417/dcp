
package org.gp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The simple definition of the keyset, specified as a profile.
 * 
 * <p>Java class for SimpleKeySetProfile_KeySetDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleKeySetProfile_KeySetDescriptionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}KeySetDescriptionType">
 *       &lt;sequence>
 *         &lt;element name="Profile" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleKeySetProfile_KeySetDescriptionType", propOrder = {
    "profile"
})
public class SimpleKeySetProfileKeySetDescriptionType
    extends KeySetDescriptionType
{

    @XmlElement(name = "Profile", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger profile;

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProfile(BigInteger value) {
        this.profile = value;
    }

}
