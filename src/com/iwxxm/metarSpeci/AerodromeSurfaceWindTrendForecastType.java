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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeSurfaceWindTrendForecastType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AerodromeSurfaceWindTrendForecastType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meanWindDirection" type="{http://www.opengis.net/gml/3.2}AngleType" minOccurs="0"/>
 *         &lt;element name="meanWindSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType"/>
 *         &lt;element name="meanWindSpeedOperator" type="{http://schemas.wmo.int/iwxxm/2.1}RelationalOperatorType" minOccurs="0"/>
 *         &lt;element name="windGustSpeed" type="{http://www.opengis.net/gml/3.2}SpeedType" minOccurs="0"/>
 *         &lt;element name="windGustSpeedOperator" type="{http://schemas.wmo.int/iwxxm/2.1}RelationalOperatorType" minOccurs="0"/>
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
@XmlType(name = "AerodromeSurfaceWindTrendForecastType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "meanWindDirection",
    "meanWindSpeed",
    "meanWindSpeedOperator",
    "windGustSpeed",
    "windGustSpeedOperator",
    "extension"
})
@XmlSeeAlso({
    AerodromeSurfaceWindForecastType.class
})
public class AerodromeSurfaceWindTrendForecastType {

    protected AngleType meanWindDirection;
    @XmlElement(required = true)
    protected SpeedType meanWindSpeed;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType meanWindSpeedOperator;
    protected SpeedType windGustSpeed;
    @XmlSchemaType(name = "string")
    protected RelationalOperatorType windGustSpeedOperator;
    protected List<Object> extension;

    /**
     * ��ȡmeanWindDirection���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AngleType }
     *     
     */
    public AngleType getMeanWindDirection() {
        return meanWindDirection;
    }

    /**
     * ����meanWindDirection���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AngleType }
     *     
     */
    public void setMeanWindDirection(AngleType value) {
        this.meanWindDirection = value;
    }

    /**
     * ��ȡmeanWindSpeed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getMeanWindSpeed() {
        return meanWindSpeed;
    }

    /**
     * ����meanWindSpeed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setMeanWindSpeed(SpeedType value) {
        this.meanWindSpeed = value;
    }

    /**
     * ��ȡmeanWindSpeedOperator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getMeanWindSpeedOperator() {
        return meanWindSpeedOperator;
    }

    /**
     * ����meanWindSpeedOperator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setMeanWindSpeedOperator(RelationalOperatorType value) {
        this.meanWindSpeedOperator = value;
    }

    /**
     * ��ȡwindGustSpeed���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SpeedType }
     *     
     */
    public SpeedType getWindGustSpeed() {
        return windGustSpeed;
    }

    /**
     * ����windGustSpeed���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedType }
     *     
     */
    public void setWindGustSpeed(SpeedType value) {
        this.windGustSpeed = value;
    }

    /**
     * ��ȡwindGustSpeedOperator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RelationalOperatorType }
     *     
     */
    public RelationalOperatorType getWindGustSpeedOperator() {
        return windGustSpeedOperator;
    }

    /**
     * ����windGustSpeedOperator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RelationalOperatorType }
     *     
     */
    public void setWindGustSpeedOperator(RelationalOperatorType value) {
        this.windGustSpeedOperator = value;
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
