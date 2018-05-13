//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OffsetCurveType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OffsetCurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;element name="offsetBase" type="{http://www.opengis.net/gml/3.2}CurvePropertyType"/>
 *         &lt;element name="distance" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         &lt;element name="refDirection" type="{http://www.opengis.net/gml/3.2}VectorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffsetCurveType", propOrder = {
    "offsetBase",
    "distance",
    "refDirection"
})
public class OffsetCurveType
    extends AbstractCurveSegmentType
{

    @XmlElement(required = true)
    protected CurvePropertyType1 offsetBase;
    @XmlElement(required = true)
    protected LengthType distance;
    protected VectorType refDirection;

    /**
     * 获取offsetBase属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType1 }
     *     
     */
    public CurvePropertyType1 getOffsetBase() {
        return offsetBase;
    }

    /**
     * 设置offsetBase属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType1 }
     *     
     */
    public void setOffsetBase(CurvePropertyType1 value) {
        this.offsetBase = value;
    }

    /**
     * 获取distance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getDistance() {
        return distance;
    }

    /**
     * 设置distance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setDistance(LengthType value) {
        this.distance = value;
    }

    /**
     * 获取refDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VectorType }
     *     
     */
    public VectorType getRefDirection() {
        return refDirection;
    }

    /**
     * 设置refDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VectorType }
     *     
     */
    public void setRefDirection(VectorType value) {
        this.refDirection = value;
    }

}
