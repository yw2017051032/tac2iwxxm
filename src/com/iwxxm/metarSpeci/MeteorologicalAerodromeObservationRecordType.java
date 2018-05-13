//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MeteorologicalAerodromeObservationRecordType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MeteorologicalAerodromeObservationRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element name="airTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="dewpointTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="qnh" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="surfaceWind" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeSurfaceWindPropertyType"/>
 *         &lt;element name="visibility" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeHorizontalVisibilityPropertyType" minOccurs="0"/>
 *         &lt;element name="rvr" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeRunwayVisualRangePropertyType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="presentWeather" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromePresentWeatherType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="cloud" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://schemas.wmo.int/iwxxm/2.1}AerodromeObservedCloudsPropertyType">
 *                 &lt;attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recentWeather" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeRecentWeatherType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="windShear" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeWindShearPropertyType" minOccurs="0"/>
 *         &lt;element name="seaState" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeSeaStatePropertyType" minOccurs="0"/>
 *         &lt;element name="runwayState" type="{http://schemas.wmo.int/iwxxm/2.1}AerodromeRunwayStatePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="cloudAndVisibilityOK" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologicalAerodromeObservationRecordType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "airTemperature",
    "dewpointTemperature",
    "qnh",
    "surfaceWind",
    "visibility",
    "rvr",
    "presentWeather",
    "cloud",
    "recentWeather",
    "windShear",
    "seaState",
    "runwayState",
    "extension"
})
public class MeteorologicalAerodromeObservationRecordType
    extends AbstractGMLType
{

    @XmlElement(required = true)
    protected MeasureType airTemperature;
    @XmlElement(required = true)
    protected MeasureType dewpointTemperature;
    @XmlElement(required = true)
    protected MeasureType qnh;
    @XmlElement(required = true)
    protected AerodromeSurfaceWindPropertyType surfaceWind;
    protected AerodromeHorizontalVisibilityPropertyType visibility;
    protected List<AerodromeRunwayVisualRangePropertyType> rvr;
    @XmlElement(nillable = true)
    protected List<AerodromePresentWeatherType> presentWeather;
    @XmlElementRef(name = "cloud", namespace = "http://schemas.wmo.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MeteorologicalAerodromeObservationRecordType.Cloud> cloud;
    protected List<AerodromeRecentWeatherType> recentWeather;
    protected AerodromeWindShearPropertyType windShear;
    protected AerodromeSeaStatePropertyType seaState;
    protected List<AerodromeRunwayStatePropertyType> runwayState;
    protected List<Object> extension;
    @XmlAttribute(name = "cloudAndVisibilityOK", required = true)
    protected boolean cloudAndVisibilityOK;

    /**
     * 获取airTemperature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAirTemperature() {
        return airTemperature;
    }

    /**
     * 设置airTemperature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAirTemperature(MeasureType value) {
        this.airTemperature = value;
    }

    /**
     * 获取dewpointTemperature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDewpointTemperature() {
        return dewpointTemperature;
    }

    /**
     * 设置dewpointTemperature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDewpointTemperature(MeasureType value) {
        this.dewpointTemperature = value;
    }

    /**
     * 获取qnh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getQnh() {
        return qnh;
    }

    /**
     * 设置qnh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setQnh(MeasureType value) {
        this.qnh = value;
    }

    /**
     * 获取surfaceWind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AerodromeSurfaceWindPropertyType }
     *     
     */
    public AerodromeSurfaceWindPropertyType getSurfaceWind() {
        return surfaceWind;
    }

    /**
     * 设置surfaceWind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeSurfaceWindPropertyType }
     *     
     */
    public void setSurfaceWind(AerodromeSurfaceWindPropertyType value) {
        this.surfaceWind = value;
    }

    /**
     * 获取visibility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AerodromeHorizontalVisibilityPropertyType }
     *     
     */
    public AerodromeHorizontalVisibilityPropertyType getVisibility() {
        return visibility;
    }

    /**
     * 设置visibility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeHorizontalVisibilityPropertyType }
     *     
     */
    public void setVisibility(AerodromeHorizontalVisibilityPropertyType value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the rvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeRunwayVisualRangePropertyType }
     * 
     * 
     */
    public List<AerodromeRunwayVisualRangePropertyType> getRvr() {
        if (rvr == null) {
            rvr = new ArrayList<AerodromeRunwayVisualRangePropertyType>();
        }
        return this.rvr;
    }

    /**
     * Gets the value of the presentWeather property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentWeather property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentWeather().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromePresentWeatherType }
     * 
     * 
     */
    public List<AerodromePresentWeatherType> getPresentWeather() {
        if (presentWeather == null) {
            presentWeather = new ArrayList<AerodromePresentWeatherType>();
        }
        return this.presentWeather;
    }

    /**
     * 获取cloud属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationRecordType.Cloud }{@code >}
     *     
     */
    public JAXBElement<MeteorologicalAerodromeObservationRecordType.Cloud> getCloud() {
        return cloud;
    }

    /**
     * 设置cloud属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationRecordType.Cloud }{@code >}
     *     
     */
    public void setCloud(JAXBElement<MeteorologicalAerodromeObservationRecordType.Cloud> value) {
        this.cloud = value;
    }

    /**
     * Gets the value of the recentWeather property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recentWeather property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecentWeather().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeRecentWeatherType }
     * 
     * 
     */
    public List<AerodromeRecentWeatherType> getRecentWeather() {
        if (recentWeather == null) {
            recentWeather = new ArrayList<AerodromeRecentWeatherType>();
        }
        return this.recentWeather;
    }

    /**
     * 获取windShear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AerodromeWindShearPropertyType }
     *     
     */
    public AerodromeWindShearPropertyType getWindShear() {
        return windShear;
    }

    /**
     * 设置windShear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeWindShearPropertyType }
     *     
     */
    public void setWindShear(AerodromeWindShearPropertyType value) {
        this.windShear = value;
    }

    /**
     * 获取seaState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AerodromeSeaStatePropertyType }
     *     
     */
    public AerodromeSeaStatePropertyType getSeaState() {
        return seaState;
    }

    /**
     * 设置seaState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeSeaStatePropertyType }
     *     
     */
    public void setSeaState(AerodromeSeaStatePropertyType value) {
        this.seaState = value;
    }

    /**
     * Gets the value of the runwayState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the runwayState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRunwayState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeRunwayStatePropertyType }
     * 
     * 
     */
    public List<AerodromeRunwayStatePropertyType> getRunwayState() {
        if (runwayState == null) {
            runwayState = new ArrayList<AerodromeRunwayStatePropertyType>();
        }
        return this.runwayState;
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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://schemas.wmo.int/iwxxm/2.1}AerodromeObservedCloudsPropertyType">
     *       &lt;attribute name="nilReason" type="{http://www.opengis.net/gml/3.2}NilReasonType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Cloud
        extends AerodromeObservedCloudsPropertyType
    {

        @XmlAttribute(name = "nilReason")
        protected List<String> nilReason;

        /**
         * Gets the value of the nilReason property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nilReason property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNilReason().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNilReason() {
            if (nilReason == null) {
                nilReason = new ArrayList<String>();
            }
            return this.nilReason;
        }

    }

}
