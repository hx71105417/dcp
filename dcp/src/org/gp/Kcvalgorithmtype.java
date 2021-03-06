
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kcvalgorithmtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="kcvalgorithmtype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EIGHTZEROS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "kcvalgorithmtype", namespace = "http://namespaces.globalplatform.org/systems-profiles/1.1.2")
@XmlEnum
public enum Kcvalgorithmtype {

    EIGHTZEROS;

    public String value() {
        return name();
    }

    public static Kcvalgorithmtype fromValue(String v) {
        return valueOf(v);
    }

}
