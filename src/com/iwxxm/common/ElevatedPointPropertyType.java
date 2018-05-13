//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ElevatedPointPropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ElevatedPointPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}ElevatedPoint"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedPointPropertyType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "elevatedPoint"
})
public class ElevatedPointPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ElevatedPoint", required = true)
    protected ElevatedPointType elevatedPoint;

    /**
     * 获取elevatedPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ElevatedPointType }
     *     
     */
    public ElevatedPointType getElevatedPoint() {
        return elevatedPoint;
    }

    /**
     * 设置elevatedPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedPointType }
     *     
     */
    public void setElevatedPoint(ElevatedPointType value) {
        this.elevatedPoint = value;
    }

}
