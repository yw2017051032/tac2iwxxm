//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 10:18:30 PM CST 
//


package com.iwxxm.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CurveInterpolationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CurveInterpolationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="linear"/>
 *     &lt;enumeration value="geodesic"/>
 *     &lt;enumeration value="circularArc3Points"/>
 *     &lt;enumeration value="circularArc2PointWithBulge"/>
 *     &lt;enumeration value="circularArcCenterPointWithRadius"/>
 *     &lt;enumeration value="elliptical"/>
 *     &lt;enumeration value="clothoid"/>
 *     &lt;enumeration value="conic"/>
 *     &lt;enumeration value="polynomialSpline"/>
 *     &lt;enumeration value="cubicSpline"/>
 *     &lt;enumeration value="rationalSpline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurveInterpolationType")
@XmlEnum
public enum CurveInterpolationType {

    @XmlEnumValue("linear")
    LINEAR("linear"),
    @XmlEnumValue("geodesic")
    GEODESIC("geodesic"),
    @XmlEnumValue("circularArc3Points")
    CIRCULAR_ARC_3_POINTS("circularArc3Points"),
    @XmlEnumValue("circularArc2PointWithBulge")
    CIRCULAR_ARC_2_POINT_WITH_BULGE("circularArc2PointWithBulge"),
    @XmlEnumValue("circularArcCenterPointWithRadius")
    CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS("circularArcCenterPointWithRadius"),
    @XmlEnumValue("elliptical")
    ELLIPTICAL("elliptical"),
    @XmlEnumValue("clothoid")
    CLOTHOID("clothoid"),
    @XmlEnumValue("conic")
    CONIC("conic"),
    @XmlEnumValue("polynomialSpline")
    POLYNOMIAL_SPLINE("polynomialSpline"),
    @XmlEnumValue("cubicSpline")
    CUBIC_SPLINE("cubicSpline"),
    @XmlEnumValue("rationalSpline")
    RATIONAL_SPLINE("rationalSpline");
    private final String value;

    CurveInterpolationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurveInterpolationType fromValue(String v) {
        for (CurveInterpolationType c: CurveInterpolationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
