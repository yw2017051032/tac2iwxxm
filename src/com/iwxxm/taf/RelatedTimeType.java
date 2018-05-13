//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:RelatedTimeType provides a content model for indicating the relative position of an arbitrary member of the substitution group whose head is gml:AbstractTimePrimitive. It extends the generic gml:TimePrimitivePropertyType with an XML attribute relativePosition, whose value is selected from the set of 13 temporal relationships identified by Allen (1983)
 * 
 * <p>RelatedTimeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RelatedTimeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}TimePrimitivePropertyType">
 *       &lt;attribute name="relativePosition">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Before"/>
 *             &lt;enumeration value="After"/>
 *             &lt;enumeration value="Begins"/>
 *             &lt;enumeration value="Ends"/>
 *             &lt;enumeration value="During"/>
 *             &lt;enumeration value="Equals"/>
 *             &lt;enumeration value="Contains"/>
 *             &lt;enumeration value="Overlaps"/>
 *             &lt;enumeration value="Meets"/>
 *             &lt;enumeration value="OverlappedBy"/>
 *             &lt;enumeration value="MetBy"/>
 *             &lt;enumeration value="BegunBy"/>
 *             &lt;enumeration value="EndedBy"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedTimeType")
public class RelatedTimeType
    extends TimePrimitivePropertyType
{

    @XmlAttribute(name = "relativePosition")
    protected String relativePosition;

    /**
     * 获取relativePosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativePosition() {
        return relativePosition;
    }

    /**
     * 设置relativePosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativePosition(String value) {
        this.relativePosition = value;
    }

}
