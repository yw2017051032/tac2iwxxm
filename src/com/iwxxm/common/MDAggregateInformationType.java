//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Encapsulates the dataset aggregation information
 * 
 * <p>MD_AggregateInformation_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MD_AggregateInformation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="aggregateDataSetName" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *         &lt;element name="aggregateDataSetIdentifier" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="associationType" type="{http://www.isotc211.org/2005/gmd}DS_AssociationTypeCode_PropertyType"/>
 *         &lt;element name="initiativeType" type="{http://www.isotc211.org/2005/gmd}DS_InitiativeTypeCode_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_AggregateInformation_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "aggregateDataSetName",
    "aggregateDataSetIdentifier",
    "associationType",
    "initiativeType"
})
public class MDAggregateInformationType
    extends AbstractObjectType
{

    protected CICitationPropertyType aggregateDataSetName;
    protected MDIdentifierPropertyType aggregateDataSetIdentifier;
    @XmlElement(required = true)
    protected DSAssociationTypeCodePropertyType associationType;
    protected DSInitiativeTypeCodePropertyType initiativeType;

    /**
     * ��ȡaggregateDataSetName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getAggregateDataSetName() {
        return aggregateDataSetName;
    }

    /**
     * ����aggregateDataSetName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setAggregateDataSetName(CICitationPropertyType value) {
        this.aggregateDataSetName = value;
    }

    /**
     * ��ȡaggregateDataSetIdentifier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getAggregateDataSetIdentifier() {
        return aggregateDataSetIdentifier;
    }

    /**
     * ����aggregateDataSetIdentifier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setAggregateDataSetIdentifier(MDIdentifierPropertyType value) {
        this.aggregateDataSetIdentifier = value;
    }

    /**
     * ��ȡassociationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DSAssociationTypeCodePropertyType }
     *     
     */
    public DSAssociationTypeCodePropertyType getAssociationType() {
        return associationType;
    }

    /**
     * ����associationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DSAssociationTypeCodePropertyType }
     *     
     */
    public void setAssociationType(DSAssociationTypeCodePropertyType value) {
        this.associationType = value;
    }

    /**
     * ��ȡinitiativeType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DSInitiativeTypeCodePropertyType }
     *     
     */
    public DSInitiativeTypeCodePropertyType getInitiativeType() {
        return initiativeType;
    }

    /**
     * ����initiativeType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DSInitiativeTypeCodePropertyType }
     *     
     */
    public void setInitiativeType(DSInitiativeTypeCodePropertyType value) {
        this.initiativeType = value;
    }

}
