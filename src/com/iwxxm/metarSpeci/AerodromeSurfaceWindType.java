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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeSurfaceWindType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AerodromeSurfaceWindType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meanWindDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="meanWindSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType"/>
 *         &lt;element name="meanWindSpeedOperator" type="{http://schemas.wmo.int/iwxxm/2.1}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="windGustSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/>
 *         &lt;element name="windGustSpeedOperator" type="{http://schemas.wmo.int/iwxxm/2.1}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="extremeClockwiseWindDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="extremeCounterClockwiseWindDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="variableWindDirection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeSurfaceWindType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "meanWindDirection",
    "meanWindSpeed",
    "meanWindSpeedOperator",
    "windGustSpeed",
    "windGustSpeedOperator",
    "extremeClockwiseWindDirection",
    "extremeCounterClockwiseWindDirection",
    "extension"
})
public class AerodromeSurfaceWindType {

    protected AngleType meanWindDirection;
    @XmlElement(required = true)
    protected SpeedType meanWindSpeed;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType meanWindSpeedOperator;
    protected SpeedType windGustSpeed;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType windGustSpeedOperator;
    protected AngleType extremeClockwiseWindDirection;
    protected AngleType extremeCounterClockwiseWindDirection;
    protected List<Object> extension;
    @XmlAttribute(name = "variableWindDirection")
    protected java.lang.Boolean variableWindDirection;

    /**
     * 获取meanWindDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getMeanWindDirection() {
        return meanWindDirection;
    }

    /**
     * 设置meanWindDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setMeanWindDirection(AngleType value) {
        this.meanWindDirection = value;
    }

    /**
     * 获取meanWindSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getMeanWindSpeed() {
        return meanWindSpeed;
    }

    /**
     * 设置meanWindSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setMeanWindSpeed(SpeedType value) {
        this.meanWindSpeed = value;
    }

    /**
     * 获取meanWindSpeedOperator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getMeanWindSpeedOperator() {
        return meanWindSpeedOperator;
    }

    /**
     * 设置meanWindSpeedOperator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setMeanWindSpeedOperator(RelationalOperatorType value) {
        this.meanWindSpeedOperator = value;
    }

    /**
     * 获取windGustSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getWindGustSpeed() {
        return windGustSpeed;
    }

    /**
     * 设置windGustSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setWindGustSpeed(SpeedType value) {
        this.windGustSpeed = value;
    }

    /**
     * 获取windGustSpeedOperator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getWindGustSpeedOperator() {
        return windGustSpeedOperator;
    }

    /**
     * 设置windGustSpeedOperator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setWindGustSpeedOperator(RelationalOperatorType value) {
        this.windGustSpeedOperator = value;
    }

    /**
     * 获取extremeClockwiseWindDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getExtremeClockwiseWindDirection() {
        return extremeClockwiseWindDirection;
    }

    /**
     * 设置extremeClockwiseWindDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setExtremeClockwiseWindDirection(AngleType value) {
        this.extremeClockwiseWindDirection = value;
    }

    /**
     * 获取extremeCounterClockwiseWindDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getExtremeCounterClockwiseWindDirection() {
        return extremeCounterClockwiseWindDirection;
    }

    /**
     * 设置extremeCounterClockwiseWindDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setExtremeCounterClockwiseWindDirection(AngleType value) {
        this.extremeCounterClockwiseWindDirection = value;
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

    /**
     * 获取variableWindDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isVariableWindDirection() {
        return variableWindDirection;
    }

    /**
     * 设置variableWindDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setVariableWindDirection(java.lang.Boolean value) {
        this.variableWindDirection = value;
    }

}
