//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SurfaceInterpolationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="SurfaceInterpolationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="planar"/>
 *     &lt;enumeration value="spherical"/>
 *     &lt;enumeration value="elliptical"/>
 *     &lt;enumeration value="conic"/>
 *     &lt;enumeration value="tin"/>
 *     &lt;enumeration value="parametricCurve"/>
 *     &lt;enumeration value="polynomialSpline"/>
 *     &lt;enumeration value="rationalSpline"/>
 *     &lt;enumeration value="triangulatedSpline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurfaceInterpolationType")
@XmlEnum
public enum SurfaceInterpolationType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("planar")
    PLANAR("planar"),
    @XmlEnumValue("spherical")
    SPHERICAL("spherical"),
    @XmlEnumValue("elliptical")
    ELLIPTICAL("elliptical"),
    @XmlEnumValue("conic")
    CONIC("conic"),
    @XmlEnumValue("tin")
    TIN("tin"),
    @XmlEnumValue("parametricCurve")
    PARAMETRIC_CURVE("parametricCurve"),
    @XmlEnumValue("polynomialSpline")
    POLYNOMIAL_SPLINE("polynomialSpline"),
    @XmlEnumValue("rationalSpline")
    RATIONAL_SPLINE("rationalSpline"),
    @XmlEnumValue("triangulatedSpline")
    TRIANGULATED_SPLINE("triangulatedSpline");
    private final String value;

    SurfaceInterpolationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurfaceInterpolationType fromValue(String v) {
        for (SurfaceInterpolationType c: SurfaceInterpolationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
