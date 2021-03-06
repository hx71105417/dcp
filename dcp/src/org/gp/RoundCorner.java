
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundCorner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoundCorner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CornerRadius" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}CornerRadius"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundCorner", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", propOrder = {
    "cornerRadius"
})
public class RoundCorner {

    @XmlElement(name = "CornerRadius", required = true)
    protected CornerRadius cornerRadius;

    /**
     * Gets the value of the cornerRadius property.
     * 
     * @return
     *     possible object is
     *     {@link CornerRadius }
     *     
     */
    public CornerRadius getCornerRadius() {
        return cornerRadius;
    }

    /**
     * Sets the value of the cornerRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link CornerRadius }
     *     
     */
    public void setCornerRadius(CornerRadius value) {
        this.cornerRadius = value;
    }

}
