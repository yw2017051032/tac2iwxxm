//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeSurfaceWindPropertyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AerodromeSurfaceWindPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.wmo.int/iwxxm/2.1}AerodromeSurfaceWind"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeSurfaceWindPropertyType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "aerodromeSurfaceWind"
})
public class AerodromeSurfaceWindPropertyType {

    @XmlElement(name = "AerodromeSurfaceWind", required = true)
    protected AerodromeSurfaceWindType aerodromeSurfaceWind;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * ��ȡaerodromeSurfaceWind���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AerodromeSurfaceWindType }
     *     
     */
    public AerodromeSurfaceWindType getAerodromeSurfaceWind() {
        return aerodromeSurfaceWind;
    }

    /**
     * ����aerodromeSurfaceWind���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeSurfaceWindType }
     *     
     */
    public void setAerodromeSurfaceWind(AerodromeSurfaceWindType value) {
        this.aerodromeSurfaceWind = value;
    }

    /**
     * ��ȡowns���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * ����owns���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
    }

}