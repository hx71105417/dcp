
package org.gp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the ExchangeServiceDataRequest message, in case or successful processing of the function
 * 
 * <p>Java class for ExchangeServiceDataResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeServiceDataResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExchangeServiceDataCommandResult" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ExchangeServiceDataCommandResultType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeServiceDataResponseDataType", propOrder = {
    "exchangeServiceDataCommandResult"
})
public class ExchangeServiceDataResponseDataType {

    @XmlElement(name = "ExchangeServiceDataCommandResult", required = true)
    protected List<ExchangeServiceDataCommandResultType> exchangeServiceDataCommandResult;

    /**
     * Gets the value of the exchangeServiceDataCommandResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeServiceDataCommandResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeServiceDataCommandResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeServiceDataCommandResultType }
     * 
     * 
     */
    public List<ExchangeServiceDataCommandResultType> getExchangeServiceDataCommandResult() {
        if (exchangeServiceDataCommandResult == null) {
            exchangeServiceDataCommandResult = new ArrayList<ExchangeServiceDataCommandResultType>();
        }
        return this.exchangeServiceDataCommandResult;
    }

}
