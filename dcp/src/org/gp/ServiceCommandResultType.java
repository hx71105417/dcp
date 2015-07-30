
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provide the individual result of the execution of a corresponding service command. 
 * Sequence of result follows the sequence of Service Command provided in the function input data.
 * 
 * <p>Java class for ServiceCommandResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCommandResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommandExecutionStatus" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceCommandExecutionStatusType"/>
 *         &lt;element name="CommandStatusCodeData" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceCommandStatusCodeDataType" minOccurs="0"/>
 *         &lt;element name="ServiceCommandResponse" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceCommandResponseType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCommandResultType", propOrder = {
    "commandExecutionStatus",
    "commandStatusCodeData",
    "serviceCommandResponse"
})
public class ServiceCommandResultType {

    @XmlElement(name = "CommandExecutionStatus", required = true)
    protected ServiceCommandExecutionStatusType commandExecutionStatus;
    @XmlElement(name = "CommandStatusCodeData")
    protected ServiceCommandStatusCodeDataType commandStatusCodeData;
    @XmlElement(name = "ServiceCommandResponse", required = true)
    protected ServiceCommandResponseType serviceCommandResponse;

    /**
     * Gets the value of the commandExecutionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCommandExecutionStatusType }
     *     
     */
    public ServiceCommandExecutionStatusType getCommandExecutionStatus() {
        return commandExecutionStatus;
    }

    /**
     * Sets the value of the commandExecutionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCommandExecutionStatusType }
     *     
     */
    public void setCommandExecutionStatus(ServiceCommandExecutionStatusType value) {
        this.commandExecutionStatus = value;
    }

    /**
     * Gets the value of the commandStatusCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCommandStatusCodeDataType }
     *     
     */
    public ServiceCommandStatusCodeDataType getCommandStatusCodeData() {
        return commandStatusCodeData;
    }

    /**
     * Sets the value of the commandStatusCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCommandStatusCodeDataType }
     *     
     */
    public void setCommandStatusCodeData(ServiceCommandStatusCodeDataType value) {
        this.commandStatusCodeData = value;
    }

    /**
     * Gets the value of the serviceCommandResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCommandResponseType }
     *     
     */
    public ServiceCommandResponseType getServiceCommandResponse() {
        return serviceCommandResponse;
    }

    /**
     * Sets the value of the serviceCommandResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCommandResponseType }
     *     
     */
    public void setServiceCommandResponse(ServiceCommandResponseType value) {
        this.serviceCommandResponse = value;
    }

}
