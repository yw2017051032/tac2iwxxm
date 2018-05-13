//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MD_Georectified_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MD_Georectified_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_GridSpatialRepresentation_Type">
 *       &lt;sequence>
 *         &lt;element name="checkPointAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         &lt;element name="checkPointDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="cornerPoints" type="{http://www.isotc211.org/2005/gss}GM_Point_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="centerPoint" type="{http://www.isotc211.org/2005/gss}GM_Point_PropertyType" minOccurs="0"/>
 *         &lt;element name="pointInPixel" type="{http://www.isotc211.org/2005/gmd}MD_PixelOrientationCode_PropertyType"/>
 *         &lt;element name="transformationDimensionDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="transformationDimensionMapping" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Georectified_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "checkPointAvailability",
    "checkPointDescription",
    "cornerPoints",
    "centerPoint",
    "pointInPixel",
    "transformationDimensionDescription",
    "transformationDimensionMapping"
})
public class MDGeorectifiedType
    extends MDGridSpatialRepresentationType
{

    @XmlElement(required = true)
    protected BooleanPropertyType checkPointAvailability;
    protected CharacterStringPropertyType checkPointDescription;
    protected List<GMPointPropertyType> cornerPoints;
    protected GMPointPropertyType centerPoint;
    @XmlElement(required = true)
    protected MDPixelOrientationCodePropertyType pointInPixel;
    protected CharacterStringPropertyType transformationDimensionDescription;
    protected List<CharacterStringPropertyType> transformationDimensionMapping;

    /**
     * ��ȡcheckPointAvailability���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getCheckPointAvailability() {
        return checkPointAvailability;
    }

    /**
     * ����checkPointAvailability���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setCheckPointAvailability(BooleanPropertyType value) {
        this.checkPointAvailability = value;
    }

    /**
     * ��ȡcheckPointDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCheckPointDescription() {
        return checkPointDescription;
    }

    /**
     * ����checkPointDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCheckPointDescription(CharacterStringPropertyType value) {
        this.checkPointDescription = value;
    }

    /**
     * Gets the value of the cornerPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cornerPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCornerPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMPointPropertyType }
     * 
     * 
     */
    public List<GMPointPropertyType> getCornerPoints() {
        if (cornerPoints == null) {
            cornerPoints = new ArrayList<GMPointPropertyType>();
        }
        return this.cornerPoints;
    }

    /**
     * ��ȡcenterPoint���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GMPointPropertyType }
     *     
     */
    public GMPointPropertyType getCenterPoint() {
        return centerPoint;
    }

    /**
     * ����centerPoint���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GMPointPropertyType }
     *     
     */
    public void setCenterPoint(GMPointPropertyType value) {
        this.centerPoint = value;
    }

    /**
     * ��ȡpointInPixel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MDPixelOrientationCodePropertyType }
     *     
     */
    public MDPixelOrientationCodePropertyType getPointInPixel() {
        return pointInPixel;
    }

    /**
     * ����pointInPixel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MDPixelOrientationCodePropertyType }
     *     
     */
    public void setPointInPixel(MDPixelOrientationCodePropertyType value) {
        this.pointInPixel = value;
    }

    /**
     * ��ȡtransformationDimensionDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getTransformationDimensionDescription() {
        return transformationDimensionDescription;
    }

    /**
     * ����transformationDimensionDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setTransformationDimensionDescription(CharacterStringPropertyType value) {
        this.transformationDimensionDescription = value;
    }

    /**
     * Gets the value of the transformationDimensionMapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformationDimensionMapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformationDimensionMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getTransformationDimensionMapping() {
        if (transformationDimensionMapping == null) {
            transformationDimensionMapping = new ArrayList<CharacterStringPropertyType>();
        }
        return this.transformationDimensionMapping;
    }

}
