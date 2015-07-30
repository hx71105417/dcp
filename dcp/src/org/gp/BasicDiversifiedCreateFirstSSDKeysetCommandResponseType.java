
package org.gp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The response to the BasicDiversified_CreateFirstSSDKeysetCommandRequest SE Command
 * 
 * <p>Java class for BasicDiversified_CreateFirstSSDKeysetCommandResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicDiversified_CreateFirstSSDKeysetCommandResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CreateFirstSSDKeysetCommandResponseType">
 *       &lt;sequence>
 *         &lt;element name="MasterKeyIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicDiversified_CreateFirstSSDKeysetCommandResponseType", propOrder = {
    "masterKeyIndex"
})
public class BasicDiversifiedCreateFirstSSDKeysetCommandResponseType
    extends CreateFirstSSDKeysetCommandResponseType
{

    @XmlElement(name = "MasterKeyIndex", required = true)
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
