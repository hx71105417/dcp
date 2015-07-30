
package org.gp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provide the individual result of the execution of a corresponding Exchange Service Data Command
 * Sequence of result SHALL follow the sequence of Exchange Service Data Command provided in the function input data.
 * 
 * <p>Java class for ExchangeServiceDataCommandResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeServiceDataCommandResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommandExecutionStatus" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ExchangeServiceDataCommandExecutionStatusType"/>
 *         &lt;element name="CommandStatusCodeData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ExchangeServiceDataStatusCodeDataType" minOccurs="0"/>
 *         &lt;element name="ServiceOutputData" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeServiceDataCommandResultType", propOrder = {
    "commandExecutionStatus",
    "commandStatusCodeData",
    "serviceOutputData"
})
public class ExchangeServiceDataCommandResultType {

    @XmlElement(name = "CommandExecutionStatus", required = true)
    protected ExchangeServiceDataCommandExecutionStatusType commandExecutionStatus;
    @XmlElement(name = "CommandStatusCodeData")
    protected ExchangeServiceDataStatusCodeDataType commandStatusCodeData;
    @XmlElement(name = "ServiceOutputData")
    protected List<Object> serviceOutputData;

    /**
     * Gets the value of the commandExecutionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeServiceDataCommandExecutionStatusType }
     *     
     */
    public ExchangeServiceDataCommandExecutionStatusType getCommandExecutionStatus() {
        return commandExecutionStatus;
    }

    /**
     * Sets the value of the commandExecutionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeServiceDataCommandExecutionStatusType }
     *     
     */
    public void setCommandExecutionStatus(ExchangeServiceDataCommandExecutionStatusType value) {
        this.commandExecutionStatus = value;
    }

    /**
     * Gets the value of the commandStatusCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeServiceDataStatusCodeDataType }
     *     
     */
    public ExchangeServiceDataStatusCodeDataType getCommandStatusCodeData() {
        return commandStatusCodeData;
    }

    /**
     * Sets the value of the commandStatusCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeServiceDataStatusCodeDataType }
     *     
     */
    public void setCommandStatusCodeData(ExchangeServiceDataStatusCodeDataType value) {
        this.commandStatusCodeData = value;
    }

    /**
     * Gets the value of the serviceOutputData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceOutputData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceOutputData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getServiceOutputData() {
        if (serviceOutputData == null) {
            serviceOutputData = new ArrayList<Object>();
        }
        return this.serviceOutputData;
    }

}
