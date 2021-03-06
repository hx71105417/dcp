
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEST"/>
 *     &lt;enumeration value="PRODUCTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mode", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2")
@XmlEnum
public enum Mode {

    TEST,
    PRODUCTION;

    public String value() {
        return name();
    }

    public static Mode fromValue(String v) {
        return valueOf(v);
    }

}
