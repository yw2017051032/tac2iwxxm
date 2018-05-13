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
 * <p>AerodromeForecastChangeIndicatorType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="AerodromeForecastChangeIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BECOMING"/>
 *     &lt;enumeration value="TEMPORARY_FLUCTUATIONS"/>
 *     &lt;enumeration value="FROM"/>
 *     &lt;enumeration value="PROBABILITY_30"/>
 *     &lt;enumeration value="PROBABILITY_30_TEMPORARY_FLUCTUATIONS"/>
 *     &lt;enumeration value="PROBABILITY_40"/>
 *     &lt;enumeration value="PROBABILITY_40_TEMPORARY_FLUCTUATIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AerodromeForecastChangeIndicatorType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
@XmlEnum
public enum AerodromeForecastChangeIndicatorType {


    /**
     * Conditions are expected to reach or pass through specified threshold values at a regular or irregular rate and at an unspecified time during the time period.  The time period should normally not exceed 2 hours but in any case should not exceed 4 hours.
     * 
     * ICAO Annex 3 / WMO No. 49-2:
     * "BECMG"
     * 
     */
    BECOMING,

    /**
     * Expected temporary fluctuations to meteorological conditions which reach or pass specified threshold criteria and last for a period of less than one hour in each instance and in the aggregate cover less than half of the forecast period during which the fluctuations are expected to occur.
     * 
     * ICAO Annex 3 / WMO No. 49-2:
     * "TEMPO"
     * 
     */
    TEMPORARY_FLUCTUATIONS,

    /**
     * One set of prevailing weather conditions is expected to change significantly and more or less completely to a different set of conditions. Conditions in a FROM group supersede conditions in earlier groups.
     * 
     * ICAO Annex 3 / WMO No. 49-2:
     * "FM"
     * 
     */
    FROM,

    /**
     * A 30% probability of occurrence of an alternative value of a forecast element or elements.
     * 
     * ICAO Annex 3 / WMO No. 49-2:
     * "PROB30"
     * 
     */
    PROBABILITY_30,

    /**
     * A 30% probability of occurrence of temporary conditions of an alternative value of a forecast element or elements.
     * 
     * ICAO Annex 3 / WMO No. 49-2:
     * "PROB30 TEMPO"
     * 
     */
    PROBABILITY_30_TEMPORARY_FLUCTUATIONS,

    /**
     * A 40% probability of occurrence of an alternative value of a forecast element or elements.
     * 
     * ICAO Annex 3 / WMO No. 49-2:
     * "PROB40"
     * 
     */
    PROBABILITY_40,

    /**
     * A 40% probability of occurrence of temporary conditions of an alternative value of a forecast element or elements.
     * 
     * ICAO Annex 3 / WMO No. 49-2:
     * "PROB40 TEMPO"
     * 
     */
    PROBABILITY_40_TEMPORARY_FLUCTUATIONS;

    public String value() {
        return name();
    }

    public static AerodromeForecastChangeIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
