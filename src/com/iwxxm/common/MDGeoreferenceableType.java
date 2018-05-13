//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MD_Georeferenceable_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MD_Georeferenceable_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_GridSpatialRepresentation_Type">
 *       &lt;sequence>
 *         &lt;element name="controlPointAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         &lt;element name="orientationParameterAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         &lt;element name="orientationParameterDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="georeferencedParameters" type="{http://www.isotc211.org/2005/gco}Record_PropertyType"/>
 *         &lt;element name="parameterCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Georeferenceable_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "controlPointAvailability",
    "orientationParameterAvailability",
    "orientationParameterDescription",
    "georeferencedParameters",
    "parameterCitation"
})
public class MDGeoreferenceableType
    extends MDGridSpatialRepresentationType
{

    @XmlElement(required = true)
    protected BooleanPropertyType controlPointAvailability;
    @XmlElement(required = true)
    protected BooleanPropertyType orientationParameterAvailability;
    protected CharacterStringPropertyType orientationParameterDescription;
    @XmlElement(required = true)
    protected RecordPropertyType georeferencedParameters;
    protected List<CICitationPropertyType> parameterCitation;

    /**
     * ��ȡcontrolPointAvailability���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getControlPointAvailability() {
        return controlPointAvailability;
    }

    /**
     * ����controlPointAvailability���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setControlPointAvailability(BooleanPropertyType value) {
        this.controlPointAvailability = value;
    }

    /**
     * ��ȡorientationParameterAvailability���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getOrientationParameterAvailability() {
        return orientationParameterAvailability;
    }

    /**
     * ����orientationParameterAvailability���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setOrientationParameterAvailability(BooleanPropertyType value) {
        this.orientationParameterAvailability = value;
    }

    /**
     * ��ȡorientationParameterDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrientationParameterDescription() {
        return orientationParameterDescription;
    }

    /**
     * ����orientationParameterDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrientationParameterDescription(CharacterStringPropertyType value) {
        this.orientationParameterDescription = value;
    }

    /**
     * ��ȡgeoreferencedParameters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RecordPropertyType }
     *     
     */
    public RecordPropertyType getGeoreferencedParameters() {
        return georeferencedParameters;
    }

    /**
     * ����georeferencedParameters���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RecordPropertyType }
     *     
     */
    public void setGeoreferencedParameters(RecordPropertyType value) {
        this.georeferencedParameters = value;
    }

    /**
     * Gets the value of the parameterCitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterCitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICitationPropertyType }
     * 
     * 
     */
    public List<CICitationPropertyType> getParameterCitation() {
        if (parameterCitation == null) {
            parameterCitation = new ArrayList<CICitationPropertyType>();
        }
        return this.parameterCitation;
    }

}
