//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
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
 * <p>MeteorologicalAerodromeForecastRecordType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡprevailingVisibility���Ե�ֵ��
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
     * ����prevailingVisibility���Ե�ֵ��
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
     * ��ȡprevailingVisibilityOperator���Ե�ֵ��
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
     * ����prevailingVisibilityOperator���Ե�ֵ��
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
     * ��ȡsurfaceWind���Ե�ֵ��
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
     * ����surfaceWind���Ե�ֵ��
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
     * ��ȡcloud���Ե�ֵ��
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
     * ����cloud���Ե�ֵ��
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
     * ��ȡchangeIndicator���Ե�ֵ��
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
     * ����changeIndicator���Ե�ֵ��
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
     * ��ȡcloudAndVisibilityOK���Ե�ֵ��
     * 
     */
    public boolean isCloudAndVisibilityOK() {
        return cloudAndVisibilityOK;
    }

    /**
     * ����cloudAndVisibilityOK���Ե�ֵ��
     * 
     */
    public void setCloudAndVisibilityOK(boolean value) {
        this.cloudAndVisibilityOK = value;
    }

}
