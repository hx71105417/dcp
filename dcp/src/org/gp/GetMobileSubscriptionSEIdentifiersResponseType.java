
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the GetMobileSubscriptionSEIdentifiersRequest message
 * 
 * <p>Java class for GetMobileSubscriptionSEIdentifiersResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMobileSubscriptionSEIdentifiersResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetMobileSubscriptionSEIdentifiersResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMobileSubscriptionSEIdentifiersResponseType", propOrder = {
    "responseData"
})
public class GetMobileSubscriptionSEIdentifiersResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected GetMobileSubscriptionSEIdentifiersResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link GetMobileSubscriptionSEIdentifiersResponseDataType }
     *     
     */
    public GetMobileSubscriptionSEIdentifiersResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMobileSubscriptionSEIdentifiersResponseDataType }
     *     
     */
    public void setResponseData(GetMobileSubscriptionSEIdentifiersResponseDataType value) {
        this.responseData = value;
    }

}
