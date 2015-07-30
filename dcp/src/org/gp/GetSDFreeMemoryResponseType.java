
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the GetSDFreeMemoryRequest message
 * 
 * <p>Java class for GetSDFreeMemoryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSDFreeMemoryResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetSDFreeMemoryResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSDFreeMemoryResponseType", propOrder = {
    "responseData"
})
public class GetSDFreeMemoryResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected GetSDFreeMemoryResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link GetSDFreeMemoryResponseDataType }
     *     
     */
    public GetSDFreeMemoryResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSDFreeMemoryResponseDataType }
     *     
     */
    public void setResponseData(GetSDFreeMemoryResponseDataType value) {
        this.responseData = value;
    }

}
