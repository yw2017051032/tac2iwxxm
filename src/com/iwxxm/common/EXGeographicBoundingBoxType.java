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
 * Geographic area of the entire dataset referenced to WGS 84
 * 
 * <p>EX_GeographicBoundingBox_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EX_GeographicBoundingBox_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractEX_GeographicExtent_Type">
 *       &lt;sequence>
 *         &lt;element name="westBoundLongitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *         &lt;element name="eastBoundLongitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *         &lt;element name="southBoundLatitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *         &lt;element name="northBoundLatitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_GeographicBoundingBox_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "westBoundLongitude",
    "eastBoundLongitude",
    "southBoundLatitude",
    "northBoundLatitude"
})
public class EXGeographicBoundingBoxType
    extends AbstractEXGeographicExtentType
{

    @XmlElement(required = true)
    protected DecimalPropertyType westBoundLongitude;
    @XmlElement(required = true)
    protected DecimalPropertyType eastBoundLongitude;
    @XmlElement(required = true)
    protected DecimalPropertyType southBoundLatitude;
    @XmlElement(required = true)
    protected DecimalPropertyType northBoundLatitude;

    /**
     * 获取westBoundLongitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getWestBoundLongitude() {
        return westBoundLongitude;
    }

    /**
     * 设置westBoundLongitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setWestBoundLongitude(DecimalPropertyType value) {
        this.westBoundLongitude = value;
    }

    /**
     * 获取eastBoundLongitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    /**
     * 设置eastBoundLongitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setEastBoundLongitude(DecimalPropertyType value) {
        this.eastBoundLongitude = value;
    }

    /**
     * 获取southBoundLatitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    /**
     * 设置southBoundLatitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setSouthBoundLatitude(DecimalPropertyType value) {
        this.southBoundLatitude = value;
    }

    /**
     * 获取northBoundLatitude属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    /**
     * 设置northBoundLatitude属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setNorthBoundLatitude(DecimalPropertyType value) {
        this.northBoundLatitude = value;
    }

}
