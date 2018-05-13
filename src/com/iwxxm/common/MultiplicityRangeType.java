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
 * A component of a multiplicity, consisting of an non-negative lower bound, and a potentially infinite upper bound.
 * 
 * <p>MultiplicityRange_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultiplicityRange_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="lower" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType"/>
 *         &lt;element name="upper" type="{http://www.isotc211.org/2005/gco}UnlimitedInteger_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiplicityRange_Type", namespace = "http://www.isotc211.org/2005/gco", propOrder = {
    "lower",
    "upper"
})
public class MultiplicityRangeType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected IntegerPropertyType lower;
    @XmlElement(required = true)
    protected UnlimitedIntegerPropertyType upper;

    /**
     * 获取lower属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getLower() {
        return lower;
    }

    /**
     * 设置lower属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setLower(IntegerPropertyType value) {
        this.lower = value;
    }

    /**
     * 获取upper属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UnlimitedIntegerPropertyType }
     *     
     */
    public UnlimitedIntegerPropertyType getUpper() {
        return upper;
    }

    /**
     * 设置upper属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UnlimitedIntegerPropertyType }
     *     
     */
    public void setUpper(UnlimitedIntegerPropertyType value) {
        this.upper = value;
    }

}
