//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MeteorologicalAerodromeObservationReportType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MeteorologicalAerodromeObservationReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.wmo.int/iwxxm/2.1}ReportType">
 *       &lt;sequence>
 *         &lt;element name="observation" type="{http://www.opengis.net/om/2.0}OM_ObservationPropertyType"/>
 *         &lt;element name="trendForecast" type="{http://www.opengis.net/om/2.0}OM_ObservationPropertyType" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{http://schemas.wmo.int/iwxxm/2.1}MeteorologicalAerodromeReportStatusType" />
 *       &lt;attribute name="automatedStation" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeteorologicalAerodromeObservationReportType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "observation",
    "trendForecast"
})
@XmlSeeAlso({
    METARType.class,
    SPECIType.class
})

public  abstract class  MeteorologicalAerodromeObservationReportType
    extends ReportType
{

    @XmlElement(required = true)
    protected OMObservationPropertyType observation;
    @XmlElement(nillable = true)
    protected List<OMObservationPropertyType> trendForecast;
    @XmlAttribute(name = "status", required = true)
    protected MeteorologicalAerodromeReportStatusType status;
    @XmlAttribute(name = "automatedStation")
    protected java.lang.Boolean automatedStation;

    /**
     * ��ȡobservation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link OMObservationPropertyType }
     *     
     */
    public OMObservationPropertyType getObservation() {
        return observation;
    }

    /**
     * ����observation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link OMObservationPropertyType }
     *     
     */
    public void setObservation(OMObservationPropertyType value) {
        this.observation = value;
    }

    /**
     * Gets the value of the trendForecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trendForecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrendForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OMObservationPropertyType }
     * 
     * 
     */
    public List<OMObservationPropertyType> getTrendForecast() {
        if (trendForecast == null) {
            trendForecast = new ArrayList<OMObservationPropertyType>();
        }
        return this.trendForecast;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MeteorologicalAerodromeReportStatusType }
     *     
     */
    public MeteorologicalAerodromeReportStatusType getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MeteorologicalAerodromeReportStatusType }
     *     
     */
    public void setStatus(MeteorologicalAerodromeReportStatusType value) {
        this.status = value;
    }

    /**
     * ��ȡautomatedStation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isAutomatedStation() {
        return automatedStation;
    }

    /**
     * ����automatedStation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setAutomatedStation(java.lang.Boolean value) {
        this.automatedStation = value;
    }

}
