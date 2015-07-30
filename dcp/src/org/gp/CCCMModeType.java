
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CCCMModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CCCMModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Scenario 1-PK"/>
 *     &lt;enumeration value="Scenario 1-Non PK"/>
 *     &lt;enumeration value="Scenario 2A"/>
 *     &lt;enumeration value="Scenario 2B"/>
 *     &lt;enumeration value="Scenario 3-ECC-256"/>
 *     &lt;enumeration value="Scenario 3-ECC-384"/>
 *     &lt;enumeration value="Scenario 3-ECC-512"/>
 *     &lt;enumeration value="Scenario 3-ECC-521"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CCCMModeType")
@XmlEnum
public enum CCCMModeType {

    @XmlEnumValue("Scenario 1-PK")
    SCENARIO_1_PK("Scenario 1-PK"),
    @XmlEnumValue("Scenario 1-Non PK")
    SCENARIO_1_NON_PK("Scenario 1-Non PK"),
    @XmlEnumValue("Scenario 2A")
    SCENARIO_2_A("Scenario 2A"),
    @XmlEnumValue("Scenario 2B")
    SCENARIO_2_B("Scenario 2B"),
    @XmlEnumValue("Scenario 3-ECC-256")
    SCENARIO_3_ECC_256("Scenario 3-ECC-256"),
    @XmlEnumValue("Scenario 3-ECC-384")
    SCENARIO_3_ECC_384("Scenario 3-ECC-384"),
    @XmlEnumValue("Scenario 3-ECC-512")
    SCENARIO_3_ECC_512("Scenario 3-ECC-512"),
    @XmlEnumValue("Scenario 3-ECC-521")
    SCENARIO_3_ECC_521("Scenario 3-ECC-521");
    private final String value;

    CCCMModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CCCMModeType fromValue(String v) {
        for (CCCMModeType c: CCCMModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
