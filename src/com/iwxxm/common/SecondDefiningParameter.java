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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}SecondDefiningParameter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "secondDefiningParameter"
})
@XmlRootElement(name = "secondDefiningParameter")
public class SecondDefiningParameter {

    @XmlElement(name = "SecondDefiningParameter", required = true)
    protected SecondDefiningParameter1 secondDefiningParameter;

    /**
     * ��ȡsecondDefiningParameter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SecondDefiningParameter1 }
     *     
     */
    public SecondDefiningParameter1 getSecondDefiningParameter() {
        return secondDefiningParameter;
    }

    /**
     * ����secondDefiningParameter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SecondDefiningParameter1 }
     *     
     */
    public void setSecondDefiningParameter(SecondDefiningParameter1 value) {
        this.secondDefiningParameter = value;
    }

}
