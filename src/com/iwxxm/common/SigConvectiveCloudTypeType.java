//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Genus of cloud of operational significance to aviation: significant convective clouds only.
 * 
 * - Cumulonimbus
 * - Towering cumulus
 * 
 * This CodeList is specifically defined for aviation purposes, as defined in WMO No. 49-2. A superset of definitions are defined in WMO No. 306 Vol I.2 FM 94 BUFR code-table 0 20 012 "Cloud type".
 * 
 * <p>SigConvectiveCloudTypeType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SigConvectiveCloudTypeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}ReferenceType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SigConvectiveCloudTypeType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
public class SigConvectiveCloudTypeType
    extends ReferenceType
{


}
