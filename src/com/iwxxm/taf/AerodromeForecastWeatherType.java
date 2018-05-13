//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * AerodromeForecastWeather enables the forecast weather at an aerodrome to be reported.
 * 
 * Only a specific set of weather phenomenon are reported within aviation meteorology as defined in Regulation ICAO Annex 3 / WMO No. 49-2.
 * 
 * This CodeList is specifically defined for aviation purposes as defined in WMO No. 49-2. A superset of definitions are defined in WMO No. 306 Vol I.1 code-table 4678 "Significant weather phenomena".
 * 
 * <p>AerodromeForecastWeatherType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AerodromeForecastWeatherType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}ReferenceType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeForecastWeatherType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
public class AerodromeForecastWeatherType
    extends ReferenceType
{


}