
package org.gp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the DeclareServiceInstanceReferenceRequest message, in case or successful processing of the function
 * 
 * <p>Java class for DeclareServiceInstanceReferenceResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclareServiceInstanceReferenceResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "DeclareServiceInstanceReferenceResponseDataType", propOrder = {
    "serviceInstanceState"
})
public class DeclareServiceInstanceReferenceResponseDataType {

    @XmlElement(name = "ServiceInstanceState", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger serviceInstanceState;

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
