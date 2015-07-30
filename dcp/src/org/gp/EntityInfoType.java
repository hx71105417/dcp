
package org.gp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				用于指定操作实体的类型，可以是标记，也可以是PAN，针对挂失、解挂、锁定、解锁及注销。EntityType指明是针对标记还是主PAN。
 * 			
 * 
 * <p>Java class for EntityInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityType" type="{http://www.gi-de.com/gd-extionsion-1.0.0}EntityTypeEnum"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OperationReason" type="{http://www.gi-de.com/gd-extionsion-1.0.0}OperationReasonEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityInfoType", namespace = "http://www.gi-de.com/gd-extionsion-1.0.0", propOrder = {
    "entityType",
    "value",
    "operationReason"
})
public class EntityInfoType {

    @XmlElement(name = "EntityType", required = true)
    protected EntityTypeEnum entityType;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "OperationReason")
    protected OperationReasonEnum operationReason;

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeEnum }
     *     
     */
    public EntityTypeEnum getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeEnum }
     *     
     */
    public void setEntityType(EntityTypeEnum value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the operationReason property.
     * 
     * @return
     *     possible object is
     *     {@link OperationReasonEnum }
     *     
     */
    public OperationReasonEnum getOperationReason() {
        return operationReason;
    }

    /**
     * Sets the value of the operationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationReasonEnum }
     *     
     */
    public void setOperationReason(OperationReasonEnum value) {
        this.operationReason = value;
    }

}
