//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MappingRuleType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MappingRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ruleDefinition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleReference" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MappingRuleType", propOrder = {
    "ruleDefinition",
    "ruleReference"
})
public class MappingRuleType {

    protected String ruleDefinition;
    protected ReferenceType ruleReference;

    /**
     * ��ȡruleDefinition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDefinition() {
        return ruleDefinition;
    }

    /**
     * ����ruleDefinition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDefinition(String value) {
        this.ruleDefinition = value;
    }

    /**
     * ��ȡruleReference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRuleReference() {
        return ruleReference;
    }

    /**
     * ����ruleReference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRuleReference(ReferenceType value) {
        this.ruleReference = value;
    }

}
