//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbstractCoordinateOperationType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AbstractCoordinateOperationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}IdentifiedObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}domainOfValidity" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}scope" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}operationVersion" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}coordinateOperationAccuracy" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}sourceCRS" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}targetCRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCoordinateOperationType", propOrder = {
    "domainOfValidity",
    "scope",
    "operationVersion",
    "coordinateOperationAccuracy",
    "sourceCRS",
    "targetCRS"
})
@XmlSeeAlso({
    PassThroughOperationType.class,
    AbstractGeneralConversionType.class,
    ConcatenatedOperationType.class,
    AbstractGeneralTransformationType.class
})
public abstract class AbstractCoordinateOperationType
    extends IdentifiedObjectType
{

    protected DomainOfValidity domainOfValidity;
    @XmlElement(required = true)
    protected List<String> scope;
    protected String operationVersion;
    protected List<CoordinateOperationAccuracy> coordinateOperationAccuracy;
    protected CRSPropertyType sourceCRS;
    protected CRSPropertyType targetCRS;

    /**
     * ��ȡdomainOfValidity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DomainOfValidity }
     *     
     */
    public DomainOfValidity getDomainOfValidity() {
        return domainOfValidity;
    }

    /**
     * ����domainOfValidity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DomainOfValidity }
     *     
     */
    public void setDomainOfValidity(DomainOfValidity value) {
        this.domainOfValidity = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScope() {
        if (scope == null) {
            scope = new ArrayList<String>();
        }
        return this.scope;
    }

    /**
     * ��ȡoperationVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationVersion() {
        return operationVersion;
    }

    /**
     * ����operationVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationVersion(String value) {
        this.operationVersion = value;
    }

    /**
     * Gets the value of the coordinateOperationAccuracy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinateOperationAccuracy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinateOperationAccuracy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoordinateOperationAccuracy }
     * 
     * 
     */
    public List<CoordinateOperationAccuracy> getCoordinateOperationAccuracy() {
        if (coordinateOperationAccuracy == null) {
            coordinateOperationAccuracy = new ArrayList<CoordinateOperationAccuracy>();
        }
        return this.coordinateOperationAccuracy;
    }

    /**
     * ��ȡsourceCRS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CRSPropertyType }
     *     
     */
    public CRSPropertyType getSourceCRS() {
        return sourceCRS;
    }

    /**
     * ����sourceCRS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CRSPropertyType }
     *     
     */
    public void setSourceCRS(CRSPropertyType value) {
        this.sourceCRS = value;
    }

    /**
     * ��ȡtargetCRS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CRSPropertyType }
     *     
     */
    public CRSPropertyType getTargetCRS() {
        return targetCRS;
    }

    /**
     * ����targetCRS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CRSPropertyType }
     *     
     */
    public void setTargetCRS(CRSPropertyType value) {
        this.targetCRS = value;
    }

}
