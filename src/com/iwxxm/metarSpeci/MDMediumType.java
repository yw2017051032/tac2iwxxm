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
 * Information about the media on which the data can be distributed
 * 
 * <p>MD_Medium_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MD_Medium_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gmd}MD_MediumNameCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="density" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="densityUnits" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="volumes" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         &lt;element name="mediumFormat" type="{http://www.isotc211.org/2005/gmd}MD_MediumFormatCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mediumNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Medium_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "name",
    "density",
    "densityUnits",
    "volumes",
    "mediumFormat",
    "mediumNote"
})
public class MDMediumType
    extends AbstractObjectType
{

    protected MDMediumNameCodePropertyType name;
    protected List<RealPropertyType> density;
    protected CharacterStringPropertyType densityUnits;
    protected IntegerPropertyType volumes;
    protected List<MDMediumFormatCodePropertyType> mediumFormat;
    protected CharacterStringPropertyType mediumNote;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MDMediumNameCodePropertyType }
     *     
     */
    public MDMediumNameCodePropertyType getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MDMediumNameCodePropertyType }
     *     
     */
    public void setName(MDMediumNameCodePropertyType value) {
        this.name = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the density property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDensity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RealPropertyType }
     * 
     * 
     */
    public List<RealPropertyType> getDensity() {
        if (density == null) {
            density = new ArrayList<RealPropertyType>();
        }
        return this.density;
    }

    /**
     * 获取densityUnits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDensityUnits() {
        return densityUnits;
    }

    /**
     * 设置densityUnits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDensityUnits(CharacterStringPropertyType value) {
        this.densityUnits = value;
    }

    /**
     * 获取volumes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getVolumes() {
        return volumes;
    }

    /**
     * 设置volumes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setVolumes(IntegerPropertyType value) {
        this.volumes = value;
    }

    /**
     * Gets the value of the mediumFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediumFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediumFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMediumFormatCodePropertyType }
     * 
     * 
     */
    public List<MDMediumFormatCodePropertyType> getMediumFormat() {
        if (mediumFormat == null) {
            mediumFormat = new ArrayList<MDMediumFormatCodePropertyType>();
        }
        return this.mediumFormat;
    }

    /**
     * 获取mediumNote属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMediumNote() {
        return mediumNote;
    }

    /**
     * 设置mediumNote属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMediumNote(CharacterStringPropertyType value) {
        this.mediumNote = value;
    }

}
