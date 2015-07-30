
package org.gp;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Notifies that the environment of the mobile-NFC service instance has changed. Environmental change might correspond to a change related to the Secure Element (SE stolen, lost, recovered, renewed¡­), or to the Device (Device stolen, lost, recovered, renewed¡­), or to the Mobile Subscription (suspended, terminated, restored¡­), etc.
 * 
 * <p>Java class for HandleServiceEnvironmentChangeNotificationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandleServiceEnvironmentChangeNotificationRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}BasicRequestType">
 *       &lt;sequence>
 *         &lt;element name="ServiceInstanceReference" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceInstanceReferenceType"/>
 *         &lt;element name="Event" type="{http://namespaces.globalplatform.org/systems-messaging/2.1.0}ServiceEnvironmentChangeEventType"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NewServiceInstanceState" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandleServiceEnvironmentChangeNotificationRequestType", propOrder = {
    "serviceInstanceReference",
    "event",
    "date",
    "newServiceInstanceState"
})
public class HandleServiceEnvironmentChangeNotificationRequestType
    extends BasicRequestType
{

    @XmlElement(name = "ServiceInstanceReference", required = true)
    protected ServiceInstanceReferenceType serviceInstanceReference;
    @XmlElement(name = "Event", required = true)
    protected BigInteger event;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "NewServiceInstanceState", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger newServiceInstanceState;

    /**
     * Gets the value of the serviceInstanceReference property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInstanceReferenceType }
     *     
     */
    public ServiceInstanceReferenceType getServiceInstanceReference() {
        return serviceInstanceReference;
    }

    /**
     * Sets the value of the serviceInstanceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInstanceReferenceType }
     *     
     */
    public void setServiceInstanceReference(ServiceInstanceReferenceType value) {
        this.serviceInstanceReference = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEvent(BigInteger value) {
        this.event = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the newServiceInstanceState property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNewServiceInstanceState() {
        return newServiceInstanceState;
    }

    /**
     * Sets the value of the newServiceInstanceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNewServiceInstanceState(BigInteger value) {
        this.newServiceInstanceState = value;
    }

}
