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
 * <p>CoordinateSystemAxisType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CoordinateSystemAxisType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}axisAbbrev"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}axisDirection"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}minimumValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}maximumValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}rangeMeaning" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uom" use="required" type="{http://www.opengis.net/gml/3.2}UomIdentifier" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateSystemAxisType", propOrder = {
    "axisAbbrev",
    "axisDirection",
    "minimumValue",
    "maximumValue",
    "rangeMeaning"
})
public class CoordinateSystemAxisType
    extends IdentifiedObjectType
{

    @XmlElement(required = true)
    protected CodeType axisAbbrev;
    @XmlElement(required = true)
    protected CodeWithAuthorityType axisDirection;
    protected Double minimumValue;
    protected Double maximumValue;
    protected CodeWithAuthorityType rangeMeaning;
    @XmlAttribute(name = "uom", required = true)
    protected String uom;

    /**
     * ��ȡaxisAbbrev���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAxisAbbrev() {
        return axisAbbrev;
    }

    /**
     * ����axisAbbrev���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAxisAbbrev(CodeType value) {
        this.axisAbbrev = value;
    }

    /**
     * ��ȡaxisDirection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getAxisDirection() {
        return axisDirection;
    }

    /**
     * ����axisDirection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setAxisDirection(CodeWithAuthorityType value) {
        this.axisDirection = value;
    }

    /**
     * ��ȡminimumValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumValue() {
        return minimumValue;
    }

    /**
     * ����minimumValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumValue(Double value) {
        this.minimumValue = value;
    }

    /**
     * ��ȡmaximumValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumValue() {
        return maximumValue;
    }

    /**
     * ����maximumValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumValue(Double value) {
        this.maximumValue = value;
    }

    /**
     * ��ȡrangeMeaning���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getRangeMeaning() {
        return rangeMeaning;
    }

    /**
     * ����rangeMeaning���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setRangeMeaning(CodeWithAuthorityType value) {
        this.rangeMeaning = value;
    }

    /**
     * ��ȡuom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUom() {
        return uom;
    }

    /**
     * ����uom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUom(String value) {
        this.uom = value;
    }

}
