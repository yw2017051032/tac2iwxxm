//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information describing metadata extensions.
 * 
 * <p>MD_MetadataExtensionInformation_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MD_MetadataExtensionInformation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="extensionOnLineResource" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" minOccurs="0"/>
 *         &lt;element name="extendedElementInformation" type="{http://www.isotc211.org/2005/gmd}MD_ExtendedElementInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_MetadataExtensionInformation_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "extensionOnLineResource",
    "extendedElementInformation"
})
public class MDMetadataExtensionInformationType
    extends AbstractObjectType
{

    protected CIOnlineResourcePropertyType extensionOnLineResource;
    protected List<MDExtendedElementInformationPropertyType> extendedElementInformation;

    /**
     * 获取extensionOnLineResource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public CIOnlineResourcePropertyType getExtensionOnLineResource() {
        return extensionOnLineResource;
    }

    /**
     * 设置extensionOnLineResource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public void setExtensionOnLineResource(CIOnlineResourcePropertyType value) {
        this.extensionOnLineResource = value;
    }

    /**
     * Gets the value of the extendedElementInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedElementInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedElementInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDExtendedElementInformationPropertyType }
     * 
     * 
     */
    public List<MDExtendedElementInformationPropertyType> getExtendedElementInformation() {
        if (extendedElementInformation == null) {
            extendedElementInformation = new ArrayList<MDExtendedElementInformationPropertyType>();
        }
        return this.extendedElementInformation;
    }

}
