//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TopoCurvePropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TopoCurvePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}TopoCurve"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoCurvePropertyType", propOrder = {
    "topoCurve"
})
public class TopoCurvePropertyType {

    @XmlElement(name = "TopoCurve", required = true)
    protected TopoCurveType topoCurve;
    @XmlAttribute(name = "owns")
    protected java.lang.Boolean owns;

    /**
     * 获取topoCurve属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TopoCurveType }
     *     
     */
    public TopoCurveType getTopoCurve() {
        return topoCurve;
    }

    /**
     * 设置topoCurve属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TopoCurveType }
     *     
     */
    public void setTopoCurve(TopoCurveType value) {
        this.topoCurve = value;
    }

    /**
     * 获取owns属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isOwns() {
        if (owns == null) {
            return false;
        } else {
            return owns;
        }
    }

    /**
     * 设置owns属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setOwns(java.lang.Boolean value) {
        this.owns = value;
    }

}
