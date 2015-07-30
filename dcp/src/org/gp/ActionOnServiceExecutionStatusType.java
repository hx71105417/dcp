
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionOnServiceExecutionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionOnServiceExecutionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXECUTED_SUCCESS"/>
 *     &lt;enumeration value="EXECUTED_FAILED"/>
 *     &lt;enumeration value="DELIVEREDWITHNORESPONSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionOnServiceExecutionStatusType")
@XmlEnum
public enum ActionOnServiceExecutionStatusType {

    EXECUTED_SUCCESS,
    EXECUTED_FAILED,
    DELIVEREDWITHNORESPONSE;

    public String value() {
        return name();
    }

    public static ActionOnServiceExecutionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
