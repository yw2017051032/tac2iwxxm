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
 * <p>AirspaceGeometryComponentPropertyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AirspaceGeometryComponentPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AirspaceGeometryComponent"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceGeometryComponentPropertyType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "airspaceGeometryComponent"
})
public class AirspaceGeometryComponentPropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirspaceGeometryComponent", required = true)
    protected AirspaceGeometryComponentType airspaceGeometryComponent;

    /**
     * ��ȡairspaceGeometryComponent���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AirspaceGeometryComponentType }
     *     
     */
    public AirspaceGeometryComponentType getAirspaceGeometryComponent() {
        return airspaceGeometryComponent;
    }

    /**
     * ����airspaceGeometryComponent���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceGeometryComponentType }
     *     
     */
    public void setAirspaceGeometryComponent(AirspaceGeometryComponentType value) {
        this.airspaceGeometryComponent = value;
    }

}
