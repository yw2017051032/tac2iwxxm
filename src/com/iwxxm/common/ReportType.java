//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ReportType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="permissibleUsage" use="required" type="{http://schemas.wmo.int/iwxxm/2.1}PermissibleUsageType" />
 *       &lt;attribute name="permissibleUsageReason" type="{http://schemas.wmo.int/iwxxm/2.1}PermissibleUsageReasonType" />
 *       &lt;attribute name="permissibleUsageSupplementary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translatedBulletinID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translatedBulletinReceptionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="translationCentreDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translationCentreName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="translationFailedTAC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
public abstract class ReportType
    extends AbstractFeatureType
{

    @XmlAttribute(name = "permissibleUsage", required = true)
    protected PermissibleUsageType permissibleUsage;
    @XmlAttribute(name = "permissibleUsageReason")
    protected PermissibleUsageReasonType permissibleUsageReason;
    @XmlAttribute(name = "permissibleUsageSupplementary")
    protected String permissibleUsageSupplementary;
    @XmlAttribute(name = "translatedBulletinID")
    protected String translatedBulletinID;
    @XmlAttribute(name = "translatedBulletinReceptionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar translatedBulletinReceptionTime;
    @XmlAttribute(name = "translationCentreDesignator")
    protected String translationCentreDesignator;
    @XmlAttribute(name = "translationCentreName")
    protected String translationCentreName;
    @XmlAttribute(name = "translationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar translationTime;
    @XmlAttribute(name = "translationFailedTAC")
    protected String translationFailedTAC;

    /**
     * 获取permissibleUsage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PermissibleUsageType }
     *     
     */
    public PermissibleUsageType getPermissibleUsage() {
        return permissibleUsage;
    }

    /**
     * 设置permissibleUsage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PermissibleUsageType }
     *     
     */
    public void setPermissibleUsage(PermissibleUsageType value) {
        this.permissibleUsage = value;
    }

    /**
     * 获取permissibleUsageReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PermissibleUsageReasonType }
     *     
     */
    public PermissibleUsageReasonType getPermissibleUsageReason() {
        return permissibleUsageReason;
    }

    /**
     * 设置permissibleUsageReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PermissibleUsageReasonType }
     *     
     */
    public void setPermissibleUsageReason(PermissibleUsageReasonType value) {
        this.permissibleUsageReason = value;
    }

    /**
     * 获取permissibleUsageSupplementary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissibleUsageSupplementary() {
        return permissibleUsageSupplementary;
    }

    /**
     * 设置permissibleUsageSupplementary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissibleUsageSupplementary(String value) {
        this.permissibleUsageSupplementary = value;
    }

    /**
     * 获取translatedBulletinID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslatedBulletinID() {
        return translatedBulletinID;
    }

    /**
     * 设置translatedBulletinID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslatedBulletinID(String value) {
        this.translatedBulletinID = value;
    }

    /**
     * 获取translatedBulletinReceptionTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranslatedBulletinReceptionTime() {
        return translatedBulletinReceptionTime;
    }

    /**
     * 设置translatedBulletinReceptionTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranslatedBulletinReceptionTime(XMLGregorianCalendar value) {
        this.translatedBulletinReceptionTime = value;
    }

    /**
     * 获取translationCentreDesignator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationCentreDesignator() {
        return translationCentreDesignator;
    }

    /**
     * 设置translationCentreDesignator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationCentreDesignator(String value) {
        this.translationCentreDesignator = value;
    }

    /**
     * 获取translationCentreName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationCentreName() {
        return translationCentreName;
    }

    /**
     * 设置translationCentreName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationCentreName(String value) {
        this.translationCentreName = value;
    }

    /**
     * 获取translationTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranslationTime() {
        return translationTime;
    }

    /**
     * 设置translationTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranslationTime(XMLGregorianCalendar value) {
        this.translationTime = value;
    }

    /**
     * 获取translationFailedTAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationFailedTAC() {
        return translationFailedTAC;
    }

    /**
     * 设置translationFailedTAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationFailedTAC(String value) {
        this.translationFailedTAC = value;
    }

}
