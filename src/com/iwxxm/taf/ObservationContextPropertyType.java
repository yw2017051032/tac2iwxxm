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
 * ObservationContext is a dataType, without identity, so may only be used
 * 				inline
 * 
 * <p>ObservationContextPropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ObservationContextPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/om/2.0}ObservationContext"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObservationContextPropertyType", namespace = "http://www.opengis.net/om/2.0", propOrder = {
    "observationContext"
})
public class ObservationContextPropertyType {

    @XmlElement(name = "ObservationContext", required = true)
    protected ObservationContextType observationContext;

    /**
     * 获取observationContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ObservationContextType }
     *     
     */
    public ObservationContextType getObservationContext() {
        return observationContext;
    }

    /**
     * 设置observationContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ObservationContextType }
     *     
     */
    public void setObservationContext(ObservationContextType value) {
        this.observationContext = value;
    }

}
