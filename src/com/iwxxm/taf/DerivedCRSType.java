//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DerivedCRSType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralDerivedCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}baseCRS"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}derivedCRSType"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}coordinateSystem"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedCRSType", propOrder = {
    "baseCRS",
    "derivedCRSType",
    "coordinateSystem"
})
public class DerivedCRSType
    extends AbstractGeneralDerivedCRSType
{

    @XmlElement(required = true)
    protected SingleCRSPropertyType baseCRS;
    @XmlElement(required = true)
    protected CodeWithAuthorityType derivedCRSType;
    @XmlElementRef(name = "coordinateSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<CoordinateSystemPropertyType> coordinateSystem;

    /**
     * 获取baseCRS属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SingleCRSPropertyType }
     *     
     */
    public SingleCRSPropertyType getBaseCRS() {
        return baseCRS;
    }

    /**
     * 设置baseCRS属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SingleCRSPropertyType }
     *     
     */
    public void setBaseCRS(SingleCRSPropertyType value) {
        this.baseCRS = value;
    }

    /**
     * 获取derivedCRSType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public CodeWithAuthorityType getDerivedCRSType() {
        return derivedCRSType;
    }

    /**
     * 设置derivedCRSType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithAuthorityType }
     *     
     */
    public void setDerivedCRSType(CodeWithAuthorityType value) {
        this.derivedCRSType = value;
    }

    /**
     * 获取coordinateSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<CoordinateSystemPropertyType> getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * 设置coordinateSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public void setCoordinateSystem(JAXBElement<CoordinateSystemPropertyType> value) {
        this.coordinateSystem = value;
    }

}
