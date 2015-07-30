
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the LookupServiceInstanceReferenceRequest message
 * 
 * <p>Java class for LookupServiceInstanceReferenceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookupServiceInstanceReferenceResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}LookupServiceInstanceReferenceResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupServiceInstanceReferenceResponseType", propOrder = {
    "responseData"
})
public class LookupServiceInstanceReferenceResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected LookupServiceInstanceReferenceResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link LookupServiceInstanceReferenceResponseDataType }
     *     
     */
    public LookupServiceInstanceReferenceResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LookupServiceInstanceReferenceResponseDataType }
     *     
     */
    public void setResponseData(LookupServiceInstanceReferenceResponseDataType value) {
        this.responseData = value;
    }

}
