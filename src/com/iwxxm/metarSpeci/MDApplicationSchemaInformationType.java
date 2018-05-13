//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the application schema used to build the dataset
 * 
 * <p>MD_ApplicationSchemaInformation_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MD_ApplicationSchemaInformation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType"/>
 *         &lt;element name="schemaLanguage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="constraintLanguage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="schemaAscii" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="graphicsFile" type="{http://www.isotc211.org/2005/gco}Binary_PropertyType" minOccurs="0"/>
 *         &lt;element name="softwareDevelopmentFile" type="{http://www.isotc211.org/2005/gco}Binary_PropertyType" minOccurs="0"/>
 *         &lt;element name="softwareDevelopmentFileFormat" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ApplicationSchemaInformation_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "name",
    "schemaLanguage",
    "constraintLanguage",
    "schemaAscii",
    "graphicsFile",
    "softwareDevelopmentFile",
    "softwareDevelopmentFileFormat"
})
public class MDApplicationSchemaInformationType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CICitationPropertyType name;
    @XmlElement(required = true)
    protected CharacterStringPropertyType schemaLanguage;
    @XmlElement(required = true)
    protected CharacterStringPropertyType constraintLanguage;
    protected CharacterStringPropertyType schemaAscii;
    protected BinaryPropertyType graphicsFile;
    protected BinaryPropertyType softwareDevelopmentFile;
    protected CharacterStringPropertyType softwareDevelopmentFileFormat;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setName(CICitationPropertyType value) {
        this.name = value;
    }

    /**
     * ��ȡschemaLanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSchemaLanguage() {
        return schemaLanguage;
    }

    /**
     * ����schemaLanguage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSchemaLanguage(CharacterStringPropertyType value) {
        this.schemaLanguage = value;
    }

    /**
     * ��ȡconstraintLanguage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getConstraintLanguage() {
        return constraintLanguage;
    }

    /**
     * ����constraintLanguage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setConstraintLanguage(CharacterStringPropertyType value) {
        this.constraintLanguage = value;
    }

    /**
     * ��ȡschemaAscii���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSchemaAscii() {
        return schemaAscii;
    }

    /**
     * ����schemaAscii���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSchemaAscii(CharacterStringPropertyType value) {
        this.schemaAscii = value;
    }

    /**
     * ��ȡgraphicsFile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BinaryPropertyType }
     *     
     */
    public BinaryPropertyType getGraphicsFile() {
        return graphicsFile;
    }

    /**
     * ����graphicsFile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryPropertyType }
     *     
     */
    public void setGraphicsFile(BinaryPropertyType value) {
        this.graphicsFile = value;
    }

    /**
     * ��ȡsoftwareDevelopmentFile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BinaryPropertyType }
     *     
     */
    public BinaryPropertyType getSoftwareDevelopmentFile() {
        return softwareDevelopmentFile;
    }

    /**
     * ����softwareDevelopmentFile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryPropertyType }
     *     
     */
    public void setSoftwareDevelopmentFile(BinaryPropertyType value) {
        this.softwareDevelopmentFile = value;
    }

    /**
     * ��ȡsoftwareDevelopmentFileFormat���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSoftwareDevelopmentFileFormat() {
        return softwareDevelopmentFileFormat;
    }

    /**
     * ����softwareDevelopmentFileFormat���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSoftwareDevelopmentFileFormat(CharacterStringPropertyType value) {
        this.softwareDevelopmentFileFormat = value;
    }

}
