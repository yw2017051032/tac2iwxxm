//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>typeType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="typeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="simple"/>
 *     &lt;enumeration value="extended"/>
 *     &lt;enumeration value="title"/>
 *     &lt;enumeration value="resource"/>
 *     &lt;enumeration value="locator"/>
 *     &lt;enumeration value="arc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeType", namespace = "http://www.w3.org/1999/xlink")
@XmlEnum
public enum TypeType {

    @XmlEnumValue("simple")
    SIMPLE("simple"),
    @XmlEnumValue("extended")
    EXTENDED("extended"),
    @XmlEnumValue("title")
    TITLE("title"),
    @XmlEnumValue("resource")
    RESOURCE("resource"),
    @XmlEnumValue("locator")
    LOCATOR("locator"),
    @XmlEnumValue("arc")
    ARC("arc");
    private final String value;

    TypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeType fromValue(String v) {
        for (TypeType c: TypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
