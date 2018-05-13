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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Intended for use as the type of user-declared elements to make them
 *     extended links.
 *     Note that the elements referenced in the content model are all abstract.
 *     The intention is that by simply declaring elements with these as their
 *     substitutionGroup, all the right things will happen.
 *    
 * 
 * <p>extended complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="extended">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1999/xlink}extendedModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}extendedAttrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extended", namespace = "http://www.w3.org/1999/xlink", propOrder = {
    "extendedModel"
})
public class Extended {

    @XmlElements({
        @XmlElement(name = "title", type = TitleEltType.class),
        @XmlElement(name = "resource", type = ResourceType.class),
        @XmlElement(name = "locator", type = LocatorType.class),
        @XmlElement(name = "arc", type = ArcType.class)
    })
    protected List<Object> extendedModel;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink", required = true)
    protected TypeType type;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String valueFileSizeTriggerType2;

    /**
     * Gets the value of the extendedModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleEltType }
     * {@link ResourceType }
     * {@link LocatorType }
     * {@link ArcType }
     * 
     * 
     */
    public List<Object> getExtendedModel() {
        if (extendedModel == null) {
            extendedModel = new ArrayList<Object>();
        }
        return this.extendedModel;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getType() {
        if (type == null) {
            return TypeType.EXTENDED;
        } else {
            return type;
        }
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * ��ȡrole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * ����role���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * ��ȡvalueFileSizeTriggerType2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueFileSizeTriggerType2() {
        return valueFileSizeTriggerType2;
    }

    /**
     * ����valueFileSizeTriggerType2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueFileSizeTriggerType2(String value) {
        this.valueFileSizeTriggerType2 = value;
    }

}