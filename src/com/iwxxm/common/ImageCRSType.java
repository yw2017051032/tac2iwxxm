//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImageCRSType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ImageCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}affineCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}usesObliqueCartesianCS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}imageDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageCRSType", propOrder = {
    "cartesianCS",
    "affineCS",
    "usesObliqueCartesianCS",
    "imageDatum"
})
public class ImageCRSType
    extends AbstractCRSType
{

    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    @XmlElementRef(name = "affineCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AffineCSPropertyType> affineCS;
    protected ObliqueCartesianCSPropertyType usesObliqueCartesianCS;
    @XmlElementRef(name = "imageDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<ImageDatumPropertyType> imageDatum;

    /**
     * ��ȡcartesianCS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<CartesianCSPropertyType> getCartesianCS() {
        return cartesianCS;
    }

    /**
     * ����cartesianCS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}
     *     
     */
    public void setCartesianCS(JAXBElement<CartesianCSPropertyType> value) {
        this.cartesianCS = value;
    }

    /**
     * ��ȡaffineCS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<AffineCSPropertyType> getAffineCS() {
        return affineCS;
    }

    /**
     * ����affineCS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}
     *     
     */
    public void setAffineCS(JAXBElement<AffineCSPropertyType> value) {
        this.affineCS = value;
    }

    /**
     * ��ȡusesObliqueCartesianCS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ObliqueCartesianCSPropertyType }
     *     
     */
    public ObliqueCartesianCSPropertyType getUsesObliqueCartesianCS() {
        return usesObliqueCartesianCS;
    }

    /**
     * ����usesObliqueCartesianCS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ObliqueCartesianCSPropertyType }
     *     
     */
    public void setUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType value) {
        this.usesObliqueCartesianCS = value;
    }

    /**
     * ��ȡimageDatum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<ImageDatumPropertyType> getImageDatum() {
        return imageDatum;
    }

    /**
     * ����imageDatum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}
     *     
     */
    public void setImageDatum(JAXBElement<ImageDatumPropertyType> value) {
        this.imageDatum = value;
    }

}
