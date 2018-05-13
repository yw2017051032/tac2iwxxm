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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeRunwayVisualRangeType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AerodromeRunwayVisualRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runway" type="{http://schemas.wmo.int/iwxxm/2.1}RunwayDirectionPropertyType"/>
 *         &lt;element name="meanRVR" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         &lt;element name="meanRVROperator" type="{http://schemas.wmo.int/iwxxm/2.1}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pastTendency" type="{http://schemas.wmo.int/iwxxm/2.1}VisualRangeTendencyType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeRunwayVisualRangeType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "runway",
    "meanRVR",
    "meanRVROperator",
    "extension"
})
public class AerodromeRunwayVisualRangeType {

    @XmlElement(required = true)
    protected RunwayDirectionPropertyType1 runway;
    @XmlElement(required = true)
    protected LengthType meanRVR;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType meanRVROperator;
    protected List<Object> extension;
    @XmlAttribute(name = "pastTendency")
    protected VisualRangeTendencyType pastTendency;

    /**
     * ��ȡrunway���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RunwayDirectionPropertyType1 }
     *     
     */
    public RunwayDirectionPropertyType1 getRunway() {
        return runway;
    }

    /**
     * ����runway���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDirectionPropertyType1 }
     *     
     */
    public void setRunway(RunwayDirectionPropertyType1 value) {
        this.runway = value;
    }

    /**
     * ��ȡmeanRVR���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getMeanRVR() {
        return meanRVR;
    }

    /**
     * ����meanRVR���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setMeanRVR(LengthType value) {
        this.meanRVR = value;
    }

    /**
     * ��ȡmeanRVROperator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getMeanRVROperator() {
        return meanRVROperator;
    }

    /**
     * ����meanRVROperator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setMeanRVROperator(RelationalOperatorType value) {
        this.meanRVROperator = value;
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

    /**
     * ��ȡpastTendency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VisualRangeTendencyType }
     *     
     */
    public VisualRangeTendencyType getPastTendency() {
        return pastTendency;
    }

    /**
     * ����pastTendency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VisualRangeTendencyType }
     *     
     */
    public void setPastTendency(VisualRangeTendencyType value) {
        this.pastTendency = value;
    }

}
