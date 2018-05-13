//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbstractAIXMMessageBaseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMMessageBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMFeatureBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}sequenceNumber" minOccurs="0"/>
 *         &lt;element name="messageMetadata" type="{http://www.aixm.aero/schema/5.1.1}MessageMetadataPropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMMessageBaseType", namespace = "http://www.aixm.aero/schema/5.1.1", propOrder = {
    "sequenceNumber",
    "messageMetadata"
})
@XmlSeeAlso({
    AbstractAIXMMessageType.class
})
public abstract class AbstractAIXMMessageBaseType
    extends AbstractAIXMFeatureBaseType
{

    protected Long sequenceNumber;
    protected MessageMetadataPropertyType messageMetadata;

    /**
     * 获取sequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * 设置sequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSequenceNumber(Long value) {
        this.sequenceNumber = value;
    }

    /**
     * 获取messageMetadata属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageMetadataPropertyType }
     *     
     */
    public MessageMetadataPropertyType getMessageMetadata() {
        return messageMetadata;
    }

    /**
     * 设置messageMetadata属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageMetadataPropertyType }
     *     
     */
    public void setMessageMetadata(MessageMetadataPropertyType value) {
        this.messageMetadata = value;
    }

}
