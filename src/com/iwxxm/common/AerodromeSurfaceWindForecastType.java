//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeSurfaceWindForecastType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AerodromeSurfaceWindForecastType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.wmo.int/iwxxm/2.1}AerodromeSurfaceWindTrendForecastType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="variableWindDirection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeSurfaceWindForecastType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
public class AerodromeSurfaceWindForecastType
    extends AerodromeSurfaceWindTrendForecastType
{

    @XmlAttribute(name = "variableWindDirection", required = true)
    protected boolean variableWindDirection;

    /**
     * ��ȡvariableWindDirection���Ե�ֵ��
     * 
     */
    public boolean isVariableWindDirection() {
        return variableWindDirection;
    }

    /**
     * ����variableWindDirection���Ե�ֵ��
     * 
     */
    public void setVariableWindDirection(boolean value) {
        this.variableWindDirection = value;
    }

}
