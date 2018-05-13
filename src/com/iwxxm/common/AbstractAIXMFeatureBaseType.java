//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This derives from gml:DynamicFeatureType, as all AIXM features are expected to have temporal properties modeled using the Timeslice model. While the GML specification does not mandate that dynamic features derive from gml:DynamicFeatureType, many GML-aware applications may only detect a dynamic feature by this type hierarchy. Note that all temporal properties of gml:DynamicFeatureType are removed during this restriction, because they will be added for each AIXM feature specifically, based on the TimeSlice model
 * 
 * <p>AbstractAIXMFeatureBaseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMFeatureBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}DynamicFeatureType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}description" minOccurs="0"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}identifier" minOccurs="0"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}name" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}boundedBy" minOccurs="0"/>
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
@XmlType(name = "AbstractAIXMFeatureBaseType", namespace = "http://www.aixm.aero/schema/5.1.1")
@XmlSeeAlso({
    AbstractAIXMFeatureType.class,
    AbstractAIXMMessageBaseType.class
})
public abstract class AbstractAIXMFeatureBaseType
    extends DynamicFeatureType
{


}
