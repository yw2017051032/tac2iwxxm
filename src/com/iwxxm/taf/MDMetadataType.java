//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the metadata
 * 
 * <p>MD_Metadata_Type complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MD_Metadata_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type">
 *       &lt;sequence>
 *         &lt;element name="fileIdentifier" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="characterSet" type="{http://www.isotc211.org/2005/gmd}MD_CharacterSetCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="parentIdentifier" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="hierarchyLevel" type="{http://www.isotc211.org/2005/gmd}MD_ScopeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hierarchyLevelName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="dateStamp" type="{http://www.isotc211.org/2005/gco}Date_PropertyType"/>
 *         &lt;element name="metadataStandardName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="metadataStandardVersion" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="dataSetURI" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.isotc211.org/2005/gmd}PT_Locale_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="spatialRepresentationInfo" type="{http://www.isotc211.org/2005/gmd}MD_SpatialRepresentation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referenceSystemInfo" type="{http://www.isotc211.org/2005/gmd}MD_ReferenceSystem_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metadataExtensionInfo" type="{http://www.isotc211.org/2005/gmd}MD_MetadataExtensionInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identificationInfo" type="{http://www.isotc211.org/2005/gmd}MD_Identification_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="contentInfo" type="{http://www.isotc211.org/2005/gmd}MD_ContentInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distributionInfo" type="{http://www.isotc211.org/2005/gmd}MD_Distribution_PropertyType" minOccurs="0"/>
 *         &lt;element name="dataQualityInfo" type="{http://www.isotc211.org/2005/gmd}DQ_DataQuality_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="portrayalCatalogueInfo" type="{http://www.isotc211.org/2005/gmd}MD_PortrayalCatalogueReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metadataConstraints" type="{http://www.isotc211.org/2005/gmd}MD_Constraints_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicationSchemaInfo" type="{http://www.isotc211.org/2005/gmd}MD_ApplicationSchemaInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metadataMaintenance" type="{http://www.isotc211.org/2005/gmd}MD_MaintenanceInformation_PropertyType" minOccurs="0"/>
 *         &lt;element name="series" type="{http://www.isotc211.org/2005/gmd}DS_Aggregate_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="describes" type="{http://www.isotc211.org/2005/gmd}DS_DataSet_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="propertyType" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="featureType" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="featureAttribute" type="{http://www.isotc211.org/2005/gco}ObjectReference_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Metadata_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "fileIdentifier",
    "language",
    "characterSet",
    "parentIdentifier",
    "hierarchyLevel",
    "hierarchyLevelName",
    "contact",
    "dateStamp",
    "metadataStandardName",
    "metadataStandardVersion",
    "dataSetURI",
    "locale",
    "spatialRepresentationInfo",
    "referenceSystemInfo",
    "metadataExtensionInfo",
    "identificationInfo",
    "contentInfo",
    "distributionInfo",
    "dataQualityInfo",
    "portrayalCatalogueInfo",
    "metadataConstraints",
    "applicationSchemaInfo",
    "metadataMaintenance",
    "series",
    "describes",
    "propertyType",
    "featureType",
    "featureAttribute"
})
public class MDMetadataType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType fileIdentifier;
    protected CharacterStringPropertyType language;
    protected MDCharacterSetCodePropertyType characterSet;
    protected CharacterStringPropertyType parentIdentifier;
    protected List<MDScopeCodePropertyType> hierarchyLevel;
    protected List<CharacterStringPropertyType> hierarchyLevelName;
    @XmlElement(required = true)
    protected List<CIResponsiblePartyPropertyType> contact;
    @XmlElement(required = true)
    protected DatePropertyType dateStamp;
    protected CharacterStringPropertyType metadataStandardName;
    protected CharacterStringPropertyType metadataStandardVersion;
    protected CharacterStringPropertyType dataSetURI;
    protected List<PTLocalePropertyType> locale;
    protected List<MDSpatialRepresentationPropertyType> spatialRepresentationInfo;
    protected List<MDReferenceSystemPropertyType> referenceSystemInfo;
    protected List<MDMetadataExtensionInformationPropertyType> metadataExtensionInfo;
    @XmlElement(required = true)
    protected List<MDIdentificationPropertyType> identificationInfo;
    protected List<MDContentInformationPropertyType> contentInfo;
    protected MDDistributionPropertyType distributionInfo;
    protected List<DQDataQualityPropertyType> dataQualityInfo;
    protected List<MDPortrayalCatalogueReferencePropertyType> portrayalCatalogueInfo;
    protected List<MDConstraintsPropertyType> metadataConstraints;
    protected List<MDApplicationSchemaInformationPropertyType> applicationSchemaInfo;
    protected MDMaintenanceInformationPropertyType metadataMaintenance;
    protected List<DSAggregatePropertyType> series;
    protected List<DSDataSetPropertyType> describes;
    protected List<ObjectReferencePropertyType> propertyType;
    protected List<ObjectReferencePropertyType> featureType;
    protected List<ObjectReferencePropertyType> featureAttribute;

    /**
     * 获取fileIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileIdentifier() {
        return fileIdentifier;
    }

    /**
     * 设置fileIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileIdentifier(CharacterStringPropertyType value) {
        this.fileIdentifier = value;
    }

    /**
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setLanguage(CharacterStringPropertyType value) {
        this.language = value;
    }

    /**
     * 获取characterSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public MDCharacterSetCodePropertyType getCharacterSet() {
        return characterSet;
    }

    /**
     * 设置characterSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MDCharacterSetCodePropertyType }
     *     
     */
    public void setCharacterSet(MDCharacterSetCodePropertyType value) {
        this.characterSet = value;
    }

    /**
     * 获取parentIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getParentIdentifier() {
        return parentIdentifier;
    }

    /**
     * 设置parentIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setParentIdentifier(CharacterStringPropertyType value) {
        this.parentIdentifier = value;
    }

    /**
     * Gets the value of the hierarchyLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDScopeCodePropertyType }
     * 
     * 
     */
    public List<MDScopeCodePropertyType> getHierarchyLevel() {
        if (hierarchyLevel == null) {
            hierarchyLevel = new ArrayList<MDScopeCodePropertyType>();
        }
        return this.hierarchyLevel;
    }

    /**
     * Gets the value of the hierarchyLevelName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hierarchyLevelName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHierarchyLevelName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getHierarchyLevelName() {
        if (hierarchyLevelName == null) {
            hierarchyLevelName = new ArrayList<CharacterStringPropertyType>();
        }
        return this.hierarchyLevelName;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getContact() {
        if (contact == null) {
            contact = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.contact;
    }

    /**
     * 获取dateStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DatePropertyType }
     *     
     */
    public DatePropertyType getDateStamp() {
        return dateStamp;
    }

    /**
     * 设置dateStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DatePropertyType }
     *     
     */
    public void setDateStamp(DatePropertyType value) {
        this.dateStamp = value;
    }

    /**
     * 获取metadataStandardName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMetadataStandardName() {
        return metadataStandardName;
    }

    /**
     * 设置metadataStandardName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMetadataStandardName(CharacterStringPropertyType value) {
        this.metadataStandardName = value;
    }

    /**
     * 获取metadataStandardVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getMetadataStandardVersion() {
        return metadataStandardVersion;
    }

    /**
     * 设置metadataStandardVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setMetadataStandardVersion(CharacterStringPropertyType value) {
        this.metadataStandardVersion = value;
    }

    /**
     * 获取dataSetURI属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDataSetURI() {
        return dataSetURI;
    }

    /**
     * 设置dataSetURI属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDataSetURI(CharacterStringPropertyType value) {
        this.dataSetURI = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTLocalePropertyType }
     * 
     * 
     */
    public List<PTLocalePropertyType> getLocale() {
        if (locale == null) {
            locale = new ArrayList<PTLocalePropertyType>();
        }
        return this.locale;
    }

    /**
     * Gets the value of the spatialRepresentationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialRepresentationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialRepresentationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDSpatialRepresentationPropertyType }
     * 
     * 
     */
    public List<MDSpatialRepresentationPropertyType> getSpatialRepresentationInfo() {
        if (spatialRepresentationInfo == null) {
            spatialRepresentationInfo = new ArrayList<MDSpatialRepresentationPropertyType>();
        }
        return this.spatialRepresentationInfo;
    }

    /**
     * Gets the value of the referenceSystemInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceSystemInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceSystemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDReferenceSystemPropertyType }
     * 
     * 
     */
    public List<MDReferenceSystemPropertyType> getReferenceSystemInfo() {
        if (referenceSystemInfo == null) {
            referenceSystemInfo = new ArrayList<MDReferenceSystemPropertyType>();
        }
        return this.referenceSystemInfo;
    }

    /**
     * Gets the value of the metadataExtensionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataExtensionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataExtensionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDMetadataExtensionInformationPropertyType }
     * 
     * 
     */
    public List<MDMetadataExtensionInformationPropertyType> getMetadataExtensionInfo() {
        if (metadataExtensionInfo == null) {
            metadataExtensionInfo = new ArrayList<MDMetadataExtensionInformationPropertyType>();
        }
        return this.metadataExtensionInfo;
    }

    /**
     * Gets the value of the identificationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDIdentificationPropertyType }
     * 
     * 
     */
    public List<MDIdentificationPropertyType> getIdentificationInfo() {
        if (identificationInfo == null) {
            identificationInfo = new ArrayList<MDIdentificationPropertyType>();
        }
        return this.identificationInfo;
    }

    /**
     * Gets the value of the contentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDContentInformationPropertyType }
     * 
     * 
     */
    public List<MDContentInformationPropertyType> getContentInfo() {
        if (contentInfo == null) {
            contentInfo = new ArrayList<MDContentInformationPropertyType>();
        }
        return this.contentInfo;
    }

    /**
     * 获取distributionInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MDDistributionPropertyType }
     *     
     */
    public MDDistributionPropertyType getDistributionInfo() {
        return distributionInfo;
    }

    /**
     * 设置distributionInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MDDistributionPropertyType }
     *     
     */
    public void setDistributionInfo(MDDistributionPropertyType value) {
        this.distributionInfo = value;
    }

    /**
     * Gets the value of the dataQualityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataQualityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataQualityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQDataQualityPropertyType }
     * 
     * 
     */
    public List<DQDataQualityPropertyType> getDataQualityInfo() {
        if (dataQualityInfo == null) {
            dataQualityInfo = new ArrayList<DQDataQualityPropertyType>();
        }
        return this.dataQualityInfo;
    }

    /**
     * Gets the value of the portrayalCatalogueInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portrayalCatalogueInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortrayalCatalogueInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDPortrayalCatalogueReferencePropertyType }
     * 
     * 
     */
    public List<MDPortrayalCatalogueReferencePropertyType> getPortrayalCatalogueInfo() {
        if (portrayalCatalogueInfo == null) {
            portrayalCatalogueInfo = new ArrayList<MDPortrayalCatalogueReferencePropertyType>();
        }
        return this.portrayalCatalogueInfo;
    }

    /**
     * Gets the value of the metadataConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDConstraintsPropertyType }
     * 
     * 
     */
    public List<MDConstraintsPropertyType> getMetadataConstraints() {
        if (metadataConstraints == null) {
            metadataConstraints = new ArrayList<MDConstraintsPropertyType>();
        }
        return this.metadataConstraints;
    }

    /**
     * Gets the value of the applicationSchemaInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationSchemaInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationSchemaInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDApplicationSchemaInformationPropertyType }
     * 
     * 
     */
    public List<MDApplicationSchemaInformationPropertyType> getApplicationSchemaInfo() {
        if (applicationSchemaInfo == null) {
            applicationSchemaInfo = new ArrayList<MDApplicationSchemaInformationPropertyType>();
        }
        return this.applicationSchemaInfo;
    }

    /**
     * 获取metadataMaintenance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MDMaintenanceInformationPropertyType }
     *     
     */
    public MDMaintenanceInformationPropertyType getMetadataMaintenance() {
        return metadataMaintenance;
    }

    /**
     * 设置metadataMaintenance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MDMaintenanceInformationPropertyType }
     *     
     */
    public void setMetadataMaintenance(MDMaintenanceInformationPropertyType value) {
        this.metadataMaintenance = value;
    }

    /**
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAggregatePropertyType }
     * 
     * 
     */
    public List<DSAggregatePropertyType> getSeries() {
        if (series == null) {
            series = new ArrayList<DSAggregatePropertyType>();
        }
        return this.series;
    }

    /**
     * Gets the value of the describes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the describes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescribes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSDataSetPropertyType }
     * 
     * 
     */
    public List<DSDataSetPropertyType> getDescribes() {
        if (describes == null) {
            describes = new ArrayList<DSDataSetPropertyType>();
        }
        return this.describes;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getPropertyType() {
        if (propertyType == null) {
            propertyType = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.propertyType;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureType() {
        if (featureType == null) {
            featureType = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.featureType;
    }

    /**
     * Gets the value of the featureAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectReferencePropertyType }
     * 
     * 
     */
    public List<ObjectReferencePropertyType> getFeatureAttribute() {
        if (featureAttribute == null) {
            featureAttribute = new ArrayList<ObjectReferencePropertyType>();
        }
        return this.featureAttribute;
    }

}
