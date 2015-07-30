
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This SE Command requests the deletion of an Application (either a simple Application or a Supplementary Security Domain) or an Executable Load File.
 * 
 * <p>Java class for DeleteCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteCommandType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SECommandType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationOrExecutableLoadFileAID" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}AIDType"/>
 *         &lt;element name="DeleteRelatedObjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SEObjectDeletionMode" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}SEObjectDeletionModeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteCommandType", propOrder = {
    "applicationOrExecutableLoadFileAID",
    "deleteRelatedObjects",
    "seObjectDeletionMode"
})
public class DeleteCommandType
    extends SECommandType
{

    @XmlElement(name = "ApplicationOrExecutableLoadFileAID", required = true)
    protected String applicationOrExecutableLoadFileAID;
    @XmlElement(name = "DeleteRelatedObjects")
    protected Boolean deleteRelatedObjects;
    @XmlElement(name = "SEObjectDeletionMode")
    protected SEObjectDeletionModeType seObjectDeletionMode;

    /**
     * Gets the value of the applicationOrExecutableLoadFileAID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationOrExecutableLoadFileAID() {
        return applicationOrExecutableLoadFileAID;
    }

    /**
     * Sets the value of the applicationOrExecutableLoadFileAID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationOrExecutableLoadFileAID(String value) {
        this.applicationOrExecutableLoadFileAID = value;
    }

    /**
     * Gets the value of the deleteRelatedObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteRelatedObjects() {
        return deleteRelatedObjects;
    }

    /**
     * Sets the value of the deleteRelatedObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteRelatedObjects(Boolean value) {
        this.deleteRelatedObjects = value;
    }

    /**
     * Gets the value of the seObjectDeletionMode property.
     * 
     * @return
     *     possible object is
     *     {@link SEObjectDeletionModeType }
     *     
     */
    public SEObjectDeletionModeType getSEObjectDeletionMode() {
        return seObjectDeletionMode;
    }

    /**
     * Sets the value of the seObjectDeletionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEObjectDeletionModeType }
     *     
     */
    public void setSEObjectDeletionMode(SEObjectDeletionModeType value) {
        this.seObjectDeletionMode = value;
    }

}
