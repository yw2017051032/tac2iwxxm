//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeSurfaceWindTrendForecastPropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AerodromeSurfaceWindTrendForecastPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.wmo.int/iwxxm/2.1}AerodromeSurfaceWindTrendForecast"/>
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
@XmlType(name = "AerodromeSurfaceWindTrendForecastPropertyType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "aerodromeSurfaceWindTrendForecast"
})
public class AerodromeSurfaceWindTrendForecastPropertyType {

    @XmlElementRef(name = "AerodromeSurfaceWindTrendForecast", namespace = "http://schemas.wmo.int/iwxxm/2.1", type = JAXBElement.class)
    protected JAXBElement<? extends AerodromeSurfaceWindTrendForecastType> aerodromeSurfaceWindTrendForecast;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * 获取aerodromeSurfaceWindTrendForecast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerodromeSurfaceWindForecastType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerodromeSurfaceWindTrendForecastType }{@code >}
     *     
     */
    public JAXBElement<? extends AerodromeSurfaceWindTrendForecastType> getAerodromeSurfaceWindTrendForecast() {
        return aerodromeSurfaceWindTrendForecast;
    }

    /**
     * 设置aerodromeSurfaceWindTrendForecast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerodromeSurfaceWindForecastType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AerodromeSurfaceWindTrendForecastType }{@code >}
     *     
     */
    public void setAerodromeSurfaceWindTrendForecast(JAXBElement<? extends AerodromeSurfaceWindTrendForecastType> value) {
        this.aerodromeSurfaceWindTrendForecast = value;
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
