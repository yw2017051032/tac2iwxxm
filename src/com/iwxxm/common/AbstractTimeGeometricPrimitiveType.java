//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbstractTimeGeometricPrimitiveType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AbstractTimeGeometricPrimitiveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTimePrimitiveType">
 *       &lt;attribute name="frame" type="{http://www.w3.org/2001/XMLSchema}anyURI" default="#ISO-8601" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeGeometricPrimitiveType")
@XmlSeeAlso({
    TimeInstantType.class,
    TimePeriodType.class
})
public abstract class AbstractTimeGeometricPrimitiveType
    extends AbstractTimePrimitiveType
{

    @XmlAttribute(name = "frame")
    @XmlSchemaType(name = "anyURI")
    protected String frame;

    /**
     * ��ȡframe���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        if (frame == null) {
            return "#ISO-8601";
        } else {
            return frame;
        }
    }

    /**
     * ����frame���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

}