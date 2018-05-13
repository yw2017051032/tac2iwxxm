//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbstractCurveSegmentType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AbstractCurveSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="numDerivativesAtStart" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="numDerivativesAtEnd" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="numDerivativeInterior" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCurveSegmentType")
@XmlSeeAlso({
    BSplineType.class,
    ClothoidType.class,
    ArcStringType.class,
    ArcByCenterPointType.class,
    LineStringSegmentType.class,
    GeodesicStringType.class,
    OffsetCurveType.class,
    ArcStringByBulgeType.class,
    CubicSplineType.class
})
public abstract class AbstractCurveSegmentType {

    @XmlAttribute(name = "numDerivativesAtStart")
    protected BigInteger numDerivativesAtStart;
    @XmlAttribute(name = "numDerivativesAtEnd")
    protected BigInteger numDerivativesAtEnd;
    @XmlAttribute(name = "numDerivativeInterior")
    protected BigInteger numDerivativeInterior;

    /**
     * ��ȡnumDerivativesAtStart���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativesAtStart() {
        if (numDerivativesAtStart == null) {
            return new BigInteger("0");
        } else {
            return numDerivativesAtStart;
        }
    }

    /**
     * ����numDerivativesAtStart���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativesAtStart(BigInteger value) {
        this.numDerivativesAtStart = value;
    }

    /**
     * ��ȡnumDerivativesAtEnd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativesAtEnd() {
        if (numDerivativesAtEnd == null) {
            return new BigInteger("0");
        } else {
            return numDerivativesAtEnd;
        }
    }

    /**
     * ����numDerivativesAtEnd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativesAtEnd(BigInteger value) {
        this.numDerivativesAtEnd = value;
    }

    /**
     * ��ȡnumDerivativeInterior���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumDerivativeInterior() {
        if (numDerivativeInterior == null) {
            return new BigInteger("0");
        } else {
            return numDerivativeInterior;
        }
    }

    /**
     * ����numDerivativeInterior���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumDerivativeInterior(BigInteger value) {
        this.numDerivativeInterior = value;
    }

}
