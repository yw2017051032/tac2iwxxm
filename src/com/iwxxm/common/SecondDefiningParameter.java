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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}SecondDefiningParameter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "secondDefiningParameter"
})
@XmlRootElement(name = "secondDefiningParameter")
public class SecondDefiningParameter {

    @XmlElement(name = "SecondDefiningParameter", required = true)
    protected SecondDefiningParameter1 secondDefiningParameter;

    /**
     * 获取secondDefiningParameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SecondDefiningParameter1 }
     *     
     */
    public SecondDefiningParameter1 getSecondDefiningParameter() {
        return secondDefiningParameter;
    }

    /**
     * 设置secondDefiningParameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SecondDefiningParameter1 }
     *     
     */
    public void setSecondDefiningParameter(SecondDefiningParameter1 value) {
        this.secondDefiningParameter = value;
    }

}
