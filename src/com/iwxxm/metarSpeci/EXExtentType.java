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
 * Information about spatial, vertical, and temporal extent
 * 
 * <p>EX_Extent_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EX_Extent_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="geographicElement" type="{http://www.isotc211.org/2005/gmd}EX_GeographicExtent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="temporalElement" type="{http://www.isotc211.org/2005/gmd}EX_TemporalExtent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="verticalElement" type="{http://www.isotc211.org/2005/gmd}EX_VerticalExtent_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_Extent_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "description",
    "geographicElement",
    "temporalElement",
    "verticalElement"
})
public class EXExtentType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType description;
    protected List<EXGeographicExtentPropertyType> geographicElement;
    protected List<EXTemporalExtentPropertyType> temporalElement;
    protected List<EXVerticalExtentPropertyType> verticalElement;

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    /**
     * Gets the value of the geographicElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXGeographicExtentPropertyType }
     * 
     * 
     */
    public List<EXGeographicExtentPropertyType> getGeographicElement() {
        if (geographicElement == null) {
            geographicElement = new ArrayList<EXGeographicExtentPropertyType>();
        }
        return this.geographicElement;
    }

    /**
     * Gets the value of the temporalElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temporalElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemporalElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXTemporalExtentPropertyType }
     * 
     * 
     */
    public List<EXTemporalExtentPropertyType> getTemporalElement() {
        if (temporalElement == null) {
            temporalElement = new ArrayList<EXTemporalExtentPropertyType>();
        }
        return this.temporalElement;
    }

    /**
     * Gets the value of the verticalElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verticalElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerticalElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EXVerticalExtentPropertyType }
     * 
     * 
     */
    public List<EXVerticalExtentPropertyType> getVerticalElement() {
        if (verticalElement == null) {
            verticalElement = new ArrayList<EXVerticalExtentPropertyType>();
        }
        return this.verticalElement;
    }

}
