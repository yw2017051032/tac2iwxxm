//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ReportType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="permissibleUsage" use="required" type="{http://schemas.wmo.int/iwxxm/2.1}PermissibleUsageType" />
 *       &lt;attribute name="permissibleUsageReason" type="{http://schemas.wmo.int/iwxxm/2.1}PermissibleUsageReasonType" />
 *       &lt;attribute name="permissibleUsageSupplementary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translatedBulletinID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translatedBulletinReceptionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="translationCentreDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translationCentreName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="translationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="translationFailedTAC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
public abstract class ReportType
    extends AbstractFeatureType
{

    @XmlAttribute(name = "permissibleUsage", required = true)
    protected PermissibleUsageType permissibleUsage;
    @XmlAttribute(name = "permissibleUsageReason")
    protected PermissibleUsageReasonType permissibleUsageReason;
    @XmlAttribute(name = "permissibleUsageSupplementary")
    protected String permissibleUsageSupplementary;
    @XmlAttribute(name = "translatedBulletinID")
    protected String translatedBulletinID;
    @XmlAttribute(name = "translatedBulletinReceptionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar translatedBulletinReceptionTime;
    @XmlAttribute(name = "translationCentreDesignator")
    protected String translationCentreDesignator;
    @XmlAttribute(name = "translationCentreName")
    protected String translationCentreName;
    @XmlAttribute(name = "translationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar translationTime;
    @XmlAttribute(name = "translationFailedTAC")
    protected String translationFailedTAC;

    /**
     * ��ȡpermissibleUsage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PermissibleUsageType }
     *     
     */
    public PermissibleUsageType getPermissibleUsage() {
        return permissibleUsage;
    }

    /**
     * ����permissibleUsage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PermissibleUsageType }
     *     
     */
    public void setPermissibleUsage(PermissibleUsageType value) {
        this.permissibleUsage = value;
    }

    /**
     * ��ȡpermissibleUsageReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PermissibleUsageReasonType }
     *     
     */
    public PermissibleUsageReasonType getPermissibleUsageReason() {
        return permissibleUsageReason;
    }

    /**
     * ����permissibleUsageReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PermissibleUsageReasonType }
     *     
     */
    public void setPermissibleUsageReason(PermissibleUsageReasonType value) {
        this.permissibleUsageReason = value;
    }

    /**
     * ��ȡpermissibleUsageSupplementary���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissibleUsageSupplementary() {
        return permissibleUsageSupplementary;
    }

    /**
     * ����permissibleUsageSupplementary���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissibleUsageSupplementary(String value) {
        this.permissibleUsageSupplementary = value;
    }

    /**
     * ��ȡtranslatedBulletinID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslatedBulletinID() {
        return translatedBulletinID;
    }

    /**
     * ����translatedBulletinID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslatedBulletinID(String value) {
        this.translatedBulletinID = value;
    }

    /**
     * ��ȡtranslatedBulletinReceptionTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranslatedBulletinReceptionTime() {
        return translatedBulletinReceptionTime;
    }

    /**
     * ����translatedBulletinReceptionTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranslatedBulletinReceptionTime(XMLGregorianCalendar value) {
        this.translatedBulletinReceptionTime = value;
    }

    /**
     * ��ȡtranslationCentreDesignator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationCentreDesignator() {
        return translationCentreDesignator;
    }

    /**
     * ����translationCentreDesignator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationCentreDesignator(String value) {
        this.translationCentreDesignator = value;
    }

    /**
     * ��ȡtranslationCentreName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationCentreName() {
        return translationCentreName;
    }

    /**
     * ����translationCentreName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationCentreName(String value) {
        this.translationCentreName = value;
    }

    /**
     * ��ȡtranslationTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranslationTime() {
        return translationTime;
    }

    /**
     * ����translationTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranslationTime(XMLGregorianCalendar value) {
        this.translationTime = value;
    }

    /**
     * ��ȡtranslationFailedTAC���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslationFailedTAC() {
        return translationFailedTAC;
    }

    /**
     * ����translationFailedTAC���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslationFailedTAC(String value) {
        this.translationFailedTAC = value;
    }

}
