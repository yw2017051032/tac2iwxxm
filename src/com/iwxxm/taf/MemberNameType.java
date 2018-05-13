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
 * A MemberName is a LocalName that references either an attribute slot in a record or  recordType or an attribute, operation, or association role in an object instance or  type description in some form of schema. The stored value "aName" is the returned value for the "aName()" operation.
 * 
 * <p>MemberName_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MemberName_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="aName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/>
 *         &lt;element name="attributeType" type="{http://www.isotc211.org/2005/gco}TypeName_PropertyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberName_Type", namespace = "http://www.isotc211.org/2005/gco", propOrder = {
    "aName",
    "attributeType"
})
public class MemberNameType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType aName;
    @XmlElement(required = true)
    protected TypeNamePropertyType attributeType;

    /**
     * ��ȡaName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAName() {
        return aName;
    }

    /**
     * ����aName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAName(CharacterStringPropertyType value) {
        this.aName = value;
    }

    /**
     * ��ȡattributeType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TypeNamePropertyType }
     *     
     */
    public TypeNamePropertyType getAttributeType() {
        return attributeType;
    }

    /**
     * ����attributeType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNamePropertyType }
     *     
     */
    public void setAttributeType(TypeNamePropertyType value) {
        this.attributeType = value;
    }

}
