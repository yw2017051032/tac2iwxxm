//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IndirectEntryType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="IndirectEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}DefinitionProxy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndirectEntryType", propOrder = {
    "definitionProxy"
})
public class IndirectEntryType {

    @XmlElement(name = "DefinitionProxy", required = true)
    protected DefinitionProxyType definitionProxy;

    /**
     * ��ȡdefinitionProxy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DefinitionProxyType }
     *     
     */
    public DefinitionProxyType getDefinitionProxy() {
        return definitionProxy;
    }

    /**
     * ����definitionProxy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionProxyType }
     *     
     */
    public void setDefinitionProxy(DefinitionProxyType value) {
        this.definitionProxy = value;
    }

}
