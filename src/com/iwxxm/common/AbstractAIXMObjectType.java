//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base type for AIXM complex types that are NOT features. For example, City, ContactInformation, AirspaceVolume, etc. It derives from AbstractGMLType so that AIXM objects are recognised as GML objects, thus ensuring that GML-aware applications recognise them properly. Retains only the mandatory gml:id attribute.
 * 
 * <p>AbstractAIXMObjectType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;sequence>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMObjectType", namespace = "http://www.aixm.aero/schema/5.1.1")
@XmlSeeAlso({
    AbstractExtensionType.class,
    AirspaceGeometryComponentType.class,
    AirspaceVolumeType.class
})
public abstract class AbstractAIXMObjectType
    extends AbstractGMLType
{


}