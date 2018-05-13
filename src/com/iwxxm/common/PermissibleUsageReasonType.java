//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PermissibleUsageReasonType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PermissibleUsageReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEST"/>
 *     &lt;enumeration value="EXERCISE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PermissibleUsageReasonType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
@XmlEnum
public enum PermissibleUsageReasonType {


    /**
     * Data is part of a test activity and should not be used for operational purposes.  This may include circumstances such as issuing a single message to assess a new data network path, or as part of a more organized test of message distribution/availability such as a regional SIGMET test
     * 
     */
    TEST,

    /**
     * Data is part of a test exercise and should not be used for operational purposes.  This may include circumstances where realistic data is issued to be used in organized exercises where users will practice or train for potential scenarios.  For example, VA SIGMET exercises may include realistic data which is intended to be considered by users participating in the exercise but is not intended for operational use
     * 
     */
    EXERCISE;

    public String value() {
        return name();
    }

    public static PermissibleUsageReasonType fromValue(String v) {
        return valueOf(v);
    }

}
