//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CloudLayerType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CloudLayerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://schemas.wmo.int/iwxxm/2.1}CloudAmountReportedAtAerodromeType"/>
 *         &lt;element name="base" type="{http://schemas.wmo.int/iwxxm/2.1}DistanceWithNilReasonType"/>
 *         &lt;element name="cloudType" type="{http://schemas.wmo.int/iwxxm/2.1}SigConvectiveCloudTypeType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloudLayerType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "amount",
    "base",
    "cloudType",
    "extension"
})
public class CloudLayerType {

    @XmlElement(required = true, nillable = true)
    protected CloudAmountReportedAtAerodromeType amount;
    @XmlElement(required = true, nillable = true)
    protected DistanceWithNilReasonType base;
    @XmlElementRef(name = "cloudType", namespace = "http://schemas.wmo.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SigConvectiveCloudTypeType> cloudType;
    protected List<Object> extension;

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CloudAmountReportedAtAerodromeType }
     *     
     */
    public CloudAmountReportedAtAerodromeType getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CloudAmountReportedAtAerodromeType }
     *     
     */
    public void setAmount(CloudAmountReportedAtAerodromeType value) {
        this.amount = value;
    }

    /**
     * 获取base属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public DistanceWithNilReasonType getBase() {
        return base;
    }

    /**
     * 设置base属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public void setBase(DistanceWithNilReasonType value) {
        this.base = value;
    }

    /**
     * 获取cloudType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SigConvectiveCloudTypeType }{@code >}
     *     
     */
    public JAXBElement<SigConvectiveCloudTypeType> getCloudType() {
        return cloudType;
    }

    /**
     * 设置cloudType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SigConvectiveCloudTypeType }{@code >}
     *     
     */
    public void setCloudType(JAXBElement<SigConvectiveCloudTypeType> value) {
        this.cloudType = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

}
