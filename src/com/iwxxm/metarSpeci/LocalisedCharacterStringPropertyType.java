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
 * <p>LocalisedCharacterString_PropertyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="LocalisedCharacterString_PropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}LocalisedCharacterString"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalisedCharacterString_PropertyType", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "localisedCharacterString"
})
public class LocalisedCharacterStringPropertyType
    extends ObjectReferencePropertyType
{

    @XmlElement(name = "LocalisedCharacterString")
    protected LocalisedCharacterStringType localisedCharacterString;

    /**
     * ��ȡlocalisedCharacterString���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LocalisedCharacterStringType }
     *     
     */
    public LocalisedCharacterStringType getLocalisedCharacterString() {
        return localisedCharacterString;
    }

    /**
     * ����localisedCharacterString���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LocalisedCharacterStringType }
     *     
     */
    public void setLocalisedCharacterString(LocalisedCharacterStringType value) {
        this.localisedCharacterString = value;
    }

}
