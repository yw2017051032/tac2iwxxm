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
 * <p>MeteorologicalAerodromeReportStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MeteorologicalAerodromeReportStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="CORRECTION"/>
 *     &lt;enumeration value="MISSING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeteorologicalAerodromeReportStatusType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
@XmlEnum
public enum MeteorologicalAerodromeReportStatusType {


    /**
     * 
     * Normal report status: not a correction of an earlier report
     * 
     * 
     */
    NORMAL,

    /**
     * A correction of an earlier report
     * 
     */
    CORRECTION,

    /**
     * 
     * The report is missing ("NIL" from ICAO Annex 3 / WMO No. 49)
     * 
     * 
     */
    MISSING;

    public String value() {
        return name();
    }

    public static MeteorologicalAerodromeReportStatusType fromValue(String v) {
        return valueOf(v);
    }

}
