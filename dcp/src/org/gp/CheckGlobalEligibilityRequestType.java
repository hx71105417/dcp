
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests for the global eligibility of the end user mobile environment, for the delivery of a mobile NFC service. Most commonly, it covers the Secure Element eligibility, the Device eligibility, and the Mobile Subscription eligibility.
 * At least, either the Mobile Subscription Identifier or the Secure Element Identifier SHALL be provided by the function caller.
 * 
 * <p>Java class for CheckGlobalEligibilityRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckGlobalEligibilityRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}MobileSubscriptionIdentifierType" minOccurs="0"/>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SEIdentifierType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceIdentifierType"/>
 *         &lt;element name="ServiceQualifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceQualifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckGlobalEligibilityRequestType", propOrder = {
    "mobileSubscription",
    "secureElement",
    "service",
    "serviceQualifier"
})
public class CheckGlobalEligibilityRequestType
    extends BasicRequestType
{

    @XmlElement(name = "MobileSubscription")
    protected MobileSubscriptionIdentifierType mobileSubscription;
    @XmlElement(name = "SecureElement")
    protected SEIdentifierType secureElement;
    @XmlElement(name = "Service", required = true)
    protected ServiceIdentifierType service;
    @XmlElement(name = "ServiceQualifier")
    protected ServiceQualifierType serviceQualifier;

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

}
