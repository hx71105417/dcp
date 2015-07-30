
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This Service Command requests the personalization of the service. Personalization scripts or messages are prepared by the function provider, based on the data provided by the function caller. Format of Personalization Data is out of the scope of this specification.
 * 
 * <p>Java class for PersonalizeServiceCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalizeServiceCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceCommandType">
 *       &lt;sequence>
 *         &lt;element name="PersonalizationData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="NewComputedData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalizeServiceCommandType", propOrder = {
    "personalizationData",
    "newComputedData"
})
public class PersonalizeServiceCommandType
    extends ServiceCommandType
{

    @XmlElement(name = "PersonalizationData")
    protected Object personalizationData;
    @XmlElement(name = "NewComputedData")
    protected Boolean newComputedData;

    /**
     * Gets the value of the personalizationData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPersonalizationData() {
        return personalizationData;
    }

    /**
     * Sets the value of the personalizationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPersonalizationData(Object value) {
        this.personalizationData = value;
    }

    /**
     * Gets the value of the newComputedData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewComputedData() {
        return newComputedData;
    }

    /**
     * Sets the value of the newComputedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewComputedData(Boolean value) {
        this.newComputedData = value;
    }

}
