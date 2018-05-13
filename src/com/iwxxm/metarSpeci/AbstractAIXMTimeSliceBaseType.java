//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type of AIXM Timeslices.  Removes option attributes that are not used in AIXM.
 * 
 * <p>AbstractAIXMTimeSliceBaseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMTimeSliceBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractTimeSliceType">
 *       &lt;sequence>
 *         &lt;sequence>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}validTime"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMTimeSliceBaseType", namespace = "http://www.aixm.aero/schema/5.1.1")
@XmlSeeAlso({
    AbstractAIXMTimeSliceType.class
})
public abstract class AbstractAIXMTimeSliceBaseType
    extends AbstractTimeSliceType
{


}
