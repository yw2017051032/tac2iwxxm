//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>KnotTypesType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="KnotTypesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="uniform"/>
 *     &lt;enumeration value="quasiUniform"/>
 *     &lt;enumeration value="piecewiseBezier"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KnotTypesType")
@XmlEnum
public enum KnotTypesType {

    @XmlEnumValue("uniform")
    UNIFORM("uniform"),
    @XmlEnumValue("quasiUniform")
    QUASI_UNIFORM("quasiUniform"),
    @XmlEnumValue("piecewiseBezier")
    PIECEWISE_BEZIER("piecewiseBezier");
    private final String value;

    KnotTypesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KnotTypesType fromValue(String v) {
        for (KnotTypesType c: KnotTypesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
