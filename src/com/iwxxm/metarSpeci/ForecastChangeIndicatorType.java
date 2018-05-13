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
 * <p>ForecastChangeIndicatorType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ForecastChangeIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BECOMING"/>
 *     &lt;enumeration value="TEMPORARY_FLUCTUATIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForecastChangeIndicatorType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
@XmlEnum
public enum ForecastChangeIndicatorType {


    /**
     * 
     * When the change is forecast to commence at the beginning of the forecast period and be completed by the end of that period, or when the change is forecast to occur within the forecast period but the time of the change is uncertain (possibly shortly after the beginning of the forecast period, or midway or near the end of that period), the change is indicated by only the change indicator BECMG.
     * 
     * 
     */
    BECOMING,

    /**
     * 
     * The change indicator TEMPO is used to describe expected temporary fluctuations to meteorological conditions which reach or pass specified threshold criteria and last for a period of less than one hour in each instance and in the aggregate cover less than half of the forecast period during which the fluctuations are expected to occur.
     * 
     * 
     */
    TEMPORARY_FLUCTUATIONS;

    public String value() {
        return name();
    }

    public static ForecastChangeIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
