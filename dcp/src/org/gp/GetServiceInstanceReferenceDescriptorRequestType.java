
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests for retrieving the value of the informations that are represented by the Service Instance Reference, at the time the GetServiceInstanceReferenceDescriptor function is called.			
 * Provides the reference to the service instance as input data, and the function provider returns the identification of the service, the identifier of the Secure Element on which the service is deployed and optionally the current identifier of Mobile Subscription that is used to reach the Secure Element.
 * 			
 * 
 * <p>Java class for GetServiceInstanceReferenceDescriptorRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceInstanceReferenceDescriptorRequestType">
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
@XmlType(name = "GetServiceInstanceReferenceDescriptorRequestType", propOrder = {
    "serviceInstanceReference"
})
public class GetServiceInstanceReferenceDescriptorRequestType
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
