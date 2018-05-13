//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Adds in the AIXM specific properties, such as 'interpretation'.
 * 
 * <p>AbstractAIXMTimeSliceType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMTimeSliceBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}interpretation"/>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}sequenceNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}correctionNumber" minOccurs="0"/>
 *         &lt;element name="timeSliceMetadata" type="{http://www.aixm.aero/schema/5.1.1}FeatureTimeSliceMetadataPropertyType" minOccurs="0"/>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}featureLifetime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMTimeSliceType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "interpretation",
    "sequenceNumber",
    "correctionNumber",
    "timeSliceMetadata",
    "featureLifetime"
})
@XmlSeeAlso({
    AirspaceTimeSliceType.class,
    RunwayTimeSliceType.class,
    UnitTimeSliceType.class,
    AirportHeliportTimeSliceType.class,
    RunwayDirectionTimeSliceType.class
})
public abstract class AbstractAIXMTimeSliceType
    extends AbstractAIXMTimeSliceBaseType
{

    @XmlElement(required = true)
    protected String interpretation;
    protected Long sequenceNumber;
    protected Long correctionNumber;
    protected FeatureTimeSliceMetadataPropertyType timeSliceMetadata;
    protected TimePrimitivePropertyType featureLifetime;

    /**
     * ��ȡinterpretation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * ����interpretation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    /**
     * ��ȡsequenceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * ����sequenceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNumber(Long value) {
        this.sequenceNumber = value;
    }

    /**
     * ��ȡcorrectionNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCorrectionNumber() {
        return correctionNumber;
    }

    /**
     * ����correctionNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCorrectionNumber(Long value) {
        this.correctionNumber = value;
    }

    /**
     * ��ȡtimeSliceMetadata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FeatureTimeSliceMetadataPropertyType }
     *     
     */
    public FeatureTimeSliceMetadataPropertyType getTimeSliceMetadata() {
        return timeSliceMetadata;
    }

    /**
     * ����timeSliceMetadata���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureTimeSliceMetadataPropertyType }
     *     
     */
    public void setTimeSliceMetadata(FeatureTimeSliceMetadataPropertyType value) {
        this.timeSliceMetadata = value;
    }

    /**
     * ��ȡfeatureLifetime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public TimePrimitivePropertyType getFeatureLifetime() {
        return featureLifetime;
    }

    /**
     * ����featureLifetime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public void setFeatureLifetime(TimePrimitivePropertyType value) {
        this.featureLifetime = value;
    }

}
