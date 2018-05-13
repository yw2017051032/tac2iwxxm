//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RunwayDirectionTimeSlicePropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RunwayDirectionTimeSlicePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}RunwayDirectionTimeSlice"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayDirectionTimeSlicePropertyType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "runwayDirectionTimeSlice"
})
public class RunwayDirectionTimeSlicePropertyType {

    @XmlElement(name = "RunwayDirectionTimeSlice", required = true)
    protected RunwayDirectionTimeSliceType runwayDirectionTimeSlice;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * 获取runwayDirectionTimeSlice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RunwayDirectionTimeSliceType }
     *     
     */
    public RunwayDirectionTimeSliceType getRunwayDirectionTimeSlice() {
        return runwayDirectionTimeSlice;
    }

    /**
     * 设置runwayDirectionTimeSlice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDirectionTimeSliceType }
     *     
     */
    public void setRunwayDirectionTimeSlice(RunwayDirectionTimeSliceType value) {
        this.runwayDirectionTimeSlice = value;
    }

    /**
     * 获取owns属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * 设置owns属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
    }

}
