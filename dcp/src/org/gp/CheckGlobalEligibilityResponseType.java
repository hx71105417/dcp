
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the CheckGlobalEligibilityRequest message
 * 
 * <p>Java class for CheckGlobalEligibilityResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckGlobalEligibilityResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}CheckGlobalEligibilityResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckGlobalEligibilityResponseType", propOrder = {
    "responseData"
})
public class CheckGlobalEligibilityResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected CheckGlobalEligibilityResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link CheckGlobalEligibilityResponseDataType }
     *     
     */
    public CheckGlobalEligibilityResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckGlobalEligibilityResponseDataType }
     *     
     */
    public void setResponseData(CheckGlobalEligibilityResponseDataType value) {
        this.responseData = value;
    }

}
