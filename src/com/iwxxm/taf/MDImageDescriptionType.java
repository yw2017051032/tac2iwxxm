//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2018.04.04 ʱ�� 07:08:22 PM CST 
//


package com.iwxxm.taf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about an image's suitability for use
 * 
 * <p>MD_ImageDescription_Type complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MD_ImageDescription_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_CoverageDescription_Type">
 *       &lt;sequence>
 *         &lt;element name="illuminationElevationAngle" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="illuminationAzimuthAngle" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="imagingCondition" type="{http://www.isotc211.org/2005/gmd}MD_ImagingConditionCode_PropertyType" minOccurs="0"/>
 *         &lt;element name="imageQualityCode" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="cloudCoverPercentage" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="processingLevelCode" type="{http://www.isotc211.org/2005/gmd}MD_Identifier_PropertyType" minOccurs="0"/>
 *         &lt;element name="compressionGenerationQuantity" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         &lt;element name="triangulationIndicator" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="radiometricCalibrationDataAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="cameraCalibrationInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="filmDistortionInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *         &lt;element name="lensDistortionInformationAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ImageDescription_Type", namespace = "http://www.isotc211.org/2005/gmd", propOrder = {
    "illuminationElevationAngle",
    "illuminationAzimuthAngle",
    "imagingCondition",
    "imageQualityCode",
    "cloudCoverPercentage",
    "processingLevelCode",
    "compressionGenerationQuantity",
    "triangulationIndicator",
    "radiometricCalibrationDataAvailability",
    "cameraCalibrationInformationAvailability",
    "filmDistortionInformationAvailability",
    "lensDistortionInformationAvailability"
})
public class MDImageDescriptionType
    extends MDCoverageDescriptionType
{

    protected RealPropertyType illuminationElevationAngle;
    protected RealPropertyType illuminationAzimuthAngle;
    protected MDImagingConditionCodePropertyType imagingCondition;
    protected MDIdentifierPropertyType imageQualityCode;
    protected RealPropertyType cloudCoverPercentage;
    protected MDIdentifierPropertyType processingLevelCode;
    protected IntegerPropertyType compressionGenerationQuantity;
    protected BooleanPropertyType triangulationIndicator;
    protected BooleanPropertyType radiometricCalibrationDataAvailability;
    protected BooleanPropertyType cameraCalibrationInformationAvailability;
    protected BooleanPropertyType filmDistortionInformationAvailability;
    protected BooleanPropertyType lensDistortionInformationAvailability;

    /**
     * ��ȡilluminationElevationAngle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getIlluminationElevationAngle() {
        return illuminationElevationAngle;
    }

    /**
     * ����illuminationElevationAngle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setIlluminationElevationAngle(RealPropertyType value) {
        this.illuminationElevationAngle = value;
    }

    /**
     * ��ȡilluminationAzimuthAngle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getIlluminationAzimuthAngle() {
        return illuminationAzimuthAngle;
    }

    /**
     * ����illuminationAzimuthAngle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setIlluminationAzimuthAngle(RealPropertyType value) {
        this.illuminationAzimuthAngle = value;
    }

    /**
     * ��ȡimagingCondition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MDImagingConditionCodePropertyType }
     *     
     */
    public MDImagingConditionCodePropertyType getImagingCondition() {
        return imagingCondition;
    }

    /**
     * ����imagingCondition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MDImagingConditionCodePropertyType }
     *     
     */
    public void setImagingCondition(MDImagingConditionCodePropertyType value) {
        this.imagingCondition = value;
    }

    /**
     * ��ȡimageQualityCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getImageQualityCode() {
        return imageQualityCode;
    }

    /**
     * ����imageQualityCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setImageQualityCode(MDIdentifierPropertyType value) {
        this.imageQualityCode = value;
    }

    /**
     * ��ȡcloudCoverPercentage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getCloudCoverPercentage() {
        return cloudCoverPercentage;
    }

    /**
     * ����cloudCoverPercentage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setCloudCoverPercentage(RealPropertyType value) {
        this.cloudCoverPercentage = value;
    }

    /**
     * ��ȡprocessingLevelCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getProcessingLevelCode() {
        return processingLevelCode;
    }

    /**
     * ����processingLevelCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setProcessingLevelCode(MDIdentifierPropertyType value) {
        this.processingLevelCode = value;
    }

    /**
     * ��ȡcompressionGenerationQuantity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getCompressionGenerationQuantity() {
        return compressionGenerationQuantity;
    }

    /**
     * ����compressionGenerationQuantity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setCompressionGenerationQuantity(IntegerPropertyType value) {
        this.compressionGenerationQuantity = value;
    }

    /**
     * ��ȡtriangulationIndicator���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getTriangulationIndicator() {
        return triangulationIndicator;
    }

    /**
     * ����triangulationIndicator���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setTriangulationIndicator(BooleanPropertyType value) {
        this.triangulationIndicator = value;
    }

    /**
     * ��ȡradiometricCalibrationDataAvailability���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getRadiometricCalibrationDataAvailability() {
        return radiometricCalibrationDataAvailability;
    }

    /**
     * ����radiometricCalibrationDataAvailability���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setRadiometricCalibrationDataAvailability(BooleanPropertyType value) {
        this.radiometricCalibrationDataAvailability = value;
    }

    /**
     * ��ȡcameraCalibrationInformationAvailability���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getCameraCalibrationInformationAvailability() {
        return cameraCalibrationInformationAvailability;
    }

    /**
     * ����cameraCalibrationInformationAvailability���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setCameraCalibrationInformationAvailability(BooleanPropertyType value) {
        this.cameraCalibrationInformationAvailability = value;
    }

    /**
     * ��ȡfilmDistortionInformationAvailability���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getFilmDistortionInformationAvailability() {
        return filmDistortionInformationAvailability;
    }

    /**
     * ����filmDistortionInformationAvailability���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setFilmDistortionInformationAvailability(BooleanPropertyType value) {
        this.filmDistortionInformationAvailability = value;
    }

    /**
     * ��ȡlensDistortionInformationAvailability���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getLensDistortionInformationAvailability() {
        return lensDistortionInformationAvailability;
    }

    /**
     * ����lensDistortionInformationAvailability���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setLensDistortionInformationAvailability(BooleanPropertyType value) {
        this.lensDistortionInformationAvailability = value;
    }

}
