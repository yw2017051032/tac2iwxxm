//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the domain of the raster cell
 * 
 * <p>MD_CoverageDescription_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MD_CoverageDescription_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_ContentInformation_Type">
 *       &lt;sequence>
 *         &lt;element name="attributeDescription" type="{http://www.isotc211.org/2005/gco}RecordType_PropertyType"/>
 *         &lt;element name="contentType" type="{http://www.isotc211.org/2005/gmd}MD_CoverageContentTypeCode_PropertyType"/>
 *         &lt;element name="dimension" type="{http://www.isotc211.org/2005/gmd}MD_RangeDimension_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_CoverageDescription_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "attributeDescription",
    "contentType",
    "dimension"
})
@XmlSeeAlso({
    MDImageDescriptionType.class
})
public class MDCoverageDescriptionType
    extends AbstractMDContentInformationType
{

    @XmlElement(required = true)
    protected RecordTypePropertyType attributeDescription;
    @XmlElement(required = true)
    protected MDCoverageContentTypeCodePropertyType contentType;
    protected List<MDRangeDimensionPropertyType> dimension;

    /**
     * 获取attributeDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public RecordTypePropertyType getAttributeDescription() {
        return attributeDescription;
    }

    /**
     * 设置attributeDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public void setAttributeDescription(RecordTypePropertyType value) {
        this.attributeDescription = value;
    }

    /**
     * 获取contentType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MDCoverageContentTypeCodePropertyType }
     *     
     */
    public MDCoverageContentTypeCodePropertyType getContentType() {
        return contentType;
    }

    /**
     * 设置contentType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MDCoverageContentTypeCodePropertyType }
     *     
     */
    public void setContentType(MDCoverageContentTypeCodePropertyType value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRangeDimensionPropertyType }
     * 
     * 
     */
    public List<MDRangeDimensionPropertyType> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<MDRangeDimensionPropertyType>();
        }
        return this.dimension;
    }

}
