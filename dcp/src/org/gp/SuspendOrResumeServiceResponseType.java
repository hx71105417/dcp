
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the SuspendOrResumeServiceRequest message
 * 
 * <p>Java class for SuspendOrResumeServiceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuspendOrResumeServiceResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SuspendOrResumeServiceResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuspendOrResumeServiceResponseType", propOrder = {
    "responseData"
})
public class SuspendOrResumeServiceResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected SuspendOrResumeServiceResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link SuspendOrResumeServiceResponseDataType }
     *     
     */
    public SuspendOrResumeServiceResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuspendOrResumeServiceResponseDataType }
     *     
     */
    public void setResponseData(SuspendOrResumeServiceResponseDataType value) {
        this.responseData = value;
    }

}
