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
 * <p>LocalisedCharacterString_PropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LocalisedCharacterString_PropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}LocalisedCharacterString"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalisedCharacterString_PropertyType", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "localisedCharacterString"
})
public class LocalisedCharacterStringPropertyType
    extends ObjectReferencePropertyType
{

    @XmlElement(name = "LocalisedCharacterString")
    protected LocalisedCharacterStringType localisedCharacterString;

    /**
     * 获取localisedCharacterString属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocalisedCharacterStringType }
     *     
     */
    public LocalisedCharacterStringType getLocalisedCharacterString() {
        return localisedCharacterString;
    }

    /**
     * 设置localisedCharacterString属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocalisedCharacterStringType }
     *     
     */
    public void setLocalisedCharacterString(LocalisedCharacterStringType value) {
        this.localisedCharacterString = value;
    }

}
