//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import com.iwxxm.common.DistanceWithNilReasonType;




@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CloudLayerType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "amount",
    "base",
    "cloudType",
    "extension"
})
public class CloudLayerType {

    @XmlElement(required = true, nillable = true)
    protected CloudAmountReportedAtAerodromeType amount;
    @XmlElement(required = true, nillable = true)
    protected com.iwxxm.metarSpeci.DistanceWithNilReasonType base;
    @XmlElementRef(name = "cloudType", namespace = "http://schemas.wmo.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SigConvectiveCloudTypeType> cloudType;
    protected List<Object> extension;

    /**
     * ��ȡamount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CloudAmountReportedAtAerodromeType }
     *     
     */
    public CloudAmountReportedAtAerodromeType getAmount() {
        return amount;
    }

    /**
     * ����amount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CloudAmountReportedAtAerodromeType }
     *     
     */
    public void setAmount(CloudAmountReportedAtAerodromeType value) {
        this.amount = value;
    }
    
    /**
     * ��ȡbase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public com.iwxxm.metarSpeci.DistanceWithNilReasonType getBase() {
        return base;
    }

    /**
     * ����base���Ե�ֵ��
     * 
     * @param distanceWithNilReason
     *     allowed object is
     *     {@link DistanceWithNilReasonType }
     *     
     */
    public void setBase(com.iwxxm.metarSpeci.DistanceWithNilReasonType distanceWithNilReason) {
        this.base = distanceWithNilReason;
    }

    /**
     * ��ȡcloudType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SigConvectiveCloudTypeType }{@code >}
     *     
     */
    public JAXBElement<SigConvectiveCloudTypeType> getCloudType() {
        return cloudType;
    }

    /**
     * ����cloudType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SigConvectiveCloudTypeType }{@code >}
     *     
     */
    public void setCloudType(JAXBElement<SigConvectiveCloudTypeType> value) {
        this.cloudType = value;
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
