//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MeteorologicalAerodromeForecastRecordType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MeteorologicalAerodromeForecastRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element name="prevailingVisibility" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="prevailingVisibilityOperator" type="{http://schemas.wmo.int/iwxxm/2.1}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="surfaceWind" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeSurfaceWindForecastPropertyType" minOccurs="0"/>
 *         &lt;element name="weather" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeForecastWeatherType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="cloud" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeCloudForecastPropertyType" minOccurs="0"/>
 *         &lt;element name="temperature" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeAirTemperatureForecastPropertyType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="changeIndicator" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeForecastChangeIndicatorType" />
 *       &lt;attribute name="cloudAndVisibilityOK" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologicalAerodromeForecastRecordType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "prevailingVisibility",
    "prevailingVisibilityOperator",
    "surfaceWind",
    "weather",
    "cloud",
    "temperature",
    "extension"
})
public class MeteorologicalAerodromeForecastRecordType
    extends AbstractGMLType
{

    protected LengthType prevailingVisibility;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType prevailingVisibilityOperator;
    protected AerodromeSurfaceWindForecastPropertyType surfaceWind;
    protected List<AerodromeForecastWeatherType> weather;
    protected AerodromeCloudForecastPropertyType cloud;
    protected List<AerodromeAirTemperatureForecastPropertyType> temperature;
    protected List<Object> extension;
    @XmlAttribute(name = "changeIndicator")
    protected AerodromeForecastChangeIndicatorType changeIndicator;
    @XmlAttribute(name = "cloudAndVisibilityOK", required = true)
    protected boolean cloudAndVisibilityOK;

    /**
     * 获取prevailingVisibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getPrevailingVisibility() {
        return prevailingVisibility;
    }

    /**
     * 设置prevailingVisibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setPrevailingVisibility(LengthType value) {
        this.prevailingVisibility = value;
    }

    /**
     * 获取prevailingVisibilityOperator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getPrevailingVisibilityOperator() {
        return prevailingVisibilityOperator;
    }

    /**
     * 设置prevailingVisibilityOperator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setPrevailingVisibilityOperator(RelationalOperatorType value) {
        this.prevailingVisibilityOperator = value;
    }

    /**
     * 获取surfaceWind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AerodromeSurfaceWindForecastPropertyType }
     *     
     */
    public AerodromeSurfaceWindForecastPropertyType getSurfaceWind() {
        return surfaceWind;
    }

    /**
     * 设置surfaceWind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeSurfaceWindForecastPropertyType }
     *     
     */
    public void setSurfaceWind(AerodromeSurfaceWindForecastPropertyType value) {
        this.surfaceWind = value;
    }

    /**
     * Gets the value of the weather property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weather property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeather().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeForecastWeatherType }
     * 
     * 
     */
    public List<AerodromeForecastWeatherType> getWeather() {
        if (weather == null) {
            weather = new ArrayList<AerodromeForecastWeatherType>();
        }
        return this.weather;
    }

    /**
     * 获取cloud属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AerodromeCloudForecastPropertyType }
     *     
     */
    public AerodromeCloudForecastPropertyType getCloud() {
        return cloud;
    }

    /**
     * 设置cloud属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeCloudForecastPropertyType }
     *     
     */
    public void setCloud(AerodromeCloudForecastPropertyType value) {
        this.cloud = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeAirTemperatureForecastPropertyType }
     * 
     * 
     */
    public List<AerodromeAirTemperatureForecastPropertyType> getTemperature() {
        if (temperature == null) {
            temperature = new ArrayList<AerodromeAirTemperatureForecastPropertyType>();
        }
        return this.temperature;
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
     * 获取changeIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AerodromeForecastChangeIndicatorType }
     *     
     */
    public AerodromeForecastChangeIndicatorType getChangeIndicator() {
        return changeIndicator;
    }

    /**
     * 设置changeIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeForecastChangeIndicatorType }
     *     
     */
    public void setChangeIndicator(AerodromeForecastChangeIndicatorType value) {
        this.changeIndicator = value;
    }

    /**
     * 获取cloudAndVisibilityOK属性的值。
     * 
     */
    public boolean isCloudAndVisibilityOK() {
        return cloudAndVisibilityOK;
    }

    /**
     * 设置cloudAndVisibilityOK属性的值。
     * 
     */
    public void setCloudAndVisibilityOK(boolean value) {
        this.cloudAndVisibilityOK = value;
    }

}
