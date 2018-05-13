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
 * Information describing metadata extensions.
 * 
 * <p>MD_MetadataExtensionInformation_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MD_MetadataExtensionInformation_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="extensionOnLineResource" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" minOccurs="0"/>
 *         &lt;element name="extendedElementInformation" type="{http://www.isotc211.org/2005/gmd}MD_ExtendedElementInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_MetadataExtensionInformation_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "extensionOnLineResource",
    "extendedElementInformation"
})
public class MDMetadataExtensionInformationType
    extends AbstractObjectType
{

    protected CIOnlineResourcePropertyType extensionOnLineResource;
    protected List<MDExtendedElementInformationPropertyType> extendedElementInformation;

    /**
     * ��ȡextensionOnLineResource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public CIOnlineResourcePropertyType getExtensionOnLineResource() {
        return extensionOnLineResource;
    }

    /**
     * ����extensionOnLineResource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CIOnlineResourcePropertyType }
     *     
     */
    public void setExtensionOnLineResource(CIOnlineResourcePropertyType value) {
        this.extensionOnLineResource = value;
    }

    /**
     * Gets the value of the extendedElementInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedElementInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedElementInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDExtendedElementInformationPropertyType }
     * 
     * 
     */
    public List<MDExtendedElementInformationPropertyType> getExtendedElementInformation() {
        if (extendedElementInformation == null) {
            extendedElementInformation = new ArrayList<MDExtendedElementInformationPropertyType>();
        }
        return this.extendedElementInformation;
    }

}
