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
 * <p>AirspaceVolumePropertyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AirspaceVolumePropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AirspaceVolume"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceVolumePropertyType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "airspaceVolume"
})
public class AirspaceVolumePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirspaceVolume", required = true)
    protected AirspaceVolumeType airspaceVolume;

    /**
     * ��ȡairspaceVolume���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AirspaceVolumeType }
     *     
     */
    public AirspaceVolumeType getAirspaceVolume() {
        return airspaceVolume;
    }

    /**
     * ����airspaceVolume���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceVolumeType }
     *     
     */
    public void setAirspaceVolume(AirspaceVolumeType value) {
        this.airspaceVolume = value;
    }

}
