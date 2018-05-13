//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TimeIndicatorType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TimeIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OBSERVATION"/>
 *     &lt;enumeration value="FORECAST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeIndicatorType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
@XmlEnum
public enum TimeIndicatorType {


    /**
     * The information is observed
     * 
     */
    OBSERVATION,

    /**
     * The information is predicated or estimated to occur at some point in the future
     * 
     */
    FORECAST;

    public String value() {
        return name();
    }

    public static TimeIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
