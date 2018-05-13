//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ElevatedCurveType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ElevatedCurveType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}CurveType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}ElevatedCurvePropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractElevatedCurveExtension"/>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElevatedCurveType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "elevation",
    "verticalAccuracy",
    "extension"
})
public class ElevatedCurveType
    extends CurveType
{

    @XmlElementRef(name = "elevation", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> elevation;
    @XmlElementRef(name = "verticalAccuracy", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceType> verticalAccuracy;
    protected List<ElevatedCurveType.Extension> extension;

    /**
     * ��ȡelevation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getElevation() {
        return elevation;
    }

    /**
     * ����elevation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setElevation(JAXBElement<ValDistanceVerticalType> value) {
        this.elevation = value;
    }

    /**
     * ��ȡverticalAccuracy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceType> getVerticalAccuracy() {
        return verticalAccuracy;
    }

    /**
     * ����verticalAccuracy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}
     *     
     */
    public void setVerticalAccuracy(JAXBElement<ValDistanceType> value) {
        this.verticalAccuracy = value;
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
     * {@link ElevatedCurveType.Extension }
     * 
     * 
     */
    public List<ElevatedCurveType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ElevatedCurveType.Extension>();
        }
        return this.extension;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractElevatedCurveExtension"/>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractElevatedCurveExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractElevatedCurveExtension", namespace = "http://www.aixm.aero/schema/5.1.1")
        protected AbstractExtensionType abstractElevatedCurveExtension;
        @XmlAttribute(name = "owns")
        protected java.lang.Boolean owns;

        /**
         * ��ȡabstractElevatedCurveExtension���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractElevatedCurveExtension() {
            return abstractElevatedCurveExtension;
        }

        /**
         * ����abstractElevatedCurveExtension���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractElevatedCurveExtension(AbstractExtensionType value) {
            this.abstractElevatedCurveExtension = value;
        }

        /**
         * ��ȡowns���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link java.lang.Boolean }
         *     
         */
        public boolean isOwns() {
            if (owns == null) {
                return false;
            } else {
                return owns;
            }
        }

        /**
         * ����owns���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.Boolean }
         *     
         */
        public void setOwns(java.lang.Boolean value) {
            this.owns = value;
        }

    }

}
