//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TAFReportStatusType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TAFReportStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NORMAL"/>
 *     &lt;enumeration value="AMENDMENT"/>
 *     &lt;enumeration value="CANCELLATION"/>
 *     &lt;enumeration value="CORRECTION"/>
 *     &lt;enumeration value="MISSING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TAFReportStatusType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
@XmlEnum
public enum TAFReportStatusType {


    /**
     * An normal issuance of a TAF
     * 
     */
    NORMAL,

    /**
     * An amendment of an earlier TAF
     * 
     */
    AMENDMENT,

    /**
     * A cancellation of an earlier TAF
     * 
     */
    CANCELLATION,

    /**
     * A correction of an earlier TAF
     * 
     */
    CORRECTION,

    /**
     * The report is missing ("NIL" from ICAO Annex 3 / WMO No. 49)
     * 
     */
    MISSING;

    public String value() {
        return name();
    }

    public static TAFReportStatusType fromValue(String v) {
        return valueOf(v);
    }

}
