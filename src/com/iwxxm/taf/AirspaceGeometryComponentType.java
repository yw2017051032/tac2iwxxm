//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AirspaceGeometryComponentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirspaceGeometryComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}AirspaceGeometryComponentPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAirspaceGeometryComponentExtension"/>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceGeometryComponentType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "theAirspaceVolume",
    "extension"
})
public class AirspaceGeometryComponentType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "theAirspaceVolume", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AirspaceVolumePropertyType> theAirspaceVolume;
    protected List<AirspaceGeometryComponentType.Extension> extension;

    /**
     * 获取theAirspaceVolume属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AirspaceVolumePropertyType }{@code >}
     *     
     */
    public JAXBElement<AirspaceVolumePropertyType> getTheAirspaceVolume() {
        return theAirspaceVolume;
    }

    /**
     * 设置theAirspaceVolume属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AirspaceVolumePropertyType }{@code >}
     *     
     */
    public void setTheAirspaceVolume(JAXBElement<AirspaceVolumePropertyType> value) {
        this.theAirspaceVolume = value;
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
     * {@link AirspaceGeometryComponentType.Extension }
     * 
     * 
     */
    public List<AirspaceGeometryComponentType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<AirspaceGeometryComponentType.Extension>();
        }
        return this.extension;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractAirspaceGeometryComponentExtension"/>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractAirspaceGeometryComponentExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractAirspaceGeometryComponentExtension", namespace = "http://www.aixm.aero/schema/5.1.1")
        protected AbstractExtensionType abstractAirspaceGeometryComponentExtension;
        @XmlAttribute(name = "owns")
        protected java.lang.Boolean owns;

        /**
         * 获取abstractAirspaceGeometryComponentExtension属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractAirspaceGeometryComponentExtension() {
            return abstractAirspaceGeometryComponentExtension;
        }

        /**
         * 设置abstractAirspaceGeometryComponentExtension属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractAirspaceGeometryComponentExtension(AbstractExtensionType value) {
            this.abstractAirspaceGeometryComponentExtension = value;
        }

        /**
         * 获取owns属性的值。
         * 
         * @return
         *     possible object is
         *     {@link java.lang.Boolean }
         *     
         */
        public boolean isOwns() {
            if (owns == null) {
                return false;
            } else {
                return owns;
            }
        }

        /**
         * 设置owns属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.Boolean }
         *     
         */
        public void setOwns(java.lang.Boolean value) {
            this.owns = value;
        }

    }

}
