//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RelationalOperatorType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="RelationalOperatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABOVE"/>
 *     &lt;enumeration value="BELOW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationalOperatorType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
@XmlEnum
public enum RelationalOperatorType {


    /**
     * The actual value is above the maximum value that can be determined by the system ("ABV", "P")
     * 
     */
    ABOVE,

    /**
     * The actual value is below the minimum value that can be determined by the system ("BLW", "M")
     * 
     */
    BELOW;

    public String value() {
        return name();
    }

    public static RelationalOperatorType fromValue(String v) {
        return valueOf(v);
    }

}
