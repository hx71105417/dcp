
package org.gp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Notifies to the AP that a global action has been performed on the mobile-NFC service instance. The action might have been directly executed by the notification sender, or simply passed through by the notification sender. This notification can for example be used in conjunction with the HandleServiceEnvironmentChangeNotification function in case some corrective or preventive actions have been executed on the service when detecting the environment change.
 * 
 * <p>Java class for HandleActionDoneOnServiceNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandleActionDoneOnServiceNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="ServiceInstanceReference" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceInstanceReferenceType"/>
 *         &lt;element name="Action" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ActionOnServiceType" maxOccurs="unbounded"/>
 *         &lt;element name="ActionExecutionStatus" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ActionOnServiceExecutionStatusType" maxOccurs="unbounded"/>
 *         &lt;element name="NewServiceInstanceState" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleActionDoneOnServiceNotificationRequestType", propOrder = {
    "serviceInstanceReference",
    "action",
    "actionExecutionStatus",
    "newServiceInstanceState"
})
public class HandleActionDoneOnServiceNotificationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "ServiceInstanceReference", required = true)
    protected ServiceInstanceReferenceType serviceInstanceReference;
    @XmlElement(name = "Action", required = true)
    protected List<BigInteger> action;
    @XmlElement(name = "ActionExecutionStatus", required = true)
    protected List<ActionOnServiceExecutionStatusType> actionExecutionStatus;
    @XmlElement(name = "NewServiceInstanceState", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger newServiceInstanceState;

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
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getAction() {
        if (action == null) {
            action = new ArrayList<BigInteger>();
        }
        return this.action;
    }

    /**
     * Gets the value of the actionExecutionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionExecutionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionExecutionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionOnServiceExecutionStatusType }
     * 
     * 
     */
    public List<ActionOnServiceExecutionStatusType> getActionExecutionStatus() {
        if (actionExecutionStatus == null) {
            actionExecutionStatus = new ArrayList<ActionOnServiceExecutionStatusType>();
        }
        return this.actionExecutionStatus;
    }

    /**
     * Gets the value of the newServiceInstanceState property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNewServiceInstanceState() {
        return newServiceInstanceState;
    }

    /**
     * Sets the value of the newServiceInstanceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNewServiceInstanceState(BigInteger value) {
        this.newServiceInstanceState = value;
    }

}
