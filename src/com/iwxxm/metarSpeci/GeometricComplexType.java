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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GeometricComplexType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GeometricComplexType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeometryType">
 *       &lt;sequence>
 *         &lt;element name="element" type="{http://www.opengis.net/gml/3.2}GeometricPrimitivePropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometricComplexType", propOrder = {
    "element"
})
public class GeometricComplexType
    extends AbstractGeometryType
{

    @XmlElement(required = true)
    protected List<GeometricPrimitivePropertyType> element;
    @XmlAttribute(name = "aggregationType")
    protected AggregationType aggregationType;

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeometricPrimitivePropertyType }
     * 
     * 
     */
    public List<GeometricPrimitivePropertyType> getElement() {
        if (element == null) {
            element = new ArrayList<GeometricPrimitivePropertyType>();
        }
        return this.element;
    }

    /**
     * ��ȡaggregationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AggregationType }
     *     
     */
    public AggregationType getAggregationType() {
        return aggregationType;
    }

    /**
     * ����aggregationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationType }
     *     
     */
    public void setAggregationType(AggregationType value) {
        this.aggregationType = value;
    }

}
