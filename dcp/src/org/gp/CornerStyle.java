
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CornerStyle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CornerStyle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}SquareCorner"/>
 *         &lt;element name="RoundCorner" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}RoundCorner"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CornerStyle", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", propOrder = {
    "squareCorner",
    "roundCorner"
})
public class CornerStyle {

    @XmlElement(name = "SquareCorner")
    protected SquareCorner squareCorner;
    @XmlElement(name = "RoundCorner")
    protected RoundCorner roundCorner;

    /**
     * Gets the value of the squareCorner property.
     * 
     * @return
     *     possible object is
     *     {@link SquareCorner }
     *     
     */
    public SquareCorner getSquareCorner() {
        return squareCorner;
    }

    /**
     * Sets the value of the squareCorner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SquareCorner }
     *     
     */
    public void setSquareCorner(SquareCorner value) {
        this.squareCorner = value;
    }

    /**
     * Gets the value of the roundCorner property.
     * 
     * @return
     *     possible object is
     *     {@link RoundCorner }
     *     
     */
    public RoundCorner getRoundCorner() {
        return roundCorner;
    }

    /**
     * Sets the value of the roundCorner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundCorner }
     *     
     */
    public void setRoundCorner(RoundCorner value) {
        this.roundCorner = value;
    }

}
