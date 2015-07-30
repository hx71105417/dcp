
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A SD key value
 * 
 * <p>Java class for SDKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDKeyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyIdentifier" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="EncryptedKeyValue" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="KCV" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SDKeyType", propOrder = {
    "keyIdentifier",
    "encryptedKeyValue",
    "kcv"
})
public class SDKeyType {

    @XmlElement(name = "KeyIdentifier")
    protected byte keyIdentifier;
    @XmlElement(name = "EncryptedKeyValue", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] encryptedKeyValue;
    @XmlElement(name = "KCV", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] kcv;

    /**
     * Gets the value of the keyIdentifier property.
     * 
     */
    public byte getKeyIdentifier() {
        return keyIdentifier;
    }

    /**
     * Sets the value of the keyIdentifier property.
     * 
     */
    public void setKeyIdentifier(byte value) {
        this.keyIdentifier = value;
    }

    /**
     * Gets the value of the encryptedKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEncryptedKeyValue() {
        return encryptedKeyValue;
    }

    /**
     * Sets the value of the encryptedKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedKeyValue(byte[] value) {
        this.encryptedKeyValue = value;
    }

    /**
     * Gets the value of the kcv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getKCV() {
        return kcv;
    }

    /**
     * Sets the value of the kcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKCV(byte[] value) {
        this.kcv = value;
    }

}
