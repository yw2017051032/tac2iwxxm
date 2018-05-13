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
 * <p>PermissibleUsageType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
