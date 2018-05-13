//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
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
 * <p>AbstractAIXMTimeSliceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取interpretation属性的值。
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
     * 设置interpretation属性的值。
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
     * 获取sequenceNumber属性的值。
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
     * 设置sequenceNumber属性的值。
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
     * 获取correctionNumber属性的值。
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
     * 设置correctionNumber属性的值。
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
     * 获取timeSliceMetadata属性的值。
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
     * 设置timeSliceMetadata属性的值。
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
     * 获取featureLifetime属性的值。
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
     * 设置featureLifetime属性的值。
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
