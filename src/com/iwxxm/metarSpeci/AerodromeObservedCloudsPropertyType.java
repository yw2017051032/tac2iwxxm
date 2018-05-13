//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeObservedCloudsPropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AerodromeObservedCloudsPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.wmo.int/iwxxm/2.1}AerodromeObservedClouds"/>
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
@XmlType(name = "AerodromeObservedCloudsPropertyType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "aerodromeObservedClouds"
})
@XmlSeeAlso({
    com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType.Cloud.class
})
public class AerodromeObservedCloudsPropertyType {

    @XmlElement(name = "AerodromeObservedClouds", required = true)
    protected AerodromeObservedCloudsType aerodromeObservedClouds;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * 获取aerodromeObservedClouds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AerodromeObservedCloudsType }
     *     
     */
    public AerodromeObservedCloudsType getAerodromeObservedClouds() {
        return aerodromeObservedClouds;
    }

    /**
     * 设置aerodromeObservedClouds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeObservedCloudsType }
     *     
     */
    public void setAerodromeObservedClouds(AerodromeObservedCloudsType value) {
        this.aerodromeObservedClouds = value;
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
