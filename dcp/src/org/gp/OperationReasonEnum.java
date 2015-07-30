
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperationReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OperationReasonEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOCK_UNLOCK"/>
 *     &lt;enumeration value="LOST_FOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OperationReasonEnum", namespace = "http://www.gi-de.com/gd-extionsion-1.0.0")
@XmlEnum
public enum OperationReasonEnum {

    LOCK_UNLOCK,
    LOST_FOUND;

    public String value() {
        return name();
    }

    public static OperationReasonEnum fromValue(String v) {
        return valueOf(v);
    }

}
