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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TAFType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡissueTime���Ե�ֵ��
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
     * ����issueTime���Ե�ֵ��
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
     * ��ȡvalidTime���Ե�ֵ��
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
     * ����validTime���Ե�ֵ��
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
     * ��ȡbaseForecast���Ե�ֵ��
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
     * ����baseForecast���Ե�ֵ��
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
     * ��ȡpreviousReportAerodrome���Ե�ֵ��
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
     * ����previousReportAerodrome���Ե�ֵ��
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
     * ��ȡpreviousReportValidPeriod���Ե�ֵ��
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
     * ����previousReportValidPeriod���Ե�ֵ��
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
     * ��ȡstatus���Ե�ֵ��
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
     * ����status���Ե�ֵ��
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
