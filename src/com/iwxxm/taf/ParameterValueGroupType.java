//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ParameterValueGroupType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ParameterValueGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGeneralParameterValueType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}parameterValue" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}group"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterValueGroupType", propOrder = {
    "parameterValue",
    "group"
})
public class ParameterValueGroupType
    extends AbstractGeneralParameterValueType
{

    @XmlElementRef(name = "parameterValue", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected List<JAXBElement<AbstractGeneralParameterValuePropertyType>> parameterValue;
    @XmlElementRef(name = "group", namespace = "http://www.opengis.net/gml/3.2", type = JAXBElement.class)
    protected JAXBElement<OperationParameterGroupPropertyType> group;

    /**
     * Gets the value of the parameterValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AbstractGeneralParameterValuePropertyType>> getParameterValue() {
        if (parameterValue == null) {
            parameterValue = new ArrayList<JAXBElement<AbstractGeneralParameterValuePropertyType>>();
        }
        return this.parameterValue;
    }

    /**
     * ��ȡgroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     
     */
    public JAXBElement<OperationParameterGroupPropertyType> getGroup() {
        return group;
    }

    /**
     * ����group���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}
     *     
     */
    public void setGroup(JAXBElement<OperationParameterGroupPropertyType> value) {
        this.group = value;
    }

}