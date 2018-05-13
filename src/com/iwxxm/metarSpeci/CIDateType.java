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
 * <p>CI_Date_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CI_Date_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.isotc211.org/2005/gco}Date_PropertyType"/>
 *         &lt;element name="dateType" type="{http://www.isotc211.org/2005/gmd}CI_DateTypeCode_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CI_Date_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "date",
    "dateType"
})
public class CIDateType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected DatePropertyType date;
    @XmlElement(required = true)
    protected CIDateTypeCodePropertyType dateType;

    /**
     * 获取date属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDate() {
        return date;
    }

    /**
     * 设置date属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDate(DatePropertyType value) {
        this.date = value;
    }

    /**
     * 获取dateType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CIDateTypeCodePropertyType }
     *     
     */
    public CIDateTypeCodePropertyType getDateType() {
        return dateType;
    }

    /**
     * 设置dateType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CIDateTypeCodePropertyType }
     *     
     */
    public void setDateType(CIDateTypeCodePropertyType value) {
        this.dateType = value;
    }

}
