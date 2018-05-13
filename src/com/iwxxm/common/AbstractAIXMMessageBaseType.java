//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbstractAIXMMessageBaseType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsequenceNumber���Ե�ֵ��
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
     * ����sequenceNumber���Ե�ֵ��
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
     * ��ȡmessageMetadata���Ե�ֵ��
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
     * ����messageMetadata���Ե�ֵ��
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
