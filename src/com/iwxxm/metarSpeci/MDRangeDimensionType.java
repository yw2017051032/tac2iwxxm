//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of adjacent wavelengths in the electro-magnetic spectrum with a common characteristic, such as the visible band
 * 
 * <p>MD_RangeDimension_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MD_RangeDimension_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="sequenceIdentifier" type="{http://www.isotc211.org/2005/gco}MemberName_PropertyType" minOccurs="0"/>
 *         &lt;element name="descriptor" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_RangeDimension_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "sequenceIdentifier",
    "descriptor"
})
@XmlSeeAlso({
    MDBandType.class
})
public class MDRangeDimensionType
    extends AbstractObjectType
{

    protected MemberNamePropertyType sequenceIdentifier;
    protected CharacterStringPropertyType descriptor;

    /**
     * 获取sequenceIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemberNamePropertyType }
     *     
     */
    public MemberNamePropertyType getSequenceIdentifier() {
        return sequenceIdentifier;
    }

    /**
     * 设置sequenceIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemberNamePropertyType }
     *     
     */
    public void setSequenceIdentifier(MemberNamePropertyType value) {
        this.sequenceIdentifier = value;
    }

    /**
     * 获取descriptor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescriptor() {
        return descriptor;
    }

    /**
     * 设置descriptor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescriptor(CharacterStringPropertyType value) {
        this.descriptor = value;
    }

}
