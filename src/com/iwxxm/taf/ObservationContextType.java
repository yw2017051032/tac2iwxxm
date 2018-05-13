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
import javax.xml.bind.annotation.XmlType;


/**
 *  Some observations depend on other observations to provide context which
 * 				is important, sometimes essential, in understanding the result. These dependencies
 * 				are stronger than mere spatiotemporal coincidences, requiring explicit
 * 				representation. If present, the association class ObservationContext (Figure 2)
 * 				shall link a OM_Observation to another OM_Observation, with the role name
 * 				relatedObservation for the target. 
 * 
 * <p>ObservationContextType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ObservationContextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="role" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="relatedObservation" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationContextType", namespace = "http://www.opengis.net/om/2.0", propOrder = {
    "role",
    "relatedObservation"
})
public class ObservationContextType {

    @XmlElement(required = true)
    protected ReferenceType role;
    @XmlElement(required = true)
    protected ReferenceType relatedObservation;

    /**
     * ��ȡrole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRole() {
        return role;
    }

    /**
     * ����role���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRole(ReferenceType value) {
        this.role = value;
    }

    /**
     * ��ȡrelatedObservation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRelatedObservation() {
        return relatedObservation;
    }

    /**
     * ����relatedObservation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRelatedObservation(ReferenceType value) {
        this.relatedObservation = value;
    }

}
