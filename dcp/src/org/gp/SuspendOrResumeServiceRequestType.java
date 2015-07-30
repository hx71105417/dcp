
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Suspend or resume the deployed service instance. Using this function, the function caller can block or unblock the usage of the service. However, the behavior in case of service being suspended is service specific (NFC service access is disabled, UI access disabled¡­).
 * 
 * <p>Java class for SuspendOrResumeServiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuspendOrResumeServiceRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="ServiceInstanceReference" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceInstanceReferenceType"/>
 *         &lt;element name="SuspensionControl" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuspendOrResumeServiceRequestType", propOrder = {
    "serviceInstanceReference",
    "suspensionControl"
})
public class SuspendOrResumeServiceRequestType
    extends BasicRequestType
{

    @XmlElement(name = "ServiceInstanceReference", required = true)
    protected ServiceInstanceReferenceType serviceInstanceReference;
    @XmlElement(name = "SuspensionControl")
    protected boolean suspensionControl;

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

    /**
     * Gets the value of the suspensionControl property.
     * 
     */
    public boolean isSuspensionControl() {
        return suspensionControl;
    }

    /**
     * Sets the value of the suspensionControl property.
     * 
     */
    public void setSuspensionControl(boolean value) {
        this.suspensionControl = value;
    }

}
