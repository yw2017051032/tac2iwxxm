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
 * <p>EngineeringCRSType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EngineeringCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}affineCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cartesianCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}cylindricalCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}linearCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}polarCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}sphericalCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}userDefinedCS"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}coordinateSystem"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}engineeringDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineeringCRSType", propOrder = {
    "affineCS",
    "cartesianCS",
    "cylindricalCS",
    "linearCS",
    "polarCS",
    "sphericalCS",
    "userDefinedCS",
    "coordinateSystem",
    "engineeringDatum"
})
public class EngineeringCRSType
    extends AbstractCRSType
{

    @XmlElementRef(name = "affineCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<AffineCSPropertyType> affineCS;
    @XmlElementRef(name = "cartesianCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CartesianCSPropertyType> cartesianCS;
    protected CylindricalCSPropertyType cylindricalCS;
    protected LinearCSPropertyType linearCS;
    protected PolarCSPropertyType polarCS;
    @XmlElementRef(name = "sphericalCS", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<SphericalCSPropertyType> sphericalCS;
    protected UserDefinedCSPropertyType userDefinedCS;
    @XmlElementRef(name = "coordinateSystem", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class, required = false)
    protected JAXBElement<CoordinateSystemPropertyType> coordinateSystem;
    @XmlElementRef(name = "engineeringDatum", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<EngineeringDatumPropertyType> engineeringDatum;

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
     * ��ȡcylindricalCS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CylindricalCSPropertyType }
     *     
     */
    public CylindricalCSPropertyType getCylindricalCS() {
        return cylindricalCS;
    }

    /**
     * ����cylindricalCS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CylindricalCSPropertyType }
     *     
     */
    public void setCylindricalCS(CylindricalCSPropertyType value) {
        this.cylindricalCS = value;
    }

    /**
     * ��ȡlinearCS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link LinearCSPropertyType }
     *     
     */
    public LinearCSPropertyType getLinearCS() {
        return linearCS;
    }

    /**
     * ����linearCS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link LinearCSPropertyType }
     *     
     */
    public void setLinearCS(LinearCSPropertyType value) {
        this.linearCS = value;
    }

    /**
     * ��ȡpolarCS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PolarCSPropertyType }
     *     
     */
    public PolarCSPropertyType getPolarCS() {
        return polarCS;
    }

    /**
     * ����polarCS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PolarCSPropertyType }
     *     
     */
    public void setPolarCS(PolarCSPropertyType value) {
        this.polarCS = value;
    }

    /**
     * ��ȡsphericalCS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     
     */
    public JAXBElement<SphericalCSPropertyType> getSphericalCS() {
        return sphericalCS;
    }

    /**
     * ����sphericalCS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}
     *     
     */
    public void setSphericalCS(JAXBElement<SphericalCSPropertyType> value) {
        this.sphericalCS = value;
    }

    /**
     * ��ȡuserDefinedCS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedCSPropertyType }
     *     
     */
    public UserDefinedCSPropertyType getUserDefinedCS() {
        return userDefinedCS;
    }

    /**
     * ����userDefinedCS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedCSPropertyType }
     *     
     */
    public void setUserDefinedCS(UserDefinedCSPropertyType value) {
        this.userDefinedCS = value;
    }

    /**
     * ��ȡcoordinateSystem���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public JAXBElement<CoordinateSystemPropertyType> getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * ����coordinateSystem���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}
     *     
     */
    public void setCoordinateSystem(JAXBElement<CoordinateSystemPropertyType> value) {
        this.coordinateSystem = value;
    }

    /**
     * ��ȡengineeringDatum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     
     */
    public JAXBElement<EngineeringDatumPropertyType> getEngineeringDatum() {
        return engineeringDatum;
    }

    /**
     * ����engineeringDatum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}
     *     
     */
    public void setEngineeringDatum(JAXBElement<EngineeringDatumPropertyType> value) {
        this.engineeringDatum = value;
    }

}
