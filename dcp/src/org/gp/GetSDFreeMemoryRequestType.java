
package org.gp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Get information on the amount of non-volatile free memory available in a Security Domain on a Secure Element.
 * In a first usage, the function provider returns a memory size. The function provider MAY respond either with the actual amount of available memory, or with the amount of memory which the function caller is allowed to use / which the function provider is ready to allocate to the function caller.
 * In a second usage of this function, the function caller provides a requested amount of memory, and the function provider simply returns a 'Yes' or 'No' response, depending on whether there is at least such available amount or not.
 * 
 * <p>Java class for GetSDFreeMemoryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSDFreeMemoryRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="SecureElement" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SEIdentifierType"/>
 *         &lt;element name="MobileSubscription" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}MobileSubscriptionIdentifierType" minOccurs="0"/>
 *         &lt;element name="SecurityDomainAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}AIDType" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceIdentifierType" minOccurs="0"/>
 *         &lt;element name="ServiceQualifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceQualifierType" minOccurs="0"/>
 *         &lt;element name="AuditType" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SEAuditType"/>
 *         &lt;element name="RequestedMemory" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSDFreeMemoryRequestType", propOrder = {
    "secureElement",
    "mobileSubscription",
    "securityDomainAID",
    "service",
    "serviceQualifier",
    "auditType",
    "requestedMemory"
})
public class GetSDFreeMemoryRequestType
    extends BasicRequestType
{

    @XmlElement(name = "SecureElement", required = true)
    protected SEIdentifierType secureElement;
    @XmlElement(name = "MobileSubscription")
    protected MobileSubscriptionIdentifierType mobileSubscription;
    @XmlElement(name = "SecurityDomainAID")
    protected String securityDomainAID;
    @XmlElement(name = "Service")
    protected ServiceIdentifierType service;
    @XmlElement(name = "ServiceQualifier")
    protected ServiceQualifierType serviceQualifier;
    @XmlElement(name = "AuditType", required = true)
    protected SEAuditType auditType;
    @XmlElement(name = "RequestedMemory")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger requestedMemory;

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
     * Gets the value of the securityDomainAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityDomainAID() {
        return securityDomainAID;
    }

    /**
     * Sets the value of the securityDomainAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityDomainAID(String value) {
        this.securityDomainAID = value;
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
     * Gets the value of the auditType property.
     * 
     * @return
     *     possible object is
     *     {@link SEAuditType }
     *     
     */
    public SEAuditType getAuditType() {
        return auditType;
    }

    /**
     * Sets the value of the auditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEAuditType }
     *     
     */
    public void setAuditType(SEAuditType value) {
        this.auditType = value;
    }

    /**
     * Gets the value of the requestedMemory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestedMemory() {
        return requestedMemory;
    }

    /**
     * Sets the value of the requestedMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestedMemory(BigInteger value) {
        this.requestedMemory = value;
    }

}
