
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOKEN_PAN"/>
 *     &lt;enumeration value="ORIGINAL_PAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityTypeEnum", namespace = "http://www.gi-de.com/gd-extionsion-1.0.0")
@XmlEnum
public enum EntityTypeEnum {

    TOKEN_PAN,
    ORIGINAL_PAN;

    public String value() {
        return name();
    }

    public static EntityTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
