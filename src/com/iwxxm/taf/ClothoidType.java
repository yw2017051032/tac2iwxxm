//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ClothoidType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ClothoidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;element name="refLocation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opengis.net/gml/3.2}AffinePlacement"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="scaleFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="startParameter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="endParameter" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="clothoid" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClothoidType", propOrder = {
    "refLocation",
    "scaleFactor",
    "startParameter",
    "endParameter"
})
public class ClothoidType
    extends AbstractCurveSegmentType
{

    @XmlElement(required = true)
    protected ClothoidType.RefLocation refLocation;
    @XmlElement(required = true)
    protected BigDecimal scaleFactor;
    protected double startParameter;
    protected double endParameter;
    @XmlAttribute(name = "interpolation")
    protected CurveInterpolationType interpolation;

    /**
     * ��ȡrefLocation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ClothoidType.RefLocation }
     *     
     */
    public ClothoidType.RefLocation getRefLocation() {
        return refLocation;
    }

    /**
     * ����refLocation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ClothoidType.RefLocation }
     *     
     */
    public void setRefLocation(ClothoidType.RefLocation value) {
        this.refLocation = value;
    }

    /**
     * ��ȡscaleFactor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScaleFactor() {
        return scaleFactor;
    }

    /**
     * ����scaleFactor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScaleFactor(BigDecimal value) {
        this.scaleFactor = value;
    }

    /**
     * ��ȡstartParameter���Ե�ֵ��
     * 
     */
    public double getStartParameter() {
        return startParameter;
    }

    /**
     * ����startParameter���Ե�ֵ��
     * 
     */
    public void setStartParameter(double value) {
        this.startParameter = value;
    }

    /**
     * ��ȡendParameter���Ե�ֵ��
     * 
     */
    public double getEndParameter() {
        return endParameter;
    }

    /**
     * ����endParameter���Ե�ֵ��
     * 
     */
    public void setEndParameter(double value) {
        this.endParameter = value;
    }

    /**
     * ��ȡinterpolation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getInterpolation() {
        if (interpolation == null) {
            return CurveInterpolationType.CLOTHOID;
        } else {
            return interpolation;
        }
    }

    /**
     * ����interpolation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setInterpolation(CurveInterpolationType value) {
        this.interpolation = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opengis.net/gml/3.2}AffinePlacement"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affinePlacement"
    })
    public static class RefLocation {

        @XmlElement(name = "AffinePlacement", required = true)
        protected AffinePlacementType affinePlacement;

        /**
         * ��ȡaffinePlacement���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link AffinePlacementType }
         *     
         */
        public AffinePlacementType getAffinePlacement() {
            return affinePlacement;
        }

        /**
         * ����affinePlacement���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link AffinePlacementType }
         *     
         */
        public void setAffinePlacement(AffinePlacementType value) {
            this.affinePlacement = value;
        }

    }

}
