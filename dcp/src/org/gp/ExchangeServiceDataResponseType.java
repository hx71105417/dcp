
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to the ExchangeServiceDataRequest message
 * 
 * <p>Java class for ExchangeServiceDataResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeServiceDataResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicResponseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ExchangeServiceDataResponseDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeServiceDataResponseType", propOrder = {
    "responseData"
})
public class ExchangeServiceDataResponseType
    extends BasicResponseType
{

    @XmlElement(name = "ResponseData")
    protected ExchangeServiceDataResponseDataType responseData;

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeServiceDataResponseDataType }
     *     
     */
    public ExchangeServiceDataResponseDataType getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeServiceDataResponseDataType }
     *     
     */
    public void setResponseData(ExchangeServiceDataResponseDataType value) {
        this.responseData = value;
    }

}
