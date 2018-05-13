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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Quantitative_conformance_measure from Quality Procedures.  -  - Renamed to remove implied use limitation -  - OCL - -- result is type specified by valueDomain - result.tupleType = valueDomain
 * 
 * <p>DQ_QuantitativeResult_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DQ_QuantitativeResult_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractDQ_Result_Type">
 *       &lt;sequence>
 *         &lt;element name="valueType" type="{http://www.isotc211.org/2005/gco}RecordType_PropertyType" minOccurs="0"/>
 *         &lt;element name="valueUnit" type="{http://www.isotc211.org/2005/gco}UnitOfMeasure_PropertyType"/>
 *         &lt;element name="errorStatistic" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.isotc211.org/2005/gco}Record_PropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_QuantitativeResult_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "valueType",
    "valueUnit",
    "errorStatistic",
    "value"
})
public class DQQuantitativeResultType
    extends AbstractDQResultType
{

    protected RecordTypePropertyType valueType;
    @XmlElement(required = true)
    protected UnitOfMeasurePropertyType valueUnit;
    protected CharacterStringPropertyType errorStatistic;
    @XmlElement(required = true)
    protected List<RecordPropertyType> value;

    /**
     * 获取valueType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public RecordTypePropertyType getValueType() {
        return valueType;
    }

    /**
     * 设置valueType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public void setValueType(RecordTypePropertyType value) {
        this.valueType = value;
    }

    /**
     * 获取valueUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurePropertyType }
     *     
     */
    public UnitOfMeasurePropertyType getValueUnit() {
        return valueUnit;
    }

    /**
     * 设置valueUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurePropertyType }
     *     
     */
    public void setValueUnit(UnitOfMeasurePropertyType value) {
        this.valueUnit = value;
    }

    /**
     * 获取errorStatistic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getErrorStatistic() {
        return errorStatistic;
    }

    /**
     * 设置errorStatistic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setErrorStatistic(CharacterStringPropertyType value) {
        this.errorStatistic = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordPropertyType }
     * 
     * 
     */
    public List<RecordPropertyType> getValue() {
        if (value == null) {
            value = new ArrayList<RecordPropertyType>();
        }
        return this.value;
    }

}
