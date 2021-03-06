
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the LoadDeviceApplicationRequest message
 * 
 * <p>Java class for LoadDeviceApplicationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadDeviceApplicationResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}LoadDeviceApplicationResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadDeviceApplicationResponseType", propOrder = {
    "responseData"
})
public class LoadDeviceApplicationResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected LoadDeviceApplicationResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link LoadDeviceApplicationResponseDataType }
     *     
     */
    public LoadDeviceApplicationResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadDeviceApplicationResponseDataType }
     *     
     */
    public void setResponseData(LoadDeviceApplicationResponseDataType value) {
        this.responseData = value;
    }

}
