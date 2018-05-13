//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ObservationType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ObservationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}validTime"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}using" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}target" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}resultOf"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationType", propOrder = {
    "validTime",
    "using",
    "target",
    "resultOf"
})
@XmlSeeAlso({
    DirectedObservationType.class
})
public class ObservationType
    extends AbstractFeatureType
{

    @XmlElement(required = true)
    protected TimePrimitivePropertyType validTime;
    protected ProcedurePropertyType using;
    @XmlElementRef(name = "target", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<TargetPropertyType> target;
    @XmlElement(required = true)
    protected ResultType resultOf;

    /**
     * ��ȡvalidTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public TimePrimitivePropertyType getValidTime() {
        return validTime;
    }

    /**
     * ����validTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrimitivePropertyType }
     *     
     */
    public void setValidTime(TimePrimitivePropertyType value) {
        this.validTime = value;
    }

    /**
     * ��ȡusing���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProcedurePropertyType }
     *     
     */
    public ProcedurePropertyType getUsing() {
        return using;
    }

    /**
     * ����using���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedurePropertyType }
     *     
     */
    public void setUsing(ProcedurePropertyType value) {
        this.using = value;
    }

    /**
     * ��ȡtarget���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     
     */
    public JAXBElement<TargetPropertyType> getTarget() {
        return target;
    }

    /**
     * ����target���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}
     *     
     */
    public void setTarget(JAXBElement<TargetPropertyType> value) {
        this.target = value;
    }

    /**
     * ��ȡresultOf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResultOf() {
        return resultOf;
    }

    /**
     * ����resultOf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResultOf(ResultType value) {
        this.resultOf = value;
    }

}
