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
 * <p>AbstractDQ_ThematicAccuracy_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AbstractDQ_ThematicAccuracy_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractDQ_Element_Type">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDQ_ThematicAccuracy_Type", namespace = "http://www.isotc211.org/2005/gmd")
@XmlSeeAlso({
    DQThematicClassificationCorrectnessType.class,
    DQQuantitativeAttributeAccuracyType.class,
    DQNonQuantitativeAttributeAccuracyType.class
})
public abstract class AbstractDQThematicAccuracyType
    extends AbstractDQElementType
{


}
