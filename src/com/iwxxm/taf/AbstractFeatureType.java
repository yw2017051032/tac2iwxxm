//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The basic feature model is given by the gml:AbstractFeatureType.
 * The content model for gml:AbstractFeatureType adds two specific properties suitable for geographic features to the content model defined in gml:AbstractGMLType. 
 * The value of the gml:boundedBy property describes an envelope that encloses the entire feature instance, and is primarily useful for supporting rapid searching for features that occur in a particular location. 
 * The value of the gml:location property describes the extent, position or relative location of the feature.
 * 
 * <p>AbstractFeatureType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}boundedBy" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}location" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureType", propOrder = {
    "boundedBy",
    "location"
})
@XmlSeeAlso({
    ReportType.class,
    ObservationType.class,
    DynamicFeatureType.class,
    AbstractCoverageType.class,
    AbstractFeatureCollectionType.class,
    BoundedFeatureType.class,
    OMObservationType.class
})
public abstract class AbstractFeatureType
    extends AbstractGMLType
{

    //@XmlElement(nillable = true)
	@XmlElement
    protected BoundingShapeType boundedBy;
    @XmlElementRef(name = "location", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends LocationPropertyType> location;

    /**
     * ��ȡboundedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BoundingShapeType }
     *     
     */
    public BoundingShapeType getBoundedBy() {
        return boundedBy;
    }

    /**
     * ����boundedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingShapeType }
     *     
     */
    public void setBoundedBy(BoundingShapeType value) {
        this.boundedBy = value;
    }

    /**
     * ��ȡlocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     
     */
    public JAXBElement<? extends LocationPropertyType> getLocation() {
        return location;
    }

    /**
     * ����location���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}
     *     
     */
    public void setLocation(JAXBElement<? extends LocationPropertyType> value) {
        this.location = value;
    }

}
