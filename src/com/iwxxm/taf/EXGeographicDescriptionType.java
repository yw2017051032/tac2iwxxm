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
 * <p>EX_GeographicDescription_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EX_GeographicDescription_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractEX_GeographicExtent_Type">
 *       &lt;sequence>
 *         &lt;element name="geographicIdentifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_GeographicDescription_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "geographicIdentifier"
})
public class EXGeographicDescriptionType
    extends AbstractEXGeographicExtentType
{

    @XmlElement(required = true)
    protected MDIdentifierPropertyType geographicIdentifier;

    /**
     * 获取geographicIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getGeographicIdentifier() {
        return geographicIdentifier;
    }

    /**
     * 设置geographicIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setGeographicIdentifier(MDIdentifierPropertyType value) {
        this.geographicIdentifier = value;
    }

}
