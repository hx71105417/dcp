
package org.gp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notifies that an action has been performed on a Device application, in the context of the management of a particular instance of mobile-NFC service through a particular Mobile Subscription.
 * 
 * <p>Java class for HandleActionDoneOnDeviceApplicationNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandleActionDoneOnDeviceApplicationNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}MobileSubscriptionIdentifierType"/>
 *         &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceIdentifierType"/>
 *         &lt;element name="ServiceQualifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceQualifierType" minOccurs="0"/>
 *         &lt;element name="DeviceApplicationIdentifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeviceApplicationIdentifierType" minOccurs="0"/>
 *         &lt;element name="Action" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ActionOnDeviceApplicationType"/>
 *         &lt;element name="ActionExecutionStatus" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ActionOnDeviceExecutionStatusType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleActionDoneOnDeviceApplicationNotificationRequestType", propOrder = {
    "mobileSubscription",
    "service",
    "serviceQualifier",
    "deviceApplicationIdentifier",
    "action",
    "actionExecutionStatus"
})
public class HandleActionDoneOnDeviceApplicationNotificationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "MobileSubscription", required = true)
    protected MobileSubscriptionIdentifierType mobileSubscription;
    @XmlElement(name = "Service", required = true)
    protected ServiceIdentifierType service;
    @XmlElement(name = "ServiceQualifier")
    protected ServiceQualifierType serviceQualifier;
    @XmlElement(name = "DeviceApplicationIdentifier")
    protected String deviceApplicationIdentifier;
    @XmlElement(name = "Action", required = true)
    protected BigInteger action;
    @XmlElement(name = "ActionExecutionStatus", required = true)
    protected ActionOnDeviceExecutionStatusType actionExecutionStatus;

    /**
     * Gets the value of the mobileSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public MobileSubscriptionIdentifierType getMobileSubscription() {
        return mobileSubscription;
    }

    /**
     * Sets the value of the mobileSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public void setMobileSubscription(MobileSubscriptionIdentifierType value) {
        this.mobileSubscription = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdentifierType }
     *     
     */
    public ServiceIdentifierType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdentifierType }
     *     
     */
    public void setService(ServiceIdentifierType value) {
        this.service = value;
    }

    /**
     * Gets the value of the serviceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQualifierType }
     *     
     */
    public ServiceQualifierType getServiceQualifier() {
        return serviceQualifier;
    }

    /**
     * Sets the value of the serviceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQualifierType }
     *     
     */
    public void setServiceQualifier(ServiceQualifierType value) {
        this.serviceQualifier = value;
    }

    /**
     * Gets the value of the deviceApplicationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceApplicationIdentifier() {
        return deviceApplicationIdentifier;
    }

    /**
     * Sets the value of the deviceApplicationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceApplicationIdentifier(String value) {
        this.deviceApplicationIdentifier = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAction(BigInteger value) {
        this.action = value;
    }

    /**
     * Gets the value of the actionExecutionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActionOnDeviceExecutionStatusType }
     *     
     */
    public ActionOnDeviceExecutionStatusType getActionExecutionStatus() {
        return actionExecutionStatus;
    }

    /**
     * Sets the value of the actionExecutionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionOnDeviceExecutionStatusType }
     *     
     */
    public void setActionExecutionStatus(ActionOnDeviceExecutionStatusType value) {
        this.actionExecutionStatus = value;
    }

}
