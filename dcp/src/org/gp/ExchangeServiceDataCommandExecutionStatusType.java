
package org.gp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeServiceDataCommandExecutionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeServiceDataCommandExecutionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXECUTED_SUCCESS"/>
 *     &lt;enumeration value="EXECUTED_WITHWARNING"/>
 *     &lt;enumeration value="EXECUTED_FAILED"/>
 *     &lt;enumeration value="NOTEXECUTED"/>
 *     &lt;enumeration value="DELIVEREDWITHNORESPONSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExchangeServiceDataCommandExecutionStatusType")
@XmlEnum
public enum ExchangeServiceDataCommandExecutionStatusType {

    EXECUTED_SUCCESS,
    EXECUTED_WITHWARNING,
    EXECUTED_FAILED,
    NOTEXECUTED,
    DELIVEREDWITHNORESPONSE;

    public String value() {
        return name();
    }

    public static ExchangeServiceDataCommandExecutionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
