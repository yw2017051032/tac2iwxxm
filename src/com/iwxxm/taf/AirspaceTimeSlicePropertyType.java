//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AirspaceTimeSlicePropertyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AirspaceTimeSlicePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AirspaceTimeSlice"/>
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
@XmlType(name = "AirspaceTimeSlicePropertyType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "airspaceTimeSlice"
})
public class AirspaceTimeSlicePropertyType {

    @XmlElement(name = "AirspaceTimeSlice", required = true)
    protected AirspaceTimeSliceType airspaceTimeSlice;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * ��ȡairspaceTimeSlice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AirspaceTimeSliceType }
     *     
     */
    public AirspaceTimeSliceType getAirspaceTimeSlice() {
        return airspaceTimeSlice;
    }

    /**
     * ����airspaceTimeSlice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceTimeSliceType }
     *     
     */
    public void setAirspaceTimeSlice(AirspaceTimeSliceType value) {
        this.airspaceTimeSlice = value;
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
