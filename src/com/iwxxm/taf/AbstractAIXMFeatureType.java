//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Adds the FeatureMetadata, which is common to all AIXM features
 * 
 * <p>AbstractAIXMFeatureType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMFeatureBaseType">
 *       &lt;sequence>
 *         &lt;element name="featureMetadata" type="{http://www.aixm.aero/schema/5.1.1}FeatureMetadataPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMFeatureType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "featureMetadata"
})
@XmlSeeAlso({
    UnitType.class,
    RunwayDirectionType.class,
    AirportHeliportType.class,
    AirspaceType.class,
    RunwayType.class
})
public abstract class AbstractAIXMFeatureType
    extends AbstractAIXMFeatureBaseType
{

    protected FeatureMetadataPropertyType featureMetadata;

    /**
     * ��ȡfeatureMetadata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FeatureMetadataPropertyType }
     *     
     */
    public FeatureMetadataPropertyType getFeatureMetadata() {
        return featureMetadata;
    }

    /**
     * ����featureMetadata���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureMetadataPropertyType }
     *     
     */
    public void setFeatureMetadata(FeatureMetadataPropertyType value) {
        this.featureMetadata = value;
    }

}
