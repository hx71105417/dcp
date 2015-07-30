
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 本元素用于申请激活码，发送激活请求。ActivationCode为空是申请激活码，有值则是验证激活码。
 * 			
 * 
 * <p>Java class for ActivationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TokenPAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActivationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationInfoType", namespace = "http://www.gi-de.com/gd-extionsion-1.0.0", propOrder = {
    "userId",
    "tokenPAN",
    "activationCode"
})
public class ActivationInfoType {

    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "TokenPAN", required = true)
    protected String tokenPAN;
    @XmlElement(name = "ActivationCode")
    protected String activationCode;

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the tokenPAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenPAN() {
        return tokenPAN;
    }

    /**
     * Sets the value of the tokenPAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenPAN(String value) {
        this.tokenPAN = value;
    }

    /**
     * Gets the value of the activationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * Sets the value of the activationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationCode(String value) {
        this.activationCode = value;
    }

}
