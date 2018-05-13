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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TAFType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TAFType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.wmo.int/iwxxm/2.1}ReportType">
 *       &lt;sequence>
 *         &lt;element name="issueTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;element name="validTime" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/>
 *         &lt;element name="baseForecast" type="{http://www.opengis.net/om/2.0}OM_ObservationPropertyType" minOccurs="0"/>
 *         &lt;element name="changeForecast" type="{http://www.opengis.net/om/2.0}OM_ObservationPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="previousReportAerodrome" type="{http://schemas.wmo.int/iwxxm/2.1}AirportHeliportPropertyType" minOccurs="0"/>
 *         &lt;element name="previousReportValidPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{http://schemas.wmo.int/iwxxm/2.1}TAFReportStatusType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAFType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "issueTime",
    "validTime",
    "baseForecast",
    "changeForecast",
    "previousReportAerodrome",
    "previousReportValidPeriod",
    "extension"
})
public class TAFType
    extends ReportType
{

    @XmlElement(required = true)
    protected TimeInstantPropertyType issueTime;
    protected TimePeriodPropertyType validTime;
    protected OMObservationPropertyType baseForecast;
    protected List<OMObservationPropertyType> changeForecast;
    protected AirportHeliportPropertyType1 previousReportAerodrome;
    protected TimePeriodPropertyType previousReportValidPeriod;
    protected List<Object> extension;
    @XmlAttribute(name = "status", required = true)
    protected TAFReportStatusType status;

    /**
     * 获取issueTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getIssueTime() {
        return issueTime;
    }

    /**
     * 设置issueTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setIssueTime(TimeInstantPropertyType value) {
        this.issueTime = value;
    }

    /**
     * 获取validTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getValidTime() {
        return validTime;
    }

    /**
     * 设置validTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setValidTime(TimePeriodPropertyType value) {
        this.validTime = value;
    }

    /**
     * 获取baseForecast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OMObservationPropertyType }
     *     
     */
    public OMObservationPropertyType getBaseForecast() {
        return baseForecast;
    }

    /**
     * 设置baseForecast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OMObservationPropertyType }
     *     
     */
    public void setBaseForecast(OMObservationPropertyType value) {
        this.baseForecast = value;
    }

    /**
     * Gets the value of the changeForecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeForecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OMObservationPropertyType }
     * 
     * 
     */
    public List<OMObservationPropertyType> getChangeForecast() {
        if (changeForecast == null) {
            changeForecast = new ArrayList<OMObservationPropertyType>();
        }
        return this.changeForecast;
    }

    /**
     * 获取previousReportAerodrome属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirportHeliportPropertyType1 }
     *     
     */
    public AirportHeliportPropertyType1 getPreviousReportAerodrome() {
        return previousReportAerodrome;
    }

    /**
     * 设置previousReportAerodrome属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirportHeliportPropertyType1 }
     *     
     */
    public void setPreviousReportAerodrome(AirportHeliportPropertyType1 value) {
        this.previousReportAerodrome = value;
    }

    /**
     * 获取previousReportValidPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getPreviousReportValidPeriod() {
        return previousReportValidPeriod;
    }

    /**
     * 设置previousReportValidPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setPreviousReportValidPeriod(TimePeriodPropertyType value) {
        this.previousReportValidPeriod = value;
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
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TAFReportStatusType }
     *     
     */
    public TAFReportStatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TAFReportStatusType }
     *     
     */
    public void setStatus(TAFReportStatusType value) {
        this.status = value;
    }

}
