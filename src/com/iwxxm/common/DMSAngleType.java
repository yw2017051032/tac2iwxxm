//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DMSAngleType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DMSAngleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}degrees"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}decimalMinutes"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}minutes"/>
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}seconds" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DMSAngleType", propOrder = {
    "degrees",
    "decimalMinutes",
    "minutes",
    "seconds"
})
public class DMSAngleType {

    @XmlElement(required = true)
    protected DegreesType degrees;
    protected BigDecimal decimalMinutes;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer minutes;
    protected BigDecimal seconds;

    /**
     * 获取degrees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DegreesType }
     *     
     */
    public DegreesType getDegrees() {
        return degrees;
    }

    /**
     * 设置degrees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DegreesType }
     *     
     */
    public void setDegrees(DegreesType value) {
        this.degrees = value;
    }

    /**
     * 获取decimalMinutes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalMinutes() {
        return decimalMinutes;
    }

    /**
     * 设置decimalMinutes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalMinutes(BigDecimal value) {
        this.decimalMinutes = value;
    }

    /**
     * 获取minutes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutes() {
        return minutes;
    }

    /**
     * 设置minutes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutes(Integer value) {
        this.minutes = value;
    }

    /**
     * 获取seconds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeconds() {
        return seconds;
    }

    /**
     * 设置seconds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeconds(BigDecimal value) {
        this.seconds = value;
    }

}
