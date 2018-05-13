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
 * <p>RelationalOperatorType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
