//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Handling restrictions imposed on the dataset because of national security, privacy, or other concerns
 * 
 * <p>MD_SecurityConstraints_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MD_SecurityConstraints_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_Constraints_Type">
 *       &lt;sequence>
 *         &lt;element name="classification" type="{http://www.isotc211.org/2005/gmd}MD_ClassificationCode_PropertyType"/>
 *         &lt;element name="userNote" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="classificationSystem" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="handlingDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_SecurityConstraints_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "classification",
    "userNote",
    "classificationSystem",
    "handlingDescription"
})
public class MDSecurityConstraintsType
    extends MDConstraintsType
{

    @XmlElement(required = true)
    protected MDClassificationCodePropertyType classification;
    protected CharacterStringPropertyType userNote;
    protected CharacterStringPropertyType classificationSystem;
    protected CharacterStringPropertyType handlingDescription;

    /**
     * ��ȡclassification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MDClassificationCodePropertyType }
     *     
     */
    public MDClassificationCodePropertyType getClassification() {
        return classification;
    }

    /**
     * ����classification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MDClassificationCodePropertyType }
     *     
     */
    public void setClassification(MDClassificationCodePropertyType value) {
        this.classification = value;
    }

    /**
     * ��ȡuserNote���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUserNote() {
        return userNote;
    }

    /**
     * ����userNote���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUserNote(CharacterStringPropertyType value) {
        this.userNote = value;
    }

    /**
     * ��ȡclassificationSystem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getClassificationSystem() {
        return classificationSystem;
    }

    /**
     * ����classificationSystem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setClassificationSystem(CharacterStringPropertyType value) {
        this.classificationSystem = value;
    }

    /**
     * ��ȡhandlingDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getHandlingDescription() {
        return handlingDescription;
    }

    /**
     * ����handlingDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setHandlingDescription(CharacterStringPropertyType value) {
        this.handlingDescription = value;
    }

}
