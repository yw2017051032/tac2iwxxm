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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ElevatedPointPropertyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ElevatedPointPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}ElevatedPoint"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedPointPropertyType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "elevatedPoint"
})
public class ElevatedPointPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "ElevatedPoint", required = true)
    protected ElevatedPointType elevatedPoint;

    /**
     * ��ȡelevatedPoint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ElevatedPointType }
     *     
     */
    public ElevatedPointType getElevatedPoint() {
        return elevatedPoint;
    }

    /**
     * ����elevatedPoint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ElevatedPointType }
     *     
     */
    public void setElevatedPoint(ElevatedPointType value) {
        this.elevatedPoint = value;
    }

}
