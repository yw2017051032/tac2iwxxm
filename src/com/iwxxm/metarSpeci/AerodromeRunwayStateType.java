//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AerodromeRunwayStateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AerodromeRunwayStateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="runway" type="{http://schemas.wmo.int/iwxxm/2.1}RunwayDirectionPropertyType" minOccurs="0"/>
 *         &lt;element name="depositType" type="{http://schemas.wmo.int/iwxxm/2.1}RunwayDepositsType" minOccurs="0"/>
 *         &lt;element name="contamination" type="{http://schemas.wmo.int/iwxxm/2.1}RunwayContaminationType" minOccurs="0"/>
 *         &lt;element name="depthOfDeposit" type="{http://schemas.wmo.int/iwxxm/2.1}DistanceWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="estimatedSurfaceFrictionOrBrakingAction" type="{http://schemas.wmo.int/iwxxm/2.1}RunwayFrictionCoefficientType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="allRunways" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="cleared" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="snowClosure" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AerodromeRunwayStateType", namespace = "http://schemas.wmo.int/iwxxm/2.1", propOrder = {
    "runway",
    "depositType",
    "contamination",
    "depthOfDeposit",
    "estimatedSurfaceFrictionOrBrakingAction",
    "extension"
})
public class AerodromeRunwayStateType {

    protected RunwayDirectionPropertyType1 runway;
    protected RunwayDepositsType depositType;
    protected RunwayContaminationType contamination;
    @XmlElementRef(name = "depthOfDeposit", namespace = "http://schemas.wmo.int/iwxxm/2.1", type = JAXBElement.class, required = false)
    protected JAXBElement<DistanceWithNilReasonType> depthOfDeposit;
    protected RunwayFrictionCoefficientType estimatedSurfaceFrictionOrBrakingAction;
    protected List<Object> extension;
    @XmlAttribute(name = "allRunways")
    protected java.lang.Boolean allRunways;
    @XmlAttribute(name = "cleared")
    protected java.lang.Boolean cleared;
    @XmlAttribute(name = "snowClosure")
    protected java.lang.Boolean snowClosure;

    /**
     * 获取runway属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RunwayDirectionPropertyType1 }
     *     
     */
    public RunwayDirectionPropertyType1 getRunway() {
        return runway;
    }

    /**
     * 设置runway属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDirectionPropertyType1 }
     *     
     */
    public void setRunway(RunwayDirectionPropertyType1 value) {
        this.runway = value;
    }

    /**
     * 获取depositType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RunwayDepositsType }
     *     
     */
    public RunwayDepositsType getDepositType() {
        return depositType;
    }

    /**
     * 设置depositType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDepositsType }
     *     
     */
    public void setDepositType(RunwayDepositsType value) {
        this.depositType = value;
    }

    /**
     * 获取contamination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RunwayContaminationType }
     *     
     */
    public RunwayContaminationType getContamination() {
        return contamination;
    }

    /**
     * 设置contamination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayContaminationType }
     *     
     */
    public void setContamination(RunwayContaminationType value) {
        this.contamination = value;
    }

    /**
     * 获取depthOfDeposit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DistanceWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<DistanceWithNilReasonType> getDepthOfDeposit() {
        return depthOfDeposit;
    }

    /**
     * 设置depthOfDeposit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DistanceWithNilReasonType }{@code >}
     *     
     */
    public void setDepthOfDeposit(JAXBElement<DistanceWithNilReasonType> value) {
        this.depthOfDeposit = value;
    }

    /**
     * 获取estimatedSurfaceFrictionOrBrakingAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RunwayFrictionCoefficientType }
     *     
     */
    public RunwayFrictionCoefficientType getEstimatedSurfaceFrictionOrBrakingAction() {
        return estimatedSurfaceFrictionOrBrakingAction;
    }

    /**
     * 设置estimatedSurfaceFrictionOrBrakingAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayFrictionCoefficientType }
     *     
     */
    public void setEstimatedSurfaceFrictionOrBrakingAction(RunwayFrictionCoefficientType value) {
        this.estimatedSurfaceFrictionOrBrakingAction = value;
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

    /**
     * 获取allRunways属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isAllRunways() {
        return allRunways;
    }

    /**
     * 设置allRunways属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setAllRunways(java.lang.Boolean value) {
        this.allRunways = value;
    }

    /**
     * 获取cleared属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isCleared() {
        return cleared;
    }

    /**
     * 设置cleared属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setCleared(java.lang.Boolean value) {
        this.cleared = value;
    }

    /**
     * 获取snowClosure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public java.lang.Boolean isSnowClosure() {
        return snowClosure;
    }

    /**
     * 设置snowClosure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setSnowClosure(java.lang.Boolean value) {
        this.snowClosure = value;
    }

}
