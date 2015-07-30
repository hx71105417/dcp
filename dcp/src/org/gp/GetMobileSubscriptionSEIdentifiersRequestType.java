
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Request for the identifiers of all the Secure Elements that can be currently accessed through a provided Mobile Subscription .
 * This function might be used by the SDM during the first step of the mobile-NFC service life-cycle management, in order to get information about the Secure Elements associated to a Mobile Subscription. This is a best effort function that will only return what the DMSR knows. Therefore not all Secure Elements may be returned.
 * 
 * <p>Java class for GetMobileSubscriptionSEIdentifiersRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMobileSubscriptionSEIdentifiersRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="MobileSubscriptionIdentifier" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}MobileSubscriptionIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMobileSubscriptionSEIdentifiersRequestType", propOrder = {
    "mobileSubscriptionIdentifier"
})
public class GetMobileSubscriptionSEIdentifiersRequestType
    extends BasicRequestType
{

    @XmlElement(name = "MobileSubscriptionIdentifier", required = true)
    protected MobileSubscriptionIdentifierType mobileSubscriptionIdentifier;

    /**
     * Gets the value of the mobileSubscriptionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public MobileSubscriptionIdentifierType getMobileSubscriptionIdentifier() {
        return mobileSubscriptionIdentifier;
    }

    /**
     * Sets the value of the mobileSubscriptionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSubscriptionIdentifierType }
     *     
     */
    public void setMobileSubscriptionIdentifier(MobileSubscriptionIdentifierType value) {
        this.mobileSubscriptionIdentifier = value;
    }

}
