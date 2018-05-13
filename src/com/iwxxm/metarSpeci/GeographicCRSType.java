//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GeographicCRSType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GeographicCRSType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCRSType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}usesEllipsoidalCS"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}usesGeodeticDatum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicCRSType", propOrder = {
    "usesEllipsoidalCS",
    "usesGeodeticDatum"
})
public class GeographicCRSType
    extends AbstractCRSType
{

    @XmlElement(required = true)
    protected EllipsoidalCSPropertyType usesEllipsoidalCS;
    @XmlElement(required = true)
    protected GeodeticDatumPropertyType usesGeodeticDatum;

    /**
     * ��ȡusesEllipsoidalCS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EllipsoidalCSPropertyType }
     *     
     */
    public EllipsoidalCSPropertyType getUsesEllipsoidalCS() {
        return usesEllipsoidalCS;
    }

    /**
     * ����usesEllipsoidalCS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EllipsoidalCSPropertyType }
     *     
     */
    public void setUsesEllipsoidalCS(EllipsoidalCSPropertyType value) {
        this.usesEllipsoidalCS = value;
    }

    /**
     * ��ȡusesGeodeticDatum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GeodeticDatumPropertyType }
     *     
     */
    public GeodeticDatumPropertyType getUsesGeodeticDatum() {
        return usesGeodeticDatum;
    }

    /**
     * ����usesGeodeticDatum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GeodeticDatumPropertyType }
     *     
     */
    public void setUsesGeodeticDatum(GeodeticDatumPropertyType value) {
        this.usesGeodeticDatum = value;
    }

}
