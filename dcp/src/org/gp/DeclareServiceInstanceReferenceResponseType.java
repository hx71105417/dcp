
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the DeclareServiceInstanceReferenceRequest message
 * 
 * <p>Java class for DeclareServiceInstanceReferenceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclareServiceInstanceReferenceResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}DeclareServiceInstanceReferenceResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclareServiceInstanceReferenceResponseType", propOrder = {
    "responseData"
})
public class DeclareServiceInstanceReferenceResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected DeclareServiceInstanceReferenceResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link DeclareServiceInstanceReferenceResponseDataType }
     *     
     */
    public DeclareServiceInstanceReferenceResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclareServiceInstanceReferenceResponseDataType }
     *     
     */
    public void setResponseData(DeclareServiceInstanceReferenceResponseDataType value) {
        this.responseData = value;
    }

}
