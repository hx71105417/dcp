
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Allows retrieving the state of a mobile-NFC service instance according to the service instance state diagram.
 * 
 * <p>Java class for GetServiceStateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceStateRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="ServiceInstanceReference" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceInstanceReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceStateRequestType", propOrder = {
    "serviceInstanceReference"
})
public class GetServiceStateRequestType
    extends BasicRequestType
{

    @XmlElement(name = "ServiceInstanceReference", required = true)
    protected ServiceInstanceReferenceType serviceInstanceReference;

    /**
     * Gets the value of the serviceInstanceReference property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInstanceReferenceType }
     *     
     */
    public ServiceInstanceReferenceType getServiceInstanceReference() {
        return serviceInstanceReference;
    }

    /**
     * Sets the value of the serviceInstanceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInstanceReferenceType }
     *     
     */
    public void setServiceInstanceReference(ServiceInstanceReferenceType value) {
        this.serviceInstanceReference = value;
    }

}
