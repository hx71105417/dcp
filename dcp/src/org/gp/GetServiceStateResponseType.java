
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the GetServiceStateRequest message
 * 
 * <p>Java class for GetServiceStateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceStateResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetServiceStateResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceStateResponseType", propOrder = {
    "responseData"
})
public class GetServiceStateResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected GetServiceStateResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link GetServiceStateResponseDataType }
     *     
     */
    public GetServiceStateResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServiceStateResponseDataType }
     *     
     */
    public void setResponseData(GetServiceStateResponseDataType value) {
        this.responseData = value;
    }

}
