
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Label complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Label">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XPosition" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}XPositionType"/>
 *         &lt;element name="YPosition" type="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}YPositionType"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}Side"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}AnchorPosition"/>
 *         &lt;element ref="{http://namespaces.globalplatform.org/systems-profiles/1.1.2}MaterialID"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2", propOrder = {
    "xPosition",
    "yPosition",
    "side",
    "anchorPosition",
    "materialID"
})
public class Label {

    @XmlElement(name = "XPosition", required = true)
    protected XPositionType xPosition;
    @XmlElement(name = "YPosition", required = true)
    protected YPositionType yPosition;
    @XmlElement(name = "Side", required = true)
    protected String side;
    @XmlElement(name = "AnchorPosition", required = true)
    protected String anchorPosition;
    @XmlElement(name = "MaterialID", required = true)
    protected String materialID;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "description", required = true)
    protected String description;

    /**
     * Gets the value of the xPosition property.
     * 
     * @return
     *     possible object is
     *     {@link XPositionType }
     *     
     */
    public XPositionType getXPosition() {
        return xPosition;
    }

    /**
     * Sets the value of the xPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPositionType }
     *     
     */
    public void setXPosition(XPositionType value) {
        this.xPosition = value;
    }

    /**
     * Gets the value of the yPosition property.
     * 
     * @return
     *     possible object is
     *     {@link YPositionType }
     *     
     */
    public YPositionType getYPosition() {
        return yPosition;
    }

    /**
     * Sets the value of the yPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link YPositionType }
     *     
     */
    public void setYPosition(YPositionType value) {
        this.yPosition = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

    /**
     * Gets the value of the anchorPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnchorPosition() {
        return anchorPosition;
    }

    /**
     * Sets the value of the anchorPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnchorPosition(String value) {
        this.anchorPosition = value;
    }

    /**
     * Gets the value of the materialID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialID() {
        return materialID;
    }

    /**
     * Sets the value of the materialID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialID(String value) {
        this.materialID = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
