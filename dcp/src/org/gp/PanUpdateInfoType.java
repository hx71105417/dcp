
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				主PAN的信息更新，用于银行通知云端支付平台。NewPAN留空标识是原始卡号的有效期延长，有值表示是换卡。
 * 			
 * 
 * <p>Java class for PanUpdateInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PanUpdateInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrginalPAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NewPAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PanUpdateInfoType", namespace = "http://www.gi-de.com/gd-extionsion-1.0.0", propOrder = {
    "orginalPAN",
    "newPAN",
    "validDate"
})
public class PanUpdateInfoType {

    @XmlElement(name = "OrginalPAN", required = true)
    protected String orginalPAN;
    @XmlElement(name = "NewPAN")
    protected String newPAN;
    @XmlElement(name = "ValidDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validDate;

    /**
     * Gets the value of the orginalPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrginalPAN() {
        return orginalPAN;
    }

    /**
     * Sets the value of the orginalPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrginalPAN(String value) {
        this.orginalPAN = value;
    }

    /**
     * Gets the value of the newPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPAN() {
        return newPAN;
    }

    /**
     * Sets the value of the newPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPAN(String value) {
        this.newPAN = value;
    }

    /**
     * Gets the value of the validDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidDate(XMLGregorianCalendar value) {
        this.validDate = value;
    }

}
