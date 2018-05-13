//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Categorical assessment of sea surface state (or other large open body of water) based on height of waves. Height in metres : Category - 0 metres : Calm (glassy) - 0-0.1 metres : Calm (rippled) - 0.1-0.5 metres : Smooth - 0.5-1.25 metres : Slight - 1.25-2.5 metres : Moderate - 2.5-4 metres : Rough - 4-6 metres : Very rough - 6-9 metres : High - 9-14 metres : Very high - >14 metres : Phenomenal See WMO No. 306 Vol I.1 code table 3700 "State of the sea" and WMO No. 306 Vol I.2 FM 94 BUFR code table 0 22 061 "State of the sea".
 * 
 * 
 * <p>SeaSurfaceStateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeaSurfaceStateType">
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
@XmlType(name = "SeaSurfaceStateType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
public class SeaSurfaceStateType
    extends ReferenceType
{


}
