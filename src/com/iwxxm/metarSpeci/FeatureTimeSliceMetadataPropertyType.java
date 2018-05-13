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
 * <p>FeatureTimeSliceMetadataPropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FeatureTimeSliceMetadataPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractMetadataPropertyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.isotc211.org/2005/gmd}MD_Metadata"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureTimeSliceMetadataPropertyType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "mdMetadata"
})
public class FeatureTimeSliceMetadataPropertyType
    extends AbstractMetadataPropertyType
{

    @XmlElement(name = "MD_Metadata", namespace = "http://www.isotc211.org/2005/gmd")
    protected MDMetadataType mdMetadata;

    /**
     * 获取mdMetadata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MDMetadataType }
     *     
     */
    public MDMetadataType getMDMetadata() {
        return mdMetadata;
    }

    /**
     * 设置mdMetadata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MDMetadataType }
     *     
     */
    public void setMDMetadata(MDMetadataType value) {
        this.mdMetadata = value;
    }

}
