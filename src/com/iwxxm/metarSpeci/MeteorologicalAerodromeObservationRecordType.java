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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MeteorologicalAerodromeObservationRecordType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡairTemperature���Ե�ֵ��
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
     * ����airTemperature���Ե�ֵ��
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
     * ��ȡdewpointTemperature���Ե�ֵ��
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
     * ����dewpointTemperature���Ե�ֵ��
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
     * ��ȡqnh���Ե�ֵ��
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
     * ����qnh���Ե�ֵ��
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
     * ��ȡsurfaceWind���Ե�ֵ��
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
     * ����surfaceWind���Ե�ֵ��
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
     * ��ȡvisibility���Ե�ֵ��
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
     * ����visibility���Ե�ֵ��
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
     * ��ȡcloud���Ե�ֵ��
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
     * ����cloud���Ե�ֵ��
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
     * ��ȡwindShear���Ե�ֵ��
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
     * ����windShear���Ե�ֵ��
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
     * ��ȡseaState���Ե�ֵ��
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
     * ����seaState���Ե�ֵ��
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


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
