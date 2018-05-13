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
 * <p>DQ_DataQuality_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DQ_DataQuality_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="scope" type="{http://www.isotc211.org/2005/gmd}DQ_Scope_PropertyType"/>
 *         &lt;element name="report" type="{http://www.isotc211.org/2005/gmd}DQ_Element_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lineage" type="{http://www.isotc211.org/2005/gmd}LI_Lineage_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_DataQuality_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "scope",
    "report",
    "lineage"
})
public class DQDataQualityType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected DQScopePropertyType scope;
    protected List<DQElementPropertyType> report;
    protected LILineagePropertyType lineage;

    /**
     * ��ȡscope���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DQScopePropertyType }
     *     
     */
    public DQScopePropertyType getScope() {
        return scope;
    }

    /**
     * ����scope���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DQScopePropertyType }
     *     
     */
    public void setScope(DQScopePropertyType value) {
        this.scope = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the report property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQElementPropertyType }
     * 
     * 
     */
    public List<DQElementPropertyType> getReport() {
        if (report == null) {
            report = new ArrayList<DQElementPropertyType>();
        }
        return this.report;
    }

    /**
     * ��ȡlineage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LILineagePropertyType }
     *     
     */
    public LILineagePropertyType getLineage() {
        return lineage;
    }

    /**
     * ����lineage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LILineagePropertyType }
     *     
     */
    public void setLineage(LILineagePropertyType value) {
        this.lineage = value;
    }

}
