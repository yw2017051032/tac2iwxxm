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
 * <p>MD_TopicCategoryCode_Type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="MD_TopicCategoryCode_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="farming"/>
 *     &lt;enumeration value="biota"/>
 *     &lt;enumeration value="boundaries"/>
 *     &lt;enumeration value="climatologyMeteorologyAtmosphere"/>
 *     &lt;enumeration value="economy"/>
 *     &lt;enumeration value="elevation"/>
 *     &lt;enumeration value="environment"/>
 *     &lt;enumeration value="geoscientificInformation"/>
 *     &lt;enumeration value="health"/>
 *     &lt;enumeration value="imageryBaseMapsEarthCover"/>
 *     &lt;enumeration value="intelligenceMilitary"/>
 *     &lt;enumeration value="inlandWaters"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="oceans"/>
 *     &lt;enumeration value="planningCadastre"/>
 *     &lt;enumeration value="society"/>
 *     &lt;enumeration value="structure"/>
 *     &lt;enumeration value="transportation"/>
 *     &lt;enumeration value="utilitiesCommunication"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MD_TopicCategoryCode_Type", namespace = "http://www.isotc211.org/2005/gmd")
@XmlEnum
public enum MDTopicCategoryCodeType {

    @XmlEnumValue("farming")
    FARMING("farming"),
    @XmlEnumValue("biota")
    BIOTA("biota"),
    @XmlEnumValue("boundaries")
    BOUNDARIES("boundaries"),
    @XmlEnumValue("climatologyMeteorologyAtmosphere")
    CLIMATOLOGY_METEOROLOGY_ATMOSPHERE("climatologyMeteorologyAtmosphere"),
    @XmlEnumValue("economy")
    ECONOMY("economy"),
    @XmlEnumValue("elevation")
    ELEVATION("elevation"),
    @XmlEnumValue("environment")
    ENVIRONMENT("environment"),
    @XmlEnumValue("geoscientificInformation")
    GEOSCIENTIFIC_INFORMATION("geoscientificInformation"),
    @XmlEnumValue("health")
    HEALTH("health"),
    @XmlEnumValue("imageryBaseMapsEarthCover")
    IMAGERY_BASE_MAPS_EARTH_COVER("imageryBaseMapsEarthCover"),
    @XmlEnumValue("intelligenceMilitary")
    INTELLIGENCE_MILITARY("intelligenceMilitary"),
    @XmlEnumValue("inlandWaters")
    INLAND_WATERS("inlandWaters"),
    @XmlEnumValue("location")
    LOCATION("location"),
    @XmlEnumValue("oceans")
    OCEANS("oceans"),
    @XmlEnumValue("planningCadastre")
    PLANNING_CADASTRE("planningCadastre"),
    @XmlEnumValue("society")
    SOCIETY("society"),
    @XmlEnumValue("structure")
    STRUCTURE("structure"),
    @XmlEnumValue("transportation")
    TRANSPORTATION("transportation"),
    @XmlEnumValue("utilitiesCommunication")
    UTILITIES_COMMUNICATION("utilitiesCommunication");
    private final String value;

    MDTopicCategoryCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MDTopicCategoryCodeType fromValue(String v) {
        for (MDTopicCategoryCodeType c: MDTopicCategoryCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
