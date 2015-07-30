
package org.gp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the UpgradeServiceRequest message, in case or successful processing of the function
 * 
 * <p>Java class for UpgradeServiceResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeServiceResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceCommandResult" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceCommandResultType" maxOccurs="3"/>
 *         &lt;element name="ServiceInstanceState" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeServiceResponseDataType", propOrder = {
    "serviceCommandResult",
    "serviceInstanceState"
})
public class UpgradeServiceResponseDataType {

    @XmlElement(name = "ServiceCommandResult", required = true)
    protected List<ServiceCommandResultType> serviceCommandResult;
    @XmlElement(name = "ServiceInstanceState", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger serviceInstanceState;

    /**
     * Gets the value of the serviceCommandResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCommandResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCommandResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCommandResultType }
     * 
     * 
     */
    public List<ServiceCommandResultType> getServiceCommandResult() {
        if (serviceCommandResult == null) {
            serviceCommandResult = new ArrayList<ServiceCommandResultType>();
        }
        return this.serviceCommandResult;
    }

    /**
     * Gets the value of the serviceInstanceState property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceInstanceState() {
        return serviceInstanceState;
    }

    /**
     * Sets the value of the serviceInstanceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceInstanceState(BigInteger value) {
        this.serviceInstanceState = value;
    }

}
