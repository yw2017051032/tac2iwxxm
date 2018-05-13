//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Vertical domain of dataset
 * 
 * <p>EX_VerticalExtent_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EX_VerticalExtent_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="minimumValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType"/>
 *         &lt;element name="maximumValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType"/>
 *         &lt;element name="verticalCRS" type="{http://www.isotc211.org/2005/gsr}SC_CRS_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_VerticalExtent_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "minimumValue",
    "maximumValue",
    "verticalCRS"
})
public class EXVerticalExtentType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected RealPropertyType minimumValue;
    @XmlElement(required = true)
    protected RealPropertyType maximumValue;
    @XmlElement(required = true)
    protected SCCRSPropertyType verticalCRS;

    /**
     * ��ȡminimumValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMinimumValue() {
        return minimumValue;
    }

    /**
     * ����minimumValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMinimumValue(RealPropertyType value) {
        this.minimumValue = value;
    }

    /**
     * ��ȡmaximumValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMaximumValue() {
        return maximumValue;
    }

    /**
     * ����maximumValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMaximumValue(RealPropertyType value) {
        this.maximumValue = value;
    }

    /**
     * ��ȡverticalCRS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SCCRSPropertyType }
     *     
     */
    public SCCRSPropertyType getVerticalCRS() {
        return verticalCRS;
    }

    /**
     * ����verticalCRS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SCCRSPropertyType }
     *     
     */
    public void setVerticalCRS(SCCRSPropertyType value) {
        this.verticalCRS = value;
    }

}
