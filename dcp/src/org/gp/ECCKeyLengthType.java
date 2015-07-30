
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECCKeyLengthType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ECCKeyLengthType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECC-256"/>
 *     &lt;enumeration value="ECC-384"/>
 *     &lt;enumeration value="ECC-512"/>
 *     &lt;enumeration value="ECC-521"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ECCKeyLengthType")
@XmlEnum
public enum ECCKeyLengthType {

    @XmlEnumValue("ECC-256")
    ECC_256("ECC-256"),
    @XmlEnumValue("ECC-384")
    ECC_384("ECC-384"),
    @XmlEnumValue("ECC-512")
    ECC_512("ECC-512"),
    @XmlEnumValue("ECC-521")
    ECC_521("ECC-521");
    private final String value;

    ECCKeyLengthType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECCKeyLengthType fromValue(String v) {
        for (ECCKeyLengthType c: ECCKeyLengthType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
