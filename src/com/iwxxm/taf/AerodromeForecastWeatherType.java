//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
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
 * <p>AerodromeForecastWeatherType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
