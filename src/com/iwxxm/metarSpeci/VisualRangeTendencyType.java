//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VisualRangeTendencyType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="VisualRangeTendencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UPWARD"/>
 *     &lt;enumeration value="NO_CHANGE"/>
 *     &lt;enumeration value="DOWNWARD"/>
 *     &lt;enumeration value="MISSING_VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VisualRangeTendencyType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
@XmlEnum
public enum VisualRangeTendencyType {


    /**
     * Upward (increasing) tendency
     * 
     */
    UPWARD,

    /**
     * No distinct change
     * 
     */
    NO_CHANGE,

    /**
     * Downward (decreasing) tendency
     * 
     */
    DOWNWARD,

    /**
     * Missing value
     * 
     */
    MISSING_VALUE;

    public String value() {
        return name();
    }

    public static VisualRangeTendencyType fromValue(String v) {
        return valueOf(v);
    }

}
