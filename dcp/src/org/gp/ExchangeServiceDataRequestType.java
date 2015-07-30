
package org.gp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests the exchange of service specific data between the Application Provider and the Eecure Element, for a particular mobile-NFC service. As examples, this function could be used in vertical specific use cases such as PIN code reset, counter reset, value top-up, etc.
 * 
 * <p>Java class for ExchangeServiceDataRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeServiceDataRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="ServiceInstanceReference" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceInstanceReferenceType"/>
 *         &lt;element name="ExchangeServiceDataCommand" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ExchangeServiceDataCommandType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeServiceDataRequestType", propOrder = {
    "serviceInstanceReference",
    "exchangeServiceDataCommand"
})
public class ExchangeServiceDataRequestType
    extends BasicRequestType
{

    @XmlElement(name = "ServiceInstanceReference", required = true)
    protected ServiceInstanceReferenceType serviceInstanceReference;
    @XmlElement(name = "ExchangeServiceDataCommand", required = true)
    protected List<ExchangeServiceDataCommandType> exchangeServiceDataCommand;

    /**
     * Gets the value of the serviceInstanceReference property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInstanceReferenceType }
     *     
     */
    public ServiceInstanceReferenceType getServiceInstanceReference() {
        return serviceInstanceReference;
    }

    /**
     * Sets the value of the serviceInstanceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInstanceReferenceType }
     *     
     */
    public void setServiceInstanceReference(ServiceInstanceReferenceType value) {
        this.serviceInstanceReference = value;
    }

    /**
     * Gets the value of the exchangeServiceDataCommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeServiceDataCommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeServiceDataCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeServiceDataCommandType }
     * 
     * 
     */
    public List<ExchangeServiceDataCommandType> getExchangeServiceDataCommand() {
        if (exchangeServiceDataCommand == null) {
            exchangeServiceDataCommand = new ArrayList<ExchangeServiceDataCommandType>();
        }
        return this.exchangeServiceDataCommand;
    }

}
