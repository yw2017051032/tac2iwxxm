//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 10:18:30 PM CST 
//


package com.iwxxm.common;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AbstractGriddedSurfaceType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AbstractGriddedSurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractParametricCurveSurfaceType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opengis.net/gml/3.2}PointGrid"/>
 *       &lt;/sequence>
 *       &lt;attribute name="rows" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="columns" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGriddedSurfaceType", propOrder = {
    "rows1"
})
@XmlSeeAlso({
    SphereType.class,
    CylinderType.class,
    ConeType.class
})
public abstract class AbstractGriddedSurfaceType
    extends AbstractParametricCurveSurfaceType
{

    @XmlElement(name = "rows", required = true)
    protected AbstractGriddedSurfaceType.Rows rows1;
    @XmlAttribute(name = "rows")
    protected BigInteger rows2;
    @XmlAttribute(name = "columns")
    protected BigInteger columns;

    /**
     * ��ȡrows1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AbstractGriddedSurfaceType.Rows }
     *     
     */
    public AbstractGriddedSurfaceType.Rows getRows1() {
        return rows1;
    }

    /**
     * ����rows1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractGriddedSurfaceType.Rows }
     *     
     */
    public void setRows1(AbstractGriddedSurfaceType.Rows value) {
        this.rows1 = value;
    }

    /**
     * ��ȡrows2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRows2() {
        return rows2;
    }

    /**
     * ����rows2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRows2(BigInteger value) {
        this.rows2 = value;
    }

    /**
     * ��ȡcolumns���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumns() {
        return columns;
    }

    /**
     * ����columns���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumns(BigInteger value) {
        this.columns = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Row" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;group ref="{http://www.opengis.net/gml/3.2}geometricPositionListGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "row"
    })
    public static class Rows {

        @XmlElement(name = "Row", required = true)
        protected List<AbstractGriddedSurfaceType.Rows.Row> row;

        /**
         * Gets the value of the row property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the row property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AbstractGriddedSurfaceType.Rows.Row }
         * 
         * 
         */
        public List<AbstractGriddedSurfaceType.Rows.Row> getRow() {
            if (row == null) {
                row = new ArrayList<AbstractGriddedSurfaceType.Rows.Row>();
            }
            return this.row;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;group ref="{http://www.opengis.net/gml/3.2}geometricPositionListGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "posList",
            "geometricPositionGroup"
        })
        public static class Row {

            protected DirectPositionListType posList;
            @XmlElements({
                @XmlElement(name = "pos", type = DirectPositionType.class),
                @XmlElement(name = "pointProperty", type = PointPropertyType1 .class)
            })
            protected List<Object> geometricPositionGroup;

            /**
             * ��ȡposList���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link DirectPositionListType }
             *     
             */
            public DirectPositionListType getPosList() {
                return posList;
            }

            /**
             * ����posList���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link DirectPositionListType }
             *     
             */
            public void setPosList(DirectPositionListType value) {
                this.posList = value;
            }

            /**
             * Gets the value of the geometricPositionGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the geometricPositionGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGeometricPositionGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DirectPositionType }
             * {@link PointPropertyType1 }
             * 
             * 
             */
            public List<Object> getGeometricPositionGroup() {
                if (geometricPositionGroup == null) {
                    geometricPositionGroup = new ArrayList<Object>();
                }
                return this.geometricPositionGroup;
            }

        }

    }

}
