
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This Service Command requests the activation of the service. Service activation makes the service be operational for the end user. This step completes the deployment process.
 * 
 * <p>Java class for ActivateServiceCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivateServiceCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceCommandType">
 *       &lt;sequence>
 *         &lt;element name="SuspensionControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivateServiceCommandType", propOrder = {
    "suspensionControl"
})
public class ActivateServiceCommandType
    extends ServiceCommandType
{

    @XmlElement(name = "SuspensionControl")
    protected Boolean suspensionControl;

    /**
     * Gets the value of the suspensionControl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspensionControl() {
        return suspensionControl;
    }

    /**
     * Sets the value of the suspensionControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspensionControl(Boolean value) {
        this.suspensionControl = value;
    }

}
