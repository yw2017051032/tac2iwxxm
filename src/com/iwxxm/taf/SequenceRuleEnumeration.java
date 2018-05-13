//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SequenceRuleEnumeration的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SequenceRuleEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Linear"/>
 *     &lt;enumeration value="Boustrophedonic"/>
 *     &lt;enumeration value="Cantor-diagonal"/>
 *     &lt;enumeration value="Spiral"/>
 *     &lt;enumeration value="Morton"/>
 *     &lt;enumeration value="Hilbert"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SequenceRuleEnumeration")
@XmlEnum
public enum SequenceRuleEnumeration {

    @XmlEnumValue("Linear")
    LINEAR("Linear"),
    @XmlEnumValue("Boustrophedonic")
    BOUSTROPHEDONIC("Boustrophedonic"),
    @XmlEnumValue("Cantor-diagonal")
    CANTOR_DIAGONAL("Cantor-diagonal"),
    @XmlEnumValue("Spiral")
    SPIRAL("Spiral"),
    @XmlEnumValue("Morton")
    MORTON("Morton"),
    @XmlEnumValue("Hilbert")
    HILBERT("Hilbert");
    private final String value;

    SequenceRuleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SequenceRuleEnumeration fromValue(String v) {
        for (SequenceRuleEnumeration c: SequenceRuleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
