
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The response to the InstantiateApplicationCommand SE Command
 * 
 * <p>Java class for InstantiateApplicationCommandResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstantiateApplicationCommandResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SECommandResponseType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}AIDType" minOccurs="0"/>
 *         &lt;element name="ApplicationTAR" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}TARType" minOccurs="0"/>
 *         &lt;element name="ParentAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}AIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstantiateApplicationCommandResponseType", propOrder = {
    "applicationAID",
    "applicationTAR",
    "parentAID"
})
public class InstantiateApplicationCommandResponseType
    extends SECommandResponseType
{

    @XmlElement(name = "ApplicationAID")
    protected String applicationAID;
    @XmlElement(name = "ApplicationTAR")
    protected String applicationTAR;
    @XmlElement(name = "ParentAID")
    protected String parentAID;

    /**
     * Gets the value of the applicationAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationAID() {
        return applicationAID;
    }

    /**
     * Sets the value of the applicationAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationAID(String value) {
        this.applicationAID = value;
    }

    /**
     * Gets the value of the applicationTAR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationTAR() {
        return applicationTAR;
    }

    /**
     * Sets the value of the applicationTAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationTAR(String value) {
        this.applicationTAR = value;
    }

    /**
     * Gets the value of the parentAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAID() {
        return parentAID;
    }

    /**
     * Sets the value of the parentAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentAID(String value) {
        this.parentAID = value;
    }

}
