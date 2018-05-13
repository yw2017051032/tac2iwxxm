//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EllipsoidType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取semiMajorAxis属性的值。
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
     * 设置semiMajorAxis属性的值。
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
     * 获取secondDefiningParameter属性的值。
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
     * 设置secondDefiningParameter属性的值。
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
