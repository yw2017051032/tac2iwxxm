//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SequenceRuleEnumeration�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="SequenceRuleEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Linear"/>
 *     &lt;enumeration value="Boustrophedonic"/>
 *     &lt;enumeration value="Cantor-diagonal"/>
 *     &lt;enumeration value="Spiral"/>
 *     &lt;enumeration value="Morton"/>
 *     &lt;enumeration value="Hilbert"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SequenceRuleEnumeration")
@XmlEnum
public enum SequenceRuleEnumeration {

    @XmlEnumValue("Linear")
    LINEAR("Linear"),
    @XmlEnumValue("Boustrophedonic")
    BOUSTROPHEDONIC("Boustrophedonic"),
    @XmlEnumValue("Cantor-diagonal")
    CANTOR_DIAGONAL("Cantor-diagonal"),
    @XmlEnumValue("Spiral")
    SPIRAL("Spiral"),
    @XmlEnumValue("Morton")
    MORTON("Morton"),
    @XmlEnumValue("Hilbert")
    HILBERT("Hilbert");
    private final String value;

    SequenceRuleEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SequenceRuleEnumeration fromValue(String v) {
        for (SequenceRuleEnumeration c: SequenceRuleEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
