//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Weather phenomenon of operational significance to aviation observed during the period since the last routine report, or last hour, whichever is shorter, but not at the time of observation. Only a specific set of weather phenomenon are reported within aviation meteorology as defined in Regulation ICAO Annex 3 / WMO No. 49-2. This CodeList is specifically defined for aviation purposes as defined in WMO No. 49-2. A superset of definitions are defined in WMO No. 306 Vol I.1 code-table 4678 "Significant weather phenomena".
 * 
 * 
 * <p>AerodromeRecentWeatherType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AerodromeRecentWeatherType">
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
@XmlType(name = "AerodromeRecentWeatherType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
public class AerodromeRecentWeatherType
    extends ReferenceType
{


}
