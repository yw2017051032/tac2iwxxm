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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Generic observation, whose result is anyType The following properties
 * 				are inherited from AbstractFeatureType: 
 * 				
 * 			
 * 
 * <p>OM_ObservationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OM_ObservationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/om/2.0}OM_CommonProperties"/>
 *         &lt;element ref="{http://www.opengis.net/om/2.0}result"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OM_ObservationType", namespace = "http://www.opengis.net/om/2.0", propOrder = {
    "type",
    "metadata",
    "relatedObservation",
    "phenomenonTime",
    "resultTime",
    "validTime",
    "procedure",
    "parameter",
    "observedProperty",
    "featureOfInterest",
    "resultQuality",
    "result"
})
public class OMObservationType
    extends AbstractFeatureType
{

    protected ReferenceType type;
    protected MDMetadataPropertyType metadata;
    protected List<ObservationContextPropertyType> relatedObservation;
    @XmlElement(required = true)
    protected TimeObjectPropertyType phenomenonTime;
    @XmlElement(required = true)
    protected TimeInstantPropertyType resultTime;
    protected TimePeriodPropertyType validTime;
    @XmlElement(required = true, nillable = true)
    protected OMProcessPropertyType procedure;
    protected List<NamedValuePropertyType> parameter;
    @XmlElement(required = true, nillable = true)
    protected ReferenceType observedProperty;
    @XmlElement(required = true, nillable = true)
    protected FeaturePropertyType featureOfInterest;
    protected List<DQElementPropertyType> resultQuality;
    @XmlElement(required = true)
    protected Object result;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setType(ReferenceType value) {
        this.type = value;
    }

    /**
     * 获取metadata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MDMetadataPropertyType }
     *     
     */
    public MDMetadataPropertyType getMetadata() {
        return metadata;
    }

    /**
     * 设置metadata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MDMetadataPropertyType }
     *     
     */
    public void setMetadata(MDMetadataPropertyType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the relatedObservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedObservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedObservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObservationContextPropertyType }
     * 
     * 
     */
    public List<ObservationContextPropertyType> getRelatedObservation() {
        if (relatedObservation == null) {
            relatedObservation = new ArrayList<ObservationContextPropertyType>();
        }
        return this.relatedObservation;
    }

    /**
     * 获取phenomenonTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeObjectPropertyType }
     *     
     */
    public TimeObjectPropertyType getPhenomenonTime() {
        return phenomenonTime;
    }

    /**
     * 设置phenomenonTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeObjectPropertyType }
     *     
     */
    public void setPhenomenonTime(TimeObjectPropertyType value) {
        this.phenomenonTime = value;
    }

    /**
     * 获取resultTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getResultTime() {
        return resultTime;
    }

    /**
     * 设置resultTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setResultTime(TimeInstantPropertyType value) {
        this.resultTime = value;
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
     * 获取procedure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OMProcessPropertyType }
     *     
     */
    public OMProcessPropertyType getProcedure() {
        return procedure;
    }

    /**
     * 设置procedure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OMProcessPropertyType }
     *     
     */
    public void setProcedure(OMProcessPropertyType value) {
        this.procedure = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedValuePropertyType }
     * 
     * 
     */
    public List<NamedValuePropertyType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<NamedValuePropertyType>();
        }
        return this.parameter;
    }

    /**
     * 获取observedProperty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getObservedProperty() {
        return observedProperty;
    }

    /**
     * 设置observedProperty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setObservedProperty(ReferenceType value) {
        this.observedProperty = value;
    }

    /**
     * 获取featureOfInterest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FeaturePropertyType }
     *     
     */
    public FeaturePropertyType getFeatureOfInterest() {
        return featureOfInterest;
    }

    /**
     * 设置featureOfInterest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturePropertyType }
     *     
     */
    public void setFeatureOfInterest(FeaturePropertyType value) {
        this.featureOfInterest = value;
    }

    /**
     * Gets the value of the resultQuality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultQuality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultQuality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQElementPropertyType }
     * 
     * 
     */
    public List<DQElementPropertyType> getResultQuality() {
        if (resultQuality == null) {
            resultQuality = new ArrayList<DQElementPropertyType>();
        }
        return this.resultQuality;
    }

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResult(Object value) {
        this.result = value;
    }

}
