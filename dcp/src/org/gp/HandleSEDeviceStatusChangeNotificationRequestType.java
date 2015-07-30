
package org.gp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Notifies of an event related to the Device that is hosting a Secure Element: device lost, device stolen, etc. Note that the Device change event is managed by the HandleSEDeviceChangedNotification notification, so is out of scope of the HandleSEDeviceStatusChangeNotification notification function.
 * 
 * <p>Java class for HandleSEDeviceStatusChangeNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandleSEDeviceStatusChangeNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SEIdentifierType"/>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}MobileSubscriptionIdentifierType" minOccurs="0"/>
 *         &lt;element name="Event" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeviceStatusChangeEventType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleSEDeviceStatusChangeNotificationRequestType", propOrder = {
    "secureElement",
    "mobileSubscription",
    "event"
})
public class HandleSEDeviceStatusChangeNotificationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "SecureElement", required = true)
    protected SEIdentifierType secureElement;
    @XmlElement(name = "MobileSubscription")
    protected MobileSubscriptionIdentifierType mobileSubscription;
    @XmlElement(name = "Event", required = true)
    protected BigInteger event;

    /**
     * Gets the value of the secureElement property.
     * 
     * @return
     *     possible object is
     *     {@link SEIdentifierType }
     *     
     */
    public SEIdentifierType getSecureElement() {
        return secureElement;
    }

    /**
     * Sets the value of the secureElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEIdentifierType }
     *     
     */
    public void setSecureElement(SEIdentifierType value) {
        this.secureElement = value;
    }

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
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEvent(BigInteger value) {
        this.event = value;
    }

}
