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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbstractGeneralDerivedCRSType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AbstractGeneralDerivedCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}conversion"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeneralDerivedCRSType", propOrder = {
    "conversion"
})
@XmlSeeAlso({
    DerivedCRSType.class,
    ProjectedCRSType.class
})
public abstract class AbstractGeneralDerivedCRSType
    extends AbstractCRSType
{

    @XmlElementRef(name = "conversion", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<GeneralConversionPropertyType> conversion;

    /**
     * 获取conversion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}
     *     
     */
    public JAXBElement<GeneralConversionPropertyType> getConversion() {
        return conversion;
    }

    /**
     * 设置conversion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}
     *     
     */
    public void setConversion(JAXBElement<GeneralConversionPropertyType> value) {
        this.conversion = value;
    }

}
