//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about online sources from which the dataset, specification, or community profile name and extended metadata elements can be obtained.
 * 
 * <p>CI_OnlineResource_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CI_OnlineResource_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="linkage" type="{http://www.isotc211.org/2005/gmd}URL_PropertyType"/>
 *         &lt;element name="protocol" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="applicationProfile" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="function" type="{http://www.isotc211.org/2005/gmd}CI_OnLineFunctionCode_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_OnlineResource_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "linkage",
    "protocol",
    "applicationProfile",
    "name",
    "description",
    "function"
})
public class CIOnlineResourceType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected URLPropertyType linkage;
    protected CharacterStringPropertyType protocol;
    protected CharacterStringPropertyType applicationProfile;
    protected CharacterStringPropertyType name;
    protected CharacterStringPropertyType description;
    protected CIOnLineFunctionCodePropertyType function;

    /**
     * 获取linkage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link URLPropertyType }
     *     
     */
    public URLPropertyType getLinkage() {
        return linkage;
    }

    /**
     * 设置linkage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link URLPropertyType }
     *     
     */
    public void setLinkage(URLPropertyType value) {
        this.linkage = value;
    }

    /**
     * 获取protocol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getProtocol() {
        return protocol;
    }

    /**
     * 设置protocol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setProtocol(CharacterStringPropertyType value) {
        this.protocol = value;
    }

    /**
     * 获取applicationProfile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getApplicationProfile() {
        return applicationProfile;
    }

    /**
     * 设置applicationProfile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setApplicationProfile(CharacterStringPropertyType value) {
        this.applicationProfile = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setName(CharacterStringPropertyType value) {
        this.name = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    /**
     * 获取function属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CIOnLineFunctionCodePropertyType }
     *     
     */
    public CIOnLineFunctionCodePropertyType getFunction() {
        return function;
    }

    /**
     * 设置function属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnLineFunctionCodePropertyType }
     *     
     */
    public void setFunction(CIOnLineFunctionCodePropertyType value) {
        this.function = value;
    }

}
