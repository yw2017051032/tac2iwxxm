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
 * <p>PT_Locale_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PT_Locale_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="languageCode" type="{http://www.isotc211.org/2005/gmd}LanguageCode_PropertyType"/>
 *         &lt;element name="country" type="{http://www.isotc211.org/2005/gmd}Country_PropertyType" minOccurs="0"/>
 *         &lt;element name="characterEncoding" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PT_Locale_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "languageCode",
    "country",
    "characterEncoding"
})
public class PTLocaleType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected LanguageCodePropertyType languageCode;
    protected CountryPropertyType country;
    @XmlElement(required = true)
    protected MDCharacterSetCodePropertyType characterEncoding;

    /**
     * 获取languageCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LanguageCodePropertyType }
     *     
     */
    public LanguageCodePropertyType getLanguageCode() {
        return languageCode;
    }

    /**
     * 设置languageCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageCodePropertyType }
     *     
     */
    public void setLanguageCode(LanguageCodePropertyType value) {
        this.languageCode = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryPropertyType }
     *     
     */
    public CountryPropertyType getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryPropertyType }
     *     
     */
    public void setCountry(CountryPropertyType value) {
        this.country = value;
    }

    /**
     * 获取characterEncoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public MDCharacterSetCodePropertyType getCharacterEncoding() {
        return characterEncoding;
    }

    /**
     * 设置characterEncoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public void setCharacterEncoding(MDCharacterSetCodePropertyType value) {
        this.characterEncoding = value;
    }

}
