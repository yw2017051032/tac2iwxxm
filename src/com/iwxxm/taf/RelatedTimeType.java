//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * gml:RelatedTimeType provides a content model for indicating the relative position of an arbitrary member of the substitution group whose head is gml:AbstractTimePrimitive. It extends the generic gml:TimePrimitivePropertyType with an XML attribute relativePosition, whose value is selected from the set of 13 temporal relationships identified by Allen (1983)
 * 
 * <p>RelatedTimeType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="RelatedTimeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}TimePrimitivePropertyType">
 *       &lt;attribute name="relativePosition">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Before"/>
 *             &lt;enumeration value="After"/>
 *             &lt;enumeration value="Begins"/>
 *             &lt;enumeration value="Ends"/>
 *             &lt;enumeration value="During"/>
 *             &lt;enumeration value="Equals"/>
 *             &lt;enumeration value="Contains"/>
 *             &lt;enumeration value="Overlaps"/>
 *             &lt;enumeration value="Meets"/>
 *             &lt;enumeration value="OverlappedBy"/>
 *             &lt;enumeration value="MetBy"/>
 *             &lt;enumeration value="BegunBy"/>
 *             &lt;enumeration value="EndedBy"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedTimeType")
public class RelatedTimeType
    extends TimePrimitivePropertyType
{

    @XmlAttribute(name = "relativePosition")
    protected String relativePosition;

    /**
     * ��ȡrelativePosition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativePosition() {
        return relativePosition;
    }

    /**
     * ����relativePosition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativePosition(String value) {
        this.relativePosition = value;
    }

}
