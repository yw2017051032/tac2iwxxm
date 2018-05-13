//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MeteorologicalAerodromeTrendForecastRecordType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MeteorologicalAerodromeTrendForecastRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element name="prevailingVisibility" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="prevailingVisibilityOperator" type="{http://schemas.wmo.int/iwxxm/2.1}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="surfaceWind" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeSurfaceWindTrendForecastPropertyType" minOccurs="0"/>
 *         &lt;element name="forecastWeather" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeForecastWeatherType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="cloud" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeCloudForecastPropertyType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="changeIndicator" use="required" type="{http://schemas.wmo.int/iwxxm/2.1}ForecastChangeIndicatorType" />
 *       &lt;attribute name="cloudAndVisibilityOK" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologicalAerodromeTrendForecastRecordType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "prevailingVisibility",
    "prevailingVisibilityOperator",
    "surfaceWind",
    "forecastWeather",
    "cloud",
    "extension"
})
public class MeteorologicalAerodromeTrendForecastRecordType
    extends AbstractGMLType
{

    protected LengthType prevailingVisibility;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType prevailingVisibilityOperator;
    protected AerodromeSurfaceWindTrendForecastPropertyType surfaceWind;
    @XmlElement(nillable = true)
	public List<AerodromeForecastWeatherType> forecastWeather;
    @XmlElementRef(name = "cloud", namespace = "http://schemas.wmo.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AerodromeCloudForecastPropertyType> cloud;
    protected List<Object> extension;
    @XmlAttribute(name = "changeIndicator", required = true)
    protected ForecastChangeIndicatorType changeIndicator;
    @XmlAttribute(name = "cloudAndVisibilityOK")
    protected java.lang.Boolean cloudAndVisibilityOK;

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
     *     {@link AerodromeSurfaceWindTrendForecastPropertyType }
     *     
     */
    public AerodromeSurfaceWindTrendForecastPropertyType getSurfaceWind() {
        return surfaceWind;
    }

    /**
     * ����surfaceWind���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeSurfaceWindTrendForecastPropertyType }
     *     
     */
    public void setSurfaceWind(AerodromeSurfaceWindTrendForecastPropertyType value) {
        this.surfaceWind = value;
    }

    /**
     * Gets the value of the forecastWeather property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastWeather property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastWeather().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeForecastWeatherType }
     * 
     * 
     */
    public List<AerodromeForecastWeatherType> getForecastWeather() {
        if (forecastWeather == null) {
            forecastWeather = new ArrayList<AerodromeForecastWeatherType>();
        }
        return this.forecastWeather;
    }

    /**
     * ��ȡcloud���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AerodromeCloudForecastPropertyType }{@code >}
     *     
     */
    public JAXBElement<AerodromeCloudForecastPropertyType> getCloud() {
        return cloud;
    }

    /**
     * ����cloud���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AerodromeCloudForecastPropertyType }{@code >}
     *     
     */
    public void setCloud(JAXBElement<AerodromeCloudForecastPropertyType> value) {
        this.cloud = value;
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
     *     {@link ForecastChangeIndicatorType }
     *     
     */
    public ForecastChangeIndicatorType getChangeIndicator() {
        return changeIndicator;
    }

    /**
     * ����changeIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastChangeIndicatorType }
     *     
     */
    public void setChangeIndicator(ForecastChangeIndicatorType value) {
        this.changeIndicator = value;
    }

    /**
     * ��ȡcloudAndVisibilityOK���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isCloudAndVisibilityOK() {
        return cloudAndVisibilityOK;
    }

    /**
     * ����cloudAndVisibilityOK���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setCloudAndVisibilityOK(java.lang.Boolean value) {
        this.cloudAndVisibilityOK = value;
    }

}
