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
 * <p>AbstractTimeSliceType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AbstractTimeSliceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}validTime"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}dataSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractTimeSliceType", propOrder = {
    "validTime",
    "dataSource"
})
@XmlSeeAlso({
    AbstractAIXMTimeSliceBaseType.class,
    MovingObjectStatusType.class
})
public abstract class AbstractTimeSliceType
    extends AbstractGMLType
{

    @XmlElement(required = true)
    protected TimePrimitivePropertyType validTime;
    protected StringOrRefType dataSource;

    /**
     * ��ȡvalidTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public TimePrimitivePropertyType getValidTime() {
        return validTime;
    }

    /**
     * ����validTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public void setValidTime(TimePrimitivePropertyType value) {
        this.validTime = value;
    }

    /**
     * ��ȡdataSource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StringOrRefType }
     *     
     */
    public StringOrRefType getDataSource() {
        return dataSource;
    }

    /**
     * ����dataSource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StringOrRefType }
     *     
     */
    public void setDataSource(StringOrRefType value) {
        this.dataSource = value;
    }

}
