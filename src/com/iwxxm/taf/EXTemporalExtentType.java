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
 * Time period covered by the content of the dataset
 * 
 * <p>EX_TemporalExtent_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EX_TemporalExtent_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="extent" type="{http://www.isotc211.org/2005/gts}TM_Primitive_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_TemporalExtent_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "extent"
})
@XmlSeeAlso({
    EXSpatialTemporalExtentType.class
})
public class EXTemporalExtentType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected TMPrimitivePropertyType extent;

    /**
     * ��ȡextent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TMPrimitivePropertyType }
     *     
     */
    public TMPrimitivePropertyType getExtent() {
        return extent;
    }

    /**
     * ����extent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TMPrimitivePropertyType }
     *     
     */
    public void setExtent(TMPrimitivePropertyType value) {
        this.extent = value;
    }

}
