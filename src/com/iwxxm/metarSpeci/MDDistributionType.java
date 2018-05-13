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
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the distributor of and options for obtaining the dataset
 * 
 * <p>MD_Distribution_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MD_Distribution_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="distributionFormat" type="{http://www.isotc211.org/2005/gmd}MD_Format_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distributor" type="{http://www.isotc211.org/2005/gmd}MD_Distributor_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transferOptions" type="{http://www.isotc211.org/2005/gmd}MD_DigitalTransferOptions_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Distribution_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "distributionFormat",
    "distributor",
    "transferOptions"
})
public class MDDistributionType
    extends AbstractObjectType
{

    protected List<MDFormatPropertyType> distributionFormat;
    protected List<MDDistributorPropertyType> distributor;
    protected List<MDDigitalTransferOptionsPropertyType> transferOptions;

    /**
     * Gets the value of the distributionFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDFormatPropertyType }
     * 
     * 
     */
    public List<MDFormatPropertyType> getDistributionFormat() {
        if (distributionFormat == null) {
            distributionFormat = new ArrayList<MDFormatPropertyType>();
        }
        return this.distributionFormat;
    }

    /**
     * Gets the value of the distributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDistributorPropertyType }
     * 
     * 
     */
    public List<MDDistributorPropertyType> getDistributor() {
        if (distributor == null) {
            distributor = new ArrayList<MDDistributorPropertyType>();
        }
        return this.distributor;
    }

    /**
     * Gets the value of the transferOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDDigitalTransferOptionsPropertyType }
     * 
     * 
     */
    public List<MDDigitalTransferOptionsPropertyType> getTransferOptions() {
        if (transferOptions == null) {
            transferOptions = new ArrayList<MDDigitalTransferOptionsPropertyType>();
        }
        return this.transferOptions;
    }

}
