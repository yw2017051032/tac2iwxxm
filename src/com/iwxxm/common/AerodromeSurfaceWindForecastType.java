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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeSurfaceWindForecastType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AerodromeSurfaceWindForecastType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.wmo.int/iwxxm/2.1}AerodromeSurfaceWindTrendForecastType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="variableWindDirection" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeSurfaceWindForecastType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
public class AerodromeSurfaceWindForecastType
    extends AerodromeSurfaceWindTrendForecastType
{

    @XmlAttribute(name = "variableWindDirection", required = true)
    protected boolean variableWindDirection;

    /**
     * 获取variableWindDirection属性的值。
     * 
     */
    public boolean isVariableWindDirection() {
        return variableWindDirection;
    }

    /**
     * 设置variableWindDirection属性的值。
     * 
     */
    public void setVariableWindDirection(boolean value) {
        this.variableWindDirection = value;
    }

}
