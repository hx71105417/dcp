
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SEObjectDeletionModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SEObjectDeletionModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DELETE_OBJECT"/>
 *     &lt;enumeration value="DELETE_OBJECT_AND_RELATED_OBJECTS"/>
 *     &lt;enumeration value="DELETE_ROOT_SD_AND_ASSOCIATED_APPLICATIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SEObjectDeletionModeType")
@XmlEnum
public enum SEObjectDeletionModeType {

    DELETE_OBJECT,
    DELETE_OBJECT_AND_RELATED_OBJECTS,
    DELETE_ROOT_SD_AND_ASSOCIATED_APPLICATIONS;

    public String value() {
        return name();
    }

    public static SEObjectDeletionModeType fromValue(String v) {
        return valueOf(v);
    }

}
