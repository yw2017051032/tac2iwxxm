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
 * <p>PT_FreeText_PropertyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PT_FreeText_PropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}PT_FreeText"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_FreeText_PropertyType", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "ptFreeText"
})
public class PTFreeTextPropertyType
    extends CharacterStringPropertyType
{

    @XmlElement(name = "PT_FreeText")
    protected PTFreeTextType ptFreeText;

    /**
     * ��ȡptFreeText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PTFreeTextType }
     *     
     */
    public PTFreeTextType getPTFreeText() {
        return ptFreeText;
    }

    /**
     * ����ptFreeText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PTFreeTextType }
     *     
     */
    public void setPTFreeText(PTFreeTextType value) {
        this.ptFreeText = value;
    }

}
