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
 * <p>EllipsoidType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EllipsoidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}semiMajorAxis"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}secondDefiningParameter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EllipsoidType", propOrder = {
    "semiMajorAxis",
    "secondDefiningParameter"
})
public class EllipsoidType
    extends IdentifiedObjectType
{

    @XmlElement(required = true)
    protected MeasureType semiMajorAxis;
    @XmlElement(required = true)
    protected SecondDefiningParameter secondDefiningParameter;

    /**
     * ��ȡsemiMajorAxis���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSemiMajorAxis() {
        return semiMajorAxis;
    }

    /**
     * ����semiMajorAxis���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSemiMajorAxis(MeasureType value) {
        this.semiMajorAxis = value;
    }

    /**
     * ��ȡsecondDefiningParameter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SecondDefiningParameter }
     *     
     */
    public SecondDefiningParameter getSecondDefiningParameter() {
        return secondDefiningParameter;
    }

    /**
     * ����secondDefiningParameter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SecondDefiningParameter }
     *     
     */
    public void setSecondDefiningParameter(SecondDefiningParameter value) {
        this.secondDefiningParameter = value;
    }

}
