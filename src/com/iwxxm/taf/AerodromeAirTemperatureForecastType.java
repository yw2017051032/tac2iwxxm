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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeAirTemperatureForecastType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AerodromeAirTemperatureForecastType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumAirTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="maximumAirTemperatureTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;element name="minimumAirTemperature" type="{http://www.opengis.net/gml/3.2}MeasureType"/>
 *         &lt;element name="minimumAirTemperatureTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
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
@XmlType(name = "AerodromeAirTemperatureForecastType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "maximumAirTemperature",
    "maximumAirTemperatureTime",
    "minimumAirTemperature",
    "minimumAirTemperatureTime",
    "extension"
})
public class AerodromeAirTemperatureForecastType {

    @XmlElement(required = true)
    protected MeasureType maximumAirTemperature;
    @XmlElement(required = true)
    protected TimeInstantPropertyType maximumAirTemperatureTime;
    @XmlElement(required = true)
    protected MeasureType minimumAirTemperature;
    @XmlElement(required = true)
    protected TimeInstantPropertyType minimumAirTemperatureTime;
    protected List<Object> extension;

    /**
     * ��ȡmaximumAirTemperature���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumAirTemperature() {
        return maximumAirTemperature;
    }

    /**
     * ����maximumAirTemperature���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximumAirTemperature(MeasureType value) {
        this.maximumAirTemperature = value;
    }

    /**
     * ��ȡmaximumAirTemperatureTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getMaximumAirTemperatureTime() {
        return maximumAirTemperatureTime;
    }

    /**
     * ����maximumAirTemperatureTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setMaximumAirTemperatureTime(TimeInstantPropertyType value) {
        this.maximumAirTemperatureTime = value;
    }

    /**
     * ��ȡminimumAirTemperature���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinimumAirTemperature() {
        return minimumAirTemperature;
    }

    /**
     * ����minimumAirTemperature���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinimumAirTemperature(MeasureType value) {
        this.minimumAirTemperature = value;
    }

    /**
     * ��ȡminimumAirTemperatureTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getMinimumAirTemperatureTime() {
        return minimumAirTemperatureTime;
    }

    /**
     * ����minimumAirTemperatureTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setMinimumAirTemperatureTime(TimeInstantPropertyType value) {
        this.minimumAirTemperatureTime = value;
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
