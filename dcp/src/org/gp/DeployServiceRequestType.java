
package org.gp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Enables to request for the deployment of a service instance which reference has been previously obtained through a call to the LookupServiceInstanceReference functions, or declared through the call of the DeclareServiceInstanceReference function.
 * 
 * <p>Java class for DeployServiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeployServiceRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="ServiceInstanceReference" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceInstanceReferenceType"/>
 *         &lt;element name="ServiceCommand" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceCommandType" maxOccurs="3"/>
 *         &lt;element name="DeviceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeployServiceRequestType", propOrder = {
    "serviceInstanceReference",
    "serviceCommand",
    "deviceOnly"
})
public class DeployServiceRequestType
    extends BasicRequestType
{

    @XmlElement(name = "ServiceInstanceReference", required = true)
    protected ServiceInstanceReferenceType serviceInstanceReference;
    @XmlElement(name = "ServiceCommand", required = true)
    protected List<ServiceCommandType> serviceCommand;
    @XmlElement(name = "DeviceOnly")
    protected Boolean deviceOnly;

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

    /**
     * Gets the value of the deviceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviceOnly() {
        return deviceOnly;
    }

    /**
     * Sets the value of the deviceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviceOnly(Boolean value) {
        this.deviceOnly = value;
    }

}
