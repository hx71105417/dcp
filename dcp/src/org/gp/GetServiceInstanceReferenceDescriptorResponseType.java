
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the GetServiceInstanceReferenceDescriptorRequest message
 * 
 * <p>Java class for GetServiceInstanceReferenceDescriptorResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceInstanceReferenceDescriptorResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}GetServiceInstanceReferenceDescriptorResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceInstanceReferenceDescriptorResponseType", propOrder = {
    "responseData"
})
public class GetServiceInstanceReferenceDescriptorResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected GetServiceInstanceReferenceDescriptorResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link GetServiceInstanceReferenceDescriptorResponseDataType }
     *     
     */
    public GetServiceInstanceReferenceDescriptorResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServiceInstanceReferenceDescriptorResponseDataType }
     *     
     */
    public void setResponseData(GetServiceInstanceReferenceDescriptorResponseDataType value) {
        this.responseData = value;
    }

}
