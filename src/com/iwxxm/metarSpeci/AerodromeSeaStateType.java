//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeSeaStateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AerodromeSeaStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seaSurfaceTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="significantWaveHeight" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="seaState" type="{http://schemas.wmo.int/iwxxm/2.1}SeaSurfaceStateType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeSeaStateType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "seaSurfaceTemperature",
    "significantWaveHeight",
    "seaState",
    "extension"
})
public class AerodromeSeaStateType {

    @XmlElement(required = true)
    protected MeasureType seaSurfaceTemperature;
    protected LengthType significantWaveHeight;
    protected SeaSurfaceStateType seaState;
    protected List<Object> extension;

    /**
     * 获取seaSurfaceTemperature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSeaSurfaceTemperature() {
        return seaSurfaceTemperature;
    }

    /**
     * 设置seaSurfaceTemperature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSeaSurfaceTemperature(MeasureType value) {
        this.seaSurfaceTemperature = value;
    }

    /**
     * 获取significantWaveHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getSignificantWaveHeight() {
        return significantWaveHeight;
    }

    /**
     * 设置significantWaveHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setSignificantWaveHeight(LengthType value) {
        this.significantWaveHeight = value;
    }

    /**
     * 获取seaState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeaSurfaceStateType }
     *     
     */
    public SeaSurfaceStateType getSeaState() {
        return seaState;
    }

    /**
     * 设置seaState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeaSurfaceStateType }
     *     
     */
    public void setSeaState(SeaSurfaceStateType value) {
        this.seaState = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

}
