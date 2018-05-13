//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PermissibleUsageType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PermissibleUsageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPERATIONAL"/>
 *     &lt;enumeration value="NON-OPERATIONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermissibleUsageType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
@XmlEnum
public enum PermissibleUsageType {


    /**
     * Data may be used for operational purposes
     * 
     */
    OPERATIONAL("OPERATIONAL"),

    /**
     * Data should not be used for operational purposes, but may be used for other purposes
     * 
     */
    @XmlEnumValue("NON-OPERATIONAL")
    NON_OPERATIONAL("NON-OPERATIONAL");
    private final String value;

    PermissibleUsageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermissibleUsageType fromValue(String v) {
        for (PermissibleUsageType c: PermissibleUsageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
