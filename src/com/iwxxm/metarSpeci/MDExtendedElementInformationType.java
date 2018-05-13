//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * New metadata element, not found in ISO 19115, which is required to describe geographic data
 * 
 * <p>MD_ExtendedElementInformation_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MD_ExtendedElementInformation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="shortName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="domainCode" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         &lt;element name="definition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="obligation" type="{http://www.isotc211.org/2005/gmd}MD_ObligationCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="condition" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="dataType" type="{http://www.isotc211.org/2005/gmd}MD_DatatypeCode_PropertyType"/>
 *         &lt;element name="maximumOccurrence" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="domainValue" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="parentEntity" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="rule" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="rationale" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ExtendedElementInformation_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "name",
    "shortName",
    "domainCode",
    "definition",
    "obligation",
    "condition",
    "dataType",
    "maximumOccurrence",
    "domainValue",
    "parentEntity",
    "rule",
    "rationale",
    "source"
})
public class MDExtendedElementInformationType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType name;
    protected CharacterStringPropertyType shortName;
    protected IntegerPropertyType domainCode;
    @XmlElement(required = true)
    protected CharacterStringPropertyType definition;
    protected MDObligationCodePropertyType obligation;
    protected CharacterStringPropertyType condition;
    @XmlElement(required = true)
    protected MDDatatypeCodePropertyType dataType;
    protected CharacterStringPropertyType maximumOccurrence;
    protected CharacterStringPropertyType domainValue;
    @XmlElement(required = true)
    protected List<CharacterStringPropertyType> parentEntity;
    @XmlElement(required = true)
    protected CharacterStringPropertyType rule;
    protected List<CharacterStringPropertyType> rationale;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> source;

    /**
     * ��ȡname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getName() {
        return name;
    }

    /**
     * ����name���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setName(CharacterStringPropertyType value) {
        this.name = value;
    }

    /**
     * ��ȡshortName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getShortName() {
        return shortName;
    }

    /**
     * ����shortName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setShortName(CharacterStringPropertyType value) {
        this.shortName = value;
    }

    /**
     * ��ȡdomainCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getDomainCode() {
        return domainCode;
    }

    /**
     * ����domainCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setDomainCode(IntegerPropertyType value) {
        this.domainCode = value;
    }

    /**
     * ��ȡdefinition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDefinition() {
        return definition;
    }

    /**
     * ����definition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDefinition(CharacterStringPropertyType value) {
        this.definition = value;
    }

    /**
     * ��ȡobligation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MDObligationCodePropertyType }
     *     
     */
    public MDObligationCodePropertyType getObligation() {
        return obligation;
    }

    /**
     * ����obligation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MDObligationCodePropertyType }
     *     
     */
    public void setObligation(MDObligationCodePropertyType value) {
        this.obligation = value;
    }

    /**
     * ��ȡcondition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getCondition() {
        return condition;
    }

    /**
     * ����condition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setCondition(CharacterStringPropertyType value) {
        this.condition = value;
    }

    /**
     * ��ȡdataType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MDDatatypeCodePropertyType }
     *     
     */
    public MDDatatypeCodePropertyType getDataType() {
        return dataType;
    }

    /**
     * ����dataType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MDDatatypeCodePropertyType }
     *     
     */
    public void setDataType(MDDatatypeCodePropertyType value) {
        this.dataType = value;
    }

    /**
     * ��ȡmaximumOccurrence���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMaximumOccurrence() {
        return maximumOccurrence;
    }

    /**
     * ����maximumOccurrence���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMaximumOccurrence(CharacterStringPropertyType value) {
        this.maximumOccurrence = value;
    }

    /**
     * ��ȡdomainValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDomainValue() {
        return domainValue;
    }

    /**
     * ����domainValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDomainValue(CharacterStringPropertyType value) {
        this.domainValue = value;
    }

    /**
     * Gets the value of the parentEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getParentEntity() {
        if (parentEntity == null) {
            parentEntity = new ArrayList<CharacterStringPropertyType>();
        }
        return this.parentEntity;
    }

    /**
     * ��ȡrule���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getRule() {
        return rule;
    }

    /**
     * ����rule���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setRule(CharacterStringPropertyType value) {
        this.rule = value;
    }

    /**
     * Gets the value of the rationale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rationale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRationale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getRationale() {
        if (rationale == null) {
            rationale = new ArrayList<CharacterStringPropertyType>();
        }
        return this.rationale;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getSource() {
        if (source == null) {
            source = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.source;
    }

}
