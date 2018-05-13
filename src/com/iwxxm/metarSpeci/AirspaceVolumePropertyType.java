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
 * <p>AirspaceVolumePropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirspaceVolumePropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMPropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AirspaceVolume"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceVolumePropertyType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "airspaceVolume"
})
public class AirspaceVolumePropertyType
    extends AbstractAIXMPropertyType
{

    @XmlElement(name = "AirspaceVolume", required = true)
    protected AirspaceVolumeType airspaceVolume;

    /**
     * 获取airspaceVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirspaceVolumeType }
     *     
     */
    public AirspaceVolumeType getAirspaceVolume() {
        return airspaceVolume;
    }

    /**
     * 设置airspaceVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceVolumeType }
     *     
     */
    public void setAirspaceVolume(AirspaceVolumeType value) {
        this.airspaceVolume = value;
    }

}
