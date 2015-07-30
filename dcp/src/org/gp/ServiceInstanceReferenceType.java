
package org.gp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The opaque (i.e. without standardized capability to retrieve information by just analyzing its value) representation of:
 * - The Service Identifier and Service Qualifier of the mobile-NFC service
 * - And the Secure Element Identifier into which the service is deployed
 * To be used for function calls between AP and SDM.
 * 
 * <p>Java class for ServiceInstanceReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInstanceReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceOwner" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ObjectIdentifierType"/>
 *         &lt;element name="Reference" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceInstanceReferenceSimpleType"/>
 *         &lt;element name="Extensions" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ExtensionsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInstanceReferenceType", propOrder = {
    "referenceOwner",
    "reference",
    "extensions"
})
public class ServiceInstanceReferenceType {

    @XmlElement(name = "ReferenceOwner", required = true)
    protected String referenceOwner;
    @XmlElement(name = "Reference", required = true)
    protected String reference;
    @XmlElement(name = "Extensions")
    protected List<ExtensionsType> extensions;

    /**
     * Gets the value of the referenceOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceOwner() {
        return referenceOwner;
    }

    /**
     * Sets the value of the referenceOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceOwner(String value) {
        this.referenceOwner = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionsType }
     * 
     * 
     */
    public List<ExtensionsType> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<ExtensionsType>();
        }
        return this.extensions;
    }

}
