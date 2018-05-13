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
 * <p>TimeCoordinateSystemType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="TimeCoordinateSystemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}TimeReferenceSystemType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="originPosition" type="{http://www.opengis.net/gml/3.2}TimePositionType"/>
 *           &lt;element name="origin" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;/choice>
 *         &lt;element name="interval" type="{http://www.opengis.net/gml/3.2}TimeIntervalLengthType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeCoordinateSystemType", propOrder = {
    "originPosition",
    "origin",
    "interval"
})
public class TimeCoordinateSystemType
    extends TimeReferenceSystemType
{

    protected TimePositionType originPosition;
    protected TimeInstantPropertyType origin;
    @XmlElement(required = true)
    protected TimeIntervalLengthType interval;

    /**
     * ��ȡoriginPosition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getOriginPosition() {
        return originPosition;
    }

    /**
     * ����originPosition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setOriginPosition(TimePositionType value) {
        this.originPosition = value;
    }

    /**
     * ��ȡorigin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getOrigin() {
        return origin;
    }

    /**
     * ����origin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setOrigin(TimeInstantPropertyType value) {
        this.origin = value;
    }

    /**
     * ��ȡinterval���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public TimeIntervalLengthType getInterval() {
        return interval;
    }

    /**
     * ����interval���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalLengthType }
     *     
     */
    public void setInterval(TimeIntervalLengthType value) {
        this.interval = value;
    }

}
