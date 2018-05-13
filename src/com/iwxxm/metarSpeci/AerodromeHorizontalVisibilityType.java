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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeHorizontalVisibilityType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AerodromeHorizontalVisibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prevailingVisibility" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         &lt;element name="prevailingVisibilityOperator" type="{http://schemas.wmo.int/iwxxm/2.1}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="minimumVisibility" type="{http://www.opengis.net/gml/3.2}LengthType" minOccurs="0"/>
 *         &lt;element name="minimumVisibilityDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeHorizontalVisibilityType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "prevailingVisibility",
    "prevailingVisibilityOperator",
    "minimumVisibility",
    "minimumVisibilityDirection",
    "extension"
})
public class AerodromeHorizontalVisibilityType {

    @XmlElement(required = true)
    protected LengthType prevailingVisibility;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType prevailingVisibilityOperator;
    protected LengthType minimumVisibility;
    protected AngleType minimumVisibilityDirection;
    protected List<Object> extension;

    /**
     * ��ȡprevailingVisibility���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getPrevailingVisibility() {
        return prevailingVisibility;
    }

    /**
     * ����prevailingVisibility���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setPrevailingVisibility(LengthType value) {
        this.prevailingVisibility = value;
    }

    /**
     * ��ȡprevailingVisibilityOperator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getPrevailingVisibilityOperator() {
        return prevailingVisibilityOperator;
    }

    /**
     * ����prevailingVisibilityOperator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setPrevailingVisibilityOperator(RelationalOperatorType value) {
        this.prevailingVisibilityOperator = value;
    }

    /**
     * ��ȡminimumVisibility���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMinimumVisibility() {
        return minimumVisibility;
    }

    /**
     * ����minimumVisibility���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMinimumVisibility(LengthType value) {
        this.minimumVisibility = value;
    }

    /**
     * ��ȡminimumVisibilityDirection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getMinimumVisibilityDirection() {
        return minimumVisibilityDirection;
    }

    /**
     * ����minimumVisibilityDirection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setMinimumVisibilityDirection(AngleType value) {
        this.minimumVisibilityDirection = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Object>();
        }
        return this.extension;
    }

}
