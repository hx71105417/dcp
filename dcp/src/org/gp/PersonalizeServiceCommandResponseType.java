
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The response to thePersonalizeServiceCommandRequest Service Command
 * 
 * <p>Java class for PersonalizeServiceCommandResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalizeServiceCommandResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceCommandResponseType">
 *       &lt;sequence>
 *         &lt;element name="PersonalizationOutputData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalizeServiceCommandResponseType", propOrder = {
    "personalizationOutputData"
})
public class PersonalizeServiceCommandResponseType
    extends ServiceCommandResponseType
{

    @XmlElement(name = "PersonalizationOutputData")
    protected Object personalizationOutputData;

    /**
     * Gets the value of the personalizationOutputData property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPersonalizationOutputData() {
        return personalizationOutputData;
    }

    /**
     * Sets the value of the personalizationOutputData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPersonalizationOutputData(Object value) {
        this.personalizationOutputData = value;
    }

}
