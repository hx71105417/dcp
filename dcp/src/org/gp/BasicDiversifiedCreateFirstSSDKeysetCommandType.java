
package org.gp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This SE Command requests the creation of the first keyset of a Supplementary Security Domain in "Basic Diversified" mode.
 * 
 * <p>Java class for BasicDiversified_CreateFirstSSDKeysetCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicDiversified_CreateFirstSSDKeysetCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CreateFirstSSDKeysetCommandType">
 *       &lt;sequence>
 *         &lt;element name="MasterKeyIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicDiversified_CreateFirstSSDKeysetCommandType", propOrder = {
    "masterKeyIndex"
})
public class BasicDiversifiedCreateFirstSSDKeysetCommandType
    extends CreateFirstSSDKeysetCommandType
{

    @XmlElement(name = "MasterKeyIndex")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger masterKeyIndex;

    /**
     * Gets the value of the masterKeyIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMasterKeyIndex() {
        return masterKeyIndex;
    }

    /**
     * Sets the value of the masterKeyIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMasterKeyIndex(BigInteger value) {
        this.masterKeyIndex = value;
    }

}
