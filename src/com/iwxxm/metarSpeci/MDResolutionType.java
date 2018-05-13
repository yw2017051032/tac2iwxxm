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
 * <p>MD_Resolution_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MD_Resolution_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="equivalentScale" type="{http://www.isotc211.org/2005/gmd}MD_RepresentativeFraction_PropertyType"/>
 *         &lt;element name="distance" type="{http://www.isotc211.org/2005/gco}Distance_PropertyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Resolution_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "equivalentScale",
    "distance"
})
public class MDResolutionType {

    protected MDRepresentativeFractionPropertyType equivalentScale;
    protected DistancePropertyType distance;

    /**
     * 获取equivalentScale属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public MDRepresentativeFractionPropertyType getEquivalentScale() {
        return equivalentScale;
    }

    /**
     * 设置equivalentScale属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public void setEquivalentScale(MDRepresentativeFractionPropertyType value) {
        this.equivalentScale = value;
    }

    /**
     * 获取distance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DistancePropertyType }
     *     
     */
    public DistancePropertyType getDistance() {
        return distance;
    }

    /**
     * 设置distance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DistancePropertyType }
     *     
     */
    public void setDistance(DistancePropertyType value) {
        this.distance = value;
    }

}
