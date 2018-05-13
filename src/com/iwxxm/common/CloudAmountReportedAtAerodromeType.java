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
 * Amount of cloud - assessed by category:
 * 
 * - Sky clear (0 oktas)
 * - Few (1 - 2 oktas)
 * - Scattered (3 - 4 oktas)
 * - Broken (5 - 7 oktas)
 * - Overcast (8 oktas)
 * 
 * This CodeList is specifically defined for aviation purposes, as defined in WMO No. 49-2. A superset of cloud-amount categories are defined in WMO No. 306 Vol I.2 FM 94 BUFR code-table 0 20 008 "Cloud distribution for aviation".
 * 
 * <p>CloudAmountReportedAtAerodromeType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CloudAmountReportedAtAerodromeType">
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
@XmlType(name = "CloudAmountReportedAtAerodromeType", namespace = "http://schemas.wmo.int/iwxxm/2.1")
public class CloudAmountReportedAtAerodromeType
    extends ReferenceType
{


}
