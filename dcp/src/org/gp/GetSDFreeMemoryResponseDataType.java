
package org.gp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data of the response to the GetSDFreeMemoryRequest message, in case or successful processing of the function
 * 
 * <p>Java class for GetSDFreeMemoryResponseDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSDFreeMemoryResponseDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FreeMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="MemoryAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSDFreeMemoryResponseDataType", propOrder = {
    "freeMemory",
    "memoryAvailable"
})
public class GetSDFreeMemoryResponseDataType {

    @XmlElement(name = "FreeMemory")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger freeMemory;
    @XmlElement(name = "MemoryAvailable")
    protected Boolean memoryAvailable;

    /**
     * Gets the value of the freeMemory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFreeMemory() {
        return freeMemory;
    }

    /**
     * Sets the value of the freeMemory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFreeMemory(BigInteger value) {
        this.freeMemory = value;
    }

    /**
     * Gets the value of the memoryAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMemoryAvailable() {
        return memoryAvailable;
    }

    /**
     * Sets the value of the memoryAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMemoryAvailable(Boolean value) {
        this.memoryAvailable = value;
    }

}
