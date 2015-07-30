
package org.gp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Enables to request for the deployment of a new version of an already deployed service instance. Prior to calling this function, it is the function caller responsibility to obtain the New Service Instance Reference by calling the LookupServiceInstanceReference function, or to declared it through the call of the DeclareServiceInstanceReference function, providing the new Service Version within the Service Identifier.
 * 
 * <p>Java class for UpgradeServiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeServiceRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="CurrentServiceInstanceReference" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceInstanceReferenceType"/>
 *         &lt;element name="NewServiceInstanceReference" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceInstanceReferenceType"/>
 *         &lt;element name="ServiceCommand" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceCommandType" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeServiceRequestType", propOrder = {
    "currentServiceInstanceReference",
    "newServiceInstanceReference",
    "serviceCommand"
})
public class UpgradeServiceRequestType
    extends BasicRequestType
{

    @XmlElement(name = "CurrentServiceInstanceReference", required = true)
    protected ServiceInstanceReferenceType currentServiceInstanceReference;
    @XmlElement(name = "NewServiceInstanceReference", required = true)
    protected ServiceInstanceReferenceType newServiceInstanceReference;
    @XmlElement(name = "ServiceCommand", required = true)
    protected List<ServiceCommandType> serviceCommand;

    /**
     * Gets the value of the currentServiceInstanceReference property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInstanceReferenceType }
     *     
     */
    public ServiceInstanceReferenceType getCurrentServiceInstanceReference() {
        return currentServiceInstanceReference;
    }

    /**
     * Sets the value of the currentServiceInstanceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInstanceReferenceType }
     *     
     */
    public void setCurrentServiceInstanceReference(ServiceInstanceReferenceType value) {
        this.currentServiceInstanceReference = value;
    }

    /**
     * Gets the value of the newServiceInstanceReference property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInstanceReferenceType }
     *     
     */
    public ServiceInstanceReferenceType getNewServiceInstanceReference() {
        return newServiceInstanceReference;
    }

    /**
     * Sets the value of the newServiceInstanceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInstanceReferenceType }
     *     
     */
    public void setNewServiceInstanceReference(ServiceInstanceReferenceType value) {
        this.newServiceInstanceReference = value;
    }

    /**
     * Gets the value of the serviceCommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCommandType }
     * 
     * 
     */
    public List<ServiceCommandType> getServiceCommand() {
        if (serviceCommand == null) {
            serviceCommand = new ArrayList<ServiceCommandType>();
        }
        return this.serviceCommand;
    }

}
