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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbstractDQ_Element_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AbstractDQ_Element_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="nameOfMeasure" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measureIdentification" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="measureDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="evaluationMethodType" type="{http://www.isotc211.org/2005/gmd}DQ_EvaluationMethodTypeCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="evaluationMethodDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="evaluationProcedure" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" minOccurs="0"/>
 *         &lt;element name="dateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.isotc211.org/2005/gmd}DQ_Result_PropertyType" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDQ_Element_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "nameOfMeasure",
    "measureIdentification",
    "measureDescription",
    "evaluationMethodType",
    "evaluationMethodDescription",
    "evaluationProcedure",
    "dateTime",
    "result"
})
@XmlSeeAlso({
    AbstractDQPositionalAccuracyType.class,
    AbstractDQTemporalAccuracyType.class,
    AbstractDQLogicalConsistencyType.class,
    AbstractDQCompletenessType.class,
    AbstractDQThematicAccuracyType.class
})
public abstract class AbstractDQElementType
    extends AbstractObjectType
{

    protected List<CharacterStringPropertyType> nameOfMeasure;
    protected MDIdentifierPropertyType measureIdentification;
    protected CharacterStringPropertyType measureDescription;
    protected DQEvaluationMethodTypeCodePropertyType evaluationMethodType;
    protected CharacterStringPropertyType evaluationMethodDescription;
    protected CICitationPropertyType evaluationProcedure;
    protected List<DateTimePropertyType> dateTime;
    @XmlElement(required = true)
    protected List<DQResultPropertyType> result;

    /**
     * Gets the value of the nameOfMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameOfMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameOfMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getNameOfMeasure() {
        if (nameOfMeasure == null) {
            nameOfMeasure = new ArrayList<CharacterStringPropertyType>();
        }
        return this.nameOfMeasure;
    }

    /**
     * ��ȡmeasureIdentification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getMeasureIdentification() {
        return measureIdentification;
    }

    /**
     * ����measureIdentification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setMeasureIdentification(MDIdentifierPropertyType value) {
        this.measureIdentification = value;
    }

    /**
     * ��ȡmeasureDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMeasureDescription() {
        return measureDescription;
    }

    /**
     * ����measureDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMeasureDescription(CharacterStringPropertyType value) {
        this.measureDescription = value;
    }

    /**
     * ��ȡevaluationMethodType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DQEvaluationMethodTypeCodePropertyType }
     *     
     */
    public DQEvaluationMethodTypeCodePropertyType getEvaluationMethodType() {
        return evaluationMethodType;
    }

    /**
     * ����evaluationMethodType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DQEvaluationMethodTypeCodePropertyType }
     *     
     */
    public void setEvaluationMethodType(DQEvaluationMethodTypeCodePropertyType value) {
        this.evaluationMethodType = value;
    }

    /**
     * ��ȡevaluationMethodDescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getEvaluationMethodDescription() {
        return evaluationMethodDescription;
    }

    /**
     * ����evaluationMethodDescription���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setEvaluationMethodDescription(CharacterStringPropertyType value) {
        this.evaluationMethodDescription = value;
    }

    /**
     * ��ȡevaluationProcedure���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getEvaluationProcedure() {
        return evaluationProcedure;
    }

    /**
     * ����evaluationProcedure���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setEvaluationProcedure(CICitationPropertyType value) {
        this.evaluationProcedure = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTimePropertyType }
     * 
     * 
     */
    public List<DateTimePropertyType> getDateTime() {
        if (dateTime == null) {
            dateTime = new ArrayList<DateTimePropertyType>();
        }
        return this.dateTime;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQResultPropertyType }
     * 
     * 
     */
    public List<DQResultPropertyType> getResult() {
        if (result == null) {
            result = new ArrayList<DQResultPropertyType>();
        }
        return this.result;
    }

}
