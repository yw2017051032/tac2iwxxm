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
 * <p>DynamicFeatureCollectionType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DynamicFeatureCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DynamicFeatureType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}dynamicMembers"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFeatureCollectionType", propOrder = {
    "dynamicMembers"
})
public class DynamicFeatureCollectionType
    extends DynamicFeatureType
{

    @XmlElement(required = true)
    protected DynamicFeatureMemberType dynamicMembers;

    /**
     * ��ȡdynamicMembers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DynamicFeatureMemberType }
     *     
     */
    public DynamicFeatureMemberType getDynamicMembers() {
        return dynamicMembers;
    }

    /**
     * ����dynamicMembers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFeatureMemberType }
     *     
     */
    public void setDynamicMembers(DynamicFeatureMemberType value) {
        this.dynamicMembers = value;
    }

}
