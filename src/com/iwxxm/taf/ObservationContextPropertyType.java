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
 * ObservationContext is a dataType, without identity, so may only be used
 * 				inline
 * 
 * <p>ObservationContextPropertyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ObservationContextPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/om/2.0}ObservationContext"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationContextPropertyType", namespace = "http://www.opengis.net/om/2.0", propOrder = {
    "observationContext"
})
public class ObservationContextPropertyType {

    @XmlElement(name = "ObservationContext", required = true)
    protected ObservationContextType observationContext;

    /**
     * ��ȡobservationContext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ObservationContextType }
     *     
     */
    public ObservationContextType getObservationContext() {
        return observationContext;
    }

    /**
     * ����observationContext���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationContextType }
     *     
     */
    public void setObservationContext(ObservationContextType value) {
        this.observationContext = value;
    }

}
