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
 * <p>MeteorologicalAerodromeReportStatusType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
