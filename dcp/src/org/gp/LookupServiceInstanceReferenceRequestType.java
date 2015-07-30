
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests for a reference of the Service instance. By calling the LookupServiceInstanceReference function, the function caller
 * - Specifies the service that is to be managed,
 * - And identifies the Secure Element into which the service is or should be deployed: Directly, by providing the SE identifier; or indirectly, by providing the Mobile Subscription through which the SE can be currently reached. In that case, the mapping between the Mobile Subscription and the Secure Element identifier has to be known by the function provider.
 * It is mandated to provide either the identifier of the Secure Element or the identifier of the Mobile Subscription as input data.
 * The function provider then determines and returns a Service Instance Reference. Any subsequent call to any other global mobile-NFC service management function requires a Service Instance Reference.
 * 			
 * 
 * <p>Java class for LookupServiceInstanceReferenceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookupServiceInstanceReferenceRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceIdentifierType"/>
 *         &lt;element name="ServiceQualifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceQualifierType" minOccurs="0"/>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SEIdentifierType" minOccurs="0"/>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}MobileSubscriptionIdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupServiceInstanceReferenceRequestType", propOrder = {
    "service",
    "serviceQualifier",
    "secureElement",
    "mobileSubscription"
})
public class LookupServiceInstanceReferenceRequestType
    extends BasicRequestType
{

    @XmlElement(name = "Service", required = true)
    protected ServiceIdentifierType service;
    @XmlElement(name = "ServiceQualifier")
    protected ServiceQualifierType serviceQualifier;
    @XmlElement(name = "SecureElement")
    protected SEIdentifierType secureElement;
    @XmlElement(name = "MobileSubscription")
    protected MobileSubscriptionIdentifierType mobileSubscription;

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

}
