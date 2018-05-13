//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Common ways in which the dataset may be obtained or received, and related instructions and fee information
 * 
 * <p>MD_StandardOrderProcess_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MD_StandardOrderProcess_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="fees" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="plannedAvailableDateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" minOccurs="0"/>
 *         &lt;element name="orderingInstructions" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="turnaround" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_StandardOrderProcess_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "fees",
    "plannedAvailableDateTime",
    "orderingInstructions",
    "turnaround"
})
public class MDStandardOrderProcessType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType fees;
    protected DateTimePropertyType plannedAvailableDateTime;
    protected CharacterStringPropertyType orderingInstructions;
    protected CharacterStringPropertyType turnaround;

    /**
     * 获取fees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFees() {
        return fees;
    }

    /**
     * 设置fees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFees(CharacterStringPropertyType value) {
        this.fees = value;
    }

    /**
     * 获取plannedAvailableDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getPlannedAvailableDateTime() {
        return plannedAvailableDateTime;
    }

    /**
     * 设置plannedAvailableDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setPlannedAvailableDateTime(DateTimePropertyType value) {
        this.plannedAvailableDateTime = value;
    }

    /**
     * 获取orderingInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrderingInstructions() {
        return orderingInstructions;
    }

    /**
     * 设置orderingInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrderingInstructions(CharacterStringPropertyType value) {
        this.orderingInstructions = value;
    }

    /**
     * 获取turnaround属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getTurnaround() {
        return turnaround;
    }

    /**
     * 设置turnaround属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setTurnaround(CharacterStringPropertyType value) {
        this.turnaround = value;
    }

}
