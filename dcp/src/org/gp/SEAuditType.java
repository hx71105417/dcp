
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SEAuditType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SEAuditType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OFFLINE"/>
 *     &lt;enumeration value="ONLINE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SEAuditType")
@XmlEnum
public enum SEAuditType {

    OFFLINE,
    ONLINE;

    public String value() {
        return name();
    }

    public static SEAuditType fromValue(String v) {
        return valueOf(v);
    }

}
