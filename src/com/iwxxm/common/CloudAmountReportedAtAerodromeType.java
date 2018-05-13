//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Amount of cloud - assessed by category:
 * 
 * - Sky clear (0 oktas)
 * - Few (1 - 2 oktas)
 * - Scattered (3 - 4 oktas)
 * - Broken (5 - 7 oktas)
 * - Overcast (8 oktas)
 * 
 * This CodeList is specifically defined for aviation purposes, as defined in WMO No. 49-2. A superset of cloud-amount categories are defined in WMO No. 306 Vol I.2 FM 94 BUFR code-table 0 20 008 "Cloud distribution for aviation".
 * 
 * <p>CloudAmountReportedAtAerodromeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CloudAmountReportedAtAerodromeType">
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
@XmlType(name = "CloudAmountReportedAtAerodromeType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
public class CloudAmountReportedAtAerodromeType
    extends ReferenceType
{


}
