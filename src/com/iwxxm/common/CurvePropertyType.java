//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CurvePropertyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CurvePropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}Curve"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurvePropertyType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "curve"
})
public class CurvePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElementRef(name = "Curve", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class)
    protected JAXBElement<? extends CurveType> curve;

    /**
     * ��ȡcurve���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevatedCurveType }{@code >}
     *     
     */
    public JAXBElement<? extends CurveType> getCurve() {
        return curve;
    }

    /**
     * ����curve���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ElevatedCurveType }{@code >}
     *     
     */
    public void setCurve(JAXBElement<? extends CurveType> value) {
        this.curve = value;
    }

}
