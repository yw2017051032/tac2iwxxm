//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.04.04 时间 09:34:11 PM CST 
//


package com.iwxxm.metarSpeci;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.iwxxm.metarSpeci package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CountList_QNAME = new QName("http://www.opengis.net/gml/3.2", "CountList");
    private final static QName _AbstractAirspaceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractAirspaceExtension");
    private final static QName _SuperComplex_QNAME = new QName("http://www.opengis.net/gml/3.2", "superComplex");
    private final static QName _DerivationUnitTerm_QNAME = new QName("http://www.opengis.net/gml/3.2", "derivationUnitTerm");
    private final static QName _ProjectedCRSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "projectedCRSRef");
    private final static QName _BaseSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "baseSurface");
    private final static QName _CurveMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "curveMember");
    private final static QName _CIRoleCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_RoleCode");
    private final static QName _MDDistributor_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Distributor");
    private final static QName _Patches_QNAME = new QName("http://www.opengis.net/gml/3.2", "patches");
    private final static QName _verticalCS1_QNAME = new QName("http://www.opengis.net/gml/3.2", "verticalCS");
    private final static QName _TopoComplex_QNAME = new QName("http://www.opengis.net/gml/3.2", "TopoComplex");
    private final static QName _Using_QNAME = new QName("http://www.opengis.net/gml/3.2", "using");
    private final static QName _CISeries_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_Series");
    private final static QName _ImageCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "ImageCRS");
    private final static QName _ElevatedCurve_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "ElevatedCurve");
    private final static QName _Arc1_QNAME = new QName("http://www.opengis.net/gml/3.2", "Arc");
    private final static QName _OffsetCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "OffsetCurve");
    private final static QName _ValueProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "valueProperty");
    private final static QName _UsesTimeCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesTimeCS");
    private final static QName _OperationRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "operationRef");
    private final static QName _CITelephone_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_Telephone");
    private final static QName _DistanceWithNilReason_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "DistanceWithNilReason");
    private final static QName _ConversionToPreferredUnit_QNAME = new QName("http://www.opengis.net/gml/3.2", "conversionToPreferredUnit");
    private final static QName _ConcatenatedOperationRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "concatenatedOperationRef");
    private final static QName _Node_QNAME = new QName("http://www.opengis.net/gml/3.2", "Node");
    private final static QName _SubComplex_QNAME = new QName("http://www.opengis.net/gml/3.2", "subComplex");
    private final static QName _MDBand_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Band");
    private final static QName _QuantityType_QNAME = new QName("http://www.opengis.net/gml/3.2", "quantityType");
    private final static QName _UsesVerticalDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesVerticalDatum");
    private final static QName _MDVectorSpatialRepresentation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_VectorSpatialRepresentation");
    private final static QName _MDDimensionNameTypeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_DimensionNameTypeCode");
    private final static QName _DQEvaluationMethodTypeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_EvaluationMethodTypeCode");
    private final static QName _TargetElement_QNAME = new QName("http://www.opengis.net/gml/3.2", "targetElement");
    private final static QName _MDCharacterSetCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_CharacterSetCode");
    private final static QName _DQCompletenessOmission_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_CompletenessOmission");
    private final static QName _DomainSet_QNAME = new QName("http://www.opengis.net/gml/3.2", "domainSet");
    private final static QName _LocationReference_QNAME = new QName("http://www.opengis.net/gml/3.2", "locationReference");
    private final static QName _EXSpatialTemporalExtent_QNAME = new QName("http://www.isotc211.org/2005/gmd", "EX_SpatialTemporalExtent");
    private final static QName _DSSeries_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_Series");
    private final static QName _URL_QNAME = new QName("http://www.isotc211.org/2005/gmd", "URL");
    private final static QName _CharacterString_QNAME = new QName("http://www.isotc211.org/2005/gco", "CharacterString");
    private final static QName _RunwayDirection_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "RunwayDirection");
    private final static QName _MDReferenceSystem_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ReferenceSystem");
    private final static QName _MDFeatureCatalogueDescription_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_FeatureCatalogueDescription");
    private final static QName _IntegerValueList_QNAME = new QName("http://www.opengis.net/gml/3.2", "integerValueList");
    private final static QName _MultiplicityRange_QNAME = new QName("http://www.isotc211.org/2005/gco", "MultiplicityRange");
    private final static QName _Coordinates_QNAME = new QName("http://www.opengis.net/gml/3.2", "coordinates");
    private final static QName _DSInitiativeTypeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_InitiativeTypeCode");
    private final static QName _LocalName_QNAME = new QName("http://www.isotc211.org/2005/gco", "LocalName");
    private final static QName _GeodeticDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "GeodeticDatum");
    private final static QName _Date_QNAME = new QName("http://www.isotc211.org/2005/gco", "Date");
    private final static QName _AirspaceVolume_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AirspaceVolume");
    private final static QName _CountExtent_QNAME = new QName("http://www.opengis.net/gml/3.2", "CountExtent");
    private final static QName _MultiCenterLineOf_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiCenterLineOf");
    private final static QName _AbstractEXGeographicExtent_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractEX_GeographicExtent");
    private final static QName _MultiPointProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiPointProperty");
    private final static QName _DatumRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "datumRef");
    private final static QName _AbstractGeneralDerivedCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeneralDerivedCRS");
    private final static QName _UsesTemporalCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesTemporalCS");
    private final static QName _Report_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "Report");
    private final static QName _TopoCurveProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "topoCurveProperty");
    private final static QName _GridFunction_QNAME = new QName("http://www.opengis.net/gml/3.2", "GridFunction");
    private final static QName _EdgeOf_QNAME = new QName("http://www.opengis.net/gml/3.2", "edgeOf");
    private final static QName _MDMediumFormatCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_MediumFormatCode");
    private final static QName _ConcatenatedOperation_QNAME = new QName("http://www.opengis.net/gml/3.2", "ConcatenatedOperation");
    private final static QName _TemporalCRSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "temporalCRSRef");
    private final static QName _Ring_QNAME = new QName("http://www.opengis.net/gml/3.2", "Ring");
    private final static QName _Envelope_QNAME = new QName("http://www.opengis.net/gml/3.2", "Envelope");
    private final static QName _DefinitionCollection_QNAME = new QName("http://www.opengis.net/gml/3.2", "DefinitionCollection");
    private final static QName _Solid_QNAME = new QName("http://www.opengis.net/gml/3.2", "Solid");
    private final static QName _RealizationEpoch_QNAME = new QName("http://www.opengis.net/gml/3.2", "realizationEpoch");
    private final static QName _DictionaryEntry_QNAME = new QName("http://www.opengis.net/gml/3.2", "dictionaryEntry");
    private final static QName _TimeEdge_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeEdge");
    private final static QName _MDGridSpatialRepresentation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_GridSpatialRepresentation");
    private final static QName _DSAssociationTypeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_AssociationTypeCode");
    private final static QName _OperationParameterRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "operationParameterRef");
    private final static QName _MultiSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiSurface");
    private final static QName _UsesSingleOperation_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesSingleOperation");
    private final static QName _MDApplicationSchemaInformation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ApplicationSchemaInformation");
    private final static QName _MDPortrayalCatalogueReference_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_PortrayalCatalogueReference");
    private final static QName _Face_QNAME = new QName("http://www.opengis.net/gml/3.2", "Face");
    private final static QName _MDGeometricObjectTypeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_GeometricObjectTypeCode");
    private final static QName _MDMaintenanceFrequencyCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_MaintenanceFrequencyCode");
    private final static QName _MDKeywordTypeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_KeywordTypeCode");
    private final static QName _sphericalCS1_QNAME = new QName("http://www.opengis.net/gml/3.2", "sphericalCS");
    private final static QName _Vector_QNAME = new QName("http://www.opengis.net/gml/3.2", "vector");
    private final static QName _Pos_QNAME = new QName("http://www.opengis.net/gml/3.2", "pos");
    private final static QName _MultiPointCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiPointCoverage");
    private final static QName _DefinitionRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "definitionRef");
    private final static QName _AbstractParametricCurveSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractParametricCurveSurface");
    private final static QName _TimeCalendarEra_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeCalendarEra");
    private final static QName _UsesGeodeticDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesGeodeticDatum");
    private final static QName _SphericalCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "SphericalCS");
    private final static QName _BaseCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "baseCurve");
    private final static QName _VerticalDatumRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "verticalDatumRef");
    private final static QName _verticalDatum1_QNAME = new QName("http://www.opengis.net/gml/3.2", "verticalDatum");
    private final static QName _AbstractDQLogicalConsistency_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_LogicalConsistency");
    private final static QName _DSOtherAggregate_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_OtherAggregate");
    private final static QName _MDStandardOrderProcess_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_StandardOrderProcess");
    private final static QName _OperationParameter1_QNAME = new QName("http://www.opengis.net/gml/3.2", "OperationParameter");
    private final static QName _AirportHeliportTimeSlice_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AirportHeliportTimeSlice");
    private final static QName _AbstractGeneralConversion_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeneralConversion");
    private final static QName _AngleWithNilReason_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AngleWithNilReason");
    private final static QName _AbstractCurveSegment_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegment");
    private final static QName _EnvelopeWithTimePeriod_QNAME = new QName("http://www.opengis.net/gml/3.2", "EnvelopeWithTimePeriod");
    private final static QName _ArcStringByBulge_QNAME = new QName("http://www.opengis.net/gml/3.2", "ArcStringByBulge");
    private final static QName _Observation_QNAME = new QName("http://www.opengis.net/gml/3.2", "Observation");
    private final static QName _Name_QNAME = new QName("http://www.opengis.net/gml/3.2", "name");
    private final static QName _OMObservation_QNAME = new QName("http://www.opengis.net/om/2.0", "OM_Observation");
    private final static QName _MaximumOccurs_QNAME = new QName("http://www.opengis.net/gml/3.2", "maximumOccurs");
    private final static QName _TemporalDatum1_QNAME = new QName("http://www.opengis.net/gml/3.2", "TemporalDatum");
    private final static QName _Measure_QNAME = new QName("http://www.opengis.net/gml/3.2", "measure");
    private final static QName _MDImageDescription_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ImageDescription");
    private final static QName _MDTopologyLevelCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_TopologyLevelCode");
    private final static QName _ArcByBulge_QNAME = new QName("http://www.opengis.net/gml/3.2", "ArcByBulge");
    private final static QName _UsesOperation_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesOperation");
    private final static QName _MDDataIdentification_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_DataIdentification");
    private final static QName _LISource_QNAME = new QName("http://www.isotc211.org/2005/gmd", "LI_Source");
    private final static QName _TimeNode_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeNode");
    private final static QName _MultiPointDomain_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiPointDomain");
    private final static QName _MeteorologicalAerodromeObservationReport_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "MeteorologicalAerodromeObservationReport");
    private final static QName _RunwayTimeSlice_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "RunwayTimeSlice");
    private final static QName _UnitTimeSlice_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "UnitTimeSlice");
    private final static QName _Polygon_QNAME = new QName("http://www.opengis.net/gml/3.2", "Polygon");
    private final static QName _MDMedium_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Medium");
    private final static QName _UsesImageDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesImageDatum");
    private final static QName _AbstractExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractExtension");
    private final static QName _Boolean1_QNAME = new QName("http://www.isotc211.org/2005/gco", "Boolean");
    private final static QName _AbstractInlineProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "abstractInlineProperty");
    private final static QName _IntegerValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "integerValue");
    private final static QName _DerivedCRSType_QNAME = new QName("http://www.opengis.net/gml/3.2", "derivedCRSType");
    private final static QName _DerivedUnit_QNAME = new QName("http://www.opengis.net/gml/3.2", "DerivedUnit");
    private final static QName _UsesEllipsoid_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesEllipsoid");
    private final static QName _MDKeywords_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Keywords");
    private final static QName _AbstractSurfacePatch_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractSurfacePatch");
    private final static QName _AffinePlacement_QNAME = new QName("http://www.opengis.net/gml/3.2", "AffinePlacement");
    private final static QName _StringValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "stringValue");
    private final static QName _Target_QNAME = new QName("http://www.opengis.net/gml/3.2", "target");
    private final static QName _BaseGeographicCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "baseGeographicCRS");
    private final static QName _RangeParameters_QNAME = new QName("http://www.opengis.net/gml/3.2", "rangeParameters");
    private final static QName _TransformationRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "transformationRef");
    private final static QName _DQRelativeInternalPositionalAccuracy_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_RelativeInternalPositionalAccuracy");
    private final static QName _Runway_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "Runway");
    private final static QName _AbstractCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractCRS");
    private final static QName _AbstractElevatedCurveExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractElevatedCurveExtension");
    private final static QName _AbstractTimeSlice_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractTimeSlice");
    private final static QName _Ellipsoid1_QNAME = new QName("http://www.opengis.net/gml/3.2", "Ellipsoid");
    private final static QName _PTLocale_QNAME = new QName("http://www.isotc211.org/2005/gmd", "PT_Locale");
    private final static QName _Formula_QNAME = new QName("http://www.opengis.net/gml/3.2", "formula");
    private final static QName _TimeReferenceSystem_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeReferenceSystem");
    private final static QName _TriangulatedSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "TriangulatedSurface");
    private final static QName _AbstractSingleOperation_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractSingleOperation");
    private final static QName _Location_QNAME = new QName("http://www.opengis.net/gml/3.2", "location");
    private final static QName _LineString_QNAME = new QName("http://www.opengis.net/gml/3.2", "LineString");
    private final static QName _RangeSet_QNAME = new QName("http://www.opengis.net/gml/3.2", "rangeSet");
    private final static QName _PolygonPatch_QNAME = new QName("http://www.opengis.net/gml/3.2", "PolygonPatch");
    private final static QName _DecimalMinutes_QNAME = new QName("http://www.opengis.net/gml/3.2", "decimalMinutes");
    private final static QName _AerodromeSurfaceWind_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AerodromeSurfaceWind");
    private final static QName _Angle1_QNAME = new QName("http://www.isotc211.org/2005/gco", "Angle");
    private final static QName _UsesEllipsoidalCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesEllipsoidalCS");
    private final static QName _ObliqueCartesianCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "ObliqueCartesianCS");
    private final static QName _DataBlock_QNAME = new QName("http://www.opengis.net/gml/3.2", "DataBlock");
    private final static QName _Description_QNAME = new QName("http://www.opengis.net/gml/3.2", "description");
    private final static QName _CompositeSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "CompositeSurface");
    private final static QName _CoordinateSystemAxisRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "coordinateSystemAxisRef");
    private final static QName _GeneralConversionRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "generalConversionRef");
    private final static QName _MDDigitalTransferOptions_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_DigitalTransferOptions");
    private final static QName _BooleanList_QNAME = new QName("http://www.opengis.net/gml/3.2", "BooleanList");
    private final static QName _MetaDataProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "metaDataProperty");
    private final static QName _MDSpatialRepresentationTypeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_SpatialRepresentationTypeCode");
    private final static QName _RectifiedGridCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "RectifiedGridCoverage");
    private final static QName _TimeTopologyComplex_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeTopologyComplex");
    private final static QName _UnitDefinition_QNAME = new QName("http://www.opengis.net/gml/3.2", "UnitDefinition");
    private final static QName _ValueComponent_QNAME = new QName("http://www.opengis.net/gml/3.2", "valueComponent");
    private final static QName _TimeCalendar_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeCalendar");
    private final static QName _CIDateTypeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_DateTypeCode");
    private final static QName _GeneralTransformationRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "generalTransformationRef");
    private final static QName _EXExtent_QNAME = new QName("http://www.isotc211.org/2005/gmd", "EX_Extent");
    private final static QName _Shell_QNAME = new QName("http://www.opengis.net/gml/3.2", "Shell");
    private final static QName _MDObligationCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ObligationCode");
    private final static QName _DQThematicClassificationCorrectness_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_ThematicClassificationCorrectness");
    private final static QName _Curve1_QNAME = new QName("http://www.opengis.net/gml/3.2", "Curve");
    private final static QName _Definition_QNAME = new QName("http://www.opengis.net/gml/3.2", "Definition");
    private final static QName _PointRep_QNAME = new QName("http://www.opengis.net/gml/3.2", "pointRep");
    private final static QName _Method_QNAME = new QName("http://www.opengis.net/gml/3.2", "method");
    private final static QName _TimePeriod_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimePeriod");
    private final static QName _CIResponsibleParty_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_ResponsibleParty");
    private final static QName _Identifier_QNAME = new QName("http://www.opengis.net/gml/3.2", "identifier");
    private final static QName _CartesianCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "CartesianCS");
    private final static QName _RunwayDirectionTimeSlice_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "RunwayDirectionTimeSlice");
    private final static QName _TupleList_QNAME = new QName("http://www.opengis.net/gml/3.2", "tupleList");
    private final static QName _AbstractGeometricAggregate_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeometricAggregate");
    private final static QName _CurveMembers_QNAME = new QName("http://www.opengis.net/gml/3.2", "curveMembers");
    private final static QName _MemberName_QNAME = new QName("http://www.isotc211.org/2005/gco", "MemberName");
    private final static QName _Binary_QNAME = new QName("http://www.isotc211.org/2005/gco", "Binary");
    private final static QName _AbstractCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractCurve");
    private final static QName _AbstractDiscreteCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractDiscreteCoverage");
    private final static QName _TemporalDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "temporalDatum");
    private final static QName _Degrees_QNAME = new QName("http://www.opengis.net/gml/3.2", "degrees");
    private final static QName _MDDistribution_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Distribution");
    private final static QName _Triangle_QNAME = new QName("http://www.opengis.net/gml/3.2", "Triangle");
    private final static QName _Rectangle_QNAME = new QName("http://www.opengis.net/gml/3.2", "Rectangle");
    private final static QName _DQTemporalValidity_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_TemporalValidity");
    private final static QName _Count_QNAME = new QName("http://www.opengis.net/gml/3.2", "Count");
    private final static QName _ParameterValueGroup_QNAME = new QName("http://www.opengis.net/gml/3.2", "ParameterValueGroup");
    private final static QName _SolidArrayProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "solidArrayProperty");
    private final static QName _TypeName_QNAME = new QName("http://www.isotc211.org/2005/gco", "TypeName");
    private final static QName _GenericMetaData_QNAME = new QName("http://www.opengis.net/gml/3.2", "GenericMetaData");
    private final static QName _EXGeographicDescription_QNAME = new QName("http://www.isotc211.org/2005/gmd", "EX_GeographicDescription");
    private final static QName _Boolean_QNAME = new QName("http://www.opengis.net/gml/3.2", "Boolean");
    private final static QName _DQConformanceResult_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_ConformanceResult");
    private final static QName _UnlimitedInteger_QNAME = new QName("http://www.isotc211.org/2005/gco", "UnlimitedInteger");
    private final static QName _AbstractContinuousCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractContinuousCoverage");
    private final static QName _DSProductionSeries_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_ProductionSeries");
    private final static QName _UsesCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesCS");
    private final static QName _DefinitionMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "definitionMember");
    private final static QName _AxisDirection_QNAME = new QName("http://www.opengis.net/gml/3.2", "axisDirection");
    private final static QName _Seconds_QNAME = new QName("http://www.opengis.net/gml/3.2", "seconds");
    private final static QName _AerodromeWindShear_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AerodromeWindShear");
    private final static QName _DSAssociation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_Association");
    private final static QName _FeatureLifetime_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "featureLifetime");
    private final static QName _CrsRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "crsRef");
    private final static QName _Cone_QNAME = new QName("http://www.opengis.net/gml/3.2", "Cone");
    private final static QName _LocationName_QNAME = new QName("http://www.opengis.net/gml/3.2", "locationName");
    private final static QName _ConversionRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "conversionRef");
    private final static QName _AbstractGeneralOperationParameter_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeneralOperationParameter");
    private final static QName _StatusReference_QNAME = new QName("http://www.opengis.net/gml/3.2", "statusReference");
    private final static QName _MDFormat_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Format");
    private final static QName _EllipsoidRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "ellipsoidRef");
    private final static QName _AbstractDQTemporalAccuracy_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_TemporalAccuracy");
    private final static QName _ProjectedCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "ProjectedCRS");
    private final static QName _Integer_QNAME = new QName("http://www.isotc211.org/2005/gco", "Integer");
    private final static QName _CoordinateOperationRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "coordinateOperationRef");
    private final static QName _UsesMethod_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesMethod");
    private final static QName _PolarCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "PolarCS");
    private final static QName _PassThroughOperationRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "passThroughOperationRef");
    private final static QName _Grid_QNAME = new QName("http://www.opengis.net/gml/3.2", "Grid");
    private final static QName _CoordOperation_QNAME = new QName("http://www.opengis.net/gml/3.2", "coordOperation");
    private final static QName _SurfaceArrayProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "surfaceArrayProperty");
    private final static QName _MultiSurfaceProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiSurfaceProperty");
    private final static QName _GeographicCRSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "geographicCRSRef");
    private final static QName _GeocentricCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "GeocentricCRS");
    private final static QName _ellipsoidalCS1_QNAME = new QName("http://www.opengis.net/gml/3.2", "ellipsoidalCS");
    private final static QName _MDRangeDimension_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_RangeDimension");
    private final static QName _SphericalCSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "sphericalCSRef");
    private final static QName _LILineage_QNAME = new QName("http://www.isotc211.org/2005/gmd", "LI_Lineage");
    private final static QName _GmlProfileSchema_QNAME = new QName("http://www.opengis.net/gml/3.2", "gmlProfileSchema");
    private final static QName _UsesTemporalDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesTemporalDatum");
    private final static QName _PointMembers_QNAME = new QName("http://www.opengis.net/gml/3.2", "pointMembers");
    private final static QName _IncludesSingleCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "includesSingleCRS");
    private final static QName _Locator_QNAME = new QName("http://www.w3.org/1999/xlink", "locator");
    private final static QName _NamedValue_QNAME = new QName("http://www.opengis.net/om/2.0", "NamedValue");
    private final static QName _OrientableCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "OrientableCurve");
    private final static QName _Ellipsoid_QNAME = new QName("http://www.opengis.net/gml/3.2", "ellipsoid");
    private final static QName _MDAggregateInformation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_AggregateInformation");
    private final static QName _AbstractFeature_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractFeature");
    private final static QName _MultiCurveProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiCurveProperty");
    private final static QName _AbstractUnitExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractUnitExtension");
    private final static QName _ImageDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "imageDatum");
    private final static QName _History_QNAME = new QName("http://www.opengis.net/gml/3.2", "history");
    private final static QName _OperationParameterGroupRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "operationParameterGroupRef");
    private final static QName _Minutes_QNAME = new QName("http://www.opengis.net/gml/3.2", "minutes");
    private final static QName _CategoryExtent_QNAME = new QName("http://www.opengis.net/gml/3.2", "CategoryExtent");
    private final static QName _DataSource_QNAME = new QName("http://www.opengis.net/gml/3.2", "dataSource");
    private final static QName _MDLegalConstraints_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_LegalConstraints");
    private final static QName _AbstractGenericName_QNAME = new QName("http://www.isotc211.org/2005/gco", "AbstractGenericName");
    private final static QName _AbstractReference_QNAME = new QName("http://www.opengis.net/gml/3.2", "abstractReference");
    private final static QName _BooleanValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "booleanValue");
    private final static QName _PixelInCell_QNAME = new QName("http://www.opengis.net/gml/3.2", "pixelInCell");
    private final static QName _Result_QNAME = new QName("http://www.opengis.net/om/2.0", "result");
    private final static QName _ElevatedSurface_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "ElevatedSurface");
    private final static QName _AbstractDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractDatum");
    private final static QName _EngineeringDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "EngineeringDatum");
    private final static QName _DQConceptualConsistency_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_ConceptualConsistency");
    private final static QName _Axis_QNAME = new QName("http://www.opengis.net/gml/3.2", "axis");
    private final static QName _PrimeMeridianRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "primeMeridianRef");
    private final static QName _TopoPrimitiveMembers_QNAME = new QName("http://www.opengis.net/gml/3.2", "topoPrimitiveMembers");
    private final static QName _OrientableSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "OrientableSurface");
    private final static QName _UsesSphericalCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesSphericalCS");
    private final static QName _SurfaceMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "surfaceMember");
    private final static QName _MultiPoint_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiPoint");
    private final static QName _Transformation_QNAME = new QName("http://www.opengis.net/gml/3.2", "Transformation");
    private final static QName _Measure1_QNAME = new QName("http://www.isotc211.org/2005/gco", "Measure");
    private final static QName _Group_QNAME = new QName("http://www.opengis.net/gml/3.2", "group");
    private final static QName _AbstractMetaData_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractMetaData");
    private final static QName _CubicSpline_QNAME = new QName("http://www.opengis.net/gml/3.2", "CubicSpline");
    private final static QName _MultiCurveDomain_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiCurveDomain");
    private final static QName _DmsAngleValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "dmsAngleValue");
    private final static QName _PTLocaleContainer_QNAME = new QName("http://www.isotc211.org/2005/gmd", "PT_LocaleContainer");
    private final static QName _PolarCSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "polarCSRef");
    private final static QName _AbstractDSAggregate_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractDS_Aggregate");
    private final static QName _Quantity_QNAME = new QName("http://www.opengis.net/gml/3.2", "Quantity");
    private final static QName _Bag_QNAME = new QName("http://www.opengis.net/gml/3.2", "Bag");
    private final static QName _MDScopeDescription_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ScopeDescription");
    private final static QName _TimePosition_QNAME = new QName("http://www.opengis.net/gml/3.2", "timePosition");
    private final static QName _DmsAngle_QNAME = new QName("http://www.opengis.net/gml/3.2", "dmsAngle");
    private final static QName _PointProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "pointProperty");
    private final static QName _MultiGeometryProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiGeometryProperty");
    private final static QName _MultiSolidDomain_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiSolidDomain");
    private final static QName _UserDefinedCSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "userDefinedCSRef");
    private final static QName _MDGeometricObjects_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_GeometricObjects");
    private final static QName _MDImagingConditionCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ImagingConditionCode");
    private final static QName _AbstractAirspaceGeometryComponentExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractAirspaceGeometryComponentExtension");
    private final static QName _CIPresentationFormCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_PresentationFormCode");
    private final static QName _LocalisedCharacterString_QNAME = new QName("http://www.isotc211.org/2005/gmd", "LocalisedCharacterString");
    private final static QName _Curve_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "Curve");
    private final static QName _FeatureCollection_QNAME = new QName("http://www.opengis.net/gml/3.2", "FeatureCollection");
    private final static QName _ValueList_QNAME = new QName("http://www.opengis.net/gml/3.2", "valueList");
    private final static QName _cartesianCS1_QNAME = new QName("http://www.opengis.net/gml/3.2", "cartesianCS");
    private final static QName _FeatureMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "featureMember");
    private final static QName _PTFreeText_QNAME = new QName("http://www.isotc211.org/2005/gmd", "PT_FreeText");
    private final static QName _AbstractGeneralParameterValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeneralParameterValue");
    private final static QName _TMPeriodDuration_QNAME = new QName("http://www.isotc211.org/2005/gts", "TM_PeriodDuration");
    private final static QName _LanguageCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "LanguageCode");
    private final static QName _AbstractMDSpatialRepresentation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractMD_SpatialRepresentation");
    private final static QName _AbstractStrictAssociationRole_QNAME = new QName("http://www.opengis.net/gml/3.2", "abstractStrictAssociationRole");
    private final static QName _MDResolution_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Resolution");
    private final static QName _AbstractAIXMFeature_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractAIXMFeature");
    private final static QName _Category_QNAME = new QName("http://www.opengis.net/gml/3.2", "Category");
    private final static QName _Value_QNAME = new QName("http://www.opengis.net/gml/3.2", "value");
    private final static QName _Track_QNAME = new QName("http://www.opengis.net/gml/3.2", "track");
    private final static QName _Title_QNAME = new QName("http://www.w3.org/1999/xlink", "title");
    private final static QName _MDClassificationCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ClassificationCode");
    private final static QName _MultiCurveCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiCurveCoverage");
    private final static QName _AffineCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "AffineCS");
    private final static QName _IncludesValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "includesValue");
    private final static QName _CompositeCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "CompositeCurve");
    private final static QName _TopoComplexProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "topoComplexProperty");
    private final static QName _TopoSurfaceProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "topoSurfaceProperty");
    private final static QName _RangeMeaning_QNAME = new QName("http://www.opengis.net/gml/3.2", "rangeMeaning");
    private final static QName _Parameter_QNAME = new QName("http://www.opengis.net/gml/3.2", "parameter");
    private final static QName _DSSensor_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_Sensor");
    private final static QName _CurveProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "curveProperty");
    private final static QName _UsesObliqueCartesianCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesObliqueCartesianCS");
    private final static QName _ModifiedCoordinate_QNAME = new QName("http://www.opengis.net/gml/3.2", "modifiedCoordinate");
    private final static QName _METAR_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "METAR");
    private final static QName _ComponentReferenceSystem_QNAME = new QName("http://www.opengis.net/gml/3.2", "componentReferenceSystem");
    private final static QName _GeometryMembers_QNAME = new QName("http://www.opengis.net/gml/3.2", "geometryMembers");
    private final static QName _AbstractGeneralOperationParameterRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "abstractGeneralOperationParameterRef");
    private final static QName _CIOnLineFunctionCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_OnLineFunctionCode");
    private final static QName _DQGriddedDataPositionalAccuracy_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_GriddedDataPositionalAccuracy");
    private final static QName _GeometricComplex_QNAME = new QName("http://www.opengis.net/gml/3.2", "GeometricComplex");
    private final static QName _ParameterValue1_QNAME = new QName("http://www.opengis.net/gml/3.2", "ParameterValue");
    private final static QName _AbstractDQElement_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_Element");
    private final static QName _GeometryMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "geometryMember");
    private final static QName _CenterOf_QNAME = new QName("http://www.opengis.net/gml/3.2", "centerOf");
    private final static QName _TimeInstant_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeInstant");
    private final static QName _CartesianCSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "cartesianCSRef");
    private final static QName _MinimumOccurs_QNAME = new QName("http://www.opengis.net/gml/3.2", "minimumOccurs");
    private final static QName _AbstractTimeTopologyPrimitive_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractTimeTopologyPrimitive");
    private final static QName _MultiSolidCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiSolidCoverage");
    private final static QName _AbstractRunwayExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractRunwayExtension");
    private final static QName _AbstractGML_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGML");
    private final static QName _DQAbsoluteExternalPositionalAccuracy_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_AbsoluteExternalPositionalAccuracy");
    private final static QName _MDPixelOrientationCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_PixelOrientationCode");
    private final static QName _AerodromeHorizontalVisibility_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AerodromeHorizontalVisibility");
    private final static QName _ArcString_QNAME = new QName("http://www.opengis.net/gml/3.2", "ArcString");
    private final static QName _TopoVolumeProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "topoVolumeProperty");
    private final static QName _MDCellGeometryCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_CellGeometryCode");
    private final static QName _AbstractGeometricPrimitive_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive");
    private final static QName _CatalogSymbol_QNAME = new QName("http://www.opengis.net/gml/3.2", "catalogSymbol");
    private final static QName _TopoPoint_QNAME = new QName("http://www.opengis.net/gml/3.2", "TopoPoint");
    private final static QName _DerivedCRSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "derivedCRSRef");
    private final static QName _GridDomain_QNAME = new QName("http://www.opengis.net/gml/3.2", "gridDomain");
    private final static QName _Real_QNAME = new QName("http://www.isotc211.org/2005/gco", "Real");
    private final static QName _affineCS1_QNAME = new QName("http://www.opengis.net/gml/3.2", "affineCS");
    private final static QName _FeatureProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "featureProperty");
    private final static QName _TopoCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "TopoCurve");
    private final static QName _RectifiedGrid_QNAME = new QName("http://www.opengis.net/gml/3.2", "RectifiedGrid");
    private final static QName _CoverageFunction_QNAME = new QName("http://www.opengis.net/gml/3.2", "coverageFunction");
    private final static QName _timeCS1_QNAME = new QName("http://www.opengis.net/gml/3.2", "timeCS");
    private final static QName _Sphere_QNAME = new QName("http://www.opengis.net/gml/3.2", "Sphere");
    private final static QName _polarCS1_QNAME = new QName("http://www.opengis.net/gml/3.2", "polarCS");
    private final static QName _PolyhedralSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "PolyhedralSurface");
    private final static QName _UsesValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesValue");
    private final static QName _Scale_QNAME = new QName("http://www.isotc211.org/2005/gco", "Scale");
    private final static QName _SurfaceProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "surfaceProperty");
    private final static QName _userDefinedCS1_QNAME = new QName("http://www.opengis.net/gml/3.2", "userDefinedCS");
    private final static QName _Country_QNAME = new QName("http://www.isotc211.org/2005/gmd", "Country");
    private final static QName _DefinedByConversion_QNAME = new QName("http://www.opengis.net/gml/3.2", "definedByConversion");
    private final static QName _LocationString_QNAME = new QName("http://www.opengis.net/gml/3.2", "LocationString");
    private final static QName _LocationKeyWord_QNAME = new QName("http://www.opengis.net/gml/3.2", "LocationKeyWord");
    private final static QName _LinearRing_QNAME = new QName("http://www.opengis.net/gml/3.2", "LinearRing");
    private final static QName _AbstractCoordinateOperation_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateOperation");
    private final static QName _UsesPrimeMeridian_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesPrimeMeridian");
    private final static QName _AerodromeSurfaceWindForecast_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AerodromeSurfaceWindForecast");
    private final static QName _PointMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "pointMember");
    private final static QName _Tin_QNAME = new QName("http://www.opengis.net/gml/3.2", "Tin");
    private final static QName _TemporalDatumRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "temporalDatumRef");
    private final static QName _GeocentricCRSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "geocentricCRSRef");
    private final static QName _DirectedObservationAtDistance_QNAME = new QName("http://www.opengis.net/gml/3.2", "DirectedObservationAtDistance");
    private final static QName _ParameterValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "parameterValue");
    private final static QName _CorrectionNumber_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "correctionNumber");
    private final static QName _Surface1_QNAME = new QName("http://www.opengis.net/gml/3.2", "Surface");
    private final static QName _AbstractAirspaceVolumeExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractAirspaceVolumeExtension");
    private final static QName _Interior_QNAME = new QName("http://www.opengis.net/gml/3.2", "interior");
    private final static QName _OperationMethod_QNAME = new QName("http://www.opengis.net/gml/3.2", "OperationMethod");
    private final static QName _AbstractTimeObject_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractTimeObject");
    private final static QName _AerodromeSeaState_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AerodromeSeaState");
    private final static QName _AirportHeliport_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AirportHeliport");
    private final static QName _EllipsoidalCSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "ellipsoidalCSRef");
    private final static QName _ReferenceSystemRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "referenceSystemRef");
    private final static QName _ValuesOfGroup_QNAME = new QName("http://www.opengis.net/gml/3.2", "valuesOfGroup");
    private final static QName _MDBrowseGraphic_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_BrowseGraphic");
    private final static QName _AbstractDQCompleteness_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_Completeness");
    private final static QName _EngineeringCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "EngineeringCRS");
    private final static QName _AbstractCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractCoverage");
    private final static QName _ObservationContext_QNAME = new QName("http://www.opengis.net/om/2.0", "ObservationContext");
    private final static QName _AbstractSolid_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractSolid");
    private final static QName _Record_QNAME = new QName("http://www.isotc211.org/2005/gco", "Record");
    private final static QName _AbstractAIXMObject_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractAIXMObject");
    private final static QName _CloudLayer_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "CloudLayer");
    private final static QName _SemiMajorAxis_QNAME = new QName("http://www.opengis.net/gml/3.2", "semiMajorAxis");
    private final static QName _AbstractRunwayDirectionExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractRunwayDirectionExtension");
    private final static QName _RecordType_QNAME = new QName("http://www.isotc211.org/2005/gco", "RecordType");
    private final static QName _VerticalCSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "verticalCSRef");
    private final static QName _AbstractGeneralTransformation_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeneralTransformation");
    private final static QName _GeodeticCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "GeodeticCRS");
    private final static QName _DSDataSet_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_DataSet");
    private final static QName _BoundedBy_QNAME = new QName("http://www.opengis.net/gml/3.2", "boundedBy");
    private final static QName _AbstractMDContentInformation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractMD_ContentInformation");
    private final static QName _Circle_QNAME = new QName("http://www.opengis.net/gml/3.2", "Circle");
    private final static QName _DQQuantitativeAttributeAccuracy_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_QuantitativeAttributeAccuracy");
    private final static QName _MultiSurfaceDomain_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiSurfaceDomain");
    private final static QName _ImageDatum1_QNAME = new QName("http://www.opengis.net/gml/3.2", "ImageDatum");
    private final static QName _TopoVolume_QNAME = new QName("http://www.opengis.net/gml/3.2", "TopoVolume");
    private final static QName _MultiEdgeOf_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiEdgeOf");
    private final static QName _PolygonPatches_QNAME = new QName("http://www.opengis.net/gml/3.2", "polygonPatches");
    private final static QName _EngineeringCRSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "engineeringCRSRef");
    private final static QName _Resource_QNAME = new QName("http://www.w3.org/1999/xlink", "resource");
    private final static QName _GridCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "GridCoverage");
    private final static QName _MovingObjectStatus_QNAME = new QName("http://www.opengis.net/gml/3.2", "MovingObjectStatus");
    private final static QName _ObliqueCartesianCSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "obliqueCartesianCSRef");
    private final static QName _DQCompletenessCommission_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_CompletenessCommission");
    private final static QName _AbstractOperation_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractOperation");
    private final static QName _OperationVersion_QNAME = new QName("http://www.opengis.net/gml/3.2", "operationVersion");
    private final static QName _AxisAbbrev_QNAME = new QName("http://www.opengis.net/gml/3.2", "axisAbbrev");
    private final static QName _CompoundCRSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "compoundCRSRef");
    private final static QName _MDMetadataExtensionInformation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_MetadataExtensionInformation");
    private final static QName _MDRestrictionCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_RestrictionCode");
    private final static QName _AbstractTopology_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractTopology");
    private final static QName _LinearCSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "linearCSRef");
    private final static QName _DQAccuracyOfATimeMeasurement_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_AccuracyOfATimeMeasurement");
    private final static QName _linearCS1_QNAME = new QName("http://www.opengis.net/gml/3.2", "linearCS");
    private final static QName _DateTime_QNAME = new QName("http://www.isotc211.org/2005/gco", "DateTime");
    private final static QName _AbstractTimePrimitive_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractTimePrimitive");
    private final static QName _CoverageMappingRule_QNAME = new QName("http://www.opengis.net/gml/3.2", "CoverageMappingRule");
    private final static QName _AbstractCoordinateSystem_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractCoordinateSystem");
    private final static QName _Clothoid_QNAME = new QName("http://www.opengis.net/gml/3.2", "Clothoid");
    private final static QName _AbstractTopoPrimitive_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractTopoPrimitive");
    private final static QName _SourceDimensions_QNAME = new QName("http://www.opengis.net/gml/3.2", "sourceDimensions");
    private final static QName _AirspaceTimeSlice_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AirspaceTimeSlice");
    private final static QName _EllipsoidalCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "EllipsoidalCS");
    private final static QName _Distance_QNAME = new QName("http://www.isotc211.org/2005/gco", "Distance");
    private final static QName _MeteorologicalAerodromeTrendForecastRecord_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "MeteorologicalAerodromeTrendForecastRecord");
    private final static QName _AssociationName_QNAME = new QName("http://www.opengis.net/gml/3.2", "associationName");
    private final static QName _MultiCurve_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiCurve");
    private final static QName _VerticalCRSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "verticalCRSRef");
    private final static QName _Bezier_QNAME = new QName("http://www.opengis.net/gml/3.2", "Bezier");
    private final static QName _MDExtendedElementInformation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ExtendedElementInformation");
    private final static QName _EXTemporalExtent_QNAME = new QName("http://www.isotc211.org/2005/gmd", "EX_TemporalExtent");
    private final static QName _DSPlatform_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_Platform");
    private final static QName _AerodromeSurfaceWindTrendForecast_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AerodromeSurfaceWindTrendForecast");
    private final static QName _Surface_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "Surface");
    private final static QName _ReversePropertyName_QNAME = new QName("http://www.opengis.net/gml/3.2", "reversePropertyName");
    private final static QName _TopoPrimitiveMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "topoPrimitiveMember");
    private final static QName _UserDefinedCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "UserDefinedCS");
    private final static QName _Interpretation_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "interpretation");
    private final static QName _DerivedCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "DerivedCRS");
    private final static QName _FeatureMembers_QNAME = new QName("http://www.opengis.net/gml/3.2", "featureMembers");
    private final static QName _MDDistributionUnits_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_DistributionUnits");
    private final static QName _UsesParameter_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesParameter");
    private final static QName _RoughConversionToPreferredUnit_QNAME = new QName("http://www.opengis.net/gml/3.2", "roughConversionToPreferredUnit");
    private final static QName _AbstractElevatedSurfaceExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractElevatedSurfaceExtension");
    private final static QName _AerodromeObservedClouds_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AerodromeObservedClouds");
    private final static QName _MDIdentifier_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Identifier");
    private final static QName _GreenwichLongitude_QNAME = new QName("http://www.opengis.net/gml/3.2", "greenwichLongitude");
    private final static QName _LineStringSegment_QNAME = new QName("http://www.opengis.net/gml/3.2", "LineStringSegment");
    private final static QName _AbstractDQThematicAccuracy_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_ThematicAccuracy");
    private final static QName _MultiLocation_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiLocation");
    private final static QName _Cylinder_QNAME = new QName("http://www.opengis.net/gml/3.2", "Cylinder");
    private final static QName _TopoSolid_QNAME = new QName("http://www.opengis.net/gml/3.2", "TopoSolid");
    private final static QName _MultiCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiCoverage");
    private final static QName _AbstractObject_QNAME = new QName("http://www.isotc211.org/2005/gco", "AbstractObject");
    private final static QName _SingleCRSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "singleCRSRef");
    private final static QName _LinearCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "LinearCS");
    private final static QName _ValueOfParameter_QNAME = new QName("http://www.opengis.net/gml/3.2", "valueOfParameter");
    private final static QName _DoubleOrNilReasonTupleList_QNAME = new QName("http://www.opengis.net/gml/3.2", "doubleOrNilReasonTupleList");
    private final static QName _AnchorPoint_QNAME = new QName("http://www.opengis.net/gml/3.2", "anchorPoint");
    private final static QName _Origin_QNAME = new QName("http://www.opengis.net/gml/3.2", "origin");
    private final static QName _SolidMember_QNAME = new QName("http://www.opengis.net/gml/3.2", "solidMember");
    private final static QName _OperationParameter_QNAME = new QName("http://www.opengis.net/gml/3.2", "operationParameter");
    private final static QName _CircleByCenterPoint_QNAME = new QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint");
    private final static QName _conversion1_QNAME = new QName("http://www.opengis.net/gml/3.2", "conversion");
    private final static QName _MDServiceIdentification_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ServiceIdentification");
    private final static QName _DQScope_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_Scope");
    private final static QName _TimeInterval_QNAME = new QName("http://www.opengis.net/gml/3.2", "timeInterval");
    private final static QName _ValueFile_QNAME = new QName("http://www.opengis.net/gml/3.2", "valueFile");
    private final static QName _CoordinateSystem_QNAME = new QName("http://www.opengis.net/gml/3.2", "coordinateSystem");
    private final static QName _GeographicCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "GeographicCRS");
    private final static QName _TimeOrdinalReferenceSystem_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeOrdinalReferenceSystem");
    private final static QName _EXBoundingPolygon_QNAME = new QName("http://www.isotc211.org/2005/gmd", "EX_BoundingPolygon");
    private final static QName _Scope_QNAME = new QName("http://www.opengis.net/gml/3.2", "scope");
    private final static QName _Duration_QNAME = new QName("http://www.opengis.net/gml/3.2", "duration");
    private final static QName _DirectedTopoSolid_QNAME = new QName("http://www.opengis.net/gml/3.2", "directedTopoSolid");
    private final static QName _TemporalCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "TemporalCRS");
    private final static QName _AnchorDefinition_QNAME = new QName("http://www.opengis.net/gml/3.2", "anchorDefinition");
    private final static QName _SolidMembers_QNAME = new QName("http://www.opengis.net/gml/3.2", "solidMembers");
    private final static QName _CurveArrayProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "curveArrayProperty");
    private final static QName _EXGeographicBoundingBox_QNAME = new QName("http://www.isotc211.org/2005/gmd", "EX_GeographicBoundingBox");
    private final static QName _ResultOf_QNAME = new QName("http://www.opengis.net/gml/3.2", "resultOf");
    private final static QName _ImageDatumRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "imageDatumRef");
    private final static QName _CoordinateSystemRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "coordinateSystemRef");
    private final static QName _BaseUnit_QNAME = new QName("http://www.opengis.net/gml/3.2", "BaseUnit");
    private final static QName _TimeCoordinateSystem_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeCoordinateSystem");
    private final static QName _MultiSurfaceCoverage_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiSurfaceCoverage");
    private final static QName _IncludesParameter_QNAME = new QName("http://www.opengis.net/gml/3.2", "includesParameter");
    private final static QName _UnitOfMeasure_QNAME = new QName("http://www.opengis.net/gml/3.2", "unitOfMeasure");
    private final static QName _ImageCRSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "imageCRSRef");
    private final static QName _DirectedNode_QNAME = new QName("http://www.opengis.net/gml/3.2", "directedNode");
    private final static QName _CenterLineOf_QNAME = new QName("http://www.opengis.net/gml/3.2", "centerLineOf");
    private final static QName _MDConstraints_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Constraints");
    private final static QName _AbstractAirportHeliportExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractAirportHeliportExtension");
    private final static QName _LIProcessStep_QNAME = new QName("http://www.isotc211.org/2005/gmd", "LI_ProcessStep");
    private final static QName _Status_QNAME = new QName("http://www.opengis.net/gml/3.2", "status");
    private final static QName _MDMediumNameCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_MediumNameCode");
    private final static QName _ValidTime_QNAME = new QName("http://www.opengis.net/gml/3.2", "validTime");
    private final static QName _BaseGeodeticCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "baseGeodeticCRS");
    private final static QName _Point_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "Point");
    private final static QName _AbstractRing_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractRing");
    private final static QName _TimeClock_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeClock");
    private final static QName _DQTemporalConsistency_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_TemporalConsistency");
    private final static QName _GeodeticDatumRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "geodeticDatumRef");
    private final static QName _RectifiedGridDomain_QNAME = new QName("http://www.opengis.net/gml/3.2", "rectifiedGridDomain");
    private final static QName _CompoundCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "CompoundCRS");
    private final static QName _SurfaceMembers_QNAME = new QName("http://www.opengis.net/gml/3.2", "surfaceMembers");
    private final static QName _SourceCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "sourceCRS");
    private final static QName _CylindricalCSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "cylindricalCSRef");
    private final static QName _TrianglePatches_QNAME = new QName("http://www.opengis.net/gml/3.2", "trianglePatches");
    private final static QName _AbstractFeatureCollection_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractFeatureCollection");
    private final static QName _OperationMethodRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "operationMethodRef");
    private final static QName _DynamicMembers_QNAME = new QName("http://www.opengis.net/gml/3.2", "dynamicMembers");
    private final static QName _IndirectEntry_QNAME = new QName("http://www.opengis.net/gml/3.2", "indirectEntry");
    private final static QName _RSIdentifier_QNAME = new QName("http://www.isotc211.org/2005/gmd", "RS_Identifier");
    private final static QName _MDMetadata_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Metadata");
    private final static QName _MinimumValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "minimumValue");
    private final static QName _Airspace_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "Airspace");
    private final static QName _DirectedEdge_QNAME = new QName("http://www.opengis.net/gml/3.2", "directedEdge");
    private final static QName _AbstractRSReferenceSystem_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractRS_ReferenceSystem");
    private final static QName _UsesCartesianCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesCartesianCS");
    private final static QName _PrimeMeridian1_QNAME = new QName("http://www.opengis.net/gml/3.2", "PrimeMeridian");
    private final static QName _UsesAffineCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesAffineCS");
    private final static QName _AbstractTimeGeometricPrimitive_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractTimeGeometricPrimitive");
    private final static QName _MDMaintenanceInformation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_MaintenanceInformation");
    private final static QName _TemporalCSRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "temporalCSRef");
    private final static QName _ValueComponents_QNAME = new QName("http://www.opengis.net/gml/3.2", "valueComponents");
    private final static QName _MDUsage_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Usage");
    private final static QName _ValueArray_QNAME = new QName("http://www.opengis.net/gml/3.2", "ValueArray");
    private final static QName _ScopedName_QNAME = new QName("http://www.isotc211.org/2005/gco", "ScopedName");
    private final static QName _BaseCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "baseCRS");
    private final static QName _PriorityLocation_QNAME = new QName("http://www.opengis.net/gml/3.2", "priorityLocation");
    private final static QName _Geodesic_QNAME = new QName("http://www.opengis.net/gml/3.2", "Geodesic");
    private final static QName _DefinitionProxy_QNAME = new QName("http://www.opengis.net/gml/3.2", "DefinitionProxy");
    private final static QName _CompositeSolid_QNAME = new QName("http://www.opengis.net/gml/3.2", "CompositeSolid");
    private final static QName _AbstractObject1_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractObject");
    private final static QName _QuantityTypeReference_QNAME = new QName("http://www.opengis.net/gml/3.2", "quantityTypeReference");
    private final static QName _DataSourceReference_QNAME = new QName("http://www.opengis.net/gml/3.2", "dataSourceReference");
    private final static QName _CIDate_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_Date");
    private final static QName _TimeCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeCS");
    private final static QName _Segments_QNAME = new QName("http://www.opengis.net/gml/3.2", "segments");
    private final static QName _UsesVerticalCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesVerticalCS");
    private final static QName _DescriptionReference_QNAME = new QName("http://www.opengis.net/gml/3.2", "descriptionReference");
    private final static QName _TopoSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "TopoSurface");
    private final static QName _CIContact_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_Contact");
    private final static QName _MaximalComplex_QNAME = new QName("http://www.opengis.net/gml/3.2", "maximalComplex");
    private final static QName _SolidProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "solidProperty");
    private final static QName _DQDataQuality_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_DataQuality");
    private final static QName _Arc_QNAME = new QName("http://www.w3.org/1999/xlink", "arc");
    private final static QName _AbstractElevatedPointExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AbstractElevatedPointExtension");
    private final static QName _AbstractMDIdentification_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractMD_Identification");
    private final static QName _CompositeValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "CompositeValue");
    private final static QName _ElevatedPoint_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "ElevatedPoint");
    private final static QName _Angle_QNAME = new QName("http://www.opengis.net/gml/3.2", "angle");
    private final static QName _VerticalCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "VerticalCRS");
    private final static QName _Member_QNAME = new QName("http://www.opengis.net/gml/3.2", "member");
    private final static QName _MDDimension_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Dimension");
    private final static QName _DQDomainConsistency_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_DomainConsistency");
    private final static QName _PassThroughOperation_QNAME = new QName("http://www.opengis.net/gml/3.2", "PassThroughOperation");
    private final static QName _Unit_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "Unit");
    private final static QName _Multiplicity_QNAME = new QName("http://www.isotc211.org/2005/gco", "Multiplicity");
    private final static QName _Conversion_QNAME = new QName("http://www.opengis.net/gml/3.2", "Conversion");
    private final static QName _UsesAxis_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesAxis");
    private final static QName _VerticalDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "VerticalDatum");
    private final static QName _DQNonQuantitativeAttributeAccuracy_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_NonQuantitativeAttributeAccuracy");
    private final static QName _MDRepresentativeFraction_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_RepresentativeFraction");
    private final static QName _AerodromeRunwayState_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AerodromeRunwayState");
    private final static QName _TemporalCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "TemporalCS");
    private final static QName _File_QNAME = new QName("http://www.opengis.net/gml/3.2", "File");
    private final static QName _MeteorologicalAerodromeObservationRecord_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "MeteorologicalAerodromeObservationRecord");
    private final static QName _MultiCenterOf_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiCenterOf");
    private final static QName _PointArrayProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "pointArrayProperty");
    private final static QName _CIAddress_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_Address");
    private final static QName _MultiPosition_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiPosition");
    private final static QName _DSStereoMate_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_StereoMate");
    private final static QName _Position_QNAME = new QName("http://www.opengis.net/gml/3.2", "position");
    private final static QName _AbstractImplicitGeometry_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractImplicitGeometry");
    private final static QName _TopoPointProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "topoPointProperty");
    private final static QName _AbstractValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractValue");
    private final static QName _MultiSolid_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiSolid");
    private final static QName _cylindricalCS1_QNAME = new QName("http://www.opengis.net/gml/3.2", "cylindricalCS");
    private final static QName _CylindricalCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "CylindricalCS");
    private final static QName _MDCoverageDescription_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_CoverageDescription");
    private final static QName _DirectedFace_QNAME = new QName("http://www.opengis.net/gml/3.2", "directedFace");
    private final static QName _AbstractDQResult_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_Result");
    private final static QName _PosList_QNAME = new QName("http://www.opengis.net/gml/3.2", "posList");
    private final static QName _DynamicFeatureCollection_QNAME = new QName("http://www.opengis.net/gml/3.2", "DynamicFeatureCollection");
    private final static QName _AirspaceGeometryComponent_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "AirspaceGeometryComponent");
    private final static QName _AbstractDQPositionalAccuracy_QNAME = new QName("http://www.isotc211.org/2005/gmd", "AbstractDQ_PositionalAccuracy");
    private final static QName _Subject_QNAME = new QName("http://www.opengis.net/gml/3.2", "subject");
    private final static QName _DSInitiative_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DS_Initiative");
    private final static QName _LengthWithNilReason_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "LengthWithNilReason");
    private final static QName _Null_QNAME = new QName("http://www.opengis.net/gml/3.2", "Null");
    private final static QName _MDCoverageContentTypeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_CoverageContentTypeCode");
    private final static QName _AbstractSingleCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractSingleCRS");
    private final static QName _DQTopologicalConsistency_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_TopologicalConsistency");
    private final static QName _MethodFormula_QNAME = new QName("http://www.opengis.net/gml/3.2", "methodFormula");
    private final static QName _MDScopeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ScopeCode");
    private final static QName _VerticalCS_QNAME = new QName("http://www.opengis.net/gml/3.2", "VerticalCS");
    private final static QName _CICitation_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_Citation");
    private final static QName _DQFormatConsistency_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_FormatConsistency");
    private final static QName _Members_QNAME = new QName("http://www.opengis.net/gml/3.2", "members");
    private final static QName _MDTopicCategoryCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_TopicCategoryCode");
    private final static QName _Decimal_QNAME = new QName("http://www.isotc211.org/2005/gco", "Decimal");
    private final static QName _AerodromeRunwayVisualRange_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AerodromeRunwayVisualRange");
    private final static QName _PrimeMeridian_QNAME = new QName("http://www.opengis.net/gml/3.2", "primeMeridian");
    private final static QName _MDSecurityConstraints_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_SecurityConstraints");
    private final static QName _AbstractSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractSurface");
    private final static QName _AbstractTimeComplex_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractTimeComplex");
    private final static QName _BSpline_QNAME = new QName("http://www.opengis.net/gml/3.2", "BSpline");
    private final static QName _AerodromeCloudForecast_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "AerodromeCloudForecast");
    private final static QName _Point1_QNAME = new QName("http://www.opengis.net/gml/3.2", "Point");
    private final static QName _GeodesicString_QNAME = new QName("http://www.opengis.net/gml/3.2", "GeodesicString");
    private final static QName _AbstractScalarValueList_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractScalarValueList");
    private final static QName _OperationParameterGroup_QNAME = new QName("http://www.opengis.net/gml/3.2", "OperationParameterGroup");
    private final static QName _geodeticDatum1_QNAME = new QName("http://www.opengis.net/gml/3.2", "geodeticDatum");
    private final static QName _EngineeringDatumRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "engineeringDatumRef");
    private final static QName _UsesEngineeringDatum_QNAME = new QName("http://www.opengis.net/gml/3.2", "usesEngineeringDatum");
    private final static QName _Edge_QNAME = new QName("http://www.opengis.net/gml/3.2", "Edge");
    private final static QName _MaximumValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "maximumValue");
    private final static QName _SequenceNumber_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "sequenceNumber");
    private final static QName _GeneralOperationParameter_QNAME = new QName("http://www.opengis.net/gml/3.2", "generalOperationParameter");
    private final static QName _Remarks_QNAME = new QName("http://www.opengis.net/gml/3.2", "remarks");
    private final static QName _MultiGeometry_QNAME = new QName("http://www.opengis.net/gml/3.2", "MultiGeometry");
    private final static QName _SingleOperationRef_QNAME = new QName("http://www.opengis.net/gml/3.2", "singleOperationRef");
    private final static QName _TargetCRS_QNAME = new QName("http://www.opengis.net/gml/3.2", "targetCRS");
    private final static QName _Length_QNAME = new QName("http://www.isotc211.org/2005/gco", "Length");
    private final static QName _Array_QNAME = new QName("http://www.opengis.net/gml/3.2", "Array");
    private final static QName _CategoryList_QNAME = new QName("http://www.opengis.net/gml/3.2", "CategoryList");
    private final static QName _DynamicFeature_QNAME = new QName("http://www.opengis.net/gml/3.2", "DynamicFeature");
    private final static QName _MappingRule_QNAME = new QName("http://www.opengis.net/gml/3.2", "MappingRule");
    private final static QName _TargetDimensions_QNAME = new QName("http://www.opengis.net/gml/3.2", "targetDimensions");
    private final static QName _MDGeoreferenceable_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Georeferenceable");
    private final static QName _DirectedObservation_QNAME = new QName("http://www.opengis.net/gml/3.2", "DirectedObservation");
    private final static QName _CoordinateSystemAxis_QNAME = new QName("http://www.opengis.net/gml/3.2", "CoordinateSystemAxis");
    private final static QName _CIOnlineResource_QNAME = new QName("http://www.isotc211.org/2005/gmd", "CI_OnlineResource");
    private final static QName _DQQuantitativeResult_QNAME = new QName("http://www.isotc211.org/2005/gmd", "DQ_QuantitativeResult");
    private final static QName _MultiSolidProperty_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiSolidProperty");
    private final static QName _MDProgressCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_ProgressCode");
    private final static QName _ConventionalUnit_QNAME = new QName("http://www.opengis.net/gml/3.2", "ConventionalUnit");
    private final static QName _QuantityList_QNAME = new QName("http://www.opengis.net/gml/3.2", "QuantityList");
    private final static QName _MDGeorectified_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_Georectified");
    private final static QName _DefaultCodeSpace_QNAME = new QName("http://www.opengis.net/gml/3.2", "defaultCodeSpace");
    private final static QName _Exterior_QNAME = new QName("http://www.opengis.net/gml/3.2", "exterior");
    private final static QName _Dictionary_QNAME = new QName("http://www.opengis.net/gml/3.2", "Dictionary");
    private final static QName _SPECI_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "SPECI");
    private final static QName _AbstractGeometry_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGeometry");
    private final static QName _MDDatatypeCode_QNAME = new QName("http://www.isotc211.org/2005/gmd", "MD_DatatypeCode");
    private final static QName _Direction_QNAME = new QName("http://www.opengis.net/gml/3.2", "direction");
    private final static QName _AbstractGriddedSurface_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractGriddedSurface");
    private final static QName _MultiExtentOf_QNAME = new QName("http://www.opengis.net/gml/3.2", "multiExtentOf");
    private final static QName _engineeringDatum1_QNAME = new QName("http://www.opengis.net/gml/3.2", "engineeringDatum");
    private final static QName _AbstractScalarValue_QNAME = new QName("http://www.opengis.net/gml/3.2", "AbstractScalarValue");
    private final static QName _TimeOrdinalEra_QNAME = new QName("http://www.opengis.net/gml/3.2", "TimeOrdinalEra");
    private final static QName _EXVerticalExtent_QNAME = new QName("http://www.isotc211.org/2005/gmd", "EX_VerticalExtent");
    private final static QName _ExtentOf_QNAME = new QName("http://www.opengis.net/gml/3.2", "extentOf");
    private final static QName _AbstractAssociationRole_QNAME = new QName("http://www.opengis.net/gml/3.2", "abstractAssociationRole");
    private final static QName _QuantityExtent_QNAME = new QName("http://www.opengis.net/gml/3.2", "QuantityExtent");
    private final static QName _ArcByCenterPoint_QNAME = new QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint");
    private final static QName _ElevatedSurfaceTypeElevation_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "elevation");
    private final static QName _ElevatedSurfaceTypeVerticalAccuracy_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "verticalAccuracy");
    private final static QName _UnitTimeSliceTypeDesignator_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "designator");
    private final static QName _UnitTimeSliceTypeExtension_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "extension");
    private final static QName _UnitTimeSliceTypeName_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "name");
    private final static QName _UnitTimeSliceTypeType_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "type");
    private final static QName _AerodromeRunwayStateTypeDepthOfDeposit_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "depthOfDeposit");
    private final static QName _CloudLayerTypeCloudType_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "cloudType");
    private final static QName _AirportHeliportTimeSliceTypeDesignatorIATA_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "designatorIATA");
    private final static QName _AirportHeliportTimeSliceTypeLocationIndicatorICAO_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "locationIndicatorICAO");
    private final static QName _AirportHeliportTimeSliceTypeFieldElevation_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "fieldElevation");
    private final static QName _AirportHeliportTimeSliceTypeARP_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "ARP");
    private final static QName _AerodromeObservedCloudsTypeVerticalVisibility_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "verticalVisibility");
    private final static QName _RunwayTimeSliceTypeAssociatedAirportHeliport_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "associatedAirportHeliport");
    private final static QName _SurfaceTypeHorizontalAccuracy_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "horizontalAccuracy");
    private final static QName _AirspaceGeometryComponentTypeTheAirspaceVolume_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "theAirspaceVolume");
    private final static QName _MeteorologicalAerodromeObservationRecordTypeCloud_QNAME = new QName("http://schemas.wmo.int/iwxxm/2.1", "cloud");
    private final static QName _AirspaceVolumeTypeLowerLimitReference_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimitReference");
    private final static QName _AirspaceVolumeTypeHorizontalProjection_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "horizontalProjection");
    private final static QName _AirspaceVolumeTypeUpperLimit_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "upperLimit");
    private final static QName _AirspaceVolumeTypeLowerLimit_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "lowerLimit");
    private final static QName _AirspaceVolumeTypeUpperLimitReference_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "upperLimitReference");
    private final static QName _GridTypeLimits_QNAME = new QName("http://www.opengis.net/gml/3.2", "limits");
    private final static QName _GridTypeAxisName_QNAME = new QName("http://www.opengis.net/gml/3.2", "axisName");
    private final static QName _GridTypeAxisLabels_QNAME = new QName("http://www.opengis.net/gml/3.2", "axisLabels");
    private final static QName _AirspaceTimeSliceTypeDesignatorICAO_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "designatorICAO");
    private final static QName _AirspaceTimeSliceTypeGeometryComponent_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "geometryComponent");
    private final static QName _RunwayDirectionTimeSliceTypeMagneticBearing_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "magneticBearing");
    private final static QName _RunwayDirectionTimeSliceTypeTrueBearing_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "trueBearing");
    private final static QName _RunwayDirectionTimeSliceTypeUsedRunway_QNAME = new QName("http://www.aixm.aero/schema/5.1.1", "usedRunway");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.iwxxm.metarSpeci
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AbstractGriddedSurfaceType.Rows }
     * 
     */
    public AbstractGriddedSurfaceType.Rows createAbstractGriddedSurfaceTypeRows() {
        return new AbstractGriddedSurfaceType.Rows();
    }

    /**
     * Create an instance of {@link ClothoidType }
     * 
     */
    public ClothoidType createClothoidType() {
        return new ClothoidType();
    }

    /**
     * Create an instance of {@link TinType }
     * 
     */
    public TinType createTinType() {
        return new TinType();
    }

    /**
     * Create an instance of {@link RunwayDirectionTimeSliceType }
     * 
     */
    public RunwayDirectionTimeSliceType createRunwayDirectionTimeSliceType() {
        return new RunwayDirectionTimeSliceType();
    }

    /**
     * Create an instance of {@link AirportHeliportTimeSliceType }
     * 
     */
    public AirportHeliportTimeSliceType createAirportHeliportTimeSliceType() {
        return new AirportHeliportTimeSliceType();
    }

    /**
     * Create an instance of {@link AirspaceVolumeType }
     * 
     */
    public AirspaceVolumeType createAirspaceVolumeType() {
        return new AirspaceVolumeType();
    }

    /**
     * Create an instance of {@link ElevatedSurfaceType }
     * 
     */
    public ElevatedSurfaceType createElevatedSurfaceType() {
        return new ElevatedSurfaceType();
    }

    /**
     * Create an instance of {@link ElevatedCurveType }
     * 
     */
    public ElevatedCurveType createElevatedCurveType() {
        return new ElevatedCurveType();
    }

    /**
     * Create an instance of {@link UnitTimeSliceType }
     * 
     */
    public UnitTimeSliceType createUnitTimeSliceType() {
        return new UnitTimeSliceType();
    }

    /**
     * Create an instance of {@link RunwayTimeSliceType }
     * 
     */
    public RunwayTimeSliceType createRunwayTimeSliceType() {
        return new RunwayTimeSliceType();
    }

    /**
     * Create an instance of {@link AirspaceGeometryComponentType }
     * 
     */
    public AirspaceGeometryComponentType createAirspaceGeometryComponentType() {
        return new AirspaceGeometryComponentType();
    }

    /**
     * Create an instance of {@link AirspaceTimeSliceType }
     * 
     */
    public AirspaceTimeSliceType createAirspaceTimeSliceType() {
        return new AirspaceTimeSliceType();
    }

    /**
     * Create an instance of {@link ElevatedPointType }
     * 
     */
    public ElevatedPointType createElevatedPointType() {
        return new ElevatedPointType();
    }

    /**
     * Create an instance of {@link AerodromeCloudForecastType }
     * 
     */
    public AerodromeCloudForecastType createAerodromeCloudForecastType() {
        return new AerodromeCloudForecastType();
    }

    /**
     * Create an instance of {@link MeteorologicalAerodromeObservationRecordType }
     * 
     */
    public MeteorologicalAerodromeObservationRecordType createMeteorologicalAerodromeObservationRecordType() {
        return new MeteorologicalAerodromeObservationRecordType();
    }

    /**
     * Create an instance of {@link AerodromeObservedCloudsType }
     * 
     */
    public AerodromeObservedCloudsType createAerodromeObservedCloudsType() {
        return new AerodromeObservedCloudsType();
    }

    /**
     * Create an instance of {@link AerodromeSurfaceWindForecastType }
     * 
     */
    public AerodromeSurfaceWindForecastType createAerodromeSurfaceWindForecastType() {
        return new AerodromeSurfaceWindForecastType();
    }

    /**
     * Create an instance of {@link AerodromeSurfaceWindTrendForecastType }
     * 
     */
    public AerodromeSurfaceWindTrendForecastType createAerodromeSurfaceWindTrendForecastType() {
        return new AerodromeSurfaceWindTrendForecastType();
    }

    /**
     * Create an instance of {@link CloudLayerType }
     * 
     */
    public CloudLayerType createCloudLayerType() {
        return new CloudLayerType();
    }

    /**
     * Create an instance of {@link AerodromeSurfaceWindType }
     * 
     */
    public AerodromeSurfaceWindType createAerodromeSurfaceWindType() {
        return new AerodromeSurfaceWindType();
    }

    /**
     * Create an instance of {@link MeteorologicalAerodromeTrendForecastRecordType }
     * 
     */
    public MeteorologicalAerodromeTrendForecastRecordType createMeteorologicalAerodromeTrendForecastRecordType() {
        return new MeteorologicalAerodromeTrendForecastRecordType();
    }

    /**
     * Create an instance of {@link METARType }
     * 
     */
    public METARType createMETARType() {
        return new METARType();
    }

    /**
     * Create an instance of {@link AerodromeSeaStateType }
     * 
     */
    public AerodromeSeaStateType createAerodromeSeaStateType() {
        return new AerodromeSeaStateType();
    }

    /**
     * Create an instance of {@link AerodromeHorizontalVisibilityType }
     * 
     */
    public AerodromeHorizontalVisibilityType createAerodromeHorizontalVisibilityType() {
        return new AerodromeHorizontalVisibilityType();
    }

    /**
     * Create an instance of {@link AerodromeRunwayVisualRangeType }
     * 
     */
    public AerodromeRunwayVisualRangeType createAerodromeRunwayVisualRangeType() {
        return new AerodromeRunwayVisualRangeType();
    }

    /**
     * Create an instance of {@link AerodromeWindShearType }
     * 
     */
    public AerodromeWindShearType createAerodromeWindShearType() {
        return new AerodromeWindShearType();
    }

    /**
     * Create an instance of {@link AngleWithNilReasonType }
     * 
     */
    public AngleWithNilReasonType createAngleWithNilReasonType() {
        return new AngleWithNilReasonType();
    }

    /**
     * Create an instance of {@link SPECIType }
     * 
     */
    public SPECIType createSPECIType() {
        return new SPECIType();
    }

    /**
     * Create an instance of {@link AerodromeRunwayStateType }
     * 
     */
    public AerodromeRunwayStateType createAerodromeRunwayStateType() {
        return new AerodromeRunwayStateType();
    }

    /**
     * Create an instance of {@link LengthWithNilReasonType }
     * 
     */
    public LengthWithNilReasonType createLengthWithNilReasonType() {
        return new LengthWithNilReasonType();
    }

    /**
     * Create an instance of {@link DistanceWithNilReasonType }
     * 
     */
    public DistanceWithNilReasonType createDistanceWithNilReasonType() {
        return new DistanceWithNilReasonType();
    }

    /**
     * Create an instance of {@link AerodromeRunwayStatePropertyType }
     * 
     */
    public AerodromeRunwayStatePropertyType createAerodromeRunwayStatePropertyType() {
        return new AerodromeRunwayStatePropertyType();
    }

    /**
     * Create an instance of {@link SeaSurfaceStateType }
     * 
     */
    public SeaSurfaceStateType createSeaSurfaceStateType() {
        return new SeaSurfaceStateType();
    }

    /**
     * Create an instance of {@link AirspacePropertyType1 }
     * 
     */
    public AirspacePropertyType1 createAirspacePropertyType1() {
        return new AirspacePropertyType1();
    }

    /**
     * Create an instance of {@link MeteorologicalAerodromeTrendForecastRecordPropertyType }
     * 
     */
    public MeteorologicalAerodromeTrendForecastRecordPropertyType createMeteorologicalAerodromeTrendForecastRecordPropertyType() {
        return new MeteorologicalAerodromeTrendForecastRecordPropertyType();
    }

    /**
     * Create an instance of {@link AerodromeSurfaceWindPropertyType }
     * 
     */
    public AerodromeSurfaceWindPropertyType createAerodromeSurfaceWindPropertyType() {
        return new AerodromeSurfaceWindPropertyType();
    }

    /**
     * Create an instance of {@link RunwayDepositsType }
     * 
     */
    public RunwayDepositsType createRunwayDepositsType() {
        return new RunwayDepositsType();
    }

    /**
     * Create an instance of {@link MeteorologicalAerodromeObservationRecordPropertyType }
     * 
     */
    public MeteorologicalAerodromeObservationRecordPropertyType createMeteorologicalAerodromeObservationRecordPropertyType() {
        return new MeteorologicalAerodromeObservationRecordPropertyType();
    }

    /**
     * Create an instance of {@link SigConvectiveCloudTypeType }
     * 
     */
    public SigConvectiveCloudTypeType createSigConvectiveCloudTypeType() {
        return new SigConvectiveCloudTypeType();
    }

    /**
     * Create an instance of {@link CloudLayerPropertyType }
     * 
     */
    public CloudLayerPropertyType createCloudLayerPropertyType() {
        return new CloudLayerPropertyType();
    }

    /**
     * Create an instance of {@link AerodromeHorizontalVisibilityPropertyType }
     * 
     */
    public AerodromeHorizontalVisibilityPropertyType createAerodromeHorizontalVisibilityPropertyType() {
        return new AerodromeHorizontalVisibilityPropertyType();
    }

    /**
     * Create an instance of {@link AerodromeRecentWeatherType }
     * 
     */
    public AerodromeRecentWeatherType createAerodromeRecentWeatherType() {
        return new AerodromeRecentWeatherType();
    }

    /**
     * Create an instance of {@link UnitPropertyType1 }
     * 
     */
    public UnitPropertyType1 createUnitPropertyType1() {
        return new UnitPropertyType1();
    }

    /**
     * Create an instance of {@link AerodromeSeaStatePropertyType }
     * 
     */
    public AerodromeSeaStatePropertyType createAerodromeSeaStatePropertyType() {
        return new AerodromeSeaStatePropertyType();
    }

    /**
     * Create an instance of {@link AerodromeObservedCloudsPropertyType }
     * 
     */
    public AerodromeObservedCloudsPropertyType createAerodromeObservedCloudsPropertyType() {
        return new AerodromeObservedCloudsPropertyType();
    }

    /**
     * Create an instance of {@link AerodromeSurfaceWindTrendForecastPropertyType }
     * 
     */
    public AerodromeSurfaceWindTrendForecastPropertyType createAerodromeSurfaceWindTrendForecastPropertyType() {
        return new AerodromeSurfaceWindTrendForecastPropertyType();
    }

    /**
     * Create an instance of {@link RunwayDirectionPropertyType1 }
     * 
     */
    public RunwayDirectionPropertyType1 createRunwayDirectionPropertyType1() {
        return new RunwayDirectionPropertyType1();
    }

    /**
     * Create an instance of {@link AerodromeForecastWeatherType }
     * 
     */
    public AerodromeForecastWeatherType createAerodromeForecastWeatherType() {
        return new AerodromeForecastWeatherType();
    }

    /**
     * Create an instance of {@link RunwayPropertyType1 }
     * 
     */
    public RunwayPropertyType1 createRunwayPropertyType1() {
        return new RunwayPropertyType1();
    }

    /**
     * Create an instance of {@link ReportPropertyType }
     * 
     */
    public ReportPropertyType createReportPropertyType() {
        return new ReportPropertyType();
    }

    /**
     * Create an instance of {@link AerodromeRunwayVisualRangePropertyType }
     * 
     */
    public AerodromeRunwayVisualRangePropertyType createAerodromeRunwayVisualRangePropertyType() {
        return new AerodromeRunwayVisualRangePropertyType();
    }

    /**
     * Create an instance of {@link AirportHeliportPropertyType1 }
     * 
     */
    public AirportHeliportPropertyType1 createAirportHeliportPropertyType1() {
        return new AirportHeliportPropertyType1();
    }

    /**
     * Create an instance of {@link SPECIPropertyType }
     * 
     */
    public SPECIPropertyType createSPECIPropertyType() {
        return new SPECIPropertyType();
    }

    /**
     * Create an instance of {@link AerodromePresentWeatherType }
     * 
     */
    public AerodromePresentWeatherType createAerodromePresentWeatherType() {
        return new AerodromePresentWeatherType();
    }

    /**
     * Create an instance of {@link METARPropertyType }
     * 
     */
    public METARPropertyType createMETARPropertyType() {
        return new METARPropertyType();
    }

    /**
     * Create an instance of {@link MeteorologicalAerodromeObservationReportPropertyType }
     * 
     */
    public MeteorologicalAerodromeObservationReportPropertyType createMeteorologicalAerodromeObservationReportPropertyType() {
        return new MeteorologicalAerodromeObservationReportPropertyType();
    }

    /**
     * Create an instance of {@link CloudAmountReportedAtAerodromeType }
     * 
     */
    public CloudAmountReportedAtAerodromeType createCloudAmountReportedAtAerodromeType() {
        return new CloudAmountReportedAtAerodromeType();
    }

    /**
     * Create an instance of {@link RunwayContaminationType }
     * 
     */
    public RunwayContaminationType createRunwayContaminationType() {
        return new RunwayContaminationType();
    }

    /**
     * Create an instance of {@link AerodromeSurfaceWindForecastPropertyType }
     * 
     */
    public AerodromeSurfaceWindForecastPropertyType createAerodromeSurfaceWindForecastPropertyType() {
        return new AerodromeSurfaceWindForecastPropertyType();
    }

    /**
     * Create an instance of {@link AerodromeWindShearPropertyType }
     * 
     */
    public AerodromeWindShearPropertyType createAerodromeWindShearPropertyType() {
        return new AerodromeWindShearPropertyType();
    }

    /**
     * Create an instance of {@link RunwayFrictionCoefficientType }
     * 
     */
    public RunwayFrictionCoefficientType createRunwayFrictionCoefficientType() {
        return new RunwayFrictionCoefficientType();
    }

    /**
     * Create an instance of {@link AerodromeCloudForecastPropertyType }
     * 
     */
    public AerodromeCloudForecastPropertyType createAerodromeCloudForecastPropertyType() {
        return new AerodromeCloudForecastPropertyType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link PointType1 }
     * 
     */
    public PointType1 createPointType1() {
        return new PointType1();
    }

    /**
     * Create an instance of {@link UnitType }
     * 
     */
    public UnitType createUnitType() {
        return new UnitType();
    }

    /**
     * Create an instance of {@link RunwayDirectionType }
     * 
     */
    public RunwayDirectionType createRunwayDirectionType() {
        return new RunwayDirectionType();
    }

    /**
     * Create an instance of {@link SurfaceType }
     * 
     */
    public SurfaceType createSurfaceType() {
        return new SurfaceType();
    }

    /**
     * Create an instance of {@link SurfaceType1 }
     * 
     */
    public SurfaceType1 createSurfaceType1() {
        return new SurfaceType1();
    }

    /**
     * Create an instance of {@link AirportHeliportType }
     * 
     */
    public AirportHeliportType createAirportHeliportType() {
        return new AirportHeliportType();
    }

    /**
     * Create an instance of {@link CurveType }
     * 
     */
    public CurveType createCurveType() {
        return new CurveType();
    }

    /**
     * Create an instance of {@link CurveType1 }
     * 
     */
    public CurveType1 createCurveType1() {
        return new CurveType1();
    }

    /**
     * Create an instance of {@link AirspaceType }
     * 
     */
    public AirspaceType createAirspaceType() {
        return new AirspaceType();
    }

    /**
     * Create an instance of {@link RunwayType }
     * 
     */
    public RunwayType createRunwayType() {
        return new RunwayType();
    }

    /**
     * Create an instance of {@link TimePrimitivePropertyType }
     * 
     */
    public TimePrimitivePropertyType createTimePrimitivePropertyType() {
        return new TimePrimitivePropertyType();
    }

    /**
     * Create an instance of {@link AirspacePropertyType }
     * 
     */
    public AirspacePropertyType createAirspacePropertyType() {
        return new AirspacePropertyType();
    }

    /**
     * Create an instance of {@link CodeOrganisationDesignatorType }
     * 
     */
    public CodeOrganisationDesignatorType createCodeOrganisationDesignatorType() {
        return new CodeOrganisationDesignatorType();
    }

    /**
     * Create an instance of {@link ElevatedPointPropertyType }
     * 
     */
    public ElevatedPointPropertyType createElevatedPointPropertyType() {
        return new ElevatedPointPropertyType();
    }

    /**
     * Create an instance of {@link CodeICAOType }
     * 
     */
    public CodeICAOType createCodeICAOType() {
        return new CodeICAOType();
    }

    /**
     * Create an instance of {@link RunwayTimeSlicePropertyType }
     * 
     */
    public RunwayTimeSlicePropertyType createRunwayTimeSlicePropertyType() {
        return new RunwayTimeSlicePropertyType();
    }

    /**
     * Create an instance of {@link ValDistanceType }
     * 
     */
    public ValDistanceType createValDistanceType() {
        return new ValDistanceType();
    }

    /**
     * Create an instance of {@link CurvePropertyType }
     * 
     */
    public CurvePropertyType createCurvePropertyType() {
        return new CurvePropertyType();
    }

    /**
     * Create an instance of {@link ElevatedSurfacePropertyType }
     * 
     */
    public ElevatedSurfacePropertyType createElevatedSurfacePropertyType() {
        return new ElevatedSurfacePropertyType();
    }

    /**
     * Create an instance of {@link UnitPropertyType }
     * 
     */
    public UnitPropertyType createUnitPropertyType() {
        return new UnitPropertyType();
    }

    /**
     * Create an instance of {@link FeatureMetadataPropertyType }
     * 
     */
    public FeatureMetadataPropertyType createFeatureMetadataPropertyType() {
        return new FeatureMetadataPropertyType();
    }

    /**
     * Create an instance of {@link CodeRunwayType }
     * 
     */
    public CodeRunwayType createCodeRunwayType() {
        return new CodeRunwayType();
    }

    /**
     * Create an instance of {@link AirspaceTimeSlicePropertyType }
     * 
     */
    public AirspaceTimeSlicePropertyType createAirspaceTimeSlicePropertyType() {
        return new AirspaceTimeSlicePropertyType();
    }

    /**
     * Create an instance of {@link RunwayDirectionPropertyType }
     * 
     */
    public RunwayDirectionPropertyType createRunwayDirectionPropertyType() {
        return new RunwayDirectionPropertyType();
    }

    /**
     * Create an instance of {@link RunwayPropertyType }
     * 
     */
    public RunwayPropertyType createRunwayPropertyType() {
        return new RunwayPropertyType();
    }

    /**
     * Create an instance of {@link RunwayBlastPadPropertyType }
     * 
     */
    public RunwayBlastPadPropertyType createRunwayBlastPadPropertyType() {
        return new RunwayBlastPadPropertyType();
    }

    /**
     * Create an instance of {@link CodeVerticalReferenceType }
     * 
     */
    public CodeVerticalReferenceType createCodeVerticalReferenceType() {
        return new CodeVerticalReferenceType();
    }

    /**
     * Create an instance of {@link AirportHeliportTimeSlicePropertyType }
     * 
     */
    public AirportHeliportTimeSlicePropertyType createAirportHeliportTimeSlicePropertyType() {
        return new AirportHeliportTimeSlicePropertyType();
    }

    /**
     * Create an instance of {@link CodeAirportHeliportType }
     * 
     */
    public CodeAirportHeliportType createCodeAirportHeliportType() {
        return new CodeAirportHeliportType();
    }

    /**
     * Create an instance of {@link AirspaceVolumePropertyType }
     * 
     */
    public AirspaceVolumePropertyType createAirspaceVolumePropertyType() {
        return new AirspaceVolumePropertyType();
    }

    /**
     * Create an instance of {@link AirportHeliportPropertyType }
     * 
     */
    public AirportHeliportPropertyType createAirportHeliportPropertyType() {
        return new AirportHeliportPropertyType();
    }

    /**
     * Create an instance of {@link CodeUnitType }
     * 
     */
    public CodeUnitType createCodeUnitType() {
        return new CodeUnitType();
    }

    /**
     * Create an instance of {@link TextDesignatorType }
     * 
     */
    public TextDesignatorType createTextDesignatorType() {
        return new TextDesignatorType();
    }

    /**
     * Create an instance of {@link TextNameType }
     * 
     */
    public TextNameType createTextNameType() {
        return new TextNameType();
    }

    /**
     * Create an instance of {@link RunwayDirectionTimeSlicePropertyType }
     * 
     */
    public RunwayDirectionTimeSlicePropertyType createRunwayDirectionTimeSlicePropertyType() {
        return new RunwayDirectionTimeSlicePropertyType();
    }

    /**
     * Create an instance of {@link AirspaceGeometryComponentPropertyType }
     * 
     */
    public AirspaceGeometryComponentPropertyType createAirspaceGeometryComponentPropertyType() {
        return new AirspaceGeometryComponentPropertyType();
    }

    /**
     * Create an instance of {@link SurfacePropertyType }
     * 
     */
    public SurfacePropertyType createSurfacePropertyType() {
        return new SurfacePropertyType();
    }

    /**
     * Create an instance of {@link CodeYesNoType }
     * 
     */
    public CodeYesNoType createCodeYesNoType() {
        return new CodeYesNoType();
    }

    /**
     * Create an instance of {@link MessageMetadataPropertyType }
     * 
     */
    public MessageMetadataPropertyType createMessageMetadataPropertyType() {
        return new MessageMetadataPropertyType();
    }

    /**
     * Create an instance of {@link CodeAirspaceType }
     * 
     */
    public CodeAirspaceType createCodeAirspaceType() {
        return new CodeAirspaceType();
    }

    /**
     * Create an instance of {@link ValDistanceVerticalType }
     * 
     */
    public ValDistanceVerticalType createValDistanceVerticalType() {
        return new ValDistanceVerticalType();
    }

    /**
     * Create an instance of {@link CodeAirspaceDesignatorType }
     * 
     */
    public CodeAirspaceDesignatorType createCodeAirspaceDesignatorType() {
        return new CodeAirspaceDesignatorType();
    }

    /**
     * Create an instance of {@link FeatureTimeSliceMetadataPropertyType }
     * 
     */
    public FeatureTimeSliceMetadataPropertyType createFeatureTimeSliceMetadataPropertyType() {
        return new FeatureTimeSliceMetadataPropertyType();
    }

    /**
     * Create an instance of {@link ElevatedCurvePropertyType }
     * 
     */
    public ElevatedCurvePropertyType createElevatedCurvePropertyType() {
        return new ElevatedCurvePropertyType();
    }

    /**
     * Create an instance of {@link ValBearingType }
     * 
     */
    public ValBearingType createValBearingType() {
        return new ValBearingType();
    }

    /**
     * Create an instance of {@link UnitTimeSlicePropertyType }
     * 
     */
    public UnitTimeSlicePropertyType createUnitTimeSlicePropertyType() {
        return new UnitTimeSlicePropertyType();
    }

    /**
     * Create an instance of {@link CodeAirportHeliportDesignatorType }
     * 
     */
    public CodeAirportHeliportDesignatorType createCodeAirportHeliportDesignatorType() {
        return new CodeAirportHeliportDesignatorType();
    }

    /**
     * Create an instance of {@link CodeIATAType }
     * 
     */
    public CodeIATAType createCodeIATAType() {
        return new CodeIATAType();
    }

    /**
     * Create an instance of {@link PointPropertyType }
     * 
     */
    public PointPropertyType createPointPropertyType() {
        return new PointPropertyType();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link TopoPointType }
     * 
     */
    public TopoPointType createTopoPointType() {
        return new TopoPointType();
    }

    /**
     * Create an instance of {@link DerivedCRSPropertyType }
     * 
     */
    public DerivedCRSPropertyType createDerivedCRSPropertyType() {
        return new DerivedCRSPropertyType();
    }

    /**
     * Create an instance of {@link DomainSetType }
     * 
     */
    public DomainSetType createDomainSetType() {
        return new DomainSetType();
    }

    /**
     * Create an instance of {@link TopoVolumePropertyType }
     * 
     */
    public TopoVolumePropertyType createTopoVolumePropertyType() {
        return new TopoVolumePropertyType();
    }

    /**
     * Create an instance of {@link ArcStringType }
     * 
     */
    public ArcStringType createArcStringType() {
        return new ArcStringType();
    }

    /**
     * Create an instance of {@link SphereType }
     * 
     */
    public SphereType createSphereType() {
        return new SphereType();
    }

    /**
     * Create an instance of {@link CoverageFunctionType }
     * 
     */
    public CoverageFunctionType createCoverageFunctionType() {
        return new CoverageFunctionType();
    }

    /**
     * Create an instance of {@link TimeCSPropertyType }
     * 
     */
    public TimeCSPropertyType createTimeCSPropertyType() {
        return new TimeCSPropertyType();
    }

    /**
     * Create an instance of {@link TopoCurveType }
     * 
     */
    public TopoCurveType createTopoCurveType() {
        return new TopoCurveType();
    }

    /**
     * Create an instance of {@link RectifiedGridType }
     * 
     */
    public RectifiedGridType createRectifiedGridType() {
        return new RectifiedGridType();
    }

    /**
     * Create an instance of {@link GridType }
     * 
     */
    public GridType createGridType() {
        return new GridType();
    }

    /**
     * Create an instance of {@link AffineCSPropertyType }
     * 
     */
    public AffineCSPropertyType createAffineCSPropertyType() {
        return new AffineCSPropertyType();
    }

    /**
     * Create an instance of {@link FeaturePropertyType }
     * 
     */
    public FeaturePropertyType createFeaturePropertyType() {
        return new FeaturePropertyType();
    }

    /**
     * Create an instance of {@link GeometryPropertyType }
     * 
     */
    public GeometryPropertyType createGeometryPropertyType() {
        return new GeometryPropertyType();
    }

    /**
     * Create an instance of {@link GeometricComplexType }
     * 
     */
    public GeometricComplexType createGeometricComplexType() {
        return new GeometricComplexType();
    }

    /**
     * Create an instance of {@link ParameterValueType }
     * 
     */
    public ParameterValueType createParameterValueType() {
        return new ParameterValueType();
    }

    /**
     * Create an instance of {@link SingleCRSPropertyType }
     * 
     */
    public SingleCRSPropertyType createSingleCRSPropertyType() {
        return new SingleCRSPropertyType();
    }

    /**
     * Create an instance of {@link GeometryArrayPropertyType }
     * 
     */
    public GeometryArrayPropertyType createGeometryArrayPropertyType() {
        return new GeometryArrayPropertyType();
    }

    /**
     * Create an instance of {@link AbstractGeneralOperationParameterPropertyType }
     * 
     */
    public AbstractGeneralOperationParameterPropertyType createAbstractGeneralOperationParameterPropertyType() {
        return new AbstractGeneralOperationParameterPropertyType();
    }

    /**
     * Create an instance of {@link DiscreteCoverageType }
     * 
     */
    public DiscreteCoverageType createDiscreteCoverageType() {
        return new DiscreteCoverageType();
    }

    /**
     * Create an instance of {@link CartesianCSPropertyType }
     * 
     */
    public CartesianCSPropertyType createCartesianCSPropertyType() {
        return new CartesianCSPropertyType();
    }

    /**
     * Create an instance of {@link PointPropertyType1 }
     * 
     */
    public PointPropertyType1 createPointPropertyType1() {
        return new PointPropertyType1();
    }

    /**
     * Create an instance of {@link TimeInstantType }
     * 
     */
    public TimeInstantType createTimeInstantType() {
        return new TimeInstantType();
    }

    /**
     * Create an instance of {@link EngineeringCRSType }
     * 
     */
    public EngineeringCRSType createEngineeringCRSType() {
        return new EngineeringCRSType();
    }

    /**
     * Create an instance of {@link DefinitionType }
     * 
     */
    public DefinitionType createDefinitionType() {
        return new DefinitionType();
    }

    /**
     * Create an instance of {@link OperationParameterGroupPropertyType }
     * 
     */
    public OperationParameterGroupPropertyType createOperationParameterGroupPropertyType() {
        return new OperationParameterGroupPropertyType();
    }

    /**
     * Create an instance of {@link CRSPropertyType }
     * 
     */
    public CRSPropertyType createCRSPropertyType() {
        return new CRSPropertyType();
    }

    /**
     * Create an instance of {@link EllipsoidalCSPropertyType }
     * 
     */
    public EllipsoidalCSPropertyType createEllipsoidalCSPropertyType() {
        return new EllipsoidalCSPropertyType();
    }

    /**
     * Create an instance of {@link AbstractGeneralParameterValuePropertyType }
     * 
     */
    public AbstractGeneralParameterValuePropertyType createAbstractGeneralParameterValuePropertyType() {
        return new AbstractGeneralParameterValuePropertyType();
    }

    /**
     * Create an instance of {@link OperationMethodType }
     * 
     */
    public OperationMethodType createOperationMethodType() {
        return new OperationMethodType();
    }

    /**
     * Create an instance of {@link AbstractRingPropertyType }
     * 
     */
    public AbstractRingPropertyType createAbstractRingPropertyType() {
        return new AbstractRingPropertyType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link VerticalCSPropertyType }
     * 
     */
    public VerticalCSPropertyType createVerticalCSPropertyType() {
        return new VerticalCSPropertyType();
    }

    /**
     * Create an instance of {@link AbstractSolidType }
     * 
     */
    public AbstractSolidType createAbstractSolidType() {
        return new AbstractSolidType();
    }

    /**
     * Create an instance of {@link GeneralConversionPropertyType }
     * 
     */
    public GeneralConversionPropertyType createGeneralConversionPropertyType() {
        return new GeneralConversionPropertyType();
    }

    /**
     * Create an instance of {@link StringOrRefType }
     * 
     */
    public StringOrRefType createStringOrRefType() {
        return new StringOrRefType();
    }

    /**
     * Create an instance of {@link UserDefinedCSPropertyType }
     * 
     */
    public UserDefinedCSPropertyType createUserDefinedCSPropertyType() {
        return new UserDefinedCSPropertyType();
    }

    /**
     * Create an instance of {@link SurfacePropertyType1 }
     * 
     */
    public SurfacePropertyType1 createSurfacePropertyType1() {
        return new SurfacePropertyType1();
    }

    /**
     * Create an instance of {@link PolarCSPropertyType }
     * 
     */
    public PolarCSPropertyType createPolarCSPropertyType() {
        return new PolarCSPropertyType();
    }

    /**
     * Create an instance of {@link DirectedObservationAtDistanceType }
     * 
     */
    public DirectedObservationAtDistanceType createDirectedObservationAtDistanceType() {
        return new DirectedObservationAtDistanceType();
    }

    /**
     * Create an instance of {@link DirectedObservationType }
     * 
     */
    public DirectedObservationType createDirectedObservationType() {
        return new DirectedObservationType();
    }

    /**
     * Create an instance of {@link ObservationType }
     * 
     */
    public ObservationType createObservationType() {
        return new ObservationType();
    }

    /**
     * Create an instance of {@link GeocentricCRSPropertyType }
     * 
     */
    public GeocentricCRSPropertyType createGeocentricCRSPropertyType() {
        return new GeocentricCRSPropertyType();
    }

    /**
     * Create an instance of {@link TemporalDatumPropertyType }
     * 
     */
    public TemporalDatumPropertyType createTemporalDatumPropertyType() {
        return new TemporalDatumPropertyType();
    }

    /**
     * Create an instance of {@link LinearRingType }
     * 
     */
    public LinearRingType createLinearRingType() {
        return new LinearRingType();
    }

    /**
     * Create an instance of {@link PrimeMeridianPropertyType }
     * 
     */
    public PrimeMeridianPropertyType createPrimeMeridianPropertyType() {
        return new PrimeMeridianPropertyType();
    }

    /**
     * Create an instance of {@link MappingRuleType }
     * 
     */
    public MappingRuleType createMappingRuleType() {
        return new MappingRuleType();
    }

    /**
     * Create an instance of {@link LinearCSPropertyType }
     * 
     */
    public LinearCSPropertyType createLinearCSPropertyType() {
        return new LinearCSPropertyType();
    }

    /**
     * Create an instance of {@link CompoundCRSPropertyType }
     * 
     */
    public CompoundCRSPropertyType createCompoundCRSPropertyType() {
        return new CompoundCRSPropertyType();
    }

    /**
     * Create an instance of {@link VerticalCRSPropertyType }
     * 
     */
    public VerticalCRSPropertyType createVerticalCRSPropertyType() {
        return new VerticalCRSPropertyType();
    }

    /**
     * Create an instance of {@link MultiCurveType }
     * 
     */
    public MultiCurveType createMultiCurveType() {
        return new MultiCurveType();
    }

    /**
     * Create an instance of {@link BezierType }
     * 
     */
    public BezierType createBezierType() {
        return new BezierType();
    }

    /**
     * Create an instance of {@link BSplineType }
     * 
     */
    public BSplineType createBSplineType() {
        return new BSplineType();
    }

    /**
     * Create an instance of {@link EllipsoidalCSType }
     * 
     */
    public EllipsoidalCSType createEllipsoidalCSType() {
        return new EllipsoidalCSType();
    }

    /**
     * Create an instance of {@link CircleType }
     * 
     */
    public CircleType createCircleType() {
        return new CircleType();
    }

    /**
     * Create an instance of {@link ArcType1 }
     * 
     */
    public ArcType1 createArcType1() {
        return new ArcType1();
    }

    /**
     * Create an instance of {@link BoundingShapeType }
     * 
     */
    public BoundingShapeType createBoundingShapeType() {
        return new BoundingShapeType();
    }

    /**
     * Create an instance of {@link GeodeticCRSType }
     * 
     */
    public GeodeticCRSType createGeodeticCRSType() {
        return new GeodeticCRSType();
    }

    /**
     * Create an instance of {@link ObliqueCartesianCSPropertyType }
     * 
     */
    public ObliqueCartesianCSPropertyType createObliqueCartesianCSPropertyType() {
        return new ObliqueCartesianCSPropertyType();
    }

    /**
     * Create an instance of {@link EngineeringCRSPropertyType }
     * 
     */
    public EngineeringCRSPropertyType createEngineeringCRSPropertyType() {
        return new EngineeringCRSPropertyType();
    }

    /**
     * Create an instance of {@link MovingObjectStatusType }
     * 
     */
    public MovingObjectStatusType createMovingObjectStatusType() {
        return new MovingObjectStatusType();
    }

    /**
     * Create an instance of {@link TopoVolumeType }
     * 
     */
    public TopoVolumeType createTopoVolumeType() {
        return new TopoVolumeType();
    }

    /**
     * Create an instance of {@link ImageDatumType }
     * 
     */
    public ImageDatumType createImageDatumType() {
        return new ImageDatumType();
    }

    /**
     * Create an instance of {@link SurfacePatchArrayPropertyType }
     * 
     */
    public SurfacePatchArrayPropertyType createSurfacePatchArrayPropertyType() {
        return new SurfacePatchArrayPropertyType();
    }

    /**
     * Create an instance of {@link MultiCurvePropertyType }
     * 
     */
    public MultiCurvePropertyType createMultiCurvePropertyType() {
        return new MultiCurvePropertyType();
    }

    /**
     * Create an instance of {@link SolidPropertyType }
     * 
     */
    public SolidPropertyType createSolidPropertyType() {
        return new SolidPropertyType();
    }

    /**
     * Create an instance of {@link OperationParameterPropertyType }
     * 
     */
    public OperationParameterPropertyType createOperationParameterPropertyType() {
        return new OperationParameterPropertyType();
    }

    /**
     * Create an instance of {@link SecondDefiningParameter1 }
     * 
     */
    public SecondDefiningParameter1 createSecondDefiningParameter1() {
        return new SecondDefiningParameter1();
    }

    /**
     * Create an instance of {@link LinearCSType }
     * 
     */
    public LinearCSType createLinearCSType() {
        return new LinearCSType();
    }

    /**
     * Create an instance of {@link TemporalCRSType }
     * 
     */
    public TemporalCRSType createTemporalCRSType() {
        return new TemporalCRSType();
    }

    /**
     * Create an instance of {@link DirectedTopoSolidPropertyType }
     * 
     */
    public DirectedTopoSolidPropertyType createDirectedTopoSolidPropertyType() {
        return new DirectedTopoSolidPropertyType();
    }

    /**
     * Create an instance of {@link TimeOrdinalReferenceSystemType }
     * 
     */
    public TimeOrdinalReferenceSystemType createTimeOrdinalReferenceSystemType() {
        return new TimeOrdinalReferenceSystemType();
    }

    /**
     * Create an instance of {@link TimeReferenceSystemType }
     * 
     */
    public TimeReferenceSystemType createTimeReferenceSystemType() {
        return new TimeReferenceSystemType();
    }

    /**
     * Create an instance of {@link TimeIntervalLengthType }
     * 
     */
    public TimeIntervalLengthType createTimeIntervalLengthType() {
        return new TimeIntervalLengthType();
    }

    /**
     * Create an instance of {@link CoordinateSystemPropertyType }
     * 
     */
    public CoordinateSystemPropertyType createCoordinateSystemPropertyType() {
        return new CoordinateSystemPropertyType();
    }

    /**
     * Create an instance of {@link GeographicCRSType }
     * 
     */
    public GeographicCRSType createGeographicCRSType() {
        return new GeographicCRSType();
    }

    /**
     * Create an instance of {@link CircleByCenterPointType }
     * 
     */
    public CircleByCenterPointType createCircleByCenterPointType() {
        return new CircleByCenterPointType();
    }

    /**
     * Create an instance of {@link ArcByCenterPointType }
     * 
     */
    public ArcByCenterPointType createArcByCenterPointType() {
        return new ArcByCenterPointType();
    }

    /**
     * Create an instance of {@link ConversionToPreferredUnitType }
     * 
     */
    public ConversionToPreferredUnitType createConversionToPreferredUnitType() {
        return new ConversionToPreferredUnitType();
    }

    /**
     * Create an instance of {@link DerivedCRSType }
     * 
     */
    public DerivedCRSType createDerivedCRSType() {
        return new DerivedCRSType();
    }

    /**
     * Create an instance of {@link UserDefinedCSType }
     * 
     */
    public UserDefinedCSType createUserDefinedCSType() {
        return new UserDefinedCSType();
    }

    /**
     * Create an instance of {@link FeatureArrayPropertyType }
     * 
     */
    public FeatureArrayPropertyType createFeatureArrayPropertyType() {
        return new FeatureArrayPropertyType();
    }

    /**
     * Create an instance of {@link TopoPrimitiveMemberType }
     * 
     */
    public TopoPrimitiveMemberType createTopoPrimitiveMemberType() {
        return new TopoPrimitiveMemberType();
    }

    /**
     * Create an instance of {@link MultiSurfacePropertyType }
     * 
     */
    public MultiSurfacePropertyType createMultiSurfacePropertyType() {
        return new MultiSurfacePropertyType();
    }

    /**
     * Create an instance of {@link CylinderType }
     * 
     */
    public CylinderType createCylinderType() {
        return new CylinderType();
    }

    /**
     * Create an instance of {@link TopoSolidType }
     * 
     */
    public TopoSolidType createTopoSolidType() {
        return new TopoSolidType();
    }

    /**
     * Create an instance of {@link MultiPointPropertyType }
     * 
     */
    public MultiPointPropertyType createMultiPointPropertyType() {
        return new MultiPointPropertyType();
    }

    /**
     * Create an instance of {@link LineStringSegmentType }
     * 
     */
    public LineStringSegmentType createLineStringSegmentType() {
        return new LineStringSegmentType();
    }

    /**
     * Create an instance of {@link AngleType }
     * 
     */
    public AngleType createAngleType() {
        return new AngleType();
    }

    /**
     * Create an instance of {@link CylindricalCSPropertyType }
     * 
     */
    public CylindricalCSPropertyType createCylindricalCSPropertyType() {
        return new CylindricalCSPropertyType();
    }

    /**
     * Create an instance of {@link CompoundCRSType }
     * 
     */
    public CompoundCRSType createCompoundCRSType() {
        return new CompoundCRSType();
    }

    /**
     * Create an instance of {@link GeodeticDatumPropertyType }
     * 
     */
    public GeodeticDatumPropertyType createGeodeticDatumPropertyType() {
        return new GeodeticDatumPropertyType();
    }

    /**
     * Create an instance of {@link SurfaceArrayPropertyType }
     * 
     */
    public SurfaceArrayPropertyType createSurfaceArrayPropertyType() {
        return new SurfaceArrayPropertyType();
    }

    /**
     * Create an instance of {@link IndirectEntryType }
     * 
     */
    public IndirectEntryType createIndirectEntryType() {
        return new IndirectEntryType();
    }

    /**
     * Create an instance of {@link OperationMethodPropertyType }
     * 
     */
    public OperationMethodPropertyType createOperationMethodPropertyType() {
        return new OperationMethodPropertyType();
    }

    /**
     * Create an instance of {@link DynamicFeatureMemberType }
     * 
     */
    public DynamicFeatureMemberType createDynamicFeatureMemberType() {
        return new DynamicFeatureMemberType();
    }

    /**
     * Create an instance of {@link UnitOfMeasureType }
     * 
     */
    public UnitOfMeasureType createUnitOfMeasureType() {
        return new UnitOfMeasureType();
    }

    /**
     * Create an instance of {@link ImageCRSPropertyType }
     * 
     */
    public ImageCRSPropertyType createImageCRSPropertyType() {
        return new ImageCRSPropertyType();
    }

    /**
     * Create an instance of {@link CurvePropertyType1 }
     * 
     */
    public CurvePropertyType1 createCurvePropertyType1() {
        return new CurvePropertyType1();
    }

    /**
     * Create an instance of {@link DirectedNodePropertyType }
     * 
     */
    public DirectedNodePropertyType createDirectedNodePropertyType() {
        return new DirectedNodePropertyType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link ImageDatumPropertyType }
     * 
     */
    public ImageDatumPropertyType createImageDatumPropertyType() {
        return new ImageDatumPropertyType();
    }

    /**
     * Create an instance of {@link BaseUnitType }
     * 
     */
    public BaseUnitType createBaseUnitType() {
        return new BaseUnitType();
    }

    /**
     * Create an instance of {@link UnitDefinitionType }
     * 
     */
    public UnitDefinitionType createUnitDefinitionType() {
        return new UnitDefinitionType();
    }

    /**
     * Create an instance of {@link TimeCoordinateSystemType }
     * 
     */
    public TimeCoordinateSystemType createTimeCoordinateSystemType() {
        return new TimeCoordinateSystemType();
    }

    /**
     * Create an instance of {@link SolidArrayPropertyType }
     * 
     */
    public SolidArrayPropertyType createSolidArrayPropertyType() {
        return new SolidArrayPropertyType();
    }

    /**
     * Create an instance of {@link CurveArrayPropertyType }
     * 
     */
    public CurveArrayPropertyType createCurveArrayPropertyType() {
        return new CurveArrayPropertyType();
    }

    /**
     * Create an instance of {@link TimeClockType }
     * 
     */
    public TimeClockType createTimeClockType() {
        return new TimeClockType();
    }

    /**
     * Create an instance of {@link GeodeticCRSPropertyType }
     * 
     */
    public GeodeticCRSPropertyType createGeodeticCRSPropertyType() {
        return new GeodeticCRSPropertyType();
    }

    /**
     * Create an instance of {@link TopoComplexPropertyType }
     * 
     */
    public TopoComplexPropertyType createTopoComplexPropertyType() {
        return new TopoComplexPropertyType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link TopoSurfaceType }
     * 
     */
    public TopoSurfaceType createTopoSurfaceType() {
        return new TopoSurfaceType();
    }

    /**
     * Create an instance of {@link TimeCSType }
     * 
     */
    public TimeCSType createTimeCSType() {
        return new TimeCSType();
    }

    /**
     * Create an instance of {@link CurveSegmentArrayPropertyType }
     * 
     */
    public CurveSegmentArrayPropertyType createCurveSegmentArrayPropertyType() {
        return new CurveSegmentArrayPropertyType();
    }

    /**
     * Create an instance of {@link PassThroughOperationType }
     * 
     */
    public PassThroughOperationType createPassThroughOperationType() {
        return new PassThroughOperationType();
    }

    /**
     * Create an instance of {@link VerticalCRSType }
     * 
     */
    public VerticalCRSType createVerticalCRSType() {
        return new VerticalCRSType();
    }

    /**
     * Create an instance of {@link AssociationRoleType }
     * 
     */
    public AssociationRoleType createAssociationRoleType() {
        return new AssociationRoleType();
    }

    /**
     * Create an instance of {@link CompositeValueType }
     * 
     */
    public CompositeValueType createCompositeValueType() {
        return new CompositeValueType();
    }

    /**
     * Create an instance of {@link ValueArrayPropertyType }
     * 
     */
    public ValueArrayPropertyType createValueArrayPropertyType() {
        return new ValueArrayPropertyType();
    }

    /**
     * Create an instance of {@link TemporalCSPropertyType }
     * 
     */
    public TemporalCSPropertyType createTemporalCSPropertyType() {
        return new TemporalCSPropertyType();
    }

    /**
     * Create an instance of {@link DirectedEdgePropertyType }
     * 
     */
    public DirectedEdgePropertyType createDirectedEdgePropertyType() {
        return new DirectedEdgePropertyType();
    }

    /**
     * Create an instance of {@link PrimeMeridianType }
     * 
     */
    public PrimeMeridianType createPrimeMeridianType() {
        return new PrimeMeridianType();
    }

    /**
     * Create an instance of {@link CompositeSolidType }
     * 
     */
    public CompositeSolidType createCompositeSolidType() {
        return new CompositeSolidType();
    }

    /**
     * Create an instance of {@link GeodesicType }
     * 
     */
    public GeodesicType createGeodesicType() {
        return new GeodesicType();
    }

    /**
     * Create an instance of {@link GeodesicStringType }
     * 
     */
    public GeodesicStringType createGeodesicStringType() {
        return new GeodesicStringType();
    }

    /**
     * Create an instance of {@link PriorityLocationPropertyType }
     * 
     */
    public PriorityLocationPropertyType createPriorityLocationPropertyType() {
        return new PriorityLocationPropertyType();
    }

    /**
     * Create an instance of {@link LocationPropertyType }
     * 
     */
    public LocationPropertyType createLocationPropertyType() {
        return new LocationPropertyType();
    }

    /**
     * Create an instance of {@link DefinitionProxyType }
     * 
     */
    public DefinitionProxyType createDefinitionProxyType() {
        return new DefinitionProxyType();
    }

    /**
     * Create an instance of {@link ValueArrayType }
     * 
     */
    public ValueArrayType createValueArrayType() {
        return new ValueArrayType();
    }

    /**
     * Create an instance of {@link TargetPropertyType }
     * 
     */
    public TargetPropertyType createTargetPropertyType() {
        return new TargetPropertyType();
    }

    /**
     * Create an instance of {@link DynamicFeatureCollectionType }
     * 
     */
    public DynamicFeatureCollectionType createDynamicFeatureCollectionType() {
        return new DynamicFeatureCollectionType();
    }

    /**
     * Create an instance of {@link DynamicFeatureType }
     * 
     */
    public DynamicFeatureType createDynamicFeatureType() {
        return new DynamicFeatureType();
    }

    /**
     * Create an instance of {@link DirectedFacePropertyType }
     * 
     */
    public DirectedFacePropertyType createDirectedFacePropertyType() {
        return new DirectedFacePropertyType();
    }

    /**
     * Create an instance of {@link DirectPositionListType }
     * 
     */
    public DirectPositionListType createDirectPositionListType() {
        return new DirectPositionListType();
    }

    /**
     * Create an instance of {@link VerticalCSType }
     * 
     */
    public VerticalCSType createVerticalCSType() {
        return new VerticalCSType();
    }

    /**
     * Create an instance of {@link ArrayAssociationType }
     * 
     */
    public ArrayAssociationType createArrayAssociationType() {
        return new ArrayAssociationType();
    }

    /**
     * Create an instance of {@link TemporalCSType }
     * 
     */
    public TemporalCSType createTemporalCSType() {
        return new TemporalCSType();
    }

    /**
     * Create an instance of {@link VerticalDatumType }
     * 
     */
    public VerticalDatumType createVerticalDatumType() {
        return new VerticalDatumType();
    }

    /**
     * Create an instance of {@link ConversionType }
     * 
     */
    public ConversionType createConversionType() {
        return new ConversionType();
    }

    /**
     * Create an instance of {@link CoordinateSystemAxisPropertyType }
     * 
     */
    public CoordinateSystemAxisPropertyType createCoordinateSystemAxisPropertyType() {
        return new CoordinateSystemAxisPropertyType();
    }

    /**
     * Create an instance of {@link MultiSolidType }
     * 
     */
    public MultiSolidType createMultiSolidType() {
        return new MultiSolidType();
    }

    /**
     * Create an instance of {@link CylindricalCSType }
     * 
     */
    public CylindricalCSType createCylindricalCSType() {
        return new CylindricalCSType();
    }

    /**
     * Create an instance of {@link TopoPointPropertyType }
     * 
     */
    public TopoPointPropertyType createTopoPointPropertyType() {
        return new TopoPointPropertyType();
    }

    /**
     * Create an instance of {@link FileType }
     * 
     */
    public FileType createFileType() {
        return new FileType();
    }

    /**
     * Create an instance of {@link PointArrayPropertyType }
     * 
     */
    public PointArrayPropertyType createPointArrayPropertyType() {
        return new PointArrayPropertyType();
    }

    /**
     * Create an instance of {@link DictionaryType }
     * 
     */
    public DictionaryType createDictionaryType() {
        return new DictionaryType();
    }

    /**
     * Create an instance of {@link ConventionalUnitType }
     * 
     */
    public ConventionalUnitType createConventionalUnitType() {
        return new ConventionalUnitType();
    }

    /**
     * Create an instance of {@link MeasureOrNilReasonListType }
     * 
     */
    public MeasureOrNilReasonListType createMeasureOrNilReasonListType() {
        return new MeasureOrNilReasonListType();
    }

    /**
     * Create an instance of {@link CoordinateSystemAxisType }
     * 
     */
    public CoordinateSystemAxisType createCoordinateSystemAxisType() {
        return new CoordinateSystemAxisType();
    }

    /**
     * Create an instance of {@link MultiSolidPropertyType }
     * 
     */
    public MultiSolidPropertyType createMultiSolidPropertyType() {
        return new MultiSolidPropertyType();
    }

    /**
     * Create an instance of {@link QuantityExtentType }
     * 
     */
    public QuantityExtentType createQuantityExtentType() {
        return new QuantityExtentType();
    }

    /**
     * Create an instance of {@link EngineeringDatumPropertyType }
     * 
     */
    public EngineeringDatumPropertyType createEngineeringDatumPropertyType() {
        return new EngineeringDatumPropertyType();
    }

    /**
     * Create an instance of {@link TimeOrdinalEraType }
     * 
     */
    public TimeOrdinalEraType createTimeOrdinalEraType() {
        return new TimeOrdinalEraType();
    }

    /**
     * Create an instance of {@link DirectionPropertyType }
     * 
     */
    public DirectionPropertyType createDirectionPropertyType() {
        return new DirectionPropertyType();
    }

    /**
     * Create an instance of {@link OperationParameterGroupType }
     * 
     */
    public OperationParameterGroupType createOperationParameterGroupType() {
        return new OperationParameterGroupType();
    }

    /**
     * Create an instance of {@link ArrayType }
     * 
     */
    public ArrayType createArrayType() {
        return new ArrayType();
    }

    /**
     * Create an instance of {@link CodeOrNilReasonListType }
     * 
     */
    public CodeOrNilReasonListType createCodeOrNilReasonListType() {
        return new CodeOrNilReasonListType();
    }

    /**
     * Create an instance of {@link SingleOperationPropertyType }
     * 
     */
    public SingleOperationPropertyType createSingleOperationPropertyType() {
        return new SingleOperationPropertyType();
    }

    /**
     * Create an instance of {@link MultiGeometryType }
     * 
     */
    public MultiGeometryType createMultiGeometryType() {
        return new MultiGeometryType();
    }

    /**
     * Create an instance of {@link EdgeType }
     * 
     */
    public EdgeType createEdgeType() {
        return new EdgeType();
    }

    /**
     * Create an instance of {@link VerticalDatumPropertyType }
     * 
     */
    public VerticalDatumPropertyType createVerticalDatumPropertyType() {
        return new VerticalDatumPropertyType();
    }

    /**
     * Create an instance of {@link ConcatenatedOperationPropertyType }
     * 
     */
    public ConcatenatedOperationPropertyType createConcatenatedOperationPropertyType() {
        return new ConcatenatedOperationPropertyType();
    }

    /**
     * Create an instance of {@link OperationPropertyType }
     * 
     */
    public OperationPropertyType createOperationPropertyType() {
        return new OperationPropertyType();
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link OffsetCurveType }
     * 
     */
    public OffsetCurveType createOffsetCurveType() {
        return new OffsetCurveType();
    }

    /**
     * Create an instance of {@link ValuePropertyType }
     * 
     */
    public ValuePropertyType createValuePropertyType() {
        return new ValuePropertyType();
    }

    /**
     * Create an instance of {@link ProcedurePropertyType }
     * 
     */
    public ProcedurePropertyType createProcedurePropertyType() {
        return new ProcedurePropertyType();
    }

    /**
     * Create an instance of {@link TopoComplexType }
     * 
     */
    public TopoComplexType createTopoComplexType() {
        return new TopoComplexType();
    }

    /**
     * Create an instance of {@link CoordinateOperationAccuracy }
     * 
     */
    public CoordinateOperationAccuracy createCoordinateOperationAccuracy() {
        return new CoordinateOperationAccuracy();
    }

    /**
     * Create an instance of {@link DerivationUnitTermType }
     * 
     */
    public DerivationUnitTermType createDerivationUnitTermType() {
        return new DerivationUnitTermType();
    }

    /**
     * Create an instance of {@link ProjectedCRSPropertyType }
     * 
     */
    public ProjectedCRSPropertyType createProjectedCRSPropertyType() {
        return new ProjectedCRSPropertyType();
    }

    /**
     * Create an instance of {@link ImageCRSType }
     * 
     */
    public ImageCRSType createImageCRSType() {
        return new ImageCRSType();
    }

    /**
     * Create an instance of {@link SecondDefiningParameter }
     * 
     */
    public SecondDefiningParameter createSecondDefiningParameter() {
        return new SecondDefiningParameter();
    }

    /**
     * Create an instance of {@link MultiSurfaceType }
     * 
     */
    public MultiSurfaceType createMultiSurfaceType() {
        return new MultiSurfaceType();
    }

    /**
     * Create an instance of {@link CoordinateOperationPropertyType }
     * 
     */
    public CoordinateOperationPropertyType createCoordinateOperationPropertyType() {
        return new CoordinateOperationPropertyType();
    }

    /**
     * Create an instance of {@link DictionaryEntryType }
     * 
     */
    public DictionaryEntryType createDictionaryEntryType() {
        return new DictionaryEntryType();
    }

    /**
     * Create an instance of {@link TimeEdgeType }
     * 
     */
    public TimeEdgeType createTimeEdgeType() {
        return new TimeEdgeType();
    }

    /**
     * Create an instance of {@link EnvelopeType }
     * 
     */
    public EnvelopeType createEnvelopeType() {
        return new EnvelopeType();
    }

    /**
     * Create an instance of {@link SolidType }
     * 
     */
    public SolidType createSolidType() {
        return new SolidType();
    }

    /**
     * Create an instance of {@link TimeCalendarEraType }
     * 
     */
    public TimeCalendarEraType createTimeCalendarEraType() {
        return new TimeCalendarEraType();
    }

    /**
     * Create an instance of {@link SphericalCSType }
     * 
     */
    public SphericalCSType createSphericalCSType() {
        return new SphericalCSType();
    }

    /**
     * Create an instance of {@link DirectPositionType }
     * 
     */
    public DirectPositionType createDirectPositionType() {
        return new DirectPositionType();
    }

    /**
     * Create an instance of {@link SphericalCSPropertyType }
     * 
     */
    public SphericalCSPropertyType createSphericalCSPropertyType() {
        return new SphericalCSPropertyType();
    }

    /**
     * Create an instance of {@link VectorType }
     * 
     */
    public VectorType createVectorType() {
        return new VectorType();
    }

    /**
     * Create an instance of {@link FaceType }
     * 
     */
    public FaceType createFaceType() {
        return new FaceType();
    }

    /**
     * Create an instance of {@link DatumPropertyType }
     * 
     */
    public DatumPropertyType createDatumPropertyType() {
        return new DatumPropertyType();
    }

    /**
     * Create an instance of {@link CoordinatesType }
     * 
     */
    public CoordinatesType createCoordinatesType() {
        return new CoordinatesType();
    }

    /**
     * Create an instance of {@link GeodeticDatumType }
     * 
     */
    public GeodeticDatumType createGeodeticDatumType() {
        return new GeodeticDatumType();
    }

    /**
     * Create an instance of {@link RingType }
     * 
     */
    public RingType createRingType() {
        return new RingType();
    }

    /**
     * Create an instance of {@link TemporalCRSPropertyType }
     * 
     */
    public TemporalCRSPropertyType createTemporalCRSPropertyType() {
        return new TemporalCRSPropertyType();
    }

    /**
     * Create an instance of {@link ConcatenatedOperationType }
     * 
     */
    public ConcatenatedOperationType createConcatenatedOperationType() {
        return new ConcatenatedOperationType();
    }

    /**
     * Create an instance of {@link TopoCurvePropertyType }
     * 
     */
    public TopoCurvePropertyType createTopoCurvePropertyType() {
        return new TopoCurvePropertyType();
    }

    /**
     * Create an instance of {@link GridFunctionType }
     * 
     */
    public GridFunctionType createGridFunctionType() {
        return new GridFunctionType();
    }

    /**
     * Create an instance of {@link TimeNodeType }
     * 
     */
    public TimeNodeType createTimeNodeType() {
        return new TimeNodeType();
    }

    /**
     * Create an instance of {@link ArcByBulgeType }
     * 
     */
    public ArcByBulgeType createArcByBulgeType() {
        return new ArcByBulgeType();
    }

    /**
     * Create an instance of {@link ArcStringByBulgeType }
     * 
     */
    public ArcStringByBulgeType createArcStringByBulgeType() {
        return new ArcStringByBulgeType();
    }

    /**
     * Create an instance of {@link DerivedUnitType }
     * 
     */
    public DerivedUnitType createDerivedUnitType() {
        return new DerivedUnitType();
    }

    /**
     * Create an instance of {@link EllipsoidPropertyType }
     * 
     */
    public EllipsoidPropertyType createEllipsoidPropertyType() {
        return new EllipsoidPropertyType();
    }

    /**
     * Create an instance of {@link AffinePlacementType }
     * 
     */
    public AffinePlacementType createAffinePlacementType() {
        return new AffinePlacementType();
    }

    /**
     * Create an instance of {@link CodeWithAuthorityType }
     * 
     */
    public CodeWithAuthorityType createCodeWithAuthorityType() {
        return new CodeWithAuthorityType();
    }

    /**
     * Create an instance of {@link InlinePropertyType }
     * 
     */
    public InlinePropertyType createInlinePropertyType() {
        return new InlinePropertyType();
    }

    /**
     * Create an instance of {@link PolygonType }
     * 
     */
    public PolygonType createPolygonType() {
        return new PolygonType();
    }

    /**
     * Create an instance of {@link OperationParameterType }
     * 
     */
    public OperationParameterType createOperationParameterType() {
        return new OperationParameterType();
    }

    /**
     * Create an instance of {@link TemporalDatumType }
     * 
     */
    public TemporalDatumType createTemporalDatumType() {
        return new TemporalDatumType();
    }

    /**
     * Create an instance of {@link FormulaCitation }
     * 
     */
    public FormulaCitation createFormulaCitation() {
        return new FormulaCitation();
    }

    /**
     * Create an instance of {@link CICitationType }
     * 
     */
    public CICitationType createCICitationType() {
        return new CICitationType();
    }

    /**
     * Create an instance of {@link EnvelopeWithTimePeriodType }
     * 
     */
    public EnvelopeWithTimePeriodType createEnvelopeWithTimePeriodType() {
        return new EnvelopeWithTimePeriodType();
    }

    /**
     * Create an instance of {@link MetaDataPropertyType }
     * 
     */
    public MetaDataPropertyType createMetaDataPropertyType() {
        return new MetaDataPropertyType();
    }

    /**
     * Create an instance of {@link CompositeSurfaceType }
     * 
     */
    public CompositeSurfaceType createCompositeSurfaceType() {
        return new CompositeSurfaceType();
    }

    /**
     * Create an instance of {@link ObliqueCartesianCSType }
     * 
     */
    public ObliqueCartesianCSType createObliqueCartesianCSType() {
        return new ObliqueCartesianCSType();
    }

    /**
     * Create an instance of {@link DataBlockType }
     * 
     */
    public DataBlockType createDataBlockType() {
        return new DataBlockType();
    }

    /**
     * Create an instance of {@link ShellType }
     * 
     */
    public ShellType createShellType() {
        return new ShellType();
    }

    /**
     * Create an instance of {@link GeneralTransformationPropertyType }
     * 
     */
    public GeneralTransformationPropertyType createGeneralTransformationPropertyType() {
        return new GeneralTransformationPropertyType();
    }

    /**
     * Create an instance of {@link TimeCalendarType }
     * 
     */
    public TimeCalendarType createTimeCalendarType() {
        return new TimeCalendarType();
    }

    /**
     * Create an instance of {@link TransformationPropertyType }
     * 
     */
    public TransformationPropertyType createTransformationPropertyType() {
        return new TransformationPropertyType();
    }

    /**
     * Create an instance of {@link GeographicCRSPropertyType }
     * 
     */
    public GeographicCRSPropertyType createGeographicCRSPropertyType() {
        return new GeographicCRSPropertyType();
    }

    /**
     * Create an instance of {@link LineStringType }
     * 
     */
    public LineStringType createLineStringType() {
        return new LineStringType();
    }

    /**
     * Create an instance of {@link PolygonPatchType }
     * 
     */
    public PolygonPatchType createPolygonPatchType() {
        return new PolygonPatchType();
    }

    /**
     * Create an instance of {@link RangeSetType }
     * 
     */
    public RangeSetType createRangeSetType() {
        return new RangeSetType();
    }

    /**
     * Create an instance of {@link EllipsoidType }
     * 
     */
    public EllipsoidType createEllipsoidType() {
        return new EllipsoidType();
    }

    /**
     * Create an instance of {@link GenericMetaDataType }
     * 
     */
    public GenericMetaDataType createGenericMetaDataType() {
        return new GenericMetaDataType();
    }

    /**
     * Create an instance of {@link ParameterValueGroupType }
     * 
     */
    public ParameterValueGroupType createParameterValueGroupType() {
        return new ParameterValueGroupType();
    }

    /**
     * Create an instance of {@link TriangleType }
     * 
     */
    public TriangleType createTriangleType() {
        return new TriangleType();
    }

    /**
     * Create an instance of {@link RectangleType }
     * 
     */
    public RectangleType createRectangleType() {
        return new RectangleType();
    }

    /**
     * Create an instance of {@link Count }
     * 
     */
    public Count createCount() {
        return new Count();
    }

    /**
     * Create an instance of {@link DegreesType }
     * 
     */
    public DegreesType createDegreesType() {
        return new DegreesType();
    }

    /**
     * Create an instance of {@link com.iwxxm.metarSpeci.Boolean }
     * 
     */
    public com.iwxxm.metarSpeci.Boolean createBoolean() {
        return new com.iwxxm.metarSpeci.Boolean();
    }

    /**
     * Create an instance of {@link CartesianCSType }
     * 
     */
    public CartesianCSType createCartesianCSType() {
        return new CartesianCSType();
    }

    /**
     * Create an instance of {@link TimePeriodType }
     * 
     */
    public TimePeriodType createTimePeriodType() {
        return new TimePeriodType();
    }

    /**
     * Create an instance of {@link PassThroughOperationPropertyType }
     * 
     */
    public PassThroughOperationPropertyType createPassThroughOperationPropertyType() {
        return new PassThroughOperationPropertyType();
    }

    /**
     * Create an instance of {@link GeocentricCRSType }
     * 
     */
    public GeocentricCRSType createGeocentricCRSType() {
        return new GeocentricCRSType();
    }

    /**
     * Create an instance of {@link ConversionPropertyType }
     * 
     */
    public ConversionPropertyType createConversionPropertyType() {
        return new ConversionPropertyType();
    }

    /**
     * Create an instance of {@link ConeType }
     * 
     */
    public ConeType createConeType() {
        return new ConeType();
    }

    /**
     * Create an instance of {@link DomainOfValidity }
     * 
     */
    public DomainOfValidity createDomainOfValidity() {
        return new DomainOfValidity();
    }

    /**
     * Create an instance of {@link EXExtentType }
     * 
     */
    public EXExtentType createEXExtentType() {
        return new EXExtentType();
    }

    /**
     * Create an instance of {@link PolarCSType }
     * 
     */
    public PolarCSType createPolarCSType() {
        return new PolarCSType();
    }

    /**
     * Create an instance of {@link ProjectedCRSType }
     * 
     */
    public ProjectedCRSType createProjectedCRSType() {
        return new ProjectedCRSType();
    }

    /**
     * Create an instance of {@link MultiPointType }
     * 
     */
    public MultiPointType createMultiPointType() {
        return new MultiPointType();
    }

    /**
     * Create an instance of {@link TransformationType }
     * 
     */
    public TransformationType createTransformationType() {
        return new TransformationType();
    }

    /**
     * Create an instance of {@link OrientableSurfaceType }
     * 
     */
    public OrientableSurfaceType createOrientableSurfaceType() {
        return new OrientableSurfaceType();
    }

    /**
     * Create an instance of {@link TopoPrimitiveArrayAssociationType }
     * 
     */
    public TopoPrimitiveArrayAssociationType createTopoPrimitiveArrayAssociationType() {
        return new TopoPrimitiveArrayAssociationType();
    }

    /**
     * Create an instance of {@link DMSAngleType }
     * 
     */
    public DMSAngleType createDMSAngleType() {
        return new DMSAngleType();
    }

    /**
     * Create an instance of {@link CubicSplineType }
     * 
     */
    public CubicSplineType createCubicSplineType() {
        return new CubicSplineType();
    }

    /**
     * Create an instance of {@link CategoryExtentType }
     * 
     */
    public CategoryExtentType createCategoryExtentType() {
        return new CategoryExtentType();
    }

    /**
     * Create an instance of {@link HistoryPropertyType }
     * 
     */
    public HistoryPropertyType createHistoryPropertyType() {
        return new HistoryPropertyType();
    }

    /**
     * Create an instance of {@link OrientableCurveType }
     * 
     */
    public OrientableCurveType createOrientableCurveType() {
        return new OrientableCurveType();
    }

    /**
     * Create an instance of {@link EngineeringDatumType }
     * 
     */
    public EngineeringDatumType createEngineeringDatumType() {
        return new EngineeringDatumType();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link TopoSurfacePropertyType }
     * 
     */
    public TopoSurfacePropertyType createTopoSurfacePropertyType() {
        return new TopoSurfacePropertyType();
    }

    /**
     * Create an instance of {@link CompositeCurveType }
     * 
     */
    public CompositeCurveType createCompositeCurveType() {
        return new CompositeCurveType();
    }

    /**
     * Create an instance of {@link AffineCSType }
     * 
     */
    public AffineCSType createAffineCSType() {
        return new AffineCSType();
    }

    /**
     * Create an instance of {@link MultiGeometryPropertyType }
     * 
     */
    public MultiGeometryPropertyType createMultiGeometryPropertyType() {
        return new MultiGeometryPropertyType();
    }

    /**
     * Create an instance of {@link TimePositionType }
     * 
     */
    public TimePositionType createTimePositionType() {
        return new TimePositionType();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link BagType }
     * 
     */
    public BagType createBagType() {
        return new BagType();
    }

    /**
     * Create an instance of {@link FeatureCollectionType }
     * 
     */
    public FeatureCollectionType createFeatureCollectionType() {
        return new FeatureCollectionType();
    }

    /**
     * Create an instance of {@link MeasureListType }
     * 
     */
    public MeasureListType createMeasureListType() {
        return new MeasureListType();
    }

    /**
     * Create an instance of {@link ScaleType }
     * 
     */
    public ScaleType createScaleType() {
        return new ScaleType();
    }

    /**
     * Create an instance of {@link TimeCalendarEraPropertyType }
     * 
     */
    public TimeCalendarEraPropertyType createTimeCalendarEraPropertyType() {
        return new TimeCalendarEraPropertyType();
    }

    /**
     * Create an instance of {@link TopoSolidPropertyType }
     * 
     */
    public TopoSolidPropertyType createTopoSolidPropertyType() {
        return new TopoSolidPropertyType();
    }

    /**
     * Create an instance of {@link TimeCalendarPropertyType }
     * 
     */
    public TimeCalendarPropertyType createTimeCalendarPropertyType() {
        return new TimeCalendarPropertyType();
    }

    /**
     * Create an instance of {@link CategoryPropertyType }
     * 
     */
    public CategoryPropertyType createCategoryPropertyType() {
        return new CategoryPropertyType();
    }

    /**
     * Create an instance of {@link CodeListType }
     * 
     */
    public CodeListType createCodeListType() {
        return new CodeListType();
    }

    /**
     * Create an instance of {@link GridEnvelopeType }
     * 
     */
    public GridEnvelopeType createGridEnvelopeType() {
        return new GridEnvelopeType();
    }

    /**
     * Create an instance of {@link DirectionVectorType }
     * 
     */
    public DirectionVectorType createDirectionVectorType() {
        return new DirectionVectorType();
    }

    /**
     * Create an instance of {@link GeometricPrimitivePropertyType }
     * 
     */
    public GeometricPrimitivePropertyType createGeometricPrimitivePropertyType() {
        return new GeometricPrimitivePropertyType();
    }

    /**
     * Create an instance of {@link TimeOrdinalEraPropertyType }
     * 
     */
    public TimeOrdinalEraPropertyType createTimeOrdinalEraPropertyType() {
        return new TimeOrdinalEraPropertyType();
    }

    /**
     * Create an instance of {@link DefinitionBaseType }
     * 
     */
    public DefinitionBaseType createDefinitionBaseType() {
        return new DefinitionBaseType();
    }

    /**
     * Create an instance of {@link TimeNodePropertyType }
     * 
     */
    public TimeNodePropertyType createTimeNodePropertyType() {
        return new TimeNodePropertyType();
    }

    /**
     * Create an instance of {@link GridLimitsType }
     * 
     */
    public GridLimitsType createGridLimitsType() {
        return new GridLimitsType();
    }

    /**
     * Create an instance of {@link NodePropertyType }
     * 
     */
    public NodePropertyType createNodePropertyType() {
        return new NodePropertyType();
    }

    /**
     * Create an instance of {@link GeometricComplexPropertyType }
     * 
     */
    public GeometricComplexPropertyType createGeometricComplexPropertyType() {
        return new GeometricComplexPropertyType();
    }

    /**
     * Create an instance of {@link TimeClockPropertyType }
     * 
     */
    public TimeClockPropertyType createTimeClockPropertyType() {
        return new TimeClockPropertyType();
    }

    /**
     * Create an instance of {@link DirectionDescriptionType }
     * 
     */
    public DirectionDescriptionType createDirectionDescriptionType() {
        return new DirectionDescriptionType();
    }

    /**
     * Create an instance of {@link AreaType }
     * 
     */
    public AreaType createAreaType() {
        return new AreaType();
    }

    /**
     * Create an instance of {@link FormulaType }
     * 
     */
    public FormulaType createFormulaType() {
        return new FormulaType();
    }

    /**
     * Create an instance of {@link LineStringSegmentArrayPropertyType }
     * 
     */
    public LineStringSegmentArrayPropertyType createLineStringSegmentArrayPropertyType() {
        return new LineStringSegmentArrayPropertyType();
    }

    /**
     * Create an instance of {@link RingPropertyType }
     * 
     */
    public RingPropertyType createRingPropertyType() {
        return new RingPropertyType();
    }

    /**
     * Create an instance of {@link FaceOrTopoSolidPropertyType }
     * 
     */
    public FaceOrTopoSolidPropertyType createFaceOrTopoSolidPropertyType() {
        return new FaceOrTopoSolidPropertyType();
    }

    /**
     * Create an instance of {@link AngleChoiceType }
     * 
     */
    public AngleChoiceType createAngleChoiceType() {
        return new AngleChoiceType();
    }

    /**
     * Create an instance of {@link TimePeriodPropertyType }
     * 
     */
    public TimePeriodPropertyType createTimePeriodPropertyType() {
        return new TimePeriodPropertyType();
    }

    /**
     * Create an instance of {@link TimeEdgePropertyType }
     * 
     */
    public TimeEdgePropertyType createTimeEdgePropertyType() {
        return new TimeEdgePropertyType();
    }

    /**
     * Create an instance of {@link GridLengthType }
     * 
     */
    public GridLengthType createGridLengthType() {
        return new GridLengthType();
    }

    /**
     * Create an instance of {@link BooleanPropertyType1 }
     * 
     */
    public BooleanPropertyType1 createBooleanPropertyType1() {
        return new BooleanPropertyType1();
    }

    /**
     * Create an instance of {@link TimeTopologyComplexPropertyType }
     * 
     */
    public TimeTopologyComplexPropertyType createTimeTopologyComplexPropertyType() {
        return new TimeTopologyComplexPropertyType();
    }

    /**
     * Create an instance of {@link LengthType }
     * 
     */
    public LengthType createLengthType() {
        return new LengthType();
    }

    /**
     * Create an instance of {@link RelatedTimeType }
     * 
     */
    public RelatedTimeType createRelatedTimeType() {
        return new RelatedTimeType();
    }

    /**
     * Create an instance of {@link LinearRingPropertyType }
     * 
     */
    public LinearRingPropertyType createLinearRingPropertyType() {
        return new LinearRingPropertyType();
    }

    /**
     * Create an instance of {@link TimeTopologyPrimitivePropertyType }
     * 
     */
    public TimeTopologyPrimitivePropertyType createTimeTopologyPrimitivePropertyType() {
        return new TimeTopologyPrimitivePropertyType();
    }

    /**
     * Create an instance of {@link SpeedType }
     * 
     */
    public SpeedType createSpeedType() {
        return new SpeedType();
    }

    /**
     * Create an instance of {@link SequenceRuleType }
     * 
     */
    public SequenceRuleType createSequenceRuleType() {
        return new SequenceRuleType();
    }

    /**
     * Create an instance of {@link KnotPropertyType }
     * 
     */
    public KnotPropertyType createKnotPropertyType() {
        return new KnotPropertyType();
    }

    /**
     * Create an instance of {@link NodeOrEdgePropertyType }
     * 
     */
    public NodeOrEdgePropertyType createNodeOrEdgePropertyType() {
        return new NodeOrEdgePropertyType();
    }

    /**
     * Create an instance of {@link TimeType }
     * 
     */
    public TimeType createTimeType() {
        return new TimeType();
    }

    /**
     * Create an instance of {@link VolumeType }
     * 
     */
    public VolumeType createVolumeType() {
        return new VolumeType();
    }

    /**
     * Create an instance of {@link CountPropertyType }
     * 
     */
    public CountPropertyType createCountPropertyType() {
        return new CountPropertyType();
    }

    /**
     * Create an instance of {@link KnotType }
     * 
     */
    public KnotType createKnotType() {
        return new KnotType();
    }

    /**
     * Create an instance of {@link TimeInstantPropertyType }
     * 
     */
    public TimeInstantPropertyType createTimeInstantPropertyType() {
        return new TimeInstantPropertyType();
    }

    /**
     * Create an instance of {@link QuantityPropertyType }
     * 
     */
    public QuantityPropertyType createQuantityPropertyType() {
        return new QuantityPropertyType();
    }

    /**
     * Create an instance of {@link ShellPropertyType }
     * 
     */
    public ShellPropertyType createShellPropertyType() {
        return new ShellPropertyType();
    }

    /**
     * Create an instance of {@link ArcType }
     * 
     */
    public ArcType createArcType() {
        return new ArcType();
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link TitleEltType }
     * 
     */
    public TitleEltType createTitleEltType() {
        return new TitleEltType();
    }

    /**
     * Create an instance of {@link LocatorType }
     * 
     */
    public LocatorType createLocatorType() {
        return new LocatorType();
    }

    /**
     * Create an instance of {@link Simple }
     * 
     */
    public Simple createSimple() {
        return new Simple();
    }

    /**
     * Create an instance of {@link Extended }
     * 
     */
    public Extended createExtended() {
        return new Extended();
    }

    /**
     * Create an instance of {@link CodeListValueType }
     * 
     */
    public CodeListValueType createCodeListValueType() {
        return new CodeListValueType();
    }

    /**
     * Create an instance of {@link MDDimensionType }
     * 
     */
    public MDDimensionType createMDDimensionType() {
        return new MDDimensionType();
    }

    /**
     * Create an instance of {@link MDRangeDimensionType }
     * 
     */
    public MDRangeDimensionType createMDRangeDimensionType() {
        return new MDRangeDimensionType();
    }

    /**
     * Create an instance of {@link DQDomainConsistencyType }
     * 
     */
    public DQDomainConsistencyType createDQDomainConsistencyType() {
        return new DQDomainConsistencyType();
    }

    /**
     * Create an instance of {@link LILineageType }
     * 
     */
    public LILineageType createLILineageType() {
        return new LILineageType();
    }

    /**
     * Create an instance of {@link MDGridSpatialRepresentationType }
     * 
     */
    public MDGridSpatialRepresentationType createMDGridSpatialRepresentationType() {
        return new MDGridSpatialRepresentationType();
    }

    /**
     * Create an instance of {@link DQDataQualityType }
     * 
     */
    public DQDataQualityType createDQDataQualityType() {
        return new DQDataQualityType();
    }

    /**
     * Create an instance of {@link CIContactType }
     * 
     */
    public CIContactType createCIContactType() {
        return new CIContactType();
    }

    /**
     * Create an instance of {@link MDApplicationSchemaInformationType }
     * 
     */
    public MDApplicationSchemaInformationType createMDApplicationSchemaInformationType() {
        return new MDApplicationSchemaInformationType();
    }

    /**
     * Create an instance of {@link MDPortrayalCatalogueReferenceType }
     * 
     */
    public MDPortrayalCatalogueReferenceType createMDPortrayalCatalogueReferenceType() {
        return new MDPortrayalCatalogueReferenceType();
    }

    /**
     * Create an instance of {@link MDBrowseGraphicType }
     * 
     */
    public MDBrowseGraphicType createMDBrowseGraphicType() {
        return new MDBrowseGraphicType();
    }

    /**
     * Create an instance of {@link MDFormatType }
     * 
     */
    public MDFormatType createMDFormatType() {
        return new MDFormatType();
    }

    /**
     * Create an instance of {@link CIDateType }
     * 
     */
    public CIDateType createCIDateType() {
        return new CIDateType();
    }

    /**
     * Create an instance of {@link DSAssociationType }
     * 
     */
    public DSAssociationType createDSAssociationType() {
        return new DSAssociationType();
    }

    /**
     * Create an instance of {@link MDFeatureCatalogueDescriptionType }
     * 
     */
    public MDFeatureCatalogueDescriptionType createMDFeatureCatalogueDescriptionType() {
        return new MDFeatureCatalogueDescriptionType();
    }

    /**
     * Create an instance of {@link MDUsageType }
     * 
     */
    public MDUsageType createMDUsageType() {
        return new MDUsageType();
    }

    /**
     * Create an instance of {@link MDMaintenanceInformationType }
     * 
     */
    public MDMaintenanceInformationType createMDMaintenanceInformationType() {
        return new MDMaintenanceInformationType();
    }

    /**
     * Create an instance of {@link EXSpatialTemporalExtentType }
     * 
     */
    public EXSpatialTemporalExtentType createEXSpatialTemporalExtentType() {
        return new EXSpatialTemporalExtentType();
    }

    /**
     * Create an instance of {@link EXTemporalExtentType }
     * 
     */
    public EXTemporalExtentType createEXTemporalExtentType() {
        return new EXTemporalExtentType();
    }

    /**
     * Create an instance of {@link DSSeriesType }
     * 
     */
    public DSSeriesType createDSSeriesType() {
        return new DSSeriesType();
    }

    /**
     * Create an instance of {@link DQCompletenessOmissionType }
     * 
     */
    public DQCompletenessOmissionType createDQCompletenessOmissionType() {
        return new DQCompletenessOmissionType();
    }

    /**
     * Create an instance of {@link DQConformanceResultType }
     * 
     */
    public DQConformanceResultType createDQConformanceResultType() {
        return new DQConformanceResultType();
    }

    /**
     * Create an instance of {@link MDReferenceSystemType }
     * 
     */
    public MDReferenceSystemType createMDReferenceSystemType() {
        return new MDReferenceSystemType();
    }

    /**
     * Create an instance of {@link DSProductionSeriesType }
     * 
     */
    public DSProductionSeriesType createDSProductionSeriesType() {
        return new DSProductionSeriesType();
    }

    /**
     * Create an instance of {@link RSIdentifierType }
     * 
     */
    public RSIdentifierType createRSIdentifierType() {
        return new RSIdentifierType();
    }

    /**
     * Create an instance of {@link MDIdentifierType }
     * 
     */
    public MDIdentifierType createMDIdentifierType() {
        return new MDIdentifierType();
    }

    /**
     * Create an instance of {@link MDMetadataType }
     * 
     */
    public MDMetadataType createMDMetadataType() {
        return new MDMetadataType();
    }

    /**
     * Create an instance of {@link DQTemporalValidityType }
     * 
     */
    public DQTemporalValidityType createDQTemporalValidityType() {
        return new DQTemporalValidityType();
    }

    /**
     * Create an instance of {@link DQTemporalConsistencyType }
     * 
     */
    public DQTemporalConsistencyType createDQTemporalConsistencyType() {
        return new DQTemporalConsistencyType();
    }

    /**
     * Create an instance of {@link MDDistributionType }
     * 
     */
    public MDDistributionType createMDDistributionType() {
        return new MDDistributionType();
    }

    /**
     * Create an instance of {@link DQAbsoluteExternalPositionalAccuracyType }
     * 
     */
    public DQAbsoluteExternalPositionalAccuracyType createDQAbsoluteExternalPositionalAccuracyType() {
        return new DQAbsoluteExternalPositionalAccuracyType();
    }

    /**
     * Create an instance of {@link MDVectorSpatialRepresentationType }
     * 
     */
    public MDVectorSpatialRepresentationType createMDVectorSpatialRepresentationType() {
        return new MDVectorSpatialRepresentationType();
    }

    /**
     * Create an instance of {@link EXGeographicDescriptionType }
     * 
     */
    public EXGeographicDescriptionType createEXGeographicDescriptionType() {
        return new EXGeographicDescriptionType();
    }

    /**
     * Create an instance of {@link CITelephoneType }
     * 
     */
    public CITelephoneType createCITelephoneType() {
        return new CITelephoneType();
    }

    /**
     * Create an instance of {@link MDBandType }
     * 
     */
    public MDBandType createMDBandType() {
        return new MDBandType();
    }

    /**
     * Create an instance of {@link CISeriesType }
     * 
     */
    public CISeriesType createCISeriesType() {
        return new CISeriesType();
    }

    /**
     * Create an instance of {@link LIProcessStepType }
     * 
     */
    public LIProcessStepType createLIProcessStepType() {
        return new LIProcessStepType();
    }

    /**
     * Create an instance of {@link DQGriddedDataPositionalAccuracyType }
     * 
     */
    public DQGriddedDataPositionalAccuracyType createDQGriddedDataPositionalAccuracyType() {
        return new DQGriddedDataPositionalAccuracyType();
    }

    /**
     * Create an instance of {@link EXGeographicBoundingBoxType }
     * 
     */
    public EXGeographicBoundingBoxType createEXGeographicBoundingBoxType() {
        return new EXGeographicBoundingBoxType();
    }

    /**
     * Create an instance of {@link DQThematicClassificationCorrectnessType }
     * 
     */
    public DQThematicClassificationCorrectnessType createDQThematicClassificationCorrectnessType() {
        return new DQThematicClassificationCorrectnessType();
    }

    /**
     * Create an instance of {@link MDConstraintsType }
     * 
     */
    public MDConstraintsType createMDConstraintsType() {
        return new MDConstraintsType();
    }

    /**
     * Create an instance of {@link MDDistributorType }
     * 
     */
    public MDDistributorType createMDDistributorType() {
        return new MDDistributorType();
    }

    /**
     * Create an instance of {@link CIResponsiblePartyType }
     * 
     */
    public CIResponsiblePartyType createCIResponsiblePartyType() {
        return new CIResponsiblePartyType();
    }

    /**
     * Create an instance of {@link MDServiceIdentificationType }
     * 
     */
    public MDServiceIdentificationType createMDServiceIdentificationType() {
        return new MDServiceIdentificationType();
    }

    /**
     * Create an instance of {@link DQScopeType }
     * 
     */
    public DQScopeType createDQScopeType() {
        return new DQScopeType();
    }

    /**
     * Create an instance of {@link EXBoundingPolygonType }
     * 
     */
    public EXBoundingPolygonType createEXBoundingPolygonType() {
        return new EXBoundingPolygonType();
    }

    /**
     * Create an instance of {@link EXVerticalExtentType }
     * 
     */
    public EXVerticalExtentType createEXVerticalExtentType() {
        return new EXVerticalExtentType();
    }

    /**
     * Create an instance of {@link DSSensorType }
     * 
     */
    public DSSensorType createDSSensorType() {
        return new DSSensorType();
    }

    /**
     * Create an instance of {@link CIOnlineResourceType }
     * 
     */
    public CIOnlineResourceType createCIOnlineResourceType() {
        return new CIOnlineResourceType();
    }

    /**
     * Create an instance of {@link DQQuantitativeResultType }
     * 
     */
    public DQQuantitativeResultType createDQQuantitativeResultType() {
        return new DQQuantitativeResultType();
    }

    /**
     * Create an instance of {@link MDGeoreferenceableType }
     * 
     */
    public MDGeoreferenceableType createMDGeoreferenceableType() {
        return new MDGeoreferenceableType();
    }

    /**
     * Create an instance of {@link MDGeorectifiedType }
     * 
     */
    public MDGeorectifiedType createMDGeorectifiedType() {
        return new MDGeorectifiedType();
    }

    /**
     * Create an instance of {@link MDDigitalTransferOptionsType }
     * 
     */
    public MDDigitalTransferOptionsType createMDDigitalTransferOptionsType() {
        return new MDDigitalTransferOptionsType();
    }

    /**
     * Create an instance of {@link MDResolutionType }
     * 
     */
    public MDResolutionType createMDResolutionType() {
        return new MDResolutionType();
    }

    /**
     * Create an instance of {@link LocalisedCharacterStringType }
     * 
     */
    public LocalisedCharacterStringType createLocalisedCharacterStringType() {
        return new LocalisedCharacterStringType();
    }

    /**
     * Create an instance of {@link PTLocaleType }
     * 
     */
    public PTLocaleType createPTLocaleType() {
        return new PTLocaleType();
    }

    /**
     * Create an instance of {@link PTFreeTextType }
     * 
     */
    public PTFreeTextType createPTFreeTextType() {
        return new PTFreeTextType();
    }

    /**
     * Create an instance of {@link MDScopeDescriptionType }
     * 
     */
    public MDScopeDescriptionType createMDScopeDescriptionType() {
        return new MDScopeDescriptionType();
    }

    /**
     * Create an instance of {@link DQRelativeInternalPositionalAccuracyType }
     * 
     */
    public DQRelativeInternalPositionalAccuracyType createDQRelativeInternalPositionalAccuracyType() {
        return new DQRelativeInternalPositionalAccuracyType();
    }

    /**
     * Create an instance of {@link MDSecurityConstraintsType }
     * 
     */
    public MDSecurityConstraintsType createMDSecurityConstraintsType() {
        return new MDSecurityConstraintsType();
    }

    /**
     * Create an instance of {@link MDGeometricObjectsType }
     * 
     */
    public MDGeometricObjectsType createMDGeometricObjectsType() {
        return new MDGeometricObjectsType();
    }

    /**
     * Create an instance of {@link DQTopologicalConsistencyType }
     * 
     */
    public DQTopologicalConsistencyType createDQTopologicalConsistencyType() {
        return new DQTopologicalConsistencyType();
    }

    /**
     * Create an instance of {@link MDMediumType }
     * 
     */
    public MDMediumType createMDMediumType() {
        return new MDMediumType();
    }

    /**
     * Create an instance of {@link MDKeywordsType }
     * 
     */
    public MDKeywordsType createMDKeywordsType() {
        return new MDKeywordsType();
    }

    /**
     * Create an instance of {@link PTLocaleContainerType }
     * 
     */
    public PTLocaleContainerType createPTLocaleContainerType() {
        return new PTLocaleContainerType();
    }

    /**
     * Create an instance of {@link DQFormatConsistencyType }
     * 
     */
    public DQFormatConsistencyType createDQFormatConsistencyType() {
        return new DQFormatConsistencyType();
    }

    /**
     * Create an instance of {@link MDExtendedElementInformationType }
     * 
     */
    public MDExtendedElementInformationType createMDExtendedElementInformationType() {
        return new MDExtendedElementInformationType();
    }

    /**
     * Create an instance of {@link DSPlatformType }
     * 
     */
    public DSPlatformType createDSPlatformType() {
        return new DSPlatformType();
    }

    /**
     * Create an instance of {@link MDMetadataExtensionInformationType }
     * 
     */
    public MDMetadataExtensionInformationType createMDMetadataExtensionInformationType() {
        return new MDMetadataExtensionInformationType();
    }

    /**
     * Create an instance of {@link LISourceType }
     * 
     */
    public LISourceType createLISourceType() {
        return new LISourceType();
    }

    /**
     * Create an instance of {@link DQAccuracyOfATimeMeasurementType }
     * 
     */
    public DQAccuracyOfATimeMeasurementType createDQAccuracyOfATimeMeasurementType() {
        return new DQAccuracyOfATimeMeasurementType();
    }

    /**
     * Create an instance of {@link MDDataIdentificationType }
     * 
     */
    public MDDataIdentificationType createMDDataIdentificationType() {
        return new MDDataIdentificationType();
    }

    /**
     * Create an instance of {@link DSInitiativeType }
     * 
     */
    public DSInitiativeType createDSInitiativeType() {
        return new DSInitiativeType();
    }

    /**
     * Create an instance of {@link DSStereoMateType }
     * 
     */
    public DSStereoMateType createDSStereoMateType() {
        return new DSStereoMateType();
    }

    /**
     * Create an instance of {@link DSOtherAggregateType }
     * 
     */
    public DSOtherAggregateType createDSOtherAggregateType() {
        return new DSOtherAggregateType();
    }

    /**
     * Create an instance of {@link DQQuantitativeAttributeAccuracyType }
     * 
     */
    public DQQuantitativeAttributeAccuracyType createDQQuantitativeAttributeAccuracyType() {
        return new DQQuantitativeAttributeAccuracyType();
    }

    /**
     * Create an instance of {@link MDLegalConstraintsType }
     * 
     */
    public MDLegalConstraintsType createMDLegalConstraintsType() {
        return new MDLegalConstraintsType();
    }

    /**
     * Create an instance of {@link CIAddressType }
     * 
     */
    public CIAddressType createCIAddressType() {
        return new CIAddressType();
    }

    /**
     * Create an instance of {@link DQConceptualConsistencyType }
     * 
     */
    public DQConceptualConsistencyType createDQConceptualConsistencyType() {
        return new DQConceptualConsistencyType();
    }

    /**
     * Create an instance of {@link DQCompletenessCommissionType }
     * 
     */
    public DQCompletenessCommissionType createDQCompletenessCommissionType() {
        return new DQCompletenessCommissionType();
    }

    /**
     * Create an instance of {@link MDCoverageDescriptionType }
     * 
     */
    public MDCoverageDescriptionType createMDCoverageDescriptionType() {
        return new MDCoverageDescriptionType();
    }

    /**
     * Create an instance of {@link MDImageDescriptionType }
     * 
     */
    public MDImageDescriptionType createMDImageDescriptionType() {
        return new MDImageDescriptionType();
    }

    /**
     * Create an instance of {@link MDAggregateInformationType }
     * 
     */
    public MDAggregateInformationType createMDAggregateInformationType() {
        return new MDAggregateInformationType();
    }

    /**
     * Create an instance of {@link DSDataSetType }
     * 
     */
    public DSDataSetType createDSDataSetType() {
        return new DSDataSetType();
    }

    /**
     * Create an instance of {@link MDStandardOrderProcessType }
     * 
     */
    public MDStandardOrderProcessType createMDStandardOrderProcessType() {
        return new MDStandardOrderProcessType();
    }

    /**
     * Create an instance of {@link DQNonQuantitativeAttributeAccuracyType }
     * 
     */
    public DQNonQuantitativeAttributeAccuracyType createDQNonQuantitativeAttributeAccuracyType() {
        return new DQNonQuantitativeAttributeAccuracyType();
    }

    /**
     * Create an instance of {@link MDRepresentativeFractionType }
     * 
     */
    public MDRepresentativeFractionType createMDRepresentativeFractionType() {
        return new MDRepresentativeFractionType();
    }

    /**
     * Create an instance of {@link MDVectorSpatialRepresentationPropertyType }
     * 
     */
    public MDVectorSpatialRepresentationPropertyType createMDVectorSpatialRepresentationPropertyType() {
        return new MDVectorSpatialRepresentationPropertyType();
    }

    /**
     * Create an instance of {@link MDDistributionPropertyType }
     * 
     */
    public MDDistributionPropertyType createMDDistributionPropertyType() {
        return new MDDistributionPropertyType();
    }

    /**
     * Create an instance of {@link MDReferenceSystemPropertyType }
     * 
     */
    public MDReferenceSystemPropertyType createMDReferenceSystemPropertyType() {
        return new MDReferenceSystemPropertyType();
    }

    /**
     * Create an instance of {@link MDServiceIdentificationPropertyType }
     * 
     */
    public MDServiceIdentificationPropertyType createMDServiceIdentificationPropertyType() {
        return new MDServiceIdentificationPropertyType();
    }

    /**
     * Create an instance of {@link MDGridSpatialRepresentationPropertyType }
     * 
     */
    public MDGridSpatialRepresentationPropertyType createMDGridSpatialRepresentationPropertyType() {
        return new MDGridSpatialRepresentationPropertyType();
    }

    /**
     * Create an instance of {@link LIProcessStepPropertyType }
     * 
     */
    public LIProcessStepPropertyType createLIProcessStepPropertyType() {
        return new LIProcessStepPropertyType();
    }

    /**
     * Create an instance of {@link DSSensorPropertyType }
     * 
     */
    public DSSensorPropertyType createDSSensorPropertyType() {
        return new DSSensorPropertyType();
    }

    /**
     * Create an instance of {@link MDTopicCategoryCodePropertyType }
     * 
     */
    public MDTopicCategoryCodePropertyType createMDTopicCategoryCodePropertyType() {
        return new MDTopicCategoryCodePropertyType();
    }

    /**
     * Create an instance of {@link MDTopologyLevelCodePropertyType }
     * 
     */
    public MDTopologyLevelCodePropertyType createMDTopologyLevelCodePropertyType() {
        return new MDTopologyLevelCodePropertyType();
    }

    /**
     * Create an instance of {@link EXExtentPropertyType }
     * 
     */
    public EXExtentPropertyType createEXExtentPropertyType() {
        return new EXExtentPropertyType();
    }

    /**
     * Create an instance of {@link MDCharacterSetCodePropertyType }
     * 
     */
    public MDCharacterSetCodePropertyType createMDCharacterSetCodePropertyType() {
        return new MDCharacterSetCodePropertyType();
    }

    /**
     * Create an instance of {@link MDSpatialRepresentationPropertyType }
     * 
     */
    public MDSpatialRepresentationPropertyType createMDSpatialRepresentationPropertyType() {
        return new MDSpatialRepresentationPropertyType();
    }

    /**
     * Create an instance of {@link DQAbsoluteExternalPositionalAccuracyPropertyType }
     * 
     */
    public DQAbsoluteExternalPositionalAccuracyPropertyType createDQAbsoluteExternalPositionalAccuracyPropertyType() {
        return new DQAbsoluteExternalPositionalAccuracyPropertyType();
    }

    /**
     * Create an instance of {@link DSAssociationPropertyType }
     * 
     */
    public DSAssociationPropertyType createDSAssociationPropertyType() {
        return new DSAssociationPropertyType();
    }

    /**
     * Create an instance of {@link MDResolutionPropertyType }
     * 
     */
    public MDResolutionPropertyType createMDResolutionPropertyType() {
        return new MDResolutionPropertyType();
    }

    /**
     * Create an instance of {@link DSSeriesPropertyType }
     * 
     */
    public DSSeriesPropertyType createDSSeriesPropertyType() {
        return new DSSeriesPropertyType();
    }

    /**
     * Create an instance of {@link DQScopePropertyType }
     * 
     */
    public DQScopePropertyType createDQScopePropertyType() {
        return new DQScopePropertyType();
    }

    /**
     * Create an instance of {@link MDAggregateInformationPropertyType }
     * 
     */
    public MDAggregateInformationPropertyType createMDAggregateInformationPropertyType() {
        return new MDAggregateInformationPropertyType();
    }

    /**
     * Create an instance of {@link EXVerticalExtentPropertyType }
     * 
     */
    public EXVerticalExtentPropertyType createEXVerticalExtentPropertyType() {
        return new EXVerticalExtentPropertyType();
    }

    /**
     * Create an instance of {@link DQConceptualConsistencyPropertyType }
     * 
     */
    public DQConceptualConsistencyPropertyType createDQConceptualConsistencyPropertyType() {
        return new DQConceptualConsistencyPropertyType();
    }

    /**
     * Create an instance of {@link DQRelativeInternalPositionalAccuracyPropertyType }
     * 
     */
    public DQRelativeInternalPositionalAccuracyPropertyType createDQRelativeInternalPositionalAccuracyPropertyType() {
        return new DQRelativeInternalPositionalAccuracyPropertyType();
    }

    /**
     * Create an instance of {@link DSStereoMatePropertyType }
     * 
     */
    public DSStereoMatePropertyType createDSStereoMatePropertyType() {
        return new DSStereoMatePropertyType();
    }

    /**
     * Create an instance of {@link MDRangeDimensionPropertyType }
     * 
     */
    public MDRangeDimensionPropertyType createMDRangeDimensionPropertyType() {
        return new MDRangeDimensionPropertyType();
    }

    /**
     * Create an instance of {@link MDKeywordsPropertyType }
     * 
     */
    public MDKeywordsPropertyType createMDKeywordsPropertyType() {
        return new MDKeywordsPropertyType();
    }

    /**
     * Create an instance of {@link RSIdentifierPropertyType }
     * 
     */
    public RSIdentifierPropertyType createRSIdentifierPropertyType() {
        return new RSIdentifierPropertyType();
    }

    /**
     * Create an instance of {@link LanguageCodePropertyType }
     * 
     */
    public LanguageCodePropertyType createLanguageCodePropertyType() {
        return new LanguageCodePropertyType();
    }

    /**
     * Create an instance of {@link EXTemporalExtentPropertyType }
     * 
     */
    public EXTemporalExtentPropertyType createEXTemporalExtentPropertyType() {
        return new EXTemporalExtentPropertyType();
    }

    /**
     * Create an instance of {@link DQConformanceResultPropertyType }
     * 
     */
    public DQConformanceResultPropertyType createDQConformanceResultPropertyType() {
        return new DQConformanceResultPropertyType();
    }

    /**
     * Create an instance of {@link DQCompletenessCommissionPropertyType }
     * 
     */
    public DQCompletenessCommissionPropertyType createDQCompletenessCommissionPropertyType() {
        return new DQCompletenessCommissionPropertyType();
    }

    /**
     * Create an instance of {@link DSInitiativePropertyType }
     * 
     */
    public DSInitiativePropertyType createDSInitiativePropertyType() {
        return new DSInitiativePropertyType();
    }

    /**
     * Create an instance of {@link CIOnLineFunctionCodePropertyType }
     * 
     */
    public CIOnLineFunctionCodePropertyType createCIOnLineFunctionCodePropertyType() {
        return new CIOnLineFunctionCodePropertyType();
    }

    /**
     * Create an instance of {@link DQCompletenessOmissionPropertyType }
     * 
     */
    public DQCompletenessOmissionPropertyType createDQCompletenessOmissionPropertyType() {
        return new DQCompletenessOmissionPropertyType();
    }

    /**
     * Create an instance of {@link MDLegalConstraintsPropertyType }
     * 
     */
    public MDLegalConstraintsPropertyType createMDLegalConstraintsPropertyType() {
        return new MDLegalConstraintsPropertyType();
    }

    /**
     * Create an instance of {@link MDDistributorPropertyType }
     * 
     */
    public MDDistributorPropertyType createMDDistributorPropertyType() {
        return new MDDistributorPropertyType();
    }

    /**
     * Create an instance of {@link MDMediumNameCodePropertyType }
     * 
     */
    public MDMediumNameCodePropertyType createMDMediumNameCodePropertyType() {
        return new MDMediumNameCodePropertyType();
    }

    /**
     * Create an instance of {@link MDProgressCodePropertyType }
     * 
     */
    public MDProgressCodePropertyType createMDProgressCodePropertyType() {
        return new MDProgressCodePropertyType();
    }

    /**
     * Create an instance of {@link CountryPropertyType }
     * 
     */
    public CountryPropertyType createCountryPropertyType() {
        return new CountryPropertyType();
    }

    /**
     * Create an instance of {@link LILineagePropertyType }
     * 
     */
    public LILineagePropertyType createLILineagePropertyType() {
        return new LILineagePropertyType();
    }

    /**
     * Create an instance of {@link MDObligationCodePropertyType }
     * 
     */
    public MDObligationCodePropertyType createMDObligationCodePropertyType() {
        return new MDObligationCodePropertyType();
    }

    /**
     * Create an instance of {@link DSPlatformPropertyType }
     * 
     */
    public DSPlatformPropertyType createDSPlatformPropertyType() {
        return new DSPlatformPropertyType();
    }

    /**
     * Create an instance of {@link MDUsagePropertyType }
     * 
     */
    public MDUsagePropertyType createMDUsagePropertyType() {
        return new MDUsagePropertyType();
    }

    /**
     * Create an instance of {@link CIResponsiblePartyPropertyType }
     * 
     */
    public CIResponsiblePartyPropertyType createCIResponsiblePartyPropertyType() {
        return new CIResponsiblePartyPropertyType();
    }

    /**
     * Create an instance of {@link MDKeywordTypeCodePropertyType }
     * 
     */
    public MDKeywordTypeCodePropertyType createMDKeywordTypeCodePropertyType() {
        return new MDKeywordTypeCodePropertyType();
    }

    /**
     * Create an instance of {@link EXGeographicDescriptionPropertyType }
     * 
     */
    public EXGeographicDescriptionPropertyType createEXGeographicDescriptionPropertyType() {
        return new EXGeographicDescriptionPropertyType();
    }

    /**
     * Create an instance of {@link MDMaintenanceInformationPropertyType }
     * 
     */
    public MDMaintenanceInformationPropertyType createMDMaintenanceInformationPropertyType() {
        return new MDMaintenanceInformationPropertyType();
    }

    /**
     * Create an instance of {@link DSDataSetPropertyType }
     * 
     */
    public DSDataSetPropertyType createDSDataSetPropertyType() {
        return new DSDataSetPropertyType();
    }

    /**
     * Create an instance of {@link MDBrowseGraphicPropertyType }
     * 
     */
    public MDBrowseGraphicPropertyType createMDBrowseGraphicPropertyType() {
        return new MDBrowseGraphicPropertyType();
    }

    /**
     * Create an instance of {@link MDGeoreferenceablePropertyType }
     * 
     */
    public MDGeoreferenceablePropertyType createMDGeoreferenceablePropertyType() {
        return new MDGeoreferenceablePropertyType();
    }

    /**
     * Create an instance of {@link EXSpatialTemporalExtentPropertyType }
     * 
     */
    public EXSpatialTemporalExtentPropertyType createEXSpatialTemporalExtentPropertyType() {
        return new EXSpatialTemporalExtentPropertyType();
    }

    /**
     * Create an instance of {@link CIDateTypeCodePropertyType }
     * 
     */
    public CIDateTypeCodePropertyType createCIDateTypeCodePropertyType() {
        return new CIDateTypeCodePropertyType();
    }

    /**
     * Create an instance of {@link MDGeometricObjectsPropertyType }
     * 
     */
    public MDGeometricObjectsPropertyType createMDGeometricObjectsPropertyType() {
        return new MDGeometricObjectsPropertyType();
    }

    /**
     * Create an instance of {@link EXBoundingPolygonPropertyType }
     * 
     */
    public EXBoundingPolygonPropertyType createEXBoundingPolygonPropertyType() {
        return new EXBoundingPolygonPropertyType();
    }

    /**
     * Create an instance of {@link MDCoverageDescriptionPropertyType }
     * 
     */
    public MDCoverageDescriptionPropertyType createMDCoverageDescriptionPropertyType() {
        return new MDCoverageDescriptionPropertyType();
    }

    /**
     * Create an instance of {@link MDDatatypeCodePropertyType }
     * 
     */
    public MDDatatypeCodePropertyType createMDDatatypeCodePropertyType() {
        return new MDDatatypeCodePropertyType();
    }

    /**
     * Create an instance of {@link DQThematicClassificationCorrectnessPropertyType }
     * 
     */
    public DQThematicClassificationCorrectnessPropertyType createDQThematicClassificationCorrectnessPropertyType() {
        return new DQThematicClassificationCorrectnessPropertyType();
    }

    /**
     * Create an instance of {@link MDStandardOrderProcessPropertyType }
     * 
     */
    public MDStandardOrderProcessPropertyType createMDStandardOrderProcessPropertyType() {
        return new MDStandardOrderProcessPropertyType();
    }

    /**
     * Create an instance of {@link MDFeatureCatalogueDescriptionPropertyType }
     * 
     */
    public MDFeatureCatalogueDescriptionPropertyType createMDFeatureCatalogueDescriptionPropertyType() {
        return new MDFeatureCatalogueDescriptionPropertyType();
    }

    /**
     * Create an instance of {@link MDDimensionNameTypeCodePropertyType }
     * 
     */
    public MDDimensionNameTypeCodePropertyType createMDDimensionNameTypeCodePropertyType() {
        return new MDDimensionNameTypeCodePropertyType();
    }

    /**
     * Create an instance of {@link DQQuantitativeResultPropertyType }
     * 
     */
    public DQQuantitativeResultPropertyType createDQQuantitativeResultPropertyType() {
        return new DQQuantitativeResultPropertyType();
    }

    /**
     * Create an instance of {@link DSAssociationTypeCodePropertyType }
     * 
     */
    public DSAssociationTypeCodePropertyType createDSAssociationTypeCodePropertyType() {
        return new DSAssociationTypeCodePropertyType();
    }

    /**
     * Create an instance of {@link DSProductionSeriesPropertyType }
     * 
     */
    public DSProductionSeriesPropertyType createDSProductionSeriesPropertyType() {
        return new DSProductionSeriesPropertyType();
    }

    /**
     * Create an instance of {@link MDConstraintsPropertyType }
     * 
     */
    public MDConstraintsPropertyType createMDConstraintsPropertyType() {
        return new MDConstraintsPropertyType();
    }

    /**
     * Create an instance of {@link DSInitiativeTypeCodePropertyType }
     * 
     */
    public DSInitiativeTypeCodePropertyType createDSInitiativeTypeCodePropertyType() {
        return new DSInitiativeTypeCodePropertyType();
    }

    /**
     * Create an instance of {@link MDContentInformationPropertyType }
     * 
     */
    public MDContentInformationPropertyType createMDContentInformationPropertyType() {
        return new MDContentInformationPropertyType();
    }

    /**
     * Create an instance of {@link DQTopologicalConsistencyPropertyType }
     * 
     */
    public DQTopologicalConsistencyPropertyType createDQTopologicalConsistencyPropertyType() {
        return new DQTopologicalConsistencyPropertyType();
    }

    /**
     * Create an instance of {@link MDGeometricObjectTypeCodePropertyType }
     * 
     */
    public MDGeometricObjectTypeCodePropertyType createMDGeometricObjectTypeCodePropertyType() {
        return new MDGeometricObjectTypeCodePropertyType();
    }

    /**
     * Create an instance of {@link MDMediumPropertyType }
     * 
     */
    public MDMediumPropertyType createMDMediumPropertyType() {
        return new MDMediumPropertyType();
    }

    /**
     * Create an instance of {@link CIPresentationFormCodePropertyType }
     * 
     */
    public CIPresentationFormCodePropertyType createCIPresentationFormCodePropertyType() {
        return new CIPresentationFormCodePropertyType();
    }

    /**
     * Create an instance of {@link MDPortrayalCatalogueReferencePropertyType }
     * 
     */
    public MDPortrayalCatalogueReferencePropertyType createMDPortrayalCatalogueReferencePropertyType() {
        return new MDPortrayalCatalogueReferencePropertyType();
    }

    /**
     * Create an instance of {@link MDMaintenanceFrequencyCodePropertyType }
     * 
     */
    public MDMaintenanceFrequencyCodePropertyType createMDMaintenanceFrequencyCodePropertyType() {
        return new MDMaintenanceFrequencyCodePropertyType();
    }

    /**
     * Create an instance of {@link MDRestrictionCodePropertyType }
     * 
     */
    public MDRestrictionCodePropertyType createMDRestrictionCodePropertyType() {
        return new MDRestrictionCodePropertyType();
    }

    /**
     * Create an instance of {@link MDCellGeometryCodePropertyType }
     * 
     */
    public MDCellGeometryCodePropertyType createMDCellGeometryCodePropertyType() {
        return new MDCellGeometryCodePropertyType();
    }

    /**
     * Create an instance of {@link MDGeorectifiedPropertyType }
     * 
     */
    public MDGeorectifiedPropertyType createMDGeorectifiedPropertyType() {
        return new MDGeorectifiedPropertyType();
    }

    /**
     * Create an instance of {@link DQTemporalValidityPropertyType }
     * 
     */
    public DQTemporalValidityPropertyType createDQTemporalValidityPropertyType() {
        return new DQTemporalValidityPropertyType();
    }

    /**
     * Create an instance of {@link DQLogicalConsistencyPropertyType }
     * 
     */
    public DQLogicalConsistencyPropertyType createDQLogicalConsistencyPropertyType() {
        return new DQLogicalConsistencyPropertyType();
    }

    /**
     * Create an instance of {@link RSReferenceSystemPropertyType }
     * 
     */
    public RSReferenceSystemPropertyType createRSReferenceSystemPropertyType() {
        return new RSReferenceSystemPropertyType();
    }

    /**
     * Create an instance of {@link MDIdentifierPropertyType }
     * 
     */
    public MDIdentifierPropertyType createMDIdentifierPropertyType() {
        return new MDIdentifierPropertyType();
    }

    /**
     * Create an instance of {@link MDDistributionUnitsPropertyType }
     * 
     */
    public MDDistributionUnitsPropertyType createMDDistributionUnitsPropertyType() {
        return new MDDistributionUnitsPropertyType();
    }

    /**
     * Create an instance of {@link CISeriesPropertyType }
     * 
     */
    public CISeriesPropertyType createCISeriesPropertyType() {
        return new CISeriesPropertyType();
    }

    /**
     * Create an instance of {@link DQElementPropertyType }
     * 
     */
    public DQElementPropertyType createDQElementPropertyType() {
        return new DQElementPropertyType();
    }

    /**
     * Create an instance of {@link MDBandPropertyType }
     * 
     */
    public MDBandPropertyType createMDBandPropertyType() {
        return new MDBandPropertyType();
    }

    /**
     * Create an instance of {@link MDApplicationSchemaInformationPropertyType }
     * 
     */
    public MDApplicationSchemaInformationPropertyType createMDApplicationSchemaInformationPropertyType() {
        return new MDApplicationSchemaInformationPropertyType();
    }

    /**
     * Create an instance of {@link LISourcePropertyType }
     * 
     */
    public LISourcePropertyType createLISourcePropertyType() {
        return new LISourcePropertyType();
    }

    /**
     * Create an instance of {@link DQTemporalAccuracyPropertyType }
     * 
     */
    public DQTemporalAccuracyPropertyType createDQTemporalAccuracyPropertyType() {
        return new DQTemporalAccuracyPropertyType();
    }

    /**
     * Create an instance of {@link MDRepresentativeFractionPropertyType }
     * 
     */
    public MDRepresentativeFractionPropertyType createMDRepresentativeFractionPropertyType() {
        return new MDRepresentativeFractionPropertyType();
    }

    /**
     * Create an instance of {@link DSAggregatePropertyType }
     * 
     */
    public DSAggregatePropertyType createDSAggregatePropertyType() {
        return new DSAggregatePropertyType();
    }

    /**
     * Create an instance of {@link MDCoverageContentTypeCodePropertyType }
     * 
     */
    public MDCoverageContentTypeCodePropertyType createMDCoverageContentTypeCodePropertyType() {
        return new MDCoverageContentTypeCodePropertyType();
    }

    /**
     * Create an instance of {@link DSOtherAggregatePropertyType }
     * 
     */
    public DSOtherAggregatePropertyType createDSOtherAggregatePropertyType() {
        return new DSOtherAggregatePropertyType();
    }

    /**
     * Create an instance of {@link MDDimensionPropertyType }
     * 
     */
    public MDDimensionPropertyType createMDDimensionPropertyType() {
        return new MDDimensionPropertyType();
    }

    /**
     * Create an instance of {@link MDDataIdentificationPropertyType }
     * 
     */
    public MDDataIdentificationPropertyType createMDDataIdentificationPropertyType() {
        return new MDDataIdentificationPropertyType();
    }

    /**
     * Create an instance of {@link CIRoleCodePropertyType }
     * 
     */
    public CIRoleCodePropertyType createCIRoleCodePropertyType() {
        return new CIRoleCodePropertyType();
    }

    /**
     * Create an instance of {@link MDFormatPropertyType }
     * 
     */
    public MDFormatPropertyType createMDFormatPropertyType() {
        return new MDFormatPropertyType();
    }

    /**
     * Create an instance of {@link DQQuantitativeAttributeAccuracyPropertyType }
     * 
     */
    public DQQuantitativeAttributeAccuracyPropertyType createDQQuantitativeAttributeAccuracyPropertyType() {
        return new DQQuantitativeAttributeAccuracyPropertyType();
    }

    /**
     * Create an instance of {@link CIDatePropertyType }
     * 
     */
    public CIDatePropertyType createCIDatePropertyType() {
        return new CIDatePropertyType();
    }

    /**
     * Create an instance of {@link MDScopeDescriptionPropertyType }
     * 
     */
    public MDScopeDescriptionPropertyType createMDScopeDescriptionPropertyType() {
        return new MDScopeDescriptionPropertyType();
    }

    /**
     * Create an instance of {@link DQEvaluationMethodTypeCodePropertyType }
     * 
     */
    public DQEvaluationMethodTypeCodePropertyType createDQEvaluationMethodTypeCodePropertyType() {
        return new DQEvaluationMethodTypeCodePropertyType();
    }

    /**
     * Create an instance of {@link CIAddressPropertyType }
     * 
     */
    public CIAddressPropertyType createCIAddressPropertyType() {
        return new CIAddressPropertyType();
    }

    /**
     * Create an instance of {@link MDScopeCodePropertyType }
     * 
     */
    public MDScopeCodePropertyType createMDScopeCodePropertyType() {
        return new MDScopeCodePropertyType();
    }

    /**
     * Create an instance of {@link MDIdentificationPropertyType }
     * 
     */
    public MDIdentificationPropertyType createMDIdentificationPropertyType() {
        return new MDIdentificationPropertyType();
    }

    /**
     * Create an instance of {@link EXGeographicExtentPropertyType }
     * 
     */
    public EXGeographicExtentPropertyType createEXGeographicExtentPropertyType() {
        return new EXGeographicExtentPropertyType();
    }

    /**
     * Create an instance of {@link DQThematicAccuracyPropertyType }
     * 
     */
    public DQThematicAccuracyPropertyType createDQThematicAccuracyPropertyType() {
        return new DQThematicAccuracyPropertyType();
    }

    /**
     * Create an instance of {@link MDImageDescriptionPropertyType }
     * 
     */
    public MDImageDescriptionPropertyType createMDImageDescriptionPropertyType() {
        return new MDImageDescriptionPropertyType();
    }

    /**
     * Create an instance of {@link DQGriddedDataPositionalAccuracyPropertyType }
     * 
     */
    public DQGriddedDataPositionalAccuracyPropertyType createDQGriddedDataPositionalAccuracyPropertyType() {
        return new DQGriddedDataPositionalAccuracyPropertyType();
    }

    /**
     * Create an instance of {@link PTLocalePropertyType }
     * 
     */
    public PTLocalePropertyType createPTLocalePropertyType() {
        return new PTLocalePropertyType();
    }

    /**
     * Create an instance of {@link DQNonQuantitativeAttributeAccuracyPropertyType }
     * 
     */
    public DQNonQuantitativeAttributeAccuracyPropertyType createDQNonQuantitativeAttributeAccuracyPropertyType() {
        return new DQNonQuantitativeAttributeAccuracyPropertyType();
    }

    /**
     * Create an instance of {@link MDMetadataPropertyType }
     * 
     */
    public MDMetadataPropertyType createMDMetadataPropertyType() {
        return new MDMetadataPropertyType();
    }

    /**
     * Create an instance of {@link MDExtendedElementInformationPropertyType }
     * 
     */
    public MDExtendedElementInformationPropertyType createMDExtendedElementInformationPropertyType() {
        return new MDExtendedElementInformationPropertyType();
    }

    /**
     * Create an instance of {@link MDMetadataExtensionInformationPropertyType }
     * 
     */
    public MDMetadataExtensionInformationPropertyType createMDMetadataExtensionInformationPropertyType() {
        return new MDMetadataExtensionInformationPropertyType();
    }

    /**
     * Create an instance of {@link MDSecurityConstraintsPropertyType }
     * 
     */
    public MDSecurityConstraintsPropertyType createMDSecurityConstraintsPropertyType() {
        return new MDSecurityConstraintsPropertyType();
    }

    /**
     * Create an instance of {@link DQAccuracyOfATimeMeasurementPropertyType }
     * 
     */
    public DQAccuracyOfATimeMeasurementPropertyType createDQAccuracyOfATimeMeasurementPropertyType() {
        return new DQAccuracyOfATimeMeasurementPropertyType();
    }

    /**
     * Create an instance of {@link DQDataQualityPropertyType }
     * 
     */
    public DQDataQualityPropertyType createDQDataQualityPropertyType() {
        return new DQDataQualityPropertyType();
    }

    /**
     * Create an instance of {@link CIContactPropertyType }
     * 
     */
    public CIContactPropertyType createCIContactPropertyType() {
        return new CIContactPropertyType();
    }

    /**
     * Create an instance of {@link MDImagingConditionCodePropertyType }
     * 
     */
    public MDImagingConditionCodePropertyType createMDImagingConditionCodePropertyType() {
        return new MDImagingConditionCodePropertyType();
    }

    /**
     * Create an instance of {@link CITelephonePropertyType }
     * 
     */
    public CITelephonePropertyType createCITelephonePropertyType() {
        return new CITelephonePropertyType();
    }

    /**
     * Create an instance of {@link DQFormatConsistencyPropertyType }
     * 
     */
    public DQFormatConsistencyPropertyType createDQFormatConsistencyPropertyType() {
        return new DQFormatConsistencyPropertyType();
    }

    /**
     * Create an instance of {@link DQTemporalConsistencyPropertyType }
     * 
     */
    public DQTemporalConsistencyPropertyType createDQTemporalConsistencyPropertyType() {
        return new DQTemporalConsistencyPropertyType();
    }

    /**
     * Create an instance of {@link LocalisedCharacterStringPropertyType }
     * 
     */
    public LocalisedCharacterStringPropertyType createLocalisedCharacterStringPropertyType() {
        return new LocalisedCharacterStringPropertyType();
    }

    /**
     * Create an instance of {@link DQCompletenessPropertyType }
     * 
     */
    public DQCompletenessPropertyType createDQCompletenessPropertyType() {
        return new DQCompletenessPropertyType();
    }

    /**
     * Create an instance of {@link URLPropertyType }
     * 
     */
    public URLPropertyType createURLPropertyType() {
        return new URLPropertyType();
    }

    /**
     * Create an instance of {@link DQPositionalAccuracyPropertyType }
     * 
     */
    public DQPositionalAccuracyPropertyType createDQPositionalAccuracyPropertyType() {
        return new DQPositionalAccuracyPropertyType();
    }

    /**
     * Create an instance of {@link MDMediumFormatCodePropertyType }
     * 
     */
    public MDMediumFormatCodePropertyType createMDMediumFormatCodePropertyType() {
        return new MDMediumFormatCodePropertyType();
    }

    /**
     * Create an instance of {@link CIOnlineResourcePropertyType }
     * 
     */
    public CIOnlineResourcePropertyType createCIOnlineResourcePropertyType() {
        return new CIOnlineResourcePropertyType();
    }

    /**
     * Create an instance of {@link MDDigitalTransferOptionsPropertyType }
     * 
     */
    public MDDigitalTransferOptionsPropertyType createMDDigitalTransferOptionsPropertyType() {
        return new MDDigitalTransferOptionsPropertyType();
    }

    /**
     * Create an instance of {@link DQResultPropertyType }
     * 
     */
    public DQResultPropertyType createDQResultPropertyType() {
        return new DQResultPropertyType();
    }

    /**
     * Create an instance of {@link MDClassificationCodePropertyType }
     * 
     */
    public MDClassificationCodePropertyType createMDClassificationCodePropertyType() {
        return new MDClassificationCodePropertyType();
    }

    /**
     * Create an instance of {@link CICitationPropertyType }
     * 
     */
    public CICitationPropertyType createCICitationPropertyType() {
        return new CICitationPropertyType();
    }

    /**
     * Create an instance of {@link MDSpatialRepresentationTypeCodePropertyType }
     * 
     */
    public MDSpatialRepresentationTypeCodePropertyType createMDSpatialRepresentationTypeCodePropertyType() {
        return new MDSpatialRepresentationTypeCodePropertyType();
    }

    /**
     * Create an instance of {@link PTFreeTextPropertyType }
     * 
     */
    public PTFreeTextPropertyType createPTFreeTextPropertyType() {
        return new PTFreeTextPropertyType();
    }

    /**
     * Create an instance of {@link EXGeographicBoundingBoxPropertyType }
     * 
     */
    public EXGeographicBoundingBoxPropertyType createEXGeographicBoundingBoxPropertyType() {
        return new EXGeographicBoundingBoxPropertyType();
    }

    /**
     * Create an instance of {@link MDPixelOrientationCodePropertyType }
     * 
     */
    public MDPixelOrientationCodePropertyType createMDPixelOrientationCodePropertyType() {
        return new MDPixelOrientationCodePropertyType();
    }

    /**
     * Create an instance of {@link DQDomainConsistencyPropertyType }
     * 
     */
    public DQDomainConsistencyPropertyType createDQDomainConsistencyPropertyType() {
        return new DQDomainConsistencyPropertyType();
    }

    /**
     * Create an instance of {@link PTLocaleContainerPropertyType }
     * 
     */
    public PTLocaleContainerPropertyType createPTLocaleContainerPropertyType() {
        return new PTLocaleContainerPropertyType();
    }

    /**
     * Create an instance of {@link TypeNameType }
     * 
     */
    public TypeNameType createTypeNameType() {
        return new TypeNameType();
    }

    /**
     * Create an instance of {@link MultiplicityRangeType }
     * 
     */
    public MultiplicityRangeType createMultiplicityRangeType() {
        return new MultiplicityRangeType();
    }

    /**
     * Create an instance of {@link RecordTypeType }
     * 
     */
    public RecordTypeType createRecordTypeType() {
        return new RecordTypeType();
    }

    /**
     * Create an instance of {@link MultiplicityType }
     * 
     */
    public MultiplicityType createMultiplicityType() {
        return new MultiplicityType();
    }

    /**
     * Create an instance of {@link MemberNameType }
     * 
     */
    public MemberNameType createMemberNameType() {
        return new MemberNameType();
    }

    /**
     * Create an instance of {@link BinaryType }
     * 
     */
    public BinaryType createBinaryType() {
        return new BinaryType();
    }

    /**
     * Create an instance of {@link UnlimitedIntegerType }
     * 
     */
    public UnlimitedIntegerType createUnlimitedIntegerType() {
        return new UnlimitedIntegerType();
    }

    /**
     * Create an instance of {@link UomAreaPropertyType }
     * 
     */
    public UomAreaPropertyType createUomAreaPropertyType() {
        return new UomAreaPropertyType();
    }

    /**
     * Create an instance of {@link MultiplicityPropertyType }
     * 
     */
    public MultiplicityPropertyType createMultiplicityPropertyType() {
        return new MultiplicityPropertyType();
    }

    /**
     * Create an instance of {@link BooleanPropertyType }
     * 
     */
    public BooleanPropertyType createBooleanPropertyType() {
        return new BooleanPropertyType();
    }

    /**
     * Create an instance of {@link UomVelocityPropertyType }
     * 
     */
    public UomVelocityPropertyType createUomVelocityPropertyType() {
        return new UomVelocityPropertyType();
    }

    /**
     * Create an instance of {@link DateTimePropertyType }
     * 
     */
    public DateTimePropertyType createDateTimePropertyType() {
        return new DateTimePropertyType();
    }

    /**
     * Create an instance of {@link GenericNamePropertyType }
     * 
     */
    public GenericNamePropertyType createGenericNamePropertyType() {
        return new GenericNamePropertyType();
    }

    /**
     * Create an instance of {@link UomLengthPropertyType }
     * 
     */
    public UomLengthPropertyType createUomLengthPropertyType() {
        return new UomLengthPropertyType();
    }

    /**
     * Create an instance of {@link CharacterStringPropertyType }
     * 
     */
    public CharacterStringPropertyType createCharacterStringPropertyType() {
        return new CharacterStringPropertyType();
    }

    /**
     * Create an instance of {@link ScopedNamePropertyType }
     * 
     */
    public ScopedNamePropertyType createScopedNamePropertyType() {
        return new ScopedNamePropertyType();
    }

    /**
     * Create an instance of {@link MeasurePropertyType }
     * 
     */
    public MeasurePropertyType createMeasurePropertyType() {
        return new MeasurePropertyType();
    }

    /**
     * Create an instance of {@link UomScalePropertyType }
     * 
     */
    public UomScalePropertyType createUomScalePropertyType() {
        return new UomScalePropertyType();
    }

    /**
     * Create an instance of {@link RecordPropertyType }
     * 
     */
    public RecordPropertyType createRecordPropertyType() {
        return new RecordPropertyType();
    }

    /**
     * Create an instance of {@link LengthPropertyType }
     * 
     */
    public LengthPropertyType createLengthPropertyType() {
        return new LengthPropertyType();
    }

    /**
     * Create an instance of {@link UnlimitedIntegerPropertyType }
     * 
     */
    public UnlimitedIntegerPropertyType createUnlimitedIntegerPropertyType() {
        return new UnlimitedIntegerPropertyType();
    }

    /**
     * Create an instance of {@link DatePropertyType }
     * 
     */
    public DatePropertyType createDatePropertyType() {
        return new DatePropertyType();
    }

    /**
     * Create an instance of {@link UomTimePropertyType }
     * 
     */
    public UomTimePropertyType createUomTimePropertyType() {
        return new UomTimePropertyType();
    }

    /**
     * Create an instance of {@link TypeNamePropertyType }
     * 
     */
    public TypeNamePropertyType createTypeNamePropertyType() {
        return new TypeNamePropertyType();
    }

    /**
     * Create an instance of {@link DistancePropertyType }
     * 
     */
    public DistancePropertyType createDistancePropertyType() {
        return new DistancePropertyType();
    }

    /**
     * Create an instance of {@link NumberPropertyType }
     * 
     */
    public NumberPropertyType createNumberPropertyType() {
        return new NumberPropertyType();
    }

    /**
     * Create an instance of {@link BinaryPropertyType }
     * 
     */
    public BinaryPropertyType createBinaryPropertyType() {
        return new BinaryPropertyType();
    }

    /**
     * Create an instance of {@link UomAnglePropertyType }
     * 
     */
    public UomAnglePropertyType createUomAnglePropertyType() {
        return new UomAnglePropertyType();
    }

    /**
     * Create an instance of {@link MemberNamePropertyType }
     * 
     */
    public MemberNamePropertyType createMemberNamePropertyType() {
        return new MemberNamePropertyType();
    }

    /**
     * Create an instance of {@link DecimalPropertyType }
     * 
     */
    public DecimalPropertyType createDecimalPropertyType() {
        return new DecimalPropertyType();
    }

    /**
     * Create an instance of {@link UomVolumePropertyType }
     * 
     */
    public UomVolumePropertyType createUomVolumePropertyType() {
        return new UomVolumePropertyType();
    }

    /**
     * Create an instance of {@link RecordTypePropertyType }
     * 
     */
    public RecordTypePropertyType createRecordTypePropertyType() {
        return new RecordTypePropertyType();
    }

    /**
     * Create an instance of {@link ObjectReferencePropertyType }
     * 
     */
    public ObjectReferencePropertyType createObjectReferencePropertyType() {
        return new ObjectReferencePropertyType();
    }

    /**
     * Create an instance of {@link ScalePropertyType }
     * 
     */
    public ScalePropertyType createScalePropertyType() {
        return new ScalePropertyType();
    }

    /**
     * Create an instance of {@link IntegerPropertyType }
     * 
     */
    public IntegerPropertyType createIntegerPropertyType() {
        return new IntegerPropertyType();
    }

    /**
     * Create an instance of {@link MultiplicityRangePropertyType }
     * 
     */
    public MultiplicityRangePropertyType createMultiplicityRangePropertyType() {
        return new MultiplicityRangePropertyType();
    }

    /**
     * Create an instance of {@link LocalNamePropertyType }
     * 
     */
    public LocalNamePropertyType createLocalNamePropertyType() {
        return new LocalNamePropertyType();
    }

    /**
     * Create an instance of {@link AnglePropertyType }
     * 
     */
    public AnglePropertyType createAnglePropertyType() {
        return new AnglePropertyType();
    }

    /**
     * Create an instance of {@link UnitOfMeasurePropertyType }
     * 
     */
    public UnitOfMeasurePropertyType createUnitOfMeasurePropertyType() {
        return new UnitOfMeasurePropertyType();
    }

    /**
     * Create an instance of {@link RealPropertyType }
     * 
     */
    public RealPropertyType createRealPropertyType() {
        return new RealPropertyType();
    }

    /**
     * Create an instance of {@link GMObjectPropertyType }
     * 
     */
    public GMObjectPropertyType createGMObjectPropertyType() {
        return new GMObjectPropertyType();
    }

    /**
     * Create an instance of {@link GMPointPropertyType }
     * 
     */
    public GMPointPropertyType createGMPointPropertyType() {
        return new GMPointPropertyType();
    }

    /**
     * Create an instance of {@link TMPeriodDurationPropertyType }
     * 
     */
    public TMPeriodDurationPropertyType createTMPeriodDurationPropertyType() {
        return new TMPeriodDurationPropertyType();
    }

    /**
     * Create an instance of {@link TMPrimitivePropertyType }
     * 
     */
    public TMPrimitivePropertyType createTMPrimitivePropertyType() {
        return new TMPrimitivePropertyType();
    }

    /**
     * Create an instance of {@link SCCRSPropertyType }
     * 
     */
    public SCCRSPropertyType createSCCRSPropertyType() {
        return new SCCRSPropertyType();
    }

    /**
     * Create an instance of {@link OMObservationType }
     * 
     */
    public OMObservationType createOMObservationType() {
        return new OMObservationType();
    }

    /**
     * Create an instance of {@link ObservationContextType }
     * 
     */
    public ObservationContextType createObservationContextType() {
        return new ObservationContextType();
    }

    /**
     * Create an instance of {@link NamedValueType }
     * 
     */
    public NamedValueType createNamedValueType() {
        return new NamedValueType();
    }

    /**
     * Create an instance of {@link OMProcessPropertyType }
     * 
     */
    public OMProcessPropertyType createOMProcessPropertyType() {
        return new OMProcessPropertyType();
    }

    /**
     * Create an instance of {@link OMObservationPropertyType }
     * 
     */
    public OMObservationPropertyType createOMObservationPropertyType() {
        return new OMObservationPropertyType();
    }

    /**
     * Create an instance of {@link TimeObjectPropertyType }
     * 
     */
    public TimeObjectPropertyType createTimeObjectPropertyType() {
        return new TimeObjectPropertyType();
    }

    /**
     * Create an instance of {@link ObservationContextPropertyType }
     * 
     */
    public ObservationContextPropertyType createObservationContextPropertyType() {
        return new ObservationContextPropertyType();
    }

    /**
     * Create an instance of {@link NamedValuePropertyType }
     * 
     */
    public NamedValuePropertyType createNamedValuePropertyType() {
        return new NamedValuePropertyType();
    }

    /**
     * Create an instance of {@link AbstractGriddedSurfaceType.Rows.Row }
     * 
     */
    public AbstractGriddedSurfaceType.Rows.Row createAbstractGriddedSurfaceTypeRowsRow() {
        return new AbstractGriddedSurfaceType.Rows.Row();
    }

    /**
     * Create an instance of {@link ClothoidType.RefLocation }
     * 
     */
    public ClothoidType.RefLocation createClothoidTypeRefLocation() {
        return new ClothoidType.RefLocation();
    }

    /**
     * Create an instance of {@link TinType.ControlPoint }
     * 
     */
    public TinType.ControlPoint createTinTypeControlPoint() {
        return new TinType.ControlPoint();
    }

    /**
     * Create an instance of {@link RunwayDirectionTimeSliceType.Extension }
     * 
     */
    public RunwayDirectionTimeSliceType.Extension createRunwayDirectionTimeSliceTypeExtension() {
        return new RunwayDirectionTimeSliceType.Extension();
    }

    /**
     * Create an instance of {@link AirportHeliportTimeSliceType.Extension }
     * 
     */
    public AirportHeliportTimeSliceType.Extension createAirportHeliportTimeSliceTypeExtension() {
        return new AirportHeliportTimeSliceType.Extension();
    }

    /**
     * Create an instance of {@link AirspaceVolumeType.Extension }
     * 
     */
    public AirspaceVolumeType.Extension createAirspaceVolumeTypeExtension() {
        return new AirspaceVolumeType.Extension();
    }

    /**
     * Create an instance of {@link ElevatedSurfaceType.Extension }
     * 
     */
    public ElevatedSurfaceType.Extension createElevatedSurfaceTypeExtension() {
        return new ElevatedSurfaceType.Extension();
    }

    /**
     * Create an instance of {@link ElevatedCurveType.Extension }
     * 
     */
    public ElevatedCurveType.Extension createElevatedCurveTypeExtension() {
        return new ElevatedCurveType.Extension();
    }

    /**
     * Create an instance of {@link UnitTimeSliceType.Extension }
     * 
     */
    public UnitTimeSliceType.Extension createUnitTimeSliceTypeExtension() {
        return new UnitTimeSliceType.Extension();
    }

    /**
     * Create an instance of {@link RunwayTimeSliceType.Extension }
     * 
     */
    public RunwayTimeSliceType.Extension createRunwayTimeSliceTypeExtension() {
        return new RunwayTimeSliceType.Extension();
    }

    /**
     * Create an instance of {@link AirspaceGeometryComponentType.Extension }
     * 
     */
    public AirspaceGeometryComponentType.Extension createAirspaceGeometryComponentTypeExtension() {
        return new AirspaceGeometryComponentType.Extension();
    }

    /**
     * Create an instance of {@link AirspaceTimeSliceType.Extension }
     * 
     */
    public AirspaceTimeSliceType.Extension createAirspaceTimeSliceTypeExtension() {
        return new AirspaceTimeSliceType.Extension();
    }

    /**
     * Create an instance of {@link ElevatedPointType.Extension }
     * 
     */
    public ElevatedPointType.Extension createElevatedPointTypeExtension() {
        return new ElevatedPointType.Extension();
    }

    /**
     * Create an instance of {@link AerodromeCloudForecastType.Layer }
     * 
     */
    public AerodromeCloudForecastType.Layer createAerodromeCloudForecastTypeLayer() {
        return new AerodromeCloudForecastType.Layer();
    }

    /**
     * Create an instance of {@link MeteorologicalAerodromeObservationRecordType.Cloud }
     * 
     */
    public MeteorologicalAerodromeObservationRecordType.Cloud createMeteorologicalAerodromeObservationRecordTypeCloud() {
        return new MeteorologicalAerodromeObservationRecordType.Cloud();
    }

    /**
     * Create an instance of {@link AerodromeObservedCloudsType.Layer }
     * 
     */
    public AerodromeObservedCloudsType.Layer createAerodromeObservedCloudsTypeLayer() {
        return new AerodromeObservedCloudsType.Layer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CountList", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractScalarValueList")
    public JAXBElement<List<String>> createCountList(List<String> value) {
        return new JAXBElement<List<String>>(_CountList_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractAirspaceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractAirspaceExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractAirspaceExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoComplexPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "superComplex")
    public JAXBElement<TopoComplexPropertyType> createSuperComplex(TopoComplexPropertyType value) {
        return new JAXBElement<TopoComplexPropertyType>(_SuperComplex_QNAME, TopoComplexPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivationUnitTermType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "derivationUnitTerm")
    public JAXBElement<DerivationUnitTermType> createDerivationUnitTerm(DerivationUnitTermType value) {
        return new JAXBElement<DerivationUnitTermType>(_DerivationUnitTerm_QNAME, DerivationUnitTermType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectedCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "projectedCRSRef")
    public JAXBElement<ProjectedCRSPropertyType> createProjectedCRSRef(ProjectedCRSPropertyType value) {
        return new JAXBElement<ProjectedCRSPropertyType>(_ProjectedCRSRef_QNAME, ProjectedCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "baseSurface")
    public JAXBElement<SurfacePropertyType1> createBaseSurface(SurfacePropertyType1 value) {
        return new JAXBElement<SurfacePropertyType1>(_BaseSurface_QNAME, SurfacePropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurvePropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "curveMember")
    public JAXBElement<CurvePropertyType1> createCurveMember(CurvePropertyType1 value) {
        return new JAXBElement<CurvePropertyType1>(_CurveMember_QNAME, CurvePropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_RoleCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createCIRoleCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_CIRoleCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDDistributorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Distributor")
    public JAXBElement<MDDistributorType> createMDDistributor(MDDistributorType value) {
        return new JAXBElement<MDDistributorType>(_MDDistributor_QNAME, MDDistributorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "patches")
    public JAXBElement<SurfacePatchArrayPropertyType> createPatches(SurfacePatchArrayPropertyType value) {
        return new JAXBElement<SurfacePatchArrayPropertyType>(_Patches_QNAME, SurfacePatchArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "verticalCS")
    public JAXBElement<VerticalCSPropertyType> createverticalCS1(VerticalCSPropertyType value) {
        return new JAXBElement<VerticalCSPropertyType>(_verticalCS1_QNAME, VerticalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TopoComplex", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTopology")
    public JAXBElement<TopoComplexType> createTopoComplex(TopoComplexType value) {
        return new JAXBElement<TopoComplexType>(_TopoComplex_QNAME, TopoComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcedurePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "using")
    public JAXBElement<ProcedurePropertyType> createUsing(ProcedurePropertyType value) {
        return new JAXBElement<ProcedurePropertyType>(_Using_QNAME, ProcedurePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CISeriesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_Series")
    public JAXBElement<CISeriesType> createCISeries(CISeriesType value) {
        return new JAXBElement<CISeriesType>(_CISeries_QNAME, CISeriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ImageCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSingleCRS")
    public JAXBElement<ImageCRSType> createImageCRS(ImageCRSType value) {
        return new JAXBElement<ImageCRSType>(_ImageCRS_QNAME, ImageCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElevatedCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "ElevatedCurve", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "Curve")
    public JAXBElement<ElevatedCurveType> createElevatedCurve(ElevatedCurveType value) {
        return new JAXBElement<ElevatedCurveType>(_ElevatedCurve_QNAME, ElevatedCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Arc", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "ArcString")
    public JAXBElement<ArcType1> createArc1(ArcType1 value) {
        return new JAXBElement<ArcType1>(_Arc1_QNAME, ArcType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffsetCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "OffsetCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<OffsetCurveType> createOffsetCurve(OffsetCurveType value) {
        return new JAXBElement<OffsetCurveType>(_OffsetCurve_QNAME, OffsetCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "valueProperty")
    public JAXBElement<ValuePropertyType> createValueProperty(ValuePropertyType value) {
        return new JAXBElement<ValuePropertyType>(_ValueProperty_QNAME, ValuePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesTimeCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "timeCS")
    public JAXBElement<TimeCSPropertyType> createUsesTimeCS(TimeCSPropertyType value) {
        return new JAXBElement<TimeCSPropertyType>(_UsesTimeCS_QNAME, TimeCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "operationRef")
    public JAXBElement<OperationPropertyType> createOperationRef(OperationPropertyType value) {
        return new JAXBElement<OperationPropertyType>(_OperationRef_QNAME, OperationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CITelephoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_Telephone")
    public JAXBElement<CITelephoneType> createCITelephone(CITelephoneType value) {
        return new JAXBElement<CITelephoneType>(_CITelephone_QNAME, CITelephoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceWithNilReasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "DistanceWithNilReason")
    public JAXBElement<DistanceWithNilReasonType> createDistanceWithNilReason(DistanceWithNilReasonType value) {
        return new JAXBElement<DistanceWithNilReasonType>(_DistanceWithNilReason_QNAME, DistanceWithNilReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionToPreferredUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "conversionToPreferredUnit")
    public JAXBElement<ConversionToPreferredUnitType> createConversionToPreferredUnit(ConversionToPreferredUnitType value) {
        return new JAXBElement<ConversionToPreferredUnitType>(_ConversionToPreferredUnit_QNAME, ConversionToPreferredUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcatenatedOperationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "concatenatedOperationRef")
    public JAXBElement<ConcatenatedOperationPropertyType> createConcatenatedOperationRef(ConcatenatedOperationPropertyType value) {
        return new JAXBElement<ConcatenatedOperationPropertyType>(_ConcatenatedOperationRef_QNAME, ConcatenatedOperationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Node", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTopoPrimitive")
    public JAXBElement<NodeType> createNode(NodeType value) {
        return new JAXBElement<NodeType>(_Node_QNAME, NodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoComplexPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "subComplex")
    public JAXBElement<TopoComplexPropertyType> createSubComplex(TopoComplexPropertyType value) {
        return new JAXBElement<TopoComplexPropertyType>(_SubComplex_QNAME, TopoComplexPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDBandType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Band", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "MD_RangeDimension")
    public JAXBElement<MDBandType> createMDBand(MDBandType value) {
        return new JAXBElement<MDBandType>(_MDBand_QNAME, MDBandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOrRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "quantityType")
    public JAXBElement<StringOrRefType> createQuantityType(StringOrRefType value) {
        return new JAXBElement<StringOrRefType>(_QuantityType_QNAME, StringOrRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesVerticalDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "verticalDatum")
    public JAXBElement<VerticalDatumPropertyType> createUsesVerticalDatum(VerticalDatumPropertyType value) {
        return new JAXBElement<VerticalDatumPropertyType>(_UsesVerticalDatum_QNAME, VerticalDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDVectorSpatialRepresentationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_VectorSpatialRepresentation", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractMD_SpatialRepresentation")
    public JAXBElement<MDVectorSpatialRepresentationType> createMDVectorSpatialRepresentation(MDVectorSpatialRepresentationType value) {
        return new JAXBElement<MDVectorSpatialRepresentationType>(_MDVectorSpatialRepresentation_QNAME, MDVectorSpatialRepresentationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_DimensionNameTypeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDDimensionNameTypeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDDimensionNameTypeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_EvaluationMethodTypeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createDQEvaluationMethodTypeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_DQEvaluationMethodTypeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "targetElement")
    public JAXBElement<String> createTargetElement(String value) {
        return new JAXBElement<String>(_TargetElement_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_CharacterSetCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDCharacterSetCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDCharacterSetCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQCompletenessOmissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_CompletenessOmission", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_Completeness")
    public JAXBElement<DQCompletenessOmissionType> createDQCompletenessOmission(DQCompletenessOmissionType value) {
        return new JAXBElement<DQCompletenessOmissionType>(_DQCompletenessOmission_QNAME, DQCompletenessOmissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "domainSet")
    public JAXBElement<DomainSetType> createDomainSet(DomainSetType value) {
        return new JAXBElement<DomainSetType>(_DomainSet_QNAME, DomainSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "locationReference")
    public JAXBElement<ReferenceType> createLocationReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_LocationReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EXSpatialTemporalExtentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "EX_SpatialTemporalExtent", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "EX_TemporalExtent")
    public JAXBElement<EXSpatialTemporalExtentType> createEXSpatialTemporalExtent(EXSpatialTemporalExtentType value) {
        return new JAXBElement<EXSpatialTemporalExtentType>(_EXSpatialTemporalExtent_QNAME, EXSpatialTemporalExtentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSSeriesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_Series", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDS_Aggregate")
    public JAXBElement<DSSeriesType> createDSSeries(DSSeriesType value) {
        return new JAXBElement<DSSeriesType>(_DSSeries_QNAME, DSSeriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "URL")
    public JAXBElement<String> createURL(String value) {
        return new JAXBElement<String>(_URL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "CharacterString")
    public JAXBElement<String> createCharacterString(String value) {
        return new JAXBElement<String>(_CharacterString_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayDirectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "RunwayDirection", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractAIXMFeature")
    public JAXBElement<RunwayDirectionType> createRunwayDirection(RunwayDirectionType value) {
        return new JAXBElement<RunwayDirectionType>(_RunwayDirection_QNAME, RunwayDirectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDReferenceSystemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ReferenceSystem")
    public JAXBElement<MDReferenceSystemType> createMDReferenceSystem(MDReferenceSystemType value) {
        return new JAXBElement<MDReferenceSystemType>(_MDReferenceSystem_QNAME, MDReferenceSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDFeatureCatalogueDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_FeatureCatalogueDescription", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractMD_ContentInformation")
    public JAXBElement<MDFeatureCatalogueDescriptionType> createMDFeatureCatalogueDescription(MDFeatureCatalogueDescriptionType value) {
        return new JAXBElement<MDFeatureCatalogueDescriptionType>(_MDFeatureCatalogueDescription_QNAME, MDFeatureCatalogueDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link BigInteger }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "integerValueList")
    public JAXBElement<List<BigInteger>> createIntegerValueList(List<BigInteger> value) {
        return new JAXBElement<List<BigInteger>>(_IntegerValueList_QNAME, ((Class) List.class), null, ((List<BigInteger> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicityRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "MultiplicityRange")
    public JAXBElement<MultiplicityRangeType> createMultiplicityRange(MultiplicityRangeType value) {
        return new JAXBElement<MultiplicityRangeType>(_MultiplicityRange_QNAME, MultiplicityRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "coordinates")
    public JAXBElement<CoordinatesType> createCoordinates(CoordinatesType value) {
        return new JAXBElement<CoordinatesType>(_Coordinates_QNAME, CoordinatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_InitiativeTypeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createDSInitiativeTypeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_DSInitiativeTypeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "LocalName", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "AbstractGenericName")
    public JAXBElement<CodeType> createLocalName(CodeType value) {
        return new JAXBElement<CodeType>(_LocalName_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeodeticDatumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "GeodeticDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDatum")
    public JAXBElement<GeodeticDatumType> createGeodeticDatum(GeodeticDatumType value) {
        return new JAXBElement<GeodeticDatumType>(_GeodeticDatum_QNAME, GeodeticDatumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Date")
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspaceVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AirspaceVolume")
    public JAXBElement<AirspaceVolumeType> createAirspaceVolume(AirspaceVolumeType value) {
        return new JAXBElement<AirspaceVolumeType>(_AirspaceVolume_QNAME, AirspaceVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CountExtent", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractValue")
    public JAXBElement<List<String>> createCountExtent(List<String> value) {
        return new JAXBElement<List<String>>(_CountExtent_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiCurvePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiCenterLineOf")
    public JAXBElement<MultiCurvePropertyType> createMultiCenterLineOf(MultiCurvePropertyType value) {
        return new JAXBElement<MultiCurvePropertyType>(_MultiCenterLineOf_QNAME, MultiCurvePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractEXGeographicExtentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractEX_GeographicExtent")
    public JAXBElement<AbstractEXGeographicExtentType> createAbstractEXGeographicExtent(AbstractEXGeographicExtentType value) {
        return new JAXBElement<AbstractEXGeographicExtentType>(_AbstractEXGeographicExtent_QNAME, AbstractEXGeographicExtentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiPointProperty")
    public JAXBElement<MultiPointPropertyType> createMultiPointProperty(MultiPointPropertyType value) {
        return new JAXBElement<MultiPointPropertyType>(_MultiPointProperty_QNAME, MultiPointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "datumRef")
    public JAXBElement<DatumPropertyType> createDatumRef(DatumPropertyType value) {
        return new JAXBElement<DatumPropertyType>(_DatumRef_QNAME, DatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralDerivedCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeneralDerivedCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSingleCRS")
    public JAXBElement<AbstractGeneralDerivedCRSType> createAbstractGeneralDerivedCRS(AbstractGeneralDerivedCRSType value) {
        return new JAXBElement<AbstractGeneralDerivedCRSType>(_AbstractGeneralDerivedCRS_QNAME, AbstractGeneralDerivedCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesTemporalCS")
    public JAXBElement<TemporalCSPropertyType> createUsesTemporalCS(TemporalCSPropertyType value) {
        return new JAXBElement<TemporalCSPropertyType>(_UsesTemporalCS_QNAME, TemporalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "Report", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<ReportType> createReport(ReportType value) {
        return new JAXBElement<ReportType>(_Report_QNAME, ReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoCurvePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "topoCurveProperty")
    public JAXBElement<TopoCurvePropertyType> createTopoCurveProperty(TopoCurvePropertyType value) {
        return new JAXBElement<TopoCurvePropertyType>(_TopoCurveProperty_QNAME, TopoCurvePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GridFunctionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "GridFunction", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<GridFunctionType> createGridFunction(GridFunctionType value) {
        return new JAXBElement<GridFunctionType>(_GridFunction_QNAME, GridFunctionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurvePropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "edgeOf")
    public JAXBElement<CurvePropertyType1> createEdgeOf(CurvePropertyType1 value) {
        return new JAXBElement<CurvePropertyType1>(_EdgeOf_QNAME, CurvePropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_MediumFormatCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDMediumFormatCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDMediumFormatCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConcatenatedOperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ConcatenatedOperation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateOperation")
    public JAXBElement<ConcatenatedOperationType> createConcatenatedOperation(ConcatenatedOperationType value) {
        return new JAXBElement<ConcatenatedOperationType>(_ConcatenatedOperation_QNAME, ConcatenatedOperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporalCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "temporalCRSRef")
    public JAXBElement<TemporalCRSPropertyType> createTemporalCRSRef(TemporalCRSPropertyType value) {
        return new JAXBElement<TemporalCRSPropertyType>(_TemporalCRSRef_QNAME, TemporalCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Ring", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractRing")
    public JAXBElement<RingType> createRing(RingType value) {
        return new JAXBElement<RingType>(_Ring_QNAME, RingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Envelope", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<EnvelopeType> createEnvelope(EnvelopeType value) {
        return new JAXBElement<EnvelopeType>(_Envelope_QNAME, EnvelopeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "DefinitionCollection", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<DictionaryType> createDefinitionCollection(DictionaryType value) {
        return new JAXBElement<DictionaryType>(_DefinitionCollection_QNAME, DictionaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Solid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSolid")
    public JAXBElement<SolidType> createSolid(SolidType value) {
        return new JAXBElement<SolidType>(_Solid_QNAME, SolidType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "realizationEpoch")
    public JAXBElement<XMLGregorianCalendar> createRealizationEpoch(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RealizationEpoch_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "dictionaryEntry")
    public JAXBElement<DictionaryEntryType> createDictionaryEntry(DictionaryEntryType value) {
        return new JAXBElement<DictionaryEntryType>(_DictionaryEntry_QNAME, DictionaryEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeEdgeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeEdge", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeTopologyPrimitive")
    public JAXBElement<TimeEdgeType> createTimeEdge(TimeEdgeType value) {
        return new JAXBElement<TimeEdgeType>(_TimeEdge_QNAME, TimeEdgeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDGridSpatialRepresentationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_GridSpatialRepresentation", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractMD_SpatialRepresentation")
    public JAXBElement<MDGridSpatialRepresentationType> createMDGridSpatialRepresentation(MDGridSpatialRepresentationType value) {
        return new JAXBElement<MDGridSpatialRepresentationType>(_MDGridSpatialRepresentation_QNAME, MDGridSpatialRepresentationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_AssociationTypeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createDSAssociationTypeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_DSAssociationTypeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "operationParameterRef")
    public JAXBElement<OperationParameterPropertyType> createOperationParameterRef(OperationParameterPropertyType value) {
        return new JAXBElement<OperationParameterPropertyType>(_OperationParameterRef_QNAME, OperationParameterPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricAggregate")
    public JAXBElement<MultiSurfaceType> createMultiSurface(MultiSurfaceType value) {
        return new JAXBElement<MultiSurfaceType>(_MultiSurface_QNAME, MultiSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesSingleOperation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "coordOperation")
    public JAXBElement<CoordinateOperationPropertyType> createUsesSingleOperation(CoordinateOperationPropertyType value) {
        return new JAXBElement<CoordinateOperationPropertyType>(_UsesSingleOperation_QNAME, CoordinateOperationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDApplicationSchemaInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ApplicationSchemaInformation")
    public JAXBElement<MDApplicationSchemaInformationType> createMDApplicationSchemaInformation(MDApplicationSchemaInformationType value) {
        return new JAXBElement<MDApplicationSchemaInformationType>(_MDApplicationSchemaInformation_QNAME, MDApplicationSchemaInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDPortrayalCatalogueReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_PortrayalCatalogueReference")
    public JAXBElement<MDPortrayalCatalogueReferenceType> createMDPortrayalCatalogueReference(MDPortrayalCatalogueReferenceType value) {
        return new JAXBElement<MDPortrayalCatalogueReferenceType>(_MDPortrayalCatalogueReference_QNAME, MDPortrayalCatalogueReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Face", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTopoPrimitive")
    public JAXBElement<FaceType> createFace(FaceType value) {
        return new JAXBElement<FaceType>(_Face_QNAME, FaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_GeometricObjectTypeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDGeometricObjectTypeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDGeometricObjectTypeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_MaintenanceFrequencyCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDMaintenanceFrequencyCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDMaintenanceFrequencyCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_KeywordTypeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDKeywordTypeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDKeywordTypeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "sphericalCS")
    public JAXBElement<SphericalCSPropertyType> createsphericalCS1(SphericalCSPropertyType value) {
        return new JAXBElement<SphericalCSPropertyType>(_sphericalCS1_QNAME, SphericalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VectorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "vector")
    public JAXBElement<VectorType> createVector(VectorType value) {
        return new JAXBElement<VectorType>(_Vector_QNAME, VectorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "pos")
    public JAXBElement<DirectPositionType> createPos(DirectPositionType value) {
        return new JAXBElement<DirectPositionType>(_Pos_QNAME, DirectPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiPointCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDiscreteCoverage")
    public JAXBElement<DiscreteCoverageType> createMultiPointCoverage(DiscreteCoverageType value) {
        return new JAXBElement<DiscreteCoverageType>(_MultiPointCoverage_QNAME, DiscreteCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "definitionRef")
    public JAXBElement<ReferenceType> createDefinitionRef(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_DefinitionRef_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractParametricCurveSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractParametricCurveSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurfacePatch")
    public JAXBElement<AbstractParametricCurveSurfaceType> createAbstractParametricCurveSurface(AbstractParametricCurveSurfaceType value) {
        return new JAXBElement<AbstractParametricCurveSurfaceType>(_AbstractParametricCurveSurface_QNAME, AbstractParametricCurveSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeCalendarEraType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeCalendarEra")
    public JAXBElement<TimeCalendarEraType> createTimeCalendarEra(TimeCalendarEraType value) {
        return new JAXBElement<TimeCalendarEraType>(_TimeCalendarEra_QNAME, TimeCalendarEraType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesGeodeticDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "geodeticDatum")
    public JAXBElement<GeodeticDatumPropertyType> createUsesGeodeticDatum(GeodeticDatumPropertyType value) {
        return new JAXBElement<GeodeticDatumPropertyType>(_UsesGeodeticDatum_QNAME, GeodeticDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SphericalCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "SphericalCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<SphericalCSType> createSphericalCS(SphericalCSType value) {
        return new JAXBElement<SphericalCSType>(_SphericalCS_QNAME, SphericalCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurvePropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "baseCurve")
    public JAXBElement<CurvePropertyType1> createBaseCurve(CurvePropertyType1 value) {
        return new JAXBElement<CurvePropertyType1>(_BaseCurve_QNAME, CurvePropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "verticalDatumRef")
    public JAXBElement<VerticalDatumPropertyType> createVerticalDatumRef(VerticalDatumPropertyType value) {
        return new JAXBElement<VerticalDatumPropertyType>(_VerticalDatumRef_QNAME, VerticalDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "verticalDatum")
    public JAXBElement<VerticalDatumPropertyType> createverticalDatum1(VerticalDatumPropertyType value) {
        return new JAXBElement<VerticalDatumPropertyType>(_verticalDatum1_QNAME, VerticalDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDQLogicalConsistencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractDQ_LogicalConsistency", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_Element")
    public JAXBElement<AbstractDQLogicalConsistencyType> createAbstractDQLogicalConsistency(AbstractDQLogicalConsistencyType value) {
        return new JAXBElement<AbstractDQLogicalConsistencyType>(_AbstractDQLogicalConsistency_QNAME, AbstractDQLogicalConsistencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSOtherAggregateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_OtherAggregate", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDS_Aggregate")
    public JAXBElement<DSOtherAggregateType> createDSOtherAggregate(DSOtherAggregateType value) {
        return new JAXBElement<DSOtherAggregateType>(_DSOtherAggregate_QNAME, DSOtherAggregateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDStandardOrderProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_StandardOrderProcess")
    public JAXBElement<MDStandardOrderProcessType> createMDStandardOrderProcess(MDStandardOrderProcessType value) {
        return new JAXBElement<MDStandardOrderProcessType>(_MDStandardOrderProcess_QNAME, MDStandardOrderProcessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "OperationParameter", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeneralOperationParameter")
    public JAXBElement<OperationParameterType> createOperationParameter1(OperationParameterType value) {
        return new JAXBElement<OperationParameterType>(_OperationParameter1_QNAME, OperationParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportHeliportTimeSliceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AirportHeliportTimeSlice", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeSlice")
    public JAXBElement<AirportHeliportTimeSliceType> createAirportHeliportTimeSlice(AirportHeliportTimeSliceType value) {
        return new JAXBElement<AirportHeliportTimeSliceType>(_AirportHeliportTimeSlice_QNAME, AirportHeliportTimeSliceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralConversionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeneralConversion", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractOperation")
    public JAXBElement<AbstractGeneralConversionType> createAbstractGeneralConversion(AbstractGeneralConversionType value) {
        return new JAXBElement<AbstractGeneralConversionType>(_AbstractGeneralConversion_QNAME, AbstractGeneralConversionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AngleWithNilReasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AngleWithNilReason")
    public JAXBElement<AngleWithNilReasonType> createAngleWithNilReason(AngleWithNilReasonType value) {
        return new JAXBElement<AngleWithNilReasonType>(_AngleWithNilReason_QNAME, AngleWithNilReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCurveSegmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractCurveSegment", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AbstractCurveSegmentType> createAbstractCurveSegment(AbstractCurveSegmentType value) {
        return new JAXBElement<AbstractCurveSegmentType>(_AbstractCurveSegment_QNAME, AbstractCurveSegmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvelopeWithTimePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "EnvelopeWithTimePeriod", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Envelope")
    public JAXBElement<EnvelopeWithTimePeriodType> createEnvelopeWithTimePeriod(EnvelopeWithTimePeriodType value) {
        return new JAXBElement<EnvelopeWithTimePeriodType>(_EnvelopeWithTimePeriod_QNAME, EnvelopeWithTimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcStringByBulgeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ArcStringByBulge", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<ArcStringByBulgeType> createArcStringByBulge(ArcStringByBulgeType value) {
        return new JAXBElement<ArcStringByBulgeType>(_ArcStringByBulge_QNAME, ArcStringByBulgeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObservationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Observation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<ObservationType> createObservation(ObservationType value) {
        return new JAXBElement<ObservationType>(_Observation_QNAME, ObservationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "name")
    public JAXBElement<CodeType> createName(CodeType value) {
        return new JAXBElement<CodeType>(_Name_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OMObservationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/om/2.0", name = "OM_Observation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<OMObservationType> createOMObservation(OMObservationType value) {
        return new JAXBElement<OMObservationType>(_OMObservation_QNAME, OMObservationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "maximumOccurs")
    public JAXBElement<BigInteger> createMaximumOccurs(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaximumOccurs_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporalDatumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TemporalDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDatum")
    public JAXBElement<TemporalDatumType> createTemporalDatum1(TemporalDatumType value) {
        return new JAXBElement<TemporalDatumType>(_TemporalDatum1_QNAME, TemporalDatumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "measure")
    public JAXBElement<MeasureType> createMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_Measure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDImageDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ImageDescription", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "MD_CoverageDescription")
    public JAXBElement<MDImageDescriptionType> createMDImageDescription(MDImageDescriptionType value) {
        return new JAXBElement<MDImageDescriptionType>(_MDImageDescription_QNAME, MDImageDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_TopologyLevelCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDTopologyLevelCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDTopologyLevelCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcByBulgeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ArcByBulge", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "ArcStringByBulge")
    public JAXBElement<ArcByBulgeType> createArcByBulge(ArcByBulgeType value) {
        return new JAXBElement<ArcByBulgeType>(_ArcByBulge_QNAME, ArcByBulgeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesOperation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "coordOperation")
    public JAXBElement<CoordinateOperationPropertyType> createUsesOperation(CoordinateOperationPropertyType value) {
        return new JAXBElement<CoordinateOperationPropertyType>(_UsesOperation_QNAME, CoordinateOperationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDDataIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_DataIdentification", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractMD_Identification")
    public JAXBElement<MDDataIdentificationType> createMDDataIdentification(MDDataIdentificationType value) {
        return new JAXBElement<MDDataIdentificationType>(_MDDataIdentification_QNAME, MDDataIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LISourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "LI_Source")
    public JAXBElement<LISourceType> createLISource(LISourceType value) {
        return new JAXBElement<LISourceType>(_LISource_QNAME, LISourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeNodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeNode", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeTopologyPrimitive")
    public JAXBElement<TimeNodeType> createTimeNode(TimeNodeType value) {
        return new JAXBElement<TimeNodeType>(_TimeNode_QNAME, TimeNodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiPointDomain", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "domainSet")
    public JAXBElement<DomainSetType> createMultiPointDomain(DomainSetType value) {
        return new JAXBElement<DomainSetType>(_MultiPointDomain_QNAME, DomainSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "MeteorologicalAerodromeObservationReport", substitutionHeadNamespace = "http://schemas.wmo.int/iwxxm/2.1", substitutionHeadName = "Report")
    public JAXBElement<MeteorologicalAerodromeObservationReportType> createMeteorologicalAerodromeObservationReport(MeteorologicalAerodromeObservationReportType value) {
        return new JAXBElement<MeteorologicalAerodromeObservationReportType>(_MeteorologicalAerodromeObservationReport_QNAME, MeteorologicalAerodromeObservationReportType.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayTimeSliceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "RunwayTimeSlice", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeSlice")
    public JAXBElement<RunwayTimeSliceType> createRunwayTimeSlice(RunwayTimeSliceType value) {
        return new JAXBElement<RunwayTimeSliceType>(_RunwayTimeSlice_QNAME, RunwayTimeSliceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitTimeSliceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "UnitTimeSlice", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeSlice")
    public JAXBElement<UnitTimeSliceType> createUnitTimeSlice(UnitTimeSliceType value) {
        return new JAXBElement<UnitTimeSliceType>(_UnitTimeSlice_QNAME, UnitTimeSliceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Polygon", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurface")
    public JAXBElement<PolygonType> createPolygon(PolygonType value) {
        return new JAXBElement<PolygonType>(_Polygon_QNAME, PolygonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDMediumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Medium")
    public JAXBElement<MDMediumType> createMDMedium(MDMediumType value) {
        return new JAXBElement<MDMediumType>(_MDMedium_QNAME, MDMediumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesImageDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "imageDatum")
    public JAXBElement<ImageDatumPropertyType> createUsesImageDatum(ImageDatumPropertyType value) {
        return new JAXBElement<ImageDatumPropertyType>(_UsesImageDatum_QNAME, ImageDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Boolean")
    public JAXBElement<java.lang.Boolean> createBoolean1(java.lang.Boolean value) {
        return new JAXBElement<java.lang.Boolean>(_Boolean1_QNAME, java.lang.Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InlinePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "abstractInlineProperty")
    public JAXBElement<InlinePropertyType> createAbstractInlineProperty(InlinePropertyType value) {
        return new JAXBElement<InlinePropertyType>(_AbstractInlineProperty_QNAME, InlinePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "integerValue")
    public JAXBElement<BigInteger> createIntegerValue(BigInteger value) {
        return new JAXBElement<BigInteger>(_IntegerValue_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeWithAuthorityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "derivedCRSType")
    public JAXBElement<CodeWithAuthorityType> createDerivedCRSType(CodeWithAuthorityType value) {
        return new JAXBElement<CodeWithAuthorityType>(_DerivedCRSType_QNAME, CodeWithAuthorityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivedUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "DerivedUnit", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "UnitDefinition")
    public JAXBElement<DerivedUnitType> createDerivedUnit(DerivedUnitType value) {
        return new JAXBElement<DerivedUnitType>(_DerivedUnit_QNAME, DerivedUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesEllipsoid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "ellipsoid")
    public JAXBElement<EllipsoidPropertyType> createUsesEllipsoid(EllipsoidPropertyType value) {
        return new JAXBElement<EllipsoidPropertyType>(_UsesEllipsoid_QNAME, EllipsoidPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDKeywordsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Keywords")
    public JAXBElement<MDKeywordsType> createMDKeywords(MDKeywordsType value) {
        return new JAXBElement<MDKeywordsType>(_MDKeywords_QNAME, MDKeywordsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSurfacePatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractSurfacePatch")
    public JAXBElement<AbstractSurfacePatchType> createAbstractSurfacePatch(AbstractSurfacePatchType value) {
        return new JAXBElement<AbstractSurfacePatchType>(_AbstractSurfacePatch_QNAME, AbstractSurfacePatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinePlacementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AffinePlacement", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AffinePlacementType> createAffinePlacement(AffinePlacementType value) {
        return new JAXBElement<AffinePlacementType>(_AffinePlacement_QNAME, AffinePlacementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "stringValue")
    public JAXBElement<String> createStringValue(String value) {
        return new JAXBElement<String>(_StringValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "target")
    public JAXBElement<TargetPropertyType> createTarget(TargetPropertyType value) {
        return new JAXBElement<TargetPropertyType>(_Target_QNAME, TargetPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "baseGeographicCRS")
    public JAXBElement<GeographicCRSPropertyType> createBaseGeographicCRS(GeographicCRSPropertyType value) {
        return new JAXBElement<GeographicCRSPropertyType>(_BaseGeographicCRS_QNAME, GeographicCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationRoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "rangeParameters")
    public JAXBElement<AssociationRoleType> createRangeParameters(AssociationRoleType value) {
        return new JAXBElement<AssociationRoleType>(_RangeParameters_QNAME, AssociationRoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "transformationRef")
    public JAXBElement<TransformationPropertyType> createTransformationRef(TransformationPropertyType value) {
        return new JAXBElement<TransformationPropertyType>(_TransformationRef_QNAME, TransformationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQRelativeInternalPositionalAccuracyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_RelativeInternalPositionalAccuracy", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_PositionalAccuracy")
    public JAXBElement<DQRelativeInternalPositionalAccuracyType> createDQRelativeInternalPositionalAccuracy(DQRelativeInternalPositionalAccuracyType value) {
        return new JAXBElement<DQRelativeInternalPositionalAccuracyType>(_DQRelativeInternalPositionalAccuracy_QNAME, DQRelativeInternalPositionalAccuracyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "Runway", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractAIXMFeature")
    public JAXBElement<RunwayType> createRunway(RunwayType value) {
        return new JAXBElement<RunwayType>(_Runway_QNAME, RunwayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<AbstractCRSType> createAbstractCRS(AbstractCRSType value) {
        return new JAXBElement<AbstractCRSType>(_AbstractCRS_QNAME, AbstractCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractElevatedCurveExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractElevatedCurveExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractElevatedCurveExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTimeSliceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractTimeSlice", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractTimeSliceType> createAbstractTimeSlice(AbstractTimeSliceType value) {
        return new JAXBElement<AbstractTimeSliceType>(_AbstractTimeSlice_QNAME, AbstractTimeSliceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EllipsoidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Ellipsoid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<EllipsoidType> createEllipsoid1(EllipsoidType value) {
        return new JAXBElement<EllipsoidType>(_Ellipsoid1_QNAME, EllipsoidType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PTLocaleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "PT_Locale")
    public JAXBElement<PTLocaleType> createPTLocale(PTLocaleType value) {
        return new JAXBElement<PTLocaleType>(_PTLocale_QNAME, PTLocaleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "formula")
    public JAXBElement<CodeType> createFormula(CodeType value) {
        return new JAXBElement<CodeType>(_Formula_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeReferenceSystemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeReferenceSystem", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<TimeReferenceSystemType> createTimeReferenceSystem(TimeReferenceSystemType value) {
        return new JAXBElement<TimeReferenceSystemType>(_TimeReferenceSystem_QNAME, TimeReferenceSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TriangulatedSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Surface")
    public JAXBElement<SurfaceType1> createTriangulatedSurface(SurfaceType1 value) {
        return new JAXBElement<SurfaceType1>(_TriangulatedSurface_QNAME, SurfaceType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractSingleOperation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateOperation")
    public JAXBElement<AbstractCoordinateOperationType> createAbstractSingleOperation(AbstractCoordinateOperationType value) {
        return new JAXBElement<AbstractCoordinateOperationType>(_AbstractSingleOperation_QNAME, AbstractCoordinateOperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "location")
    public JAXBElement<LocationPropertyType> createLocation(LocationPropertyType value) {
        return new JAXBElement<LocationPropertyType>(_Location_QNAME, LocationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "LineString", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<LineStringType> createLineString(LineStringType value) {
        return new JAXBElement<LineStringType>(_LineString_QNAME, LineStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "rangeSet")
    public JAXBElement<RangeSetType> createRangeSet(RangeSetType value) {
        return new JAXBElement<RangeSetType>(_RangeSet_QNAME, RangeSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonPatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "PolygonPatch", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurfacePatch")
    public JAXBElement<PolygonPatchType> createPolygonPatch(PolygonPatchType value) {
        return new JAXBElement<PolygonPatchType>(_PolygonPatch_QNAME, PolygonPatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "decimalMinutes")
    public JAXBElement<BigDecimal> createDecimalMinutes(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DecimalMinutes_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeSurfaceWindType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AerodromeSurfaceWind", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AerodromeSurfaceWindType> createAerodromeSurfaceWind(AerodromeSurfaceWindType value) {
        return new JAXBElement<AerodromeSurfaceWindType>(_AerodromeSurfaceWind_QNAME, AerodromeSurfaceWindType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AngleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Angle", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "Measure")
    public JAXBElement<AngleType> createAngle1(AngleType value) {
        return new JAXBElement<AngleType>(_Angle1_QNAME, AngleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesEllipsoidalCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "ellipsoidalCS")
    public JAXBElement<EllipsoidalCSPropertyType> createUsesEllipsoidalCS(EllipsoidalCSPropertyType value) {
        return new JAXBElement<EllipsoidalCSPropertyType>(_UsesEllipsoidalCS_QNAME, EllipsoidalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObliqueCartesianCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ObliqueCartesianCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<ObliqueCartesianCSType> createObliqueCartesianCS(ObliqueCartesianCSType value) {
        return new JAXBElement<ObliqueCartesianCSType>(_ObliqueCartesianCS_QNAME, ObliqueCartesianCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataBlockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "DataBlock", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<DataBlockType> createDataBlock(DataBlockType value) {
        return new JAXBElement<DataBlockType>(_DataBlock_QNAME, DataBlockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOrRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "description")
    public JAXBElement<StringOrRefType> createDescription(StringOrRefType value) {
        return new JAXBElement<StringOrRefType>(_Description_QNAME, StringOrRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CompositeSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurface")
    public JAXBElement<CompositeSurfaceType> createCompositeSurface(CompositeSurfaceType value) {
        return new JAXBElement<CompositeSurfaceType>(_CompositeSurface_QNAME, CompositeSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateSystemAxisPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "coordinateSystemAxisRef")
    public JAXBElement<CoordinateSystemAxisPropertyType> createCoordinateSystemAxisRef(CoordinateSystemAxisPropertyType value) {
        return new JAXBElement<CoordinateSystemAxisPropertyType>(_CoordinateSystemAxisRef_QNAME, CoordinateSystemAxisPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "generalConversionRef")
    public JAXBElement<GeneralConversionPropertyType> createGeneralConversionRef(GeneralConversionPropertyType value) {
        return new JAXBElement<GeneralConversionPropertyType>(_GeneralConversionRef_QNAME, GeneralConversionPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDDigitalTransferOptionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_DigitalTransferOptions")
    public JAXBElement<MDDigitalTransferOptionsType> createMDDigitalTransferOptions(MDDigitalTransferOptionsType value) {
        return new JAXBElement<MDDigitalTransferOptionsType>(_MDDigitalTransferOptions_QNAME, MDDigitalTransferOptionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "BooleanList", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractScalarValueList")
    public JAXBElement<List<String>> createBooleanList(List<String> value) {
        return new JAXBElement<List<String>>(_BooleanList_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaDataPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "metaDataProperty")
    public JAXBElement<MetaDataPropertyType> createMetaDataProperty(MetaDataPropertyType value) {
        return new JAXBElement<MetaDataPropertyType>(_MetaDataProperty_QNAME, MetaDataPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_SpatialRepresentationTypeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDSpatialRepresentationTypeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDSpatialRepresentationTypeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "RectifiedGridCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDiscreteCoverage")
    public JAXBElement<DiscreteCoverageType> createRectifiedGridCoverage(DiscreteCoverageType value) {
        return new JAXBElement<DiscreteCoverageType>(_RectifiedGridCoverage_QNAME, DiscreteCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeTopologyComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeTopologyComplex", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeComplex")
    public JAXBElement<TimeTopologyComplexType> createTimeTopologyComplex(TimeTopologyComplexType value) {
        return new JAXBElement<TimeTopologyComplexType>(_TimeTopologyComplex_QNAME, TimeTopologyComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitDefinitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "UnitDefinition", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<UnitDefinitionType> createUnitDefinition(UnitDefinitionType value) {
        return new JAXBElement<UnitDefinitionType>(_UnitDefinition_QNAME, UnitDefinitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "valueComponent")
    public JAXBElement<ValuePropertyType> createValueComponent(ValuePropertyType value) {
        return new JAXBElement<ValuePropertyType>(_ValueComponent_QNAME, ValuePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeCalendarType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeCalendar", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "TimeReferenceSystem")
    public JAXBElement<TimeCalendarType> createTimeCalendar(TimeCalendarType value) {
        return new JAXBElement<TimeCalendarType>(_TimeCalendar_QNAME, TimeCalendarType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_DateTypeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createCIDateTypeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_CIDateTypeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralTransformationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "generalTransformationRef")
    public JAXBElement<GeneralTransformationPropertyType> createGeneralTransformationRef(GeneralTransformationPropertyType value) {
        return new JAXBElement<GeneralTransformationPropertyType>(_GeneralTransformationRef_QNAME, GeneralTransformationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EXExtentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "EX_Extent")
    public JAXBElement<EXExtentType> createEXExtent(EXExtentType value) {
        return new JAXBElement<EXExtentType>(_EXExtent_QNAME, EXExtentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShellType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Shell", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<ShellType> createShell(ShellType value) {
        return new JAXBElement<ShellType>(_Shell_QNAME, ShellType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDObligationCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ObligationCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<MDObligationCodeType> createMDObligationCode(MDObligationCodeType value) {
        return new JAXBElement<MDObligationCodeType>(_MDObligationCode_QNAME, MDObligationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQThematicClassificationCorrectnessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_ThematicClassificationCorrectness", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_ThematicAccuracy")
    public JAXBElement<DQThematicClassificationCorrectnessType> createDQThematicClassificationCorrectness(DQThematicClassificationCorrectnessType value) {
        return new JAXBElement<DQThematicClassificationCorrectnessType>(_DQThematicClassificationCorrectness_QNAME, DQThematicClassificationCorrectnessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Curve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<CurveType1> createCurve1(CurveType1 value) {
        return new JAXBElement<CurveType1>(_Curve1_QNAME, CurveType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefinitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Definition", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<DefinitionType> createDefinition(DefinitionType value) {
        return new JAXBElement<DefinitionType>(_Definition_QNAME, DefinitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "pointRep")
    public JAXBElement<PointPropertyType1> createPointRep(PointPropertyType1 value) {
        return new JAXBElement<PointPropertyType1>(_PointRep_QNAME, PointPropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "method")
    public JAXBElement<OperationMethodPropertyType> createMethod(OperationMethodPropertyType value) {
        return new JAXBElement<OperationMethodPropertyType>(_Method_QNAME, OperationMethodPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimePeriod", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeGeometricPrimitive")
    public JAXBElement<TimePeriodType> createTimePeriod(TimePeriodType value) {
        return new JAXBElement<TimePeriodType>(_TimePeriod_QNAME, TimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIResponsiblePartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_ResponsibleParty")
    public JAXBElement<CIResponsiblePartyType> createCIResponsibleParty(CIResponsiblePartyType value) {
        return new JAXBElement<CIResponsiblePartyType>(_CIResponsibleParty_QNAME, CIResponsiblePartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeWithAuthorityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "identifier")
    public JAXBElement<CodeWithAuthorityType> createIdentifier(CodeWithAuthorityType value) {
        return new JAXBElement<CodeWithAuthorityType>(_Identifier_QNAME, CodeWithAuthorityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CartesianCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CartesianCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<CartesianCSType> createCartesianCS(CartesianCSType value) {
        return new JAXBElement<CartesianCSType>(_CartesianCS_QNAME, CartesianCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayDirectionTimeSliceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "RunwayDirectionTimeSlice", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeSlice")
    public JAXBElement<RunwayDirectionTimeSliceType> createRunwayDirectionTimeSlice(RunwayDirectionTimeSliceType value) {
        return new JAXBElement<RunwayDirectionTimeSliceType>(_RunwayDirectionTimeSlice_QNAME, RunwayDirectionTimeSliceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinatesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "tupleList")
    public JAXBElement<CoordinatesType> createTupleList(CoordinatesType value) {
        return new JAXBElement<CoordinatesType>(_TupleList_QNAME, CoordinatesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometricAggregateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeometricAggregate", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometry")
    public JAXBElement<AbstractGeometricAggregateType> createAbstractGeometricAggregate(AbstractGeometricAggregateType value) {
        return new JAXBElement<AbstractGeometricAggregateType>(_AbstractGeometricAggregate_QNAME, AbstractGeometricAggregateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "curveMembers")
    public JAXBElement<CurveArrayPropertyType> createCurveMembers(CurveArrayPropertyType value) {
        return new JAXBElement<CurveArrayPropertyType>(_CurveMembers_QNAME, CurveArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "MemberName")
    public JAXBElement<MemberNameType> createMemberName(MemberNameType value) {
        return new JAXBElement<MemberNameType>(_MemberName_QNAME, MemberNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Binary")
    public JAXBElement<BinaryType> createBinary(BinaryType value) {
        return new JAXBElement<BinaryType>(_Binary_QNAME, BinaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<AbstractCurveType> createAbstractCurve(AbstractCurveType value) {
        return new JAXBElement<AbstractCurveType>(_AbstractCurve_QNAME, AbstractCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractDiscreteCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoverage")
    public JAXBElement<DiscreteCoverageType> createAbstractDiscreteCoverage(DiscreteCoverageType value) {
        return new JAXBElement<DiscreteCoverageType>(_AbstractDiscreteCoverage_QNAME, DiscreteCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "temporalDatum")
    public JAXBElement<TemporalDatumPropertyType> createTemporalDatum(TemporalDatumPropertyType value) {
        return new JAXBElement<TemporalDatumPropertyType>(_TemporalDatum_QNAME, TemporalDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DegreesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "degrees")
    public JAXBElement<DegreesType> createDegrees(DegreesType value) {
        return new JAXBElement<DegreesType>(_Degrees_QNAME, DegreesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDDistributionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Distribution")
    public JAXBElement<MDDistributionType> createMDDistribution(MDDistributionType value) {
        return new JAXBElement<MDDistributionType>(_MDDistribution_QNAME, MDDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriangleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Triangle", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurfacePatch")
    public JAXBElement<TriangleType> createTriangle(TriangleType value) {
        return new JAXBElement<TriangleType>(_Triangle_QNAME, TriangleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RectangleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Rectangle", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurfacePatch")
    public JAXBElement<RectangleType> createRectangle(RectangleType value) {
        return new JAXBElement<RectangleType>(_Rectangle_QNAME, RectangleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQTemporalValidityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_TemporalValidity", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_TemporalAccuracy")
    public JAXBElement<DQTemporalValidityType> createDQTemporalValidity(DQTemporalValidityType value) {
        return new JAXBElement<DQTemporalValidityType>(_DQTemporalValidity_QNAME, DQTemporalValidityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Count }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Count", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractScalarValue")
    public JAXBElement<Count> createCount(Count value) {
        return new JAXBElement<Count>(_Count_QNAME, Count.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ParameterValueGroup", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeneralParameterValue")
    public JAXBElement<ParameterValueGroupType> createParameterValueGroup(ParameterValueGroupType value) {
        return new JAXBElement<ParameterValueGroupType>(_ParameterValueGroup_QNAME, ParameterValueGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "solidArrayProperty")
    public JAXBElement<SolidArrayPropertyType> createSolidArrayProperty(SolidArrayPropertyType value) {
        return new JAXBElement<SolidArrayPropertyType>(_SolidArrayProperty_QNAME, SolidArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "TypeName")
    public JAXBElement<TypeNameType> createTypeName(TypeNameType value) {
        return new JAXBElement<TypeNameType>(_TypeName_QNAME, TypeNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericMetaDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "GenericMetaData", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractMetaData")
    public JAXBElement<GenericMetaDataType> createGenericMetaData(GenericMetaDataType value) {
        return new JAXBElement<GenericMetaDataType>(_GenericMetaData_QNAME, GenericMetaDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EXGeographicDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "EX_GeographicDescription", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractEX_GeographicExtent")
    public JAXBElement<EXGeographicDescriptionType> createEXGeographicDescription(EXGeographicDescriptionType value) {
        return new JAXBElement<EXGeographicDescriptionType>(_EXGeographicDescription_QNAME, EXGeographicDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.iwxxm.metarSpeci.Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Boolean", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractScalarValue")
    public JAXBElement<com.iwxxm.metarSpeci.Boolean> createBoolean(com.iwxxm.metarSpeci.Boolean value) {
        return new JAXBElement<com.iwxxm.metarSpeci.Boolean>(_Boolean_QNAME, com.iwxxm.metarSpeci.Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQConformanceResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_ConformanceResult", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_Result")
    public JAXBElement<DQConformanceResultType> createDQConformanceResult(DQConformanceResultType value) {
        return new JAXBElement<DQConformanceResultType>(_DQConformanceResult_QNAME, DQConformanceResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlimitedIntegerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "UnlimitedInteger")
    public JAXBElement<UnlimitedIntegerType> createUnlimitedInteger(UnlimitedIntegerType value) {
        return new JAXBElement<UnlimitedIntegerType>(_UnlimitedInteger_QNAME, UnlimitedIntegerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractContinuousCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractContinuousCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<AbstractContinuousCoverageType> createAbstractContinuousCoverage(AbstractContinuousCoverageType value) {
        return new JAXBElement<AbstractContinuousCoverageType>(_AbstractContinuousCoverage_QNAME, AbstractContinuousCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSProductionSeriesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_ProductionSeries", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "DS_Series")
    public JAXBElement<DSProductionSeriesType> createDSProductionSeries(DSProductionSeriesType value) {
        return new JAXBElement<DSProductionSeriesType>(_DSProductionSeries_QNAME, DSProductionSeriesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "coordinateSystem")
    public JAXBElement<CoordinateSystemPropertyType> createUsesCS(CoordinateSystemPropertyType value) {
        return new JAXBElement<CoordinateSystemPropertyType>(_UsesCS_QNAME, CoordinateSystemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "definitionMember", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "dictionaryEntry")
    public JAXBElement<DictionaryEntryType> createDefinitionMember(DictionaryEntryType value) {
        return new JAXBElement<DictionaryEntryType>(_DefinitionMember_QNAME, DictionaryEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeWithAuthorityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "axisDirection")
    public JAXBElement<CodeWithAuthorityType> createAxisDirection(CodeWithAuthorityType value) {
        return new JAXBElement<CodeWithAuthorityType>(_AxisDirection_QNAME, CodeWithAuthorityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "seconds")
    public JAXBElement<BigDecimal> createSeconds(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Seconds_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeWindShearType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AerodromeWindShear", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AerodromeWindShearType> createAerodromeWindShear(AerodromeWindShearType value) {
        return new JAXBElement<AerodromeWindShearType>(_AerodromeWindShear_QNAME, AerodromeWindShearType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_Association")
    public JAXBElement<DSAssociationType> createDSAssociation(DSAssociationType value) {
        return new JAXBElement<DSAssociationType>(_DSAssociation_QNAME, DSAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePrimitivePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "featureLifetime")
    public JAXBElement<TimePrimitivePropertyType> createFeatureLifetime(TimePrimitivePropertyType value) {
        return new JAXBElement<TimePrimitivePropertyType>(_FeatureLifetime_QNAME, TimePrimitivePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "crsRef")
    public JAXBElement<CRSPropertyType> createCrsRef(CRSPropertyType value) {
        return new JAXBElement<CRSPropertyType>(_CrsRef_QNAME, CRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Cone", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGriddedSurface")
    public JAXBElement<ConeType> createCone(ConeType value) {
        return new JAXBElement<ConeType>(_Cone_QNAME, ConeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "locationName")
    public JAXBElement<CodeType> createLocationName(CodeType value) {
        return new JAXBElement<CodeType>(_LocationName_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "conversionRef")
    public JAXBElement<ConversionPropertyType> createConversionRef(ConversionPropertyType value) {
        return new JAXBElement<ConversionPropertyType>(_ConversionRef_QNAME, ConversionPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeneralOperationParameter", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<AbstractGeneralOperationParameterType> createAbstractGeneralOperationParameter(AbstractGeneralOperationParameterType value) {
        return new JAXBElement<AbstractGeneralOperationParameterType>(_AbstractGeneralOperationParameter_QNAME, AbstractGeneralOperationParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "statusReference")
    public JAXBElement<ReferenceType> createStatusReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_StatusReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDFormatType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Format")
    public JAXBElement<MDFormatType> createMDFormat(MDFormatType value) {
        return new JAXBElement<MDFormatType>(_MDFormat_QNAME, MDFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ellipsoidRef")
    public JAXBElement<EllipsoidPropertyType> createEllipsoidRef(EllipsoidPropertyType value) {
        return new JAXBElement<EllipsoidPropertyType>(_EllipsoidRef_QNAME, EllipsoidPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDQTemporalAccuracyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractDQ_TemporalAccuracy", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_Element")
    public JAXBElement<AbstractDQTemporalAccuracyType> createAbstractDQTemporalAccuracy(AbstractDQTemporalAccuracyType value) {
        return new JAXBElement<AbstractDQTemporalAccuracyType>(_AbstractDQTemporalAccuracy_QNAME, AbstractDQTemporalAccuracyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectedCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ProjectedCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeneralDerivedCRS")
    public JAXBElement<ProjectedCRSType> createProjectedCRS(ProjectedCRSType value) {
        return new JAXBElement<ProjectedCRSType>(_ProjectedCRS_QNAME, ProjectedCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Integer")
    public JAXBElement<BigInteger> createInteger(BigInteger value) {
        return new JAXBElement<BigInteger>(_Integer_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "coordinateOperationRef")
    public JAXBElement<CoordinateOperationPropertyType> createCoordinateOperationRef(CoordinateOperationPropertyType value) {
        return new JAXBElement<CoordinateOperationPropertyType>(_CoordinateOperationRef_QNAME, CoordinateOperationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesMethod", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "method")
    public JAXBElement<OperationMethodPropertyType> createUsesMethod(OperationMethodPropertyType value) {
        return new JAXBElement<OperationMethodPropertyType>(_UsesMethod_QNAME, OperationMethodPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolarCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "PolarCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<PolarCSType> createPolarCS(PolarCSType value) {
        return new JAXBElement<PolarCSType>(_PolarCS_QNAME, PolarCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassThroughOperationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "passThroughOperationRef")
    public JAXBElement<PassThroughOperationPropertyType> createPassThroughOperationRef(PassThroughOperationPropertyType value) {
        return new JAXBElement<PassThroughOperationPropertyType>(_PassThroughOperationRef_QNAME, PassThroughOperationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GridType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Grid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractImplicitGeometry")
    public JAXBElement<GridType> createGrid(GridType value) {
        return new JAXBElement<GridType>(_Grid_QNAME, GridType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateOperationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "coordOperation")
    public JAXBElement<CoordinateOperationPropertyType> createCoordOperation(CoordinateOperationPropertyType value) {
        return new JAXBElement<CoordinateOperationPropertyType>(_CoordOperation_QNAME, CoordinateOperationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "surfaceArrayProperty")
    public JAXBElement<SurfaceArrayPropertyType> createSurfaceArrayProperty(SurfaceArrayPropertyType value) {
        return new JAXBElement<SurfaceArrayPropertyType>(_SurfaceArrayProperty_QNAME, SurfaceArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiSurfaceProperty")
    public JAXBElement<MultiSurfacePropertyType> createMultiSurfaceProperty(MultiSurfacePropertyType value) {
        return new JAXBElement<MultiSurfacePropertyType>(_MultiSurfaceProperty_QNAME, MultiSurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "geographicCRSRef")
    public JAXBElement<GeographicCRSPropertyType> createGeographicCRSRef(GeographicCRSPropertyType value) {
        return new JAXBElement<GeographicCRSPropertyType>(_GeographicCRSRef_QNAME, GeographicCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocentricCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "GeocentricCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSingleCRS")
    public JAXBElement<GeocentricCRSType> createGeocentricCRS(GeocentricCRSType value) {
        return new JAXBElement<GeocentricCRSType>(_GeocentricCRS_QNAME, GeocentricCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ellipsoidalCS")
    public JAXBElement<EllipsoidalCSPropertyType> createellipsoidalCS1(EllipsoidalCSPropertyType value) {
        return new JAXBElement<EllipsoidalCSPropertyType>(_ellipsoidalCS1_QNAME, EllipsoidalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDRangeDimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_RangeDimension")
    public JAXBElement<MDRangeDimensionType> createMDRangeDimension(MDRangeDimensionType value) {
        return new JAXBElement<MDRangeDimensionType>(_MDRangeDimension_QNAME, MDRangeDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "sphericalCSRef")
    public JAXBElement<SphericalCSPropertyType> createSphericalCSRef(SphericalCSPropertyType value) {
        return new JAXBElement<SphericalCSPropertyType>(_SphericalCSRef_QNAME, SphericalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LILineageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "LI_Lineage")
    public JAXBElement<LILineageType> createLILineage(LILineageType value) {
        return new JAXBElement<LILineageType>(_LILineage_QNAME, LILineageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "gmlProfileSchema")
    public JAXBElement<String> createGmlProfileSchema(String value) {
        return new JAXBElement<String>(_GmlProfileSchema_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesTemporalDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "temporalDatum")
    public JAXBElement<TemporalDatumPropertyType> createUsesTemporalDatum(TemporalDatumPropertyType value) {
        return new JAXBElement<TemporalDatumPropertyType>(_UsesTemporalDatum_QNAME, TemporalDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "pointMembers")
    public JAXBElement<PointArrayPropertyType> createPointMembers(PointArrayPropertyType value) {
        return new JAXBElement<PointArrayPropertyType>(_PointMembers_QNAME, PointArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "includesSingleCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "componentReferenceSystem")
    public JAXBElement<SingleCRSPropertyType> createIncludesSingleCRS(SingleCRSPropertyType value) {
        return new JAXBElement<SingleCRSPropertyType>(_IncludesSingleCRS_QNAME, SingleCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xlink", name = "locator")
    public JAXBElement<LocatorType> createLocator(LocatorType value) {
        return new JAXBElement<LocatorType>(_Locator_QNAME, LocatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NamedValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/om/2.0", name = "NamedValue")
    public JAXBElement<NamedValueType> createNamedValue(NamedValueType value) {
        return new JAXBElement<NamedValueType>(_NamedValue_QNAME, NamedValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "OrientableCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<OrientableCurveType> createOrientableCurve(OrientableCurveType value) {
        return new JAXBElement<OrientableCurveType>(_OrientableCurve_QNAME, OrientableCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EllipsoidPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ellipsoid")
    public JAXBElement<EllipsoidPropertyType> createEllipsoid(EllipsoidPropertyType value) {
        return new JAXBElement<EllipsoidPropertyType>(_Ellipsoid_QNAME, EllipsoidPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDAggregateInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_AggregateInformation")
    public JAXBElement<MDAggregateInformationType> createMDAggregateInformation(MDAggregateInformationType value) {
        return new JAXBElement<MDAggregateInformationType>(_MDAggregateInformation_QNAME, MDAggregateInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractFeature", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractFeatureType> createAbstractFeature(AbstractFeatureType value) {
        return new JAXBElement<AbstractFeatureType>(_AbstractFeature_QNAME, AbstractFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiCurvePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiCurveProperty")
    public JAXBElement<MultiCurvePropertyType> createMultiCurveProperty(MultiCurvePropertyType value) {
        return new JAXBElement<MultiCurvePropertyType>(_MultiCurveProperty_QNAME, MultiCurvePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractUnitExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractUnitExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractUnitExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "imageDatum")
    public JAXBElement<ImageDatumPropertyType> createImageDatum(ImageDatumPropertyType value) {
        return new JAXBElement<ImageDatumPropertyType>(_ImageDatum_QNAME, ImageDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "history")
    public JAXBElement<HistoryPropertyType> createHistory(HistoryPropertyType value) {
        return new JAXBElement<HistoryPropertyType>(_History_QNAME, HistoryPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "operationParameterGroupRef")
    public JAXBElement<OperationParameterPropertyType> createOperationParameterGroupRef(OperationParameterPropertyType value) {
        return new JAXBElement<OperationParameterPropertyType>(_OperationParameterGroupRef_QNAME, OperationParameterPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "minutes")
    public JAXBElement<Integer> createMinutes(Integer value) {
        return new JAXBElement<Integer>(_Minutes_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryExtentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CategoryExtent", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractValue")
    public JAXBElement<CategoryExtentType> createCategoryExtent(CategoryExtentType value) {
        return new JAXBElement<CategoryExtentType>(_CategoryExtent_QNAME, CategoryExtentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOrRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "dataSource")
    public JAXBElement<StringOrRefType> createDataSource(StringOrRefType value) {
        return new JAXBElement<StringOrRefType>(_DataSource_QNAME, StringOrRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDLegalConstraintsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_LegalConstraints", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "MD_Constraints")
    public JAXBElement<MDLegalConstraintsType> createMDLegalConstraints(MDLegalConstraintsType value) {
        return new JAXBElement<MDLegalConstraintsType>(_MDLegalConstraints_QNAME, MDLegalConstraintsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "AbstractGenericName")
    public JAXBElement<CodeType> createAbstractGenericName(CodeType value) {
        return new JAXBElement<CodeType>(_AbstractGenericName_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "abstractReference")
    public JAXBElement<ReferenceType> createAbstractReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_AbstractReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.lang.Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "booleanValue")
    public JAXBElement<java.lang.Boolean> createBooleanValue(java.lang.Boolean value) {
        return new JAXBElement<java.lang.Boolean>(_BooleanValue_QNAME, java.lang.Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeWithAuthorityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "pixelInCell")
    public JAXBElement<CodeWithAuthorityType> createPixelInCell(CodeWithAuthorityType value) {
        return new JAXBElement<CodeWithAuthorityType>(_PixelInCell_QNAME, CodeWithAuthorityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/om/2.0", name = "result")
    public JAXBElement<Object> createResult(Object value) {
        return new JAXBElement<Object>(_Result_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElevatedSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "ElevatedSurface", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "Surface")
    public JAXBElement<ElevatedSurfaceType> createElevatedSurface(ElevatedSurfaceType value) {
        return new JAXBElement<ElevatedSurfaceType>(_ElevatedSurface_QNAME, ElevatedSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDatumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<AbstractDatumType> createAbstractDatum(AbstractDatumType value) {
        return new JAXBElement<AbstractDatumType>(_AbstractDatum_QNAME, AbstractDatumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EngineeringDatumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "EngineeringDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDatum")
    public JAXBElement<EngineeringDatumType> createEngineeringDatum(EngineeringDatumType value) {
        return new JAXBElement<EngineeringDatumType>(_EngineeringDatum_QNAME, EngineeringDatumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQConceptualConsistencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_ConceptualConsistency", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_LogicalConsistency")
    public JAXBElement<DQConceptualConsistencyType> createDQConceptualConsistency(DQConceptualConsistencyType value) {
        return new JAXBElement<DQConceptualConsistencyType>(_DQConceptualConsistency_QNAME, DQConceptualConsistencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateSystemAxisPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "axis")
    public JAXBElement<CoordinateSystemAxisPropertyType> createAxis(CoordinateSystemAxisPropertyType value) {
        return new JAXBElement<CoordinateSystemAxisPropertyType>(_Axis_QNAME, CoordinateSystemAxisPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "primeMeridianRef")
    public JAXBElement<PrimeMeridianPropertyType> createPrimeMeridianRef(PrimeMeridianPropertyType value) {
        return new JAXBElement<PrimeMeridianPropertyType>(_PrimeMeridianRef_QNAME, PrimeMeridianPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoPrimitiveArrayAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "topoPrimitiveMembers")
    public JAXBElement<TopoPrimitiveArrayAssociationType> createTopoPrimitiveMembers(TopoPrimitiveArrayAssociationType value) {
        return new JAXBElement<TopoPrimitiveArrayAssociationType>(_TopoPrimitiveMembers_QNAME, TopoPrimitiveArrayAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrientableSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "OrientableSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurface")
    public JAXBElement<OrientableSurfaceType> createOrientableSurface(OrientableSurfaceType value) {
        return new JAXBElement<OrientableSurfaceType>(_OrientableSurface_QNAME, OrientableSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SphericalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesSphericalCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "sphericalCS")
    public JAXBElement<SphericalCSPropertyType> createUsesSphericalCS(SphericalCSPropertyType value) {
        return new JAXBElement<SphericalCSPropertyType>(_UsesSphericalCS_QNAME, SphericalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "surfaceMember")
    public JAXBElement<SurfacePropertyType1> createSurfaceMember(SurfacePropertyType1 value) {
        return new JAXBElement<SurfacePropertyType1>(_SurfaceMember_QNAME, SurfacePropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiPoint", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricAggregate")
    public JAXBElement<MultiPointType> createMultiPoint(MultiPointType value) {
        return new JAXBElement<MultiPointType>(_MultiPoint_QNAME, MultiPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Transformation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeneralTransformation")
    public JAXBElement<TransformationType> createTransformation(TransformationType value) {
        return new JAXBElement<TransformationType>(_Transformation_QNAME, TransformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Measure")
    public JAXBElement<MeasureType> createMeasure1(MeasureType value) {
        return new JAXBElement<MeasureType>(_Measure1_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "group")
    public JAXBElement<OperationParameterGroupPropertyType> createGroup(OperationParameterGroupPropertyType value) {
        return new JAXBElement<OperationParameterGroupPropertyType>(_Group_QNAME, OperationParameterGroupPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractMetaDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractMetaData", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AbstractMetaDataType> createAbstractMetaData(AbstractMetaDataType value) {
        return new JAXBElement<AbstractMetaDataType>(_AbstractMetaData_QNAME, AbstractMetaDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CubicSplineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CubicSpline", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<CubicSplineType> createCubicSpline(CubicSplineType value) {
        return new JAXBElement<CubicSplineType>(_CubicSpline_QNAME, CubicSplineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiCurveDomain", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "domainSet")
    public JAXBElement<DomainSetType> createMultiCurveDomain(DomainSetType value) {
        return new JAXBElement<DomainSetType>(_MultiCurveDomain_QNAME, DomainSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMSAngleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "dmsAngleValue")
    public JAXBElement<DMSAngleType> createDmsAngleValue(DMSAngleType value) {
        return new JAXBElement<DMSAngleType>(_DmsAngleValue_QNAME, DMSAngleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PTLocaleContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "PT_LocaleContainer")
    public JAXBElement<PTLocaleContainerType> createPTLocaleContainer(PTLocaleContainerType value) {
        return new JAXBElement<PTLocaleContainerType>(_PTLocaleContainer_QNAME, PTLocaleContainerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolarCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "polarCSRef")
    public JAXBElement<PolarCSPropertyType> createPolarCSRef(PolarCSPropertyType value) {
        return new JAXBElement<PolarCSPropertyType>(_PolarCSRef_QNAME, PolarCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDSAggregateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractDS_Aggregate")
    public JAXBElement<AbstractDSAggregateType> createAbstractDSAggregate(AbstractDSAggregateType value) {
        return new JAXBElement<AbstractDSAggregateType>(_AbstractDSAggregate_QNAME, AbstractDSAggregateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quantity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Quantity", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractScalarValue")
    public JAXBElement<Quantity> createQuantity(Quantity value) {
        return new JAXBElement<Quantity>(_Quantity_QNAME, Quantity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Bag", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<BagType> createBag(BagType value) {
        return new JAXBElement<BagType>(_Bag_QNAME, BagType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDScopeDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ScopeDescription")
    public JAXBElement<MDScopeDescriptionType> createMDScopeDescription(MDScopeDescriptionType value) {
        return new JAXBElement<MDScopeDescriptionType>(_MDScopeDescription_QNAME, MDScopeDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "timePosition")
    public JAXBElement<TimePositionType> createTimePosition(TimePositionType value) {
        return new JAXBElement<TimePositionType>(_TimePosition_QNAME, TimePositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DMSAngleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "dmsAngle")
    public JAXBElement<DMSAngleType> createDmsAngle(DMSAngleType value) {
        return new JAXBElement<DMSAngleType>(_DmsAngle_QNAME, DMSAngleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "pointProperty")
    public JAXBElement<PointPropertyType1> createPointProperty(PointPropertyType1 value) {
        return new JAXBElement<PointPropertyType1>(_PointProperty_QNAME, PointPropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiGeometryPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiGeometryProperty")
    public JAXBElement<MultiGeometryPropertyType> createMultiGeometryProperty(MultiGeometryPropertyType value) {
        return new JAXBElement<MultiGeometryPropertyType>(_MultiGeometryProperty_QNAME, MultiGeometryPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiSolidDomain", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "domainSet")
    public JAXBElement<DomainSetType> createMultiSolidDomain(DomainSetType value) {
        return new JAXBElement<DomainSetType>(_MultiSolidDomain_QNAME, DomainSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "userDefinedCSRef")
    public JAXBElement<UserDefinedCSPropertyType> createUserDefinedCSRef(UserDefinedCSPropertyType value) {
        return new JAXBElement<UserDefinedCSPropertyType>(_UserDefinedCSRef_QNAME, UserDefinedCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDGeometricObjectsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_GeometricObjects")
    public JAXBElement<MDGeometricObjectsType> createMDGeometricObjects(MDGeometricObjectsType value) {
        return new JAXBElement<MDGeometricObjectsType>(_MDGeometricObjects_QNAME, MDGeometricObjectsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ImagingConditionCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDImagingConditionCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDImagingConditionCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractAirspaceGeometryComponentExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractAirspaceGeometryComponentExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractAirspaceGeometryComponentExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_PresentationFormCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createCIPresentationFormCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_CIPresentationFormCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalisedCharacterStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "LocalisedCharacterString", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<LocalisedCharacterStringType> createLocalisedCharacterString(LocalisedCharacterStringType value) {
        return new JAXBElement<LocalisedCharacterStringType>(_LocalisedCharacterString_QNAME, LocalisedCharacterStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "Curve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Curve")
    public JAXBElement<CurveType> createCurve(CurveType value) {
        return new JAXBElement<CurveType>(_Curve_QNAME, CurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "FeatureCollection", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<FeatureCollectionType> createFeatureCollection(FeatureCollectionType value) {
        return new JAXBElement<FeatureCollectionType>(_FeatureCollection_QNAME, FeatureCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "valueList")
    public JAXBElement<MeasureListType> createValueList(MeasureListType value) {
        return new JAXBElement<MeasureListType>(_ValueList_QNAME, MeasureListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "cartesianCS")
    public JAXBElement<CartesianCSPropertyType> createcartesianCS1(CartesianCSPropertyType value) {
        return new JAXBElement<CartesianCSPropertyType>(_cartesianCS1_QNAME, CartesianCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "featureMember")
    public JAXBElement<FeaturePropertyType> createFeatureMember(FeaturePropertyType value) {
        return new JAXBElement<FeaturePropertyType>(_FeatureMember_QNAME, FeaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PTFreeTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "PT_FreeText")
    public JAXBElement<PTFreeTextType> createPTFreeText(PTFreeTextType value) {
        return new JAXBElement<PTFreeTextType>(_PTFreeText_QNAME, PTFreeTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeneralParameterValue", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AbstractGeneralParameterValueType> createAbstractGeneralParameterValue(AbstractGeneralParameterValueType value) {
        return new JAXBElement<AbstractGeneralParameterValueType>(_AbstractGeneralParameterValue_QNAME, AbstractGeneralParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gts", name = "TM_PeriodDuration")
    public JAXBElement<Duration> createTMPeriodDuration(Duration value) {
        return new JAXBElement<Duration>(_TMPeriodDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "LanguageCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createLanguageCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_LanguageCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractMDSpatialRepresentationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractMD_SpatialRepresentation")
    public JAXBElement<AbstractMDSpatialRepresentationType> createAbstractMDSpatialRepresentation(AbstractMDSpatialRepresentationType value) {
        return new JAXBElement<AbstractMDSpatialRepresentationType>(_AbstractMDSpatialRepresentation_QNAME, AbstractMDSpatialRepresentationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationRoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "abstractStrictAssociationRole")
    public JAXBElement<AssociationRoleType> createAbstractStrictAssociationRole(AssociationRoleType value) {
        return new JAXBElement<AssociationRoleType>(_AbstractStrictAssociationRole_QNAME, AssociationRoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDResolutionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Resolution")
    public JAXBElement<MDResolutionType> createMDResolution(MDResolutionType value) {
        return new JAXBElement<MDResolutionType>(_MDResolution_QNAME, MDResolutionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractAIXMFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractAIXMFeature", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<AbstractAIXMFeatureType> createAbstractAIXMFeature(AbstractAIXMFeatureType value) {
        return new JAXBElement<AbstractAIXMFeatureType>(_AbstractAIXMFeature_QNAME, AbstractAIXMFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Category }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Category", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractScalarValue")
    public JAXBElement<Category> createCategory(Category value) {
        return new JAXBElement<Category>(_Category_QNAME, Category.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "value")
    public JAXBElement<MeasureType> createValue(MeasureType value) {
        return new JAXBElement<MeasureType>(_Value_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistoryPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "track", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "history")
    public JAXBElement<HistoryPropertyType> createTrack(HistoryPropertyType value) {
        return new JAXBElement<HistoryPropertyType>(_Track_QNAME, HistoryPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitleEltType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xlink", name = "title")
    public JAXBElement<TitleEltType> createTitle(TitleEltType value) {
        return new JAXBElement<TitleEltType>(_Title_QNAME, TitleEltType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ClassificationCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDClassificationCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDClassificationCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiCurveCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDiscreteCoverage")
    public JAXBElement<DiscreteCoverageType> createMultiCurveCoverage(DiscreteCoverageType value) {
        return new JAXBElement<DiscreteCoverageType>(_MultiCurveCoverage_QNAME, DiscreteCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffineCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AffineCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<AffineCSType> createAffineCS(AffineCSType value) {
        return new JAXBElement<AffineCSType>(_AffineCS_QNAME, AffineCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "includesValue", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "parameterValue")
    public JAXBElement<AbstractGeneralParameterValuePropertyType> createIncludesValue(AbstractGeneralParameterValuePropertyType value) {
        return new JAXBElement<AbstractGeneralParameterValuePropertyType>(_IncludesValue_QNAME, AbstractGeneralParameterValuePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CompositeCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<CompositeCurveType> createCompositeCurve(CompositeCurveType value) {
        return new JAXBElement<CompositeCurveType>(_CompositeCurve_QNAME, CompositeCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoComplexPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "topoComplexProperty")
    public JAXBElement<TopoComplexPropertyType> createTopoComplexProperty(TopoComplexPropertyType value) {
        return new JAXBElement<TopoComplexPropertyType>(_TopoComplexProperty_QNAME, TopoComplexPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoSurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "topoSurfaceProperty")
    public JAXBElement<TopoSurfacePropertyType> createTopoSurfaceProperty(TopoSurfacePropertyType value) {
        return new JAXBElement<TopoSurfacePropertyType>(_TopoSurfaceProperty_QNAME, TopoSurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeWithAuthorityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "rangeMeaning")
    public JAXBElement<CodeWithAuthorityType> createRangeMeaning(CodeWithAuthorityType value) {
        return new JAXBElement<CodeWithAuthorityType>(_RangeMeaning_QNAME, CodeWithAuthorityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "parameter")
    public JAXBElement<AbstractGeneralOperationParameterPropertyType> createParameter(AbstractGeneralOperationParameterPropertyType value) {
        return new JAXBElement<AbstractGeneralOperationParameterPropertyType>(_Parameter_QNAME, AbstractGeneralOperationParameterPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSSensorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_Sensor", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "DS_Series")
    public JAXBElement<DSSensorType> createDSSensor(DSSensorType value) {
        return new JAXBElement<DSSensorType>(_DSSensor_QNAME, DSSensorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurvePropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "curveProperty")
    public JAXBElement<CurvePropertyType1> createCurveProperty(CurvePropertyType1 value) {
        return new JAXBElement<CurvePropertyType1>(_CurveProperty_QNAME, CurvePropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObliqueCartesianCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesObliqueCartesianCS")
    public JAXBElement<ObliqueCartesianCSPropertyType> createUsesObliqueCartesianCS(ObliqueCartesianCSPropertyType value) {
        return new JAXBElement<ObliqueCartesianCSPropertyType>(_UsesObliqueCartesianCS_QNAME, ObliqueCartesianCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "modifiedCoordinate")
    public JAXBElement<BigInteger> createModifiedCoordinate(BigInteger value) {
        return new JAXBElement<BigInteger>(_ModifiedCoordinate_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METARType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "METAR", substitutionHeadNamespace = "http://schemas.wmo.int/iwxxm/2.1", substitutionHeadName = "MeteorologicalAerodromeObservationReport")
    public JAXBElement<METARType> createMETAR(METARType value) {
        return new JAXBElement<METARType>(_METAR_QNAME, METARType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "componentReferenceSystem")
    public JAXBElement<SingleCRSPropertyType> createComponentReferenceSystem(SingleCRSPropertyType value) {
        return new JAXBElement<SingleCRSPropertyType>(_ComponentReferenceSystem_QNAME, SingleCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeometryArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "geometryMembers")
    public JAXBElement<GeometryArrayPropertyType> createGeometryMembers(GeometryArrayPropertyType value) {
        return new JAXBElement<GeometryArrayPropertyType>(_GeometryMembers_QNAME, GeometryArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "abstractGeneralOperationParameterRef")
    public JAXBElement<AbstractGeneralOperationParameterPropertyType> createAbstractGeneralOperationParameterRef(AbstractGeneralOperationParameterPropertyType value) {
        return new JAXBElement<AbstractGeneralOperationParameterPropertyType>(_AbstractGeneralOperationParameterRef_QNAME, AbstractGeneralOperationParameterPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_OnLineFunctionCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createCIOnLineFunctionCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_CIOnLineFunctionCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQGriddedDataPositionalAccuracyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_GriddedDataPositionalAccuracy", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_PositionalAccuracy")
    public JAXBElement<DQGriddedDataPositionalAccuracyType> createDQGriddedDataPositionalAccuracy(DQGriddedDataPositionalAccuracyType value) {
        return new JAXBElement<DQGriddedDataPositionalAccuracyType>(_DQGriddedDataPositionalAccuracy_QNAME, DQGriddedDataPositionalAccuracyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeometricComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "GeometricComplex", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometry")
    public JAXBElement<GeometricComplexType> createGeometricComplex(GeometricComplexType value) {
        return new JAXBElement<GeometricComplexType>(_GeometricComplex_QNAME, GeometricComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ParameterValue", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeneralParameterValue")
    public JAXBElement<ParameterValueType> createParameterValue1(ParameterValueType value) {
        return new JAXBElement<ParameterValueType>(_ParameterValue1_QNAME, ParameterValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDQElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractDQ_Element")
    public JAXBElement<AbstractDQElementType> createAbstractDQElement(AbstractDQElementType value) {
        return new JAXBElement<AbstractDQElementType>(_AbstractDQElement_QNAME, AbstractDQElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeometryPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "geometryMember")
    public JAXBElement<GeometryPropertyType> createGeometryMember(GeometryPropertyType value) {
        return new JAXBElement<GeometryPropertyType>(_GeometryMember_QNAME, GeometryPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "centerOf")
    public JAXBElement<PointPropertyType1> createCenterOf(PointPropertyType1 value) {
        return new JAXBElement<PointPropertyType1>(_CenterOf_QNAME, PointPropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeInstantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeInstant", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeGeometricPrimitive")
    public JAXBElement<TimeInstantType> createTimeInstant(TimeInstantType value) {
        return new JAXBElement<TimeInstantType>(_TimeInstant_QNAME, TimeInstantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "cartesianCSRef")
    public JAXBElement<CartesianCSPropertyType> createCartesianCSRef(CartesianCSPropertyType value) {
        return new JAXBElement<CartesianCSPropertyType>(_CartesianCSRef_QNAME, CartesianCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "minimumOccurs")
    public JAXBElement<BigInteger> createMinimumOccurs(BigInteger value) {
        return new JAXBElement<BigInteger>(_MinimumOccurs_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTimeTopologyPrimitiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractTimeTopologyPrimitive", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimePrimitive")
    public JAXBElement<AbstractTimeTopologyPrimitiveType> createAbstractTimeTopologyPrimitive(AbstractTimeTopologyPrimitiveType value) {
        return new JAXBElement<AbstractTimeTopologyPrimitiveType>(_AbstractTimeTopologyPrimitive_QNAME, AbstractTimeTopologyPrimitiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiSolidCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDiscreteCoverage")
    public JAXBElement<DiscreteCoverageType> createMultiSolidCoverage(DiscreteCoverageType value) {
        return new JAXBElement<DiscreteCoverageType>(_MultiSolidCoverage_QNAME, DiscreteCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractRunwayExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractRunwayExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractRunwayExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGMLType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGML", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AbstractGMLType> createAbstractGML(AbstractGMLType value) {
        return new JAXBElement<AbstractGMLType>(_AbstractGML_QNAME, AbstractGMLType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQAbsoluteExternalPositionalAccuracyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_AbsoluteExternalPositionalAccuracy", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_PositionalAccuracy")
    public JAXBElement<DQAbsoluteExternalPositionalAccuracyType> createDQAbsoluteExternalPositionalAccuracy(DQAbsoluteExternalPositionalAccuracyType value) {
        return new JAXBElement<DQAbsoluteExternalPositionalAccuracyType>(_DQAbsoluteExternalPositionalAccuracy_QNAME, DQAbsoluteExternalPositionalAccuracyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDPixelOrientationCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_PixelOrientationCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<MDPixelOrientationCodeType> createMDPixelOrientationCode(MDPixelOrientationCodeType value) {
        return new JAXBElement<MDPixelOrientationCodeType>(_MDPixelOrientationCode_QNAME, MDPixelOrientationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeHorizontalVisibilityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AerodromeHorizontalVisibility", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AerodromeHorizontalVisibilityType> createAerodromeHorizontalVisibility(AerodromeHorizontalVisibilityType value) {
        return new JAXBElement<AerodromeHorizontalVisibilityType>(_AerodromeHorizontalVisibility_QNAME, AerodromeHorizontalVisibilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ArcString", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<ArcStringType> createArcString(ArcStringType value) {
        return new JAXBElement<ArcStringType>(_ArcString_QNAME, ArcStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoVolumePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "topoVolumeProperty")
    public JAXBElement<TopoVolumePropertyType> createTopoVolumeProperty(TopoVolumePropertyType value) {
        return new JAXBElement<TopoVolumePropertyType>(_TopoVolumeProperty_QNAME, TopoVolumePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_CellGeometryCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDCellGeometryCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDCellGeometryCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometricPrimitiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeometricPrimitive", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometry")
    public JAXBElement<AbstractGeometricPrimitiveType> createAbstractGeometricPrimitive(AbstractGeometricPrimitiveType value) {
        return new JAXBElement<AbstractGeometricPrimitiveType>(_AbstractGeometricPrimitive_QNAME, AbstractGeometricPrimitiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "catalogSymbol")
    public JAXBElement<CodeType> createCatalogSymbol(CodeType value) {
        return new JAXBElement<CodeType>(_CatalogSymbol_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TopoPoint")
    public JAXBElement<TopoPointType> createTopoPoint(TopoPointType value) {
        return new JAXBElement<TopoPointType>(_TopoPoint_QNAME, TopoPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivedCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "derivedCRSRef")
    public JAXBElement<DerivedCRSPropertyType> createDerivedCRSRef(DerivedCRSPropertyType value) {
        return new JAXBElement<DerivedCRSPropertyType>(_DerivedCRSRef_QNAME, DerivedCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "gridDomain", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "domainSet")
    public JAXBElement<DomainSetType> createGridDomain(DomainSetType value) {
        return new JAXBElement<DomainSetType>(_GridDomain_QNAME, DomainSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Real")
    public JAXBElement<Double> createReal(Double value) {
        return new JAXBElement<Double>(_Real_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "affineCS")
    public JAXBElement<AffineCSPropertyType> createaffineCS1(AffineCSPropertyType value) {
        return new JAXBElement<AffineCSPropertyType>(_affineCS1_QNAME, AffineCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "featureProperty")
    public JAXBElement<FeaturePropertyType> createFeatureProperty(FeaturePropertyType value) {
        return new JAXBElement<FeaturePropertyType>(_FeatureProperty_QNAME, FeaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TopoCurve")
    public JAXBElement<TopoCurveType> createTopoCurve(TopoCurveType value) {
        return new JAXBElement<TopoCurveType>(_TopoCurve_QNAME, TopoCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RectifiedGridType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "RectifiedGrid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Grid")
    public JAXBElement<RectifiedGridType> createRectifiedGrid(RectifiedGridType value) {
        return new JAXBElement<RectifiedGridType>(_RectifiedGrid_QNAME, RectifiedGridType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoverageFunctionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "coverageFunction", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<CoverageFunctionType> createCoverageFunction(CoverageFunctionType value) {
        return new JAXBElement<CoverageFunctionType>(_CoverageFunction_QNAME, CoverageFunctionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "timeCS")
    public JAXBElement<TimeCSPropertyType> createtimeCS1(TimeCSPropertyType value) {
        return new JAXBElement<TimeCSPropertyType>(_timeCS1_QNAME, TimeCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SphereType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Sphere", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGriddedSurface")
    public JAXBElement<SphereType> createSphere(SphereType value) {
        return new JAXBElement<SphereType>(_Sphere_QNAME, SphereType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolarCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "polarCS")
    public JAXBElement<PolarCSPropertyType> createpolarCS1(PolarCSPropertyType value) {
        return new JAXBElement<PolarCSPropertyType>(_polarCS1_QNAME, PolarCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "PolyhedralSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Surface")
    public JAXBElement<SurfaceType1> createPolyhedralSurface(SurfaceType1 value) {
        return new JAXBElement<SurfaceType1>(_PolyhedralSurface_QNAME, SurfaceType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesValue", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "parameterValue")
    public JAXBElement<AbstractGeneralParameterValuePropertyType> createUsesValue(AbstractGeneralParameterValuePropertyType value) {
        return new JAXBElement<AbstractGeneralParameterValuePropertyType>(_UsesValue_QNAME, AbstractGeneralParameterValuePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Scale", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "Measure")
    public JAXBElement<ScaleType> createScale(ScaleType value) {
        return new JAXBElement<ScaleType>(_Scale_QNAME, ScaleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "surfaceProperty")
    public JAXBElement<SurfacePropertyType1> createSurfaceProperty(SurfacePropertyType1 value) {
        return new JAXBElement<SurfacePropertyType1>(_SurfaceProperty_QNAME, SurfacePropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "userDefinedCS")
    public JAXBElement<UserDefinedCSPropertyType> createuserDefinedCS1(UserDefinedCSPropertyType value) {
        return new JAXBElement<UserDefinedCSPropertyType>(_userDefinedCS1_QNAME, UserDefinedCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "Country", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createCountry(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_Country_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "definedByConversion", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "conversion")
    public JAXBElement<GeneralConversionPropertyType> createDefinedByConversion(GeneralConversionPropertyType value) {
        return new JAXBElement<GeneralConversionPropertyType>(_DefinedByConversion_QNAME, GeneralConversionPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOrRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "LocationString")
    public JAXBElement<StringOrRefType> createLocationString(StringOrRefType value) {
        return new JAXBElement<StringOrRefType>(_LocationString_QNAME, StringOrRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "LocationKeyWord")
    public JAXBElement<CodeType> createLocationKeyWord(CodeType value) {
        return new JAXBElement<CodeType>(_LocationKeyWord_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearRingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "LinearRing", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractRing")
    public JAXBElement<LinearRingType> createLinearRing(LinearRingType value) {
        return new JAXBElement<LinearRingType>(_LinearRing_QNAME, LinearRingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractCoordinateOperation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<AbstractCoordinateOperationType> createAbstractCoordinateOperation(AbstractCoordinateOperationType value) {
        return new JAXBElement<AbstractCoordinateOperationType>(_AbstractCoordinateOperation_QNAME, AbstractCoordinateOperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesPrimeMeridian", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "primeMeridian")
    public JAXBElement<PrimeMeridianPropertyType> createUsesPrimeMeridian(PrimeMeridianPropertyType value) {
        return new JAXBElement<PrimeMeridianPropertyType>(_UsesPrimeMeridian_QNAME, PrimeMeridianPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeSurfaceWindForecastType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AerodromeSurfaceWindForecast", substitutionHeadNamespace = "http://schemas.wmo.int/iwxxm/2.1", substitutionHeadName = "AerodromeSurfaceWindTrendForecast")
    public JAXBElement<AerodromeSurfaceWindForecastType> createAerodromeSurfaceWindForecast(AerodromeSurfaceWindForecastType value) {
        return new JAXBElement<AerodromeSurfaceWindForecastType>(_AerodromeSurfaceWindForecast_QNAME, AerodromeSurfaceWindForecastType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "pointMember")
    public JAXBElement<PointPropertyType1> createPointMember(PointPropertyType1 value) {
        return new JAXBElement<PointPropertyType1>(_PointMember_QNAME, PointPropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TinType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Tin", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "TriangulatedSurface")
    public JAXBElement<TinType> createTin(TinType value) {
        return new JAXBElement<TinType>(_Tin_QNAME, TinType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporalDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "temporalDatumRef")
    public JAXBElement<TemporalDatumPropertyType> createTemporalDatumRef(TemporalDatumPropertyType value) {
        return new JAXBElement<TemporalDatumPropertyType>(_TemporalDatumRef_QNAME, TemporalDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeocentricCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "geocentricCRSRef")
    public JAXBElement<GeocentricCRSPropertyType> createGeocentricCRSRef(GeocentricCRSPropertyType value) {
        return new JAXBElement<GeocentricCRSPropertyType>(_GeocentricCRSRef_QNAME, GeocentricCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectedObservationAtDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "DirectedObservationAtDistance", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "DirectedObservation")
    public JAXBElement<DirectedObservationAtDistanceType> createDirectedObservationAtDistance(DirectedObservationAtDistanceType value) {
        return new JAXBElement<DirectedObservationAtDistanceType>(_DirectedObservationAtDistance_QNAME, DirectedObservationAtDistanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralParameterValuePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "parameterValue")
    public JAXBElement<AbstractGeneralParameterValuePropertyType> createParameterValue(AbstractGeneralParameterValuePropertyType value) {
        return new JAXBElement<AbstractGeneralParameterValuePropertyType>(_ParameterValue_QNAME, AbstractGeneralParameterValuePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "correctionNumber")
    public JAXBElement<Long> createCorrectionNumber(Long value) {
        return new JAXBElement<Long>(_CorrectionNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Surface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSurface")
    public JAXBElement<SurfaceType1> createSurface1(SurfaceType1 value) {
        return new JAXBElement<SurfaceType1>(_Surface1_QNAME, SurfaceType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractAirspaceVolumeExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractAirspaceVolumeExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractAirspaceVolumeExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "interior")
    public JAXBElement<AbstractRingPropertyType> createInterior(AbstractRingPropertyType value) {
        return new JAXBElement<AbstractRingPropertyType>(_Interior_QNAME, AbstractRingPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "OperationMethod", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<OperationMethodType> createOperationMethod(OperationMethodType value) {
        return new JAXBElement<OperationMethodType>(_OperationMethod_QNAME, OperationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTimeObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractTimeObject", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractTimeObjectType> createAbstractTimeObject(AbstractTimeObjectType value) {
        return new JAXBElement<AbstractTimeObjectType>(_AbstractTimeObject_QNAME, AbstractTimeObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeSeaStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AerodromeSeaState", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AerodromeSeaStateType> createAerodromeSeaState(AerodromeSeaStateType value) {
        return new JAXBElement<AerodromeSeaStateType>(_AerodromeSeaState_QNAME, AerodromeSeaStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportHeliportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AirportHeliport", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractAIXMFeature")
    public JAXBElement<AirportHeliportType> createAirportHeliport(AirportHeliportType value) {
        return new JAXBElement<AirportHeliportType>(_AirportHeliport_QNAME, AirportHeliportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EllipsoidalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ellipsoidalCSRef")
    public JAXBElement<EllipsoidalCSPropertyType> createEllipsoidalCSRef(EllipsoidalCSPropertyType value) {
        return new JAXBElement<EllipsoidalCSPropertyType>(_EllipsoidalCSRef_QNAME, EllipsoidalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "referenceSystemRef")
    public JAXBElement<CRSPropertyType> createReferenceSystemRef(CRSPropertyType value) {
        return new JAXBElement<CRSPropertyType>(_ReferenceSystemRef_QNAME, CRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationParameterGroupPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "valuesOfGroup", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "group")
    public JAXBElement<OperationParameterGroupPropertyType> createValuesOfGroup(OperationParameterGroupPropertyType value) {
        return new JAXBElement<OperationParameterGroupPropertyType>(_ValuesOfGroup_QNAME, OperationParameterGroupPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDBrowseGraphicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_BrowseGraphic")
    public JAXBElement<MDBrowseGraphicType> createMDBrowseGraphic(MDBrowseGraphicType value) {
        return new JAXBElement<MDBrowseGraphicType>(_MDBrowseGraphic_QNAME, MDBrowseGraphicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDQCompletenessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractDQ_Completeness", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_Element")
    public JAXBElement<AbstractDQCompletenessType> createAbstractDQCompleteness(AbstractDQCompletenessType value) {
        return new JAXBElement<AbstractDQCompletenessType>(_AbstractDQCompleteness_QNAME, AbstractDQCompletenessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EngineeringCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "EngineeringCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSingleCRS")
    public JAXBElement<EngineeringCRSType> createEngineeringCRS(EngineeringCRSType value) {
        return new JAXBElement<EngineeringCRSType>(_EngineeringCRS_QNAME, EngineeringCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<AbstractCoverageType> createAbstractCoverage(AbstractCoverageType value) {
        return new JAXBElement<AbstractCoverageType>(_AbstractCoverage_QNAME, AbstractCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObservationContextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/om/2.0", name = "ObservationContext")
    public JAXBElement<ObservationContextType> createObservationContext(ObservationContextType value) {
        return new JAXBElement<ObservationContextType>(_ObservationContext_QNAME, ObservationContextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSolidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractSolid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<AbstractSolidType> createAbstractSolid(AbstractSolidType value) {
        return new JAXBElement<AbstractSolidType>(_AbstractSolid_QNAME, AbstractSolidType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Record")
    public JAXBElement<Object> createRecord(Object value) {
        return new JAXBElement<Object>(_Record_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractAIXMObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractAIXMObject", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractAIXMObjectType> createAbstractAIXMObject(AbstractAIXMObjectType value) {
        return new JAXBElement<AbstractAIXMObjectType>(_AbstractAIXMObject_QNAME, AbstractAIXMObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloudLayerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "CloudLayer", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<CloudLayerType> createCloudLayer(CloudLayerType value) {
        return new JAXBElement<CloudLayerType>(_CloudLayer_QNAME, CloudLayerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "semiMajorAxis")
    public JAXBElement<MeasureType> createSemiMajorAxis(MeasureType value) {
        return new JAXBElement<MeasureType>(_SemiMajorAxis_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractRunwayDirectionExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractRunwayDirectionExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractRunwayDirectionExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "RecordType")
    public JAXBElement<RecordTypeType> createRecordType(RecordTypeType value) {
        return new JAXBElement<RecordTypeType>(_RecordType_QNAME, RecordTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "verticalCSRef")
    public JAXBElement<VerticalCSPropertyType> createVerticalCSRef(VerticalCSPropertyType value) {
        return new JAXBElement<VerticalCSPropertyType>(_VerticalCSRef_QNAME, VerticalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralTransformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeneralTransformation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractOperation")
    public JAXBElement<AbstractGeneralTransformationType> createAbstractGeneralTransformation(AbstractGeneralTransformationType value) {
        return new JAXBElement<AbstractGeneralTransformationType>(_AbstractGeneralTransformation_QNAME, AbstractGeneralTransformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeodeticCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "GeodeticCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSingleCRS")
    public JAXBElement<GeodeticCRSType> createGeodeticCRS(GeodeticCRSType value) {
        return new JAXBElement<GeodeticCRSType>(_GeodeticCRS_QNAME, GeodeticCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSDataSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_DataSet")
    public JAXBElement<DSDataSetType> createDSDataSet(DSDataSetType value) {
        return new JAXBElement<DSDataSetType>(_DSDataSet_QNAME, DSDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoundingShapeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "boundedBy")
    public JAXBElement<BoundingShapeType> createBoundedBy(BoundingShapeType value) {
        return new JAXBElement<BoundingShapeType>(_BoundedBy_QNAME, BoundingShapeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractMDContentInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractMD_ContentInformation")
    public JAXBElement<AbstractMDContentInformationType> createAbstractMDContentInformation(AbstractMDContentInformationType value) {
        return new JAXBElement<AbstractMDContentInformationType>(_AbstractMDContentInformation_QNAME, AbstractMDContentInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Circle", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Arc")
    public JAXBElement<CircleType> createCircle(CircleType value) {
        return new JAXBElement<CircleType>(_Circle_QNAME, CircleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQQuantitativeAttributeAccuracyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_QuantitativeAttributeAccuracy", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_ThematicAccuracy")
    public JAXBElement<DQQuantitativeAttributeAccuracyType> createDQQuantitativeAttributeAccuracy(DQQuantitativeAttributeAccuracyType value) {
        return new JAXBElement<DQQuantitativeAttributeAccuracyType>(_DQQuantitativeAttributeAccuracy_QNAME, DQQuantitativeAttributeAccuracyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiSurfaceDomain", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "domainSet")
    public JAXBElement<DomainSetType> createMultiSurfaceDomain(DomainSetType value) {
        return new JAXBElement<DomainSetType>(_MultiSurfaceDomain_QNAME, DomainSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageDatumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ImageDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDatum")
    public JAXBElement<ImageDatumType> createImageDatum1(ImageDatumType value) {
        return new JAXBElement<ImageDatumType>(_ImageDatum1_QNAME, ImageDatumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoVolumeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TopoVolume")
    public JAXBElement<TopoVolumeType> createTopoVolume(TopoVolumeType value) {
        return new JAXBElement<TopoVolumeType>(_TopoVolume_QNAME, TopoVolumeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiCurvePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiEdgeOf")
    public JAXBElement<MultiCurvePropertyType> createMultiEdgeOf(MultiCurvePropertyType value) {
        return new JAXBElement<MultiCurvePropertyType>(_MultiEdgeOf_QNAME, MultiCurvePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "polygonPatches", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "patches")
    public JAXBElement<SurfacePatchArrayPropertyType> createPolygonPatches(SurfacePatchArrayPropertyType value) {
        return new JAXBElement<SurfacePatchArrayPropertyType>(_PolygonPatches_QNAME, SurfacePatchArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EngineeringCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "engineeringCRSRef")
    public JAXBElement<EngineeringCRSPropertyType> createEngineeringCRSRef(EngineeringCRSPropertyType value) {
        return new JAXBElement<EngineeringCRSPropertyType>(_EngineeringCRSRef_QNAME, EngineeringCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xlink", name = "resource")
    public JAXBElement<ResourceType> createResource(ResourceType value) {
        return new JAXBElement<ResourceType>(_Resource_QNAME, ResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "GridCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDiscreteCoverage")
    public JAXBElement<DiscreteCoverageType> createGridCoverage(DiscreteCoverageType value) {
        return new JAXBElement<DiscreteCoverageType>(_GridCoverage_QNAME, DiscreteCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovingObjectStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MovingObjectStatus", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeSlice")
    public JAXBElement<MovingObjectStatusType> createMovingObjectStatus(MovingObjectStatusType value) {
        return new JAXBElement<MovingObjectStatusType>(_MovingObjectStatus_QNAME, MovingObjectStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObliqueCartesianCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "obliqueCartesianCSRef")
    public JAXBElement<ObliqueCartesianCSPropertyType> createObliqueCartesianCSRef(ObliqueCartesianCSPropertyType value) {
        return new JAXBElement<ObliqueCartesianCSPropertyType>(_ObliqueCartesianCSRef_QNAME, ObliqueCartesianCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQCompletenessCommissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_CompletenessCommission", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_Completeness")
    public JAXBElement<DQCompletenessCommissionType> createDQCompletenessCommission(DQCompletenessCommissionType value) {
        return new JAXBElement<DQCompletenessCommissionType>(_DQCompletenessCommission_QNAME, DQCompletenessCommissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCoordinateOperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractOperation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSingleOperation")
    public JAXBElement<AbstractCoordinateOperationType> createAbstractOperation(AbstractCoordinateOperationType value) {
        return new JAXBElement<AbstractCoordinateOperationType>(_AbstractOperation_QNAME, AbstractCoordinateOperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "operationVersion")
    public JAXBElement<String> createOperationVersion(String value) {
        return new JAXBElement<String>(_OperationVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "axisAbbrev")
    public JAXBElement<CodeType> createAxisAbbrev(CodeType value) {
        return new JAXBElement<CodeType>(_AxisAbbrev_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompoundCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "compoundCRSRef")
    public JAXBElement<CompoundCRSPropertyType> createCompoundCRSRef(CompoundCRSPropertyType value) {
        return new JAXBElement<CompoundCRSPropertyType>(_CompoundCRSRef_QNAME, CompoundCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDMetadataExtensionInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_MetadataExtensionInformation")
    public JAXBElement<MDMetadataExtensionInformationType> createMDMetadataExtensionInformation(MDMetadataExtensionInformationType value) {
        return new JAXBElement<MDMetadataExtensionInformationType>(_MDMetadataExtensionInformation_QNAME, MDMetadataExtensionInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_RestrictionCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDRestrictionCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDRestrictionCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTopologyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractTopology", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractTopologyType> createAbstractTopology(AbstractTopologyType value) {
        return new JAXBElement<AbstractTopologyType>(_AbstractTopology_QNAME, AbstractTopologyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "linearCSRef")
    public JAXBElement<LinearCSPropertyType> createLinearCSRef(LinearCSPropertyType value) {
        return new JAXBElement<LinearCSPropertyType>(_LinearCSRef_QNAME, LinearCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQAccuracyOfATimeMeasurementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_AccuracyOfATimeMeasurement", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_TemporalAccuracy")
    public JAXBElement<DQAccuracyOfATimeMeasurementType> createDQAccuracyOfATimeMeasurement(DQAccuracyOfATimeMeasurementType value) {
        return new JAXBElement<DQAccuracyOfATimeMeasurementType>(_DQAccuracyOfATimeMeasurement_QNAME, DQAccuracyOfATimeMeasurementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "linearCS")
    public JAXBElement<LinearCSPropertyType> createlinearCS1(LinearCSPropertyType value) {
        return new JAXBElement<LinearCSPropertyType>(_linearCS1_QNAME, LinearCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "DateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTimePrimitiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractTimePrimitive", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeObject")
    public JAXBElement<AbstractTimePrimitiveType> createAbstractTimePrimitive(AbstractTimePrimitiveType value) {
        return new JAXBElement<AbstractTimePrimitiveType>(_AbstractTimePrimitive_QNAME, AbstractTimePrimitiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingRuleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CoverageMappingRule", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<MappingRuleType> createCoverageMappingRule(MappingRuleType value) {
        return new JAXBElement<MappingRuleType>(_CoverageMappingRule_QNAME, MappingRuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCoordinateSystemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractCoordinateSystem", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<AbstractCoordinateSystemType> createAbstractCoordinateSystem(AbstractCoordinateSystemType value) {
        return new JAXBElement<AbstractCoordinateSystemType>(_AbstractCoordinateSystem_QNAME, AbstractCoordinateSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClothoidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Clothoid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<ClothoidType> createClothoid(ClothoidType value) {
        return new JAXBElement<ClothoidType>(_Clothoid_QNAME, ClothoidType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTopoPrimitiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractTopoPrimitive", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTopology")
    public JAXBElement<AbstractTopoPrimitiveType> createAbstractTopoPrimitive(AbstractTopoPrimitiveType value) {
        return new JAXBElement<AbstractTopoPrimitiveType>(_AbstractTopoPrimitive_QNAME, AbstractTopoPrimitiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "sourceDimensions")
    public JAXBElement<BigInteger> createSourceDimensions(BigInteger value) {
        return new JAXBElement<BigInteger>(_SourceDimensions_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspaceTimeSliceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AirspaceTimeSlice", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeSlice")
    public JAXBElement<AirspaceTimeSliceType> createAirspaceTimeSlice(AirspaceTimeSliceType value) {
        return new JAXBElement<AirspaceTimeSliceType>(_AirspaceTimeSlice_QNAME, AirspaceTimeSliceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EllipsoidalCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "EllipsoidalCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<EllipsoidalCSType> createEllipsoidalCS(EllipsoidalCSType value) {
        return new JAXBElement<EllipsoidalCSType>(_EllipsoidalCS_QNAME, EllipsoidalCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Distance", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "Length")
    public JAXBElement<LengthType> createDistance(LengthType value) {
        return new JAXBElement<LengthType>(_Distance_QNAME, LengthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeTrendForecastRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "MeteorologicalAerodromeTrendForecastRecord", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<MeteorologicalAerodromeTrendForecastRecordType> createMeteorologicalAerodromeTrendForecastRecord(MeteorologicalAerodromeTrendForecastRecordType value) {
        return new JAXBElement<MeteorologicalAerodromeTrendForecastRecordType>(_MeteorologicalAerodromeTrendForecastRecord_QNAME, MeteorologicalAerodromeTrendForecastRecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "associationName")
    public JAXBElement<String> createAssociationName(String value) {
        return new JAXBElement<String>(_AssociationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricAggregate")
    public JAXBElement<MultiCurveType> createMultiCurve(MultiCurveType value) {
        return new JAXBElement<MultiCurveType>(_MultiCurve_QNAME, MultiCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "verticalCRSRef")
    public JAXBElement<VerticalCRSPropertyType> createVerticalCRSRef(VerticalCRSPropertyType value) {
        return new JAXBElement<VerticalCRSPropertyType>(_VerticalCRSRef_QNAME, VerticalCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BezierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Bezier", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "BSpline")
    public JAXBElement<BezierType> createBezier(BezierType value) {
        return new JAXBElement<BezierType>(_Bezier_QNAME, BezierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDExtendedElementInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ExtendedElementInformation")
    public JAXBElement<MDExtendedElementInformationType> createMDExtendedElementInformation(MDExtendedElementInformationType value) {
        return new JAXBElement<MDExtendedElementInformationType>(_MDExtendedElementInformation_QNAME, MDExtendedElementInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EXTemporalExtentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "EX_TemporalExtent")
    public JAXBElement<EXTemporalExtentType> createEXTemporalExtent(EXTemporalExtentType value) {
        return new JAXBElement<EXTemporalExtentType>(_EXTemporalExtent_QNAME, EXTemporalExtentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSPlatformType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_Platform", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "DS_Series")
    public JAXBElement<DSPlatformType> createDSPlatform(DSPlatformType value) {
        return new JAXBElement<DSPlatformType>(_DSPlatform_QNAME, DSPlatformType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeSurfaceWindTrendForecastType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AerodromeSurfaceWindTrendForecast", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AerodromeSurfaceWindTrendForecastType> createAerodromeSurfaceWindTrendForecast(AerodromeSurfaceWindTrendForecastType value) {
        return new JAXBElement<AerodromeSurfaceWindTrendForecastType>(_AerodromeSurfaceWindTrendForecast_QNAME, AerodromeSurfaceWindTrendForecastType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "Surface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Surface")
    public JAXBElement<SurfaceType> createSurface(SurfaceType value) {
        return new JAXBElement<SurfaceType>(_Surface_QNAME, SurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "reversePropertyName")
    public JAXBElement<String> createReversePropertyName(String value) {
        return new JAXBElement<String>(_ReversePropertyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoPrimitiveMemberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "topoPrimitiveMember")
    public JAXBElement<TopoPrimitiveMemberType> createTopoPrimitiveMember(TopoPrimitiveMemberType value) {
        return new JAXBElement<TopoPrimitiveMemberType>(_TopoPrimitiveMember_QNAME, TopoPrimitiveMemberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserDefinedCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "UserDefinedCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<UserDefinedCSType> createUserDefinedCS(UserDefinedCSType value) {
        return new JAXBElement<UserDefinedCSType>(_UserDefinedCS_QNAME, UserDefinedCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "interpretation")
    public JAXBElement<String> createInterpretation(String value) {
        return new JAXBElement<String>(_Interpretation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivedCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "DerivedCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeneralDerivedCRS")
    public JAXBElement<DerivedCRSType> createDerivedCRS(DerivedCRSType value) {
        return new JAXBElement<DerivedCRSType>(_DerivedCRS_QNAME, DerivedCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "featureMembers")
    public JAXBElement<FeatureArrayPropertyType> createFeatureMembers(FeatureArrayPropertyType value) {
        return new JAXBElement<FeatureArrayPropertyType>(_FeatureMembers_QNAME, FeatureArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_DistributionUnits", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDDistributionUnits(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDDistributionUnits_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesParameter", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "generalOperationParameter")
    public JAXBElement<AbstractGeneralOperationParameterPropertyType> createUsesParameter(AbstractGeneralOperationParameterPropertyType value) {
        return new JAXBElement<AbstractGeneralOperationParameterPropertyType>(_UsesParameter_QNAME, AbstractGeneralOperationParameterPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionToPreferredUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "roughConversionToPreferredUnit")
    public JAXBElement<ConversionToPreferredUnitType> createRoughConversionToPreferredUnit(ConversionToPreferredUnitType value) {
        return new JAXBElement<ConversionToPreferredUnitType>(_RoughConversionToPreferredUnit_QNAME, ConversionToPreferredUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractElevatedSurfaceExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractElevatedSurfaceExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractElevatedSurfaceExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeObservedCloudsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AerodromeObservedClouds", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AerodromeObservedCloudsType> createAerodromeObservedClouds(AerodromeObservedCloudsType value) {
        return new JAXBElement<AerodromeObservedCloudsType>(_AerodromeObservedClouds_QNAME, AerodromeObservedCloudsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Identifier")
    public JAXBElement<MDIdentifierType> createMDIdentifier(MDIdentifierType value) {
        return new JAXBElement<MDIdentifierType>(_MDIdentifier_QNAME, MDIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AngleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "greenwichLongitude")
    public JAXBElement<AngleType> createGreenwichLongitude(AngleType value) {
        return new JAXBElement<AngleType>(_GreenwichLongitude_QNAME, AngleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStringSegmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "LineStringSegment", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<LineStringSegmentType> createLineStringSegment(LineStringSegmentType value) {
        return new JAXBElement<LineStringSegmentType>(_LineStringSegment_QNAME, LineStringSegmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDQThematicAccuracyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractDQ_ThematicAccuracy", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_Element")
    public JAXBElement<AbstractDQThematicAccuracyType> createAbstractDQThematicAccuracy(AbstractDQThematicAccuracyType value) {
        return new JAXBElement<AbstractDQThematicAccuracyType>(_AbstractDQThematicAccuracy_QNAME, AbstractDQThematicAccuracyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiLocation")
    public JAXBElement<MultiPointPropertyType> createMultiLocation(MultiPointPropertyType value) {
        return new JAXBElement<MultiPointPropertyType>(_MultiLocation_QNAME, MultiPointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CylinderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Cylinder", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGriddedSurface")
    public JAXBElement<CylinderType> createCylinder(CylinderType value) {
        return new JAXBElement<CylinderType>(_Cylinder_QNAME, CylinderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoSolidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TopoSolid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTopoPrimitive")
    public JAXBElement<TopoSolidType> createTopoSolid(TopoSolidType value) {
        return new JAXBElement<TopoSolidType>(_TopoSolid_QNAME, TopoSolidType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiCoverage")
    public JAXBElement<MultiSurfacePropertyType> createMultiCoverage(MultiSurfacePropertyType value) {
        return new JAXBElement<MultiSurfacePropertyType>(_MultiCoverage_QNAME, MultiSurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractObjectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "AbstractObject")
    public JAXBElement<AbstractObjectType> createAbstractObject(AbstractObjectType value) {
        return new JAXBElement<AbstractObjectType>(_AbstractObject_QNAME, AbstractObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "singleCRSRef")
    public JAXBElement<SingleCRSPropertyType> createSingleCRSRef(SingleCRSPropertyType value) {
        return new JAXBElement<SingleCRSPropertyType>(_SingleCRSRef_QNAME, SingleCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinearCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "LinearCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<LinearCSType> createLinearCS(LinearCSType value) {
        return new JAXBElement<LinearCSType>(_LinearCS_QNAME, LinearCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "valueOfParameter", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "operationParameter")
    public JAXBElement<OperationParameterPropertyType> createValueOfParameter(OperationParameterPropertyType value) {
        return new JAXBElement<OperationParameterPropertyType>(_ValueOfParameter_QNAME, OperationParameterPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "doubleOrNilReasonTupleList")
    public JAXBElement<List<String>> createDoubleOrNilReasonTupleList(List<String> value) {
        return new JAXBElement<List<String>>(_DoubleOrNilReasonTupleList_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "anchorPoint", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "anchorDefinition")
    public JAXBElement<CodeType> createAnchorPoint(CodeType value) {
        return new JAXBElement<CodeType>(_AnchorPoint_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "origin")
    public JAXBElement<XMLGregorianCalendar> createOrigin(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Origin_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "solidMember")
    public JAXBElement<SolidPropertyType> createSolidMember(SolidPropertyType value) {
        return new JAXBElement<SolidPropertyType>(_SolidMember_QNAME, SolidPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationParameterPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "operationParameter")
    public JAXBElement<OperationParameterPropertyType> createOperationParameter(OperationParameterPropertyType value) {
        return new JAXBElement<OperationParameterPropertyType>(_OperationParameter_QNAME, OperationParameterPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircleByCenterPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CircleByCenterPoint", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "ArcByCenterPoint")
    public JAXBElement<CircleByCenterPointType> createCircleByCenterPoint(CircleByCenterPointType value) {
        return new JAXBElement<CircleByCenterPointType>(_CircleByCenterPoint_QNAME, CircleByCenterPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralConversionPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "conversion")
    public JAXBElement<GeneralConversionPropertyType> createconversion1(GeneralConversionPropertyType value) {
        return new JAXBElement<GeneralConversionPropertyType>(_conversion1_QNAME, GeneralConversionPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDServiceIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ServiceIdentification", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractMD_Identification")
    public JAXBElement<MDServiceIdentificationType> createMDServiceIdentification(MDServiceIdentificationType value) {
        return new JAXBElement<MDServiceIdentificationType>(_MDServiceIdentification_QNAME, MDServiceIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQScopeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_Scope")
    public JAXBElement<DQScopeType> createDQScope(DQScopeType value) {
        return new JAXBElement<DQScopeType>(_DQScope_QNAME, DQScopeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeIntervalLengthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "timeInterval")
    public JAXBElement<TimeIntervalLengthType> createTimeInterval(TimeIntervalLengthType value) {
        return new JAXBElement<TimeIntervalLengthType>(_TimeInterval_QNAME, TimeIntervalLengthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "valueFile")
    public JAXBElement<String> createValueFile(String value) {
        return new JAXBElement<String>(_ValueFile_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "coordinateSystem")
    public JAXBElement<CoordinateSystemPropertyType> createCoordinateSystem(CoordinateSystemPropertyType value) {
        return new JAXBElement<CoordinateSystemPropertyType>(_CoordinateSystem_QNAME, CoordinateSystemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeographicCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "GeographicCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSingleCRS")
    public JAXBElement<GeographicCRSType> createGeographicCRS(GeographicCRSType value) {
        return new JAXBElement<GeographicCRSType>(_GeographicCRS_QNAME, GeographicCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeOrdinalReferenceSystemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeOrdinalReferenceSystem", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "TimeReferenceSystem")
    public JAXBElement<TimeOrdinalReferenceSystemType> createTimeOrdinalReferenceSystem(TimeOrdinalReferenceSystemType value) {
        return new JAXBElement<TimeOrdinalReferenceSystemType>(_TimeOrdinalReferenceSystem_QNAME, TimeOrdinalReferenceSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EXBoundingPolygonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "EX_BoundingPolygon", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractEX_GeographicExtent")
    public JAXBElement<EXBoundingPolygonType> createEXBoundingPolygon(EXBoundingPolygonType value) {
        return new JAXBElement<EXBoundingPolygonType>(_EXBoundingPolygon_QNAME, EXBoundingPolygonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "scope")
    public JAXBElement<String> createScope(String value) {
        return new JAXBElement<String>(_Scope_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectedTopoSolidPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "directedTopoSolid")
    public JAXBElement<DirectedTopoSolidPropertyType> createDirectedTopoSolid(DirectedTopoSolidPropertyType value) {
        return new JAXBElement<DirectedTopoSolidPropertyType>(_DirectedTopoSolid_QNAME, DirectedTopoSolidPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporalCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TemporalCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSingleCRS")
    public JAXBElement<TemporalCRSType> createTemporalCRS(TemporalCRSType value) {
        return new JAXBElement<TemporalCRSType>(_TemporalCRS_QNAME, TemporalCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "anchorDefinition")
    public JAXBElement<CodeType> createAnchorDefinition(CodeType value) {
        return new JAXBElement<CodeType>(_AnchorDefinition_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "solidMembers")
    public JAXBElement<SolidArrayPropertyType> createSolidMembers(SolidArrayPropertyType value) {
        return new JAXBElement<SolidArrayPropertyType>(_SolidMembers_QNAME, SolidArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "curveArrayProperty")
    public JAXBElement<CurveArrayPropertyType> createCurveArrayProperty(CurveArrayPropertyType value) {
        return new JAXBElement<CurveArrayPropertyType>(_CurveArrayProperty_QNAME, CurveArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EXGeographicBoundingBoxType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "EX_GeographicBoundingBox", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractEX_GeographicExtent")
    public JAXBElement<EXGeographicBoundingBoxType> createEXGeographicBoundingBox(EXGeographicBoundingBoxType value) {
        return new JAXBElement<EXGeographicBoundingBoxType>(_EXGeographicBoundingBox_QNAME, EXGeographicBoundingBoxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "resultOf")
    public JAXBElement<ResultType> createResultOf(ResultType value) {
        return new JAXBElement<ResultType>(_ResultOf_QNAME, ResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "imageDatumRef")
    public JAXBElement<ImageDatumPropertyType> createImageDatumRef(ImageDatumPropertyType value) {
        return new JAXBElement<ImageDatumPropertyType>(_ImageDatumRef_QNAME, ImageDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateSystemPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "coordinateSystemRef")
    public JAXBElement<CoordinateSystemPropertyType> createCoordinateSystemRef(CoordinateSystemPropertyType value) {
        return new JAXBElement<CoordinateSystemPropertyType>(_CoordinateSystemRef_QNAME, CoordinateSystemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "BaseUnit", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "UnitDefinition")
    public JAXBElement<BaseUnitType> createBaseUnit(BaseUnitType value) {
        return new JAXBElement<BaseUnitType>(_BaseUnit_QNAME, BaseUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeCoordinateSystemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeCoordinateSystem", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "TimeReferenceSystem")
    public JAXBElement<TimeCoordinateSystemType> createTimeCoordinateSystem(TimeCoordinateSystemType value) {
        return new JAXBElement<TimeCoordinateSystemType>(_TimeCoordinateSystem_QNAME, TimeCoordinateSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscreteCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiSurfaceCoverage", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDiscreteCoverage")
    public JAXBElement<DiscreteCoverageType> createMultiSurfaceCoverage(DiscreteCoverageType value) {
        return new JAXBElement<DiscreteCoverageType>(_MultiSurfaceCoverage_QNAME, DiscreteCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "includesParameter", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "parameter")
    public JAXBElement<AbstractGeneralOperationParameterPropertyType> createIncludesParameter(AbstractGeneralOperationParameterPropertyType value) {
        return new JAXBElement<AbstractGeneralOperationParameterPropertyType>(_IncludesParameter_QNAME, AbstractGeneralOperationParameterPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitOfMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "unitOfMeasure")
    public JAXBElement<UnitOfMeasureType> createUnitOfMeasure(UnitOfMeasureType value) {
        return new JAXBElement<UnitOfMeasureType>(_UnitOfMeasure_QNAME, UnitOfMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "imageCRSRef")
    public JAXBElement<ImageCRSPropertyType> createImageCRSRef(ImageCRSPropertyType value) {
        return new JAXBElement<ImageCRSPropertyType>(_ImageCRSRef_QNAME, ImageCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectedNodePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "directedNode")
    public JAXBElement<DirectedNodePropertyType> createDirectedNode(DirectedNodePropertyType value) {
        return new JAXBElement<DirectedNodePropertyType>(_DirectedNode_QNAME, DirectedNodePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurvePropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "centerLineOf")
    public JAXBElement<CurvePropertyType1> createCenterLineOf(CurvePropertyType1 value) {
        return new JAXBElement<CurvePropertyType1>(_CenterLineOf_QNAME, CurvePropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDConstraintsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Constraints")
    public JAXBElement<MDConstraintsType> createMDConstraints(MDConstraintsType value) {
        return new JAXBElement<MDConstraintsType>(_MDConstraints_QNAME, MDConstraintsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractAirportHeliportExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractAirportHeliportExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractAirportHeliportExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LIProcessStepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "LI_ProcessStep")
    public JAXBElement<LIProcessStepType> createLIProcessStep(LIProcessStepType value) {
        return new JAXBElement<LIProcessStepType>(_LIProcessStep_QNAME, LIProcessStepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOrRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "status")
    public JAXBElement<StringOrRefType> createStatus(StringOrRefType value) {
        return new JAXBElement<StringOrRefType>(_Status_QNAME, StringOrRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_MediumNameCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDMediumNameCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDMediumNameCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePrimitivePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "validTime")
    public JAXBElement<TimePrimitivePropertyType> createValidTime(TimePrimitivePropertyType value) {
        return new JAXBElement<TimePrimitivePropertyType>(_ValidTime_QNAME, TimePrimitivePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeodeticCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "baseGeodeticCRS")
    public JAXBElement<GeodeticCRSPropertyType> createBaseGeodeticCRS(GeodeticCRSPropertyType value) {
        return new JAXBElement<GeodeticCRSPropertyType>(_BaseGeodeticCRS_QNAME, GeodeticCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "Point", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Point")
    public JAXBElement<PointType> createPoint(PointType value) {
        return new JAXBElement<PointType>(_Point_QNAME, PointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractRing", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AbstractRingType> createAbstractRing(AbstractRingType value) {
        return new JAXBElement<AbstractRingType>(_AbstractRing_QNAME, AbstractRingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeClockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeClock", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "TimeReferenceSystem")
    public JAXBElement<TimeClockType> createTimeClock(TimeClockType value) {
        return new JAXBElement<TimeClockType>(_TimeClock_QNAME, TimeClockType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQTemporalConsistencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_TemporalConsistency", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_TemporalAccuracy")
    public JAXBElement<DQTemporalConsistencyType> createDQTemporalConsistency(DQTemporalConsistencyType value) {
        return new JAXBElement<DQTemporalConsistencyType>(_DQTemporalConsistency_QNAME, DQTemporalConsistencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "geodeticDatumRef")
    public JAXBElement<GeodeticDatumPropertyType> createGeodeticDatumRef(GeodeticDatumPropertyType value) {
        return new JAXBElement<GeodeticDatumPropertyType>(_GeodeticDatumRef_QNAME, GeodeticDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainSetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "rectifiedGridDomain", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "domainSet")
    public JAXBElement<DomainSetType> createRectifiedGridDomain(DomainSetType value) {
        return new JAXBElement<DomainSetType>(_RectifiedGridDomain_QNAME, DomainSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompoundCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CompoundCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCRS")
    public JAXBElement<CompoundCRSType> createCompoundCRS(CompoundCRSType value) {
        return new JAXBElement<CompoundCRSType>(_CompoundCRS_QNAME, CompoundCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "surfaceMembers")
    public JAXBElement<SurfaceArrayPropertyType> createSurfaceMembers(SurfaceArrayPropertyType value) {
        return new JAXBElement<SurfaceArrayPropertyType>(_SurfaceMembers_QNAME, SurfaceArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "sourceCRS")
    public JAXBElement<CRSPropertyType> createSourceCRS(CRSPropertyType value) {
        return new JAXBElement<CRSPropertyType>(_SourceCRS_QNAME, CRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CylindricalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "cylindricalCSRef")
    public JAXBElement<CylindricalCSPropertyType> createCylindricalCSRef(CylindricalCSPropertyType value) {
        return new JAXBElement<CylindricalCSPropertyType>(_CylindricalCSRef_QNAME, CylindricalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePatchArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "trianglePatches", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "patches")
    public JAXBElement<SurfacePatchArrayPropertyType> createTrianglePatches(SurfacePatchArrayPropertyType value) {
        return new JAXBElement<SurfacePatchArrayPropertyType>(_TrianglePatches_QNAME, SurfacePatchArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractFeatureCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractFeatureCollection", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<AbstractFeatureCollectionType> createAbstractFeatureCollection(AbstractFeatureCollectionType value) {
        return new JAXBElement<AbstractFeatureCollectionType>(_AbstractFeatureCollection_QNAME, AbstractFeatureCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationMethodPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "operationMethodRef")
    public JAXBElement<OperationMethodPropertyType> createOperationMethodRef(OperationMethodPropertyType value) {
        return new JAXBElement<OperationMethodPropertyType>(_OperationMethodRef_QNAME, OperationMethodPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicFeatureMemberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "dynamicMembers")
    public JAXBElement<DynamicFeatureMemberType> createDynamicMembers(DynamicFeatureMemberType value) {
        return new JAXBElement<DynamicFeatureMemberType>(_DynamicMembers_QNAME, DynamicFeatureMemberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndirectEntryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "indirectEntry")
    public JAXBElement<IndirectEntryType> createIndirectEntry(IndirectEntryType value) {
        return new JAXBElement<IndirectEntryType>(_IndirectEntry_QNAME, IndirectEntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RSIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "RS_Identifier", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "MD_Identifier")
    public JAXBElement<RSIdentifierType> createRSIdentifier(RSIdentifierType value) {
        return new JAXBElement<RSIdentifierType>(_RSIdentifier_QNAME, RSIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Metadata")
    public JAXBElement<MDMetadataType> createMDMetadata(MDMetadataType value) {
        return new JAXBElement<MDMetadataType>(_MDMetadata_QNAME, MDMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "minimumValue")
    public JAXBElement<Double> createMinimumValue(Double value) {
        return new JAXBElement<Double>(_MinimumValue_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "Airspace", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractAIXMFeature")
    public JAXBElement<AirspaceType> createAirspace(AirspaceType value) {
        return new JAXBElement<AirspaceType>(_Airspace_QNAME, AirspaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectedEdgePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "directedEdge")
    public JAXBElement<DirectedEdgePropertyType> createDirectedEdge(DirectedEdgePropertyType value) {
        return new JAXBElement<DirectedEdgePropertyType>(_DirectedEdge_QNAME, DirectedEdgePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRSReferenceSystemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractRS_ReferenceSystem")
    public JAXBElement<AbstractRSReferenceSystemType> createAbstractRSReferenceSystem(AbstractRSReferenceSystemType value) {
        return new JAXBElement<AbstractRSReferenceSystemType>(_AbstractRSReferenceSystem_QNAME, AbstractRSReferenceSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CartesianCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesCartesianCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "cartesianCS")
    public JAXBElement<CartesianCSPropertyType> createUsesCartesianCS(CartesianCSPropertyType value) {
        return new JAXBElement<CartesianCSPropertyType>(_UsesCartesianCS_QNAME, CartesianCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeMeridianType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "PrimeMeridian", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<PrimeMeridianType> createPrimeMeridian1(PrimeMeridianType value) {
        return new JAXBElement<PrimeMeridianType>(_PrimeMeridian1_QNAME, PrimeMeridianType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffineCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesAffineCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "affineCS")
    public JAXBElement<AffineCSPropertyType> createUsesAffineCS(AffineCSPropertyType value) {
        return new JAXBElement<AffineCSPropertyType>(_UsesAffineCS_QNAME, AffineCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTimeGeometricPrimitiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractTimeGeometricPrimitive", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimePrimitive")
    public JAXBElement<AbstractTimeGeometricPrimitiveType> createAbstractTimeGeometricPrimitive(AbstractTimeGeometricPrimitiveType value) {
        return new JAXBElement<AbstractTimeGeometricPrimitiveType>(_AbstractTimeGeometricPrimitive_QNAME, AbstractTimeGeometricPrimitiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDMaintenanceInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_MaintenanceInformation")
    public JAXBElement<MDMaintenanceInformationType> createMDMaintenanceInformation(MDMaintenanceInformationType value) {
        return new JAXBElement<MDMaintenanceInformationType>(_MDMaintenanceInformation_QNAME, MDMaintenanceInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "temporalCSRef")
    public JAXBElement<TemporalCSPropertyType> createTemporalCSRef(TemporalCSPropertyType value) {
        return new JAXBElement<TemporalCSPropertyType>(_TemporalCSRef_QNAME, TemporalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "valueComponents")
    public JAXBElement<ValueArrayPropertyType> createValueComponents(ValueArrayPropertyType value) {
        return new JAXBElement<ValueArrayPropertyType>(_ValueComponents_QNAME, ValueArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDUsageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Usage")
    public JAXBElement<MDUsageType> createMDUsage(MDUsageType value) {
        return new JAXBElement<MDUsageType>(_MDUsage_QNAME, MDUsageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueArrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ValueArray", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "CompositeValue")
    public JAXBElement<ValueArrayType> createValueArray(ValueArrayType value) {
        return new JAXBElement<ValueArrayType>(_ValueArray_QNAME, ValueArrayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "ScopedName", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "AbstractGenericName")
    public JAXBElement<CodeType> createScopedName(CodeType value) {
        return new JAXBElement<CodeType>(_ScopedName_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleCRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "baseCRS")
    public JAXBElement<SingleCRSPropertyType> createBaseCRS(SingleCRSPropertyType value) {
        return new JAXBElement<SingleCRSPropertyType>(_BaseCRS_QNAME, SingleCRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriorityLocationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "priorityLocation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "location")
    public JAXBElement<PriorityLocationPropertyType> createPriorityLocation(PriorityLocationPropertyType value) {
        return new JAXBElement<PriorityLocationPropertyType>(_PriorityLocation_QNAME, PriorityLocationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeodesicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Geodesic", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "GeodesicString")
    public JAXBElement<GeodesicType> createGeodesic(GeodesicType value) {
        return new JAXBElement<GeodesicType>(_Geodesic_QNAME, GeodesicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefinitionProxyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "DefinitionProxy", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<DefinitionProxyType> createDefinitionProxy(DefinitionProxyType value) {
        return new JAXBElement<DefinitionProxyType>(_DefinitionProxy_QNAME, DefinitionProxyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeSolidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CompositeSolid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSolid")
    public JAXBElement<CompositeSolidType> createCompositeSolid(CompositeSolidType value) {
        return new JAXBElement<CompositeSolidType>(_CompositeSolid_QNAME, CompositeSolidType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractObject")
    public JAXBElement<Object> createAbstractObject1(Object value) {
        return new JAXBElement<Object>(_AbstractObject1_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "quantityTypeReference")
    public JAXBElement<ReferenceType> createQuantityTypeReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_QuantityTypeReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "dataSourceReference")
    public JAXBElement<ReferenceType> createDataSourceReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_DataSourceReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_Date")
    public JAXBElement<CIDateType> createCIDate(CIDateType value) {
        return new JAXBElement<CIDateType>(_CIDate_QNAME, CIDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<TimeCSType> createTimeCS(TimeCSType value) {
        return new JAXBElement<TimeCSType>(_TimeCS_QNAME, TimeCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveSegmentArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "segments")
    public JAXBElement<CurveSegmentArrayPropertyType> createSegments(CurveSegmentArrayPropertyType value) {
        return new JAXBElement<CurveSegmentArrayPropertyType>(_Segments_QNAME, CurveSegmentArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesVerticalCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "verticalCS")
    public JAXBElement<VerticalCSPropertyType> createUsesVerticalCS(VerticalCSPropertyType value) {
        return new JAXBElement<VerticalCSPropertyType>(_UsesVerticalCS_QNAME, VerticalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "descriptionReference")
    public JAXBElement<ReferenceType> createDescriptionReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_DescriptionReference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TopoSurface")
    public JAXBElement<TopoSurfaceType> createTopoSurface(TopoSurfaceType value) {
        return new JAXBElement<TopoSurfaceType>(_TopoSurface_QNAME, TopoSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_Contact")
    public JAXBElement<CIContactType> createCIContact(CIContactType value) {
        return new JAXBElement<CIContactType>(_CIContact_QNAME, CIContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoComplexPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "maximalComplex")
    public JAXBElement<TopoComplexPropertyType> createMaximalComplex(TopoComplexPropertyType value) {
        return new JAXBElement<TopoComplexPropertyType>(_MaximalComplex_QNAME, TopoComplexPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolidPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "solidProperty")
    public JAXBElement<SolidPropertyType> createSolidProperty(SolidPropertyType value) {
        return new JAXBElement<SolidPropertyType>(_SolidProperty_QNAME, SolidPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQDataQualityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_DataQuality")
    public JAXBElement<DQDataQualityType> createDQDataQuality(DQDataQualityType value) {
        return new JAXBElement<DQDataQualityType>(_DQDataQuality_QNAME, DQDataQualityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/1999/xlink", name = "arc")
    public JAXBElement<ArcType> createArc(ArcType value) {
        return new JAXBElement<ArcType>(_Arc_QNAME, ArcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AbstractElevatedPointExtension", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractExtension")
    public JAXBElement<AbstractExtensionType> createAbstractElevatedPointExtension(AbstractExtensionType value) {
        return new JAXBElement<AbstractExtensionType>(_AbstractElevatedPointExtension_QNAME, AbstractExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractMDIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractMD_Identification")
    public JAXBElement<AbstractMDIdentificationType> createAbstractMDIdentification(AbstractMDIdentificationType value) {
        return new JAXBElement<AbstractMDIdentificationType>(_AbstractMDIdentification_QNAME, AbstractMDIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CompositeValue", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractValue")
    public JAXBElement<CompositeValueType> createCompositeValue(CompositeValueType value) {
        return new JAXBElement<CompositeValueType>(_CompositeValue_QNAME, CompositeValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElevatedPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "ElevatedPoint", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "Point")
    public JAXBElement<ElevatedPointType> createElevatedPoint(ElevatedPointType value) {
        return new JAXBElement<ElevatedPointType>(_ElevatedPoint_QNAME, ElevatedPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AngleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "angle")
    public JAXBElement<AngleType> createAngle(AngleType value) {
        return new JAXBElement<AngleType>(_Angle_QNAME, AngleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "VerticalCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSingleCRS")
    public JAXBElement<VerticalCRSType> createVerticalCRS(VerticalCRSType value) {
        return new JAXBElement<VerticalCRSType>(_VerticalCRS_QNAME, VerticalCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationRoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "member")
    public JAXBElement<AssociationRoleType> createMember(AssociationRoleType value) {
        return new JAXBElement<AssociationRoleType>(_Member_QNAME, AssociationRoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDDimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Dimension")
    public JAXBElement<MDDimensionType> createMDDimension(MDDimensionType value) {
        return new JAXBElement<MDDimensionType>(_MDDimension_QNAME, MDDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQDomainConsistencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_DomainConsistency", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_LogicalConsistency")
    public JAXBElement<DQDomainConsistencyType> createDQDomainConsistency(DQDomainConsistencyType value) {
        return new JAXBElement<DQDomainConsistencyType>(_DQDomainConsistency_QNAME, DQDomainConsistencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassThroughOperationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "PassThroughOperation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractSingleOperation")
    public JAXBElement<PassThroughOperationType> createPassThroughOperation(PassThroughOperationType value) {
        return new JAXBElement<PassThroughOperationType>(_PassThroughOperation_QNAME, PassThroughOperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "Unit", substitutionHeadNamespace = "http://www.aixm.aero/schema/5.1.1", substitutionHeadName = "AbstractAIXMFeature")
    public JAXBElement<UnitType> createUnit(UnitType value) {
        return new JAXBElement<UnitType>(_Unit_QNAME, UnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Multiplicity")
    public JAXBElement<MultiplicityType> createMultiplicity(MultiplicityType value) {
        return new JAXBElement<MultiplicityType>(_Multiplicity_QNAME, MultiplicityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Conversion", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeneralConversion")
    public JAXBElement<ConversionType> createConversion(ConversionType value) {
        return new JAXBElement<ConversionType>(_Conversion_QNAME, ConversionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateSystemAxisPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesAxis", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "axis")
    public JAXBElement<CoordinateSystemAxisPropertyType> createUsesAxis(CoordinateSystemAxisPropertyType value) {
        return new JAXBElement<CoordinateSystemAxisPropertyType>(_UsesAxis_QNAME, CoordinateSystemAxisPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalDatumType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "VerticalDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractDatum")
    public JAXBElement<VerticalDatumType> createVerticalDatum(VerticalDatumType value) {
        return new JAXBElement<VerticalDatumType>(_VerticalDatum_QNAME, VerticalDatumType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQNonQuantitativeAttributeAccuracyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_NonQuantitativeAttributeAccuracy", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_ThematicAccuracy")
    public JAXBElement<DQNonQuantitativeAttributeAccuracyType> createDQNonQuantitativeAttributeAccuracy(DQNonQuantitativeAttributeAccuracyType value) {
        return new JAXBElement<DQNonQuantitativeAttributeAccuracyType>(_DQNonQuantitativeAttributeAccuracy_QNAME, DQNonQuantitativeAttributeAccuracyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDRepresentativeFractionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_RepresentativeFraction")
    public JAXBElement<MDRepresentativeFractionType> createMDRepresentativeFraction(MDRepresentativeFractionType value) {
        return new JAXBElement<MDRepresentativeFractionType>(_MDRepresentativeFraction_QNAME, MDRepresentativeFractionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeRunwayStateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AerodromeRunwayState", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AerodromeRunwayStateType> createAerodromeRunwayState(AerodromeRunwayStateType value) {
        return new JAXBElement<AerodromeRunwayStateType>(_AerodromeRunwayState_QNAME, AerodromeRunwayStateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporalCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TemporalCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<TemporalCSType> createTemporalCS(TemporalCSType value) {
        return new JAXBElement<TemporalCSType>(_TemporalCS_QNAME, TemporalCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "File", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<FileType> createFile(FileType value) {
        return new JAXBElement<FileType>(_File_QNAME, FileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "MeteorologicalAerodromeObservationRecord", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<MeteorologicalAerodromeObservationRecordType> createMeteorologicalAerodromeObservationRecord(MeteorologicalAerodromeObservationRecordType value) {
        return new JAXBElement<MeteorologicalAerodromeObservationRecordType>(_MeteorologicalAerodromeObservationRecord_QNAME, MeteorologicalAerodromeObservationRecordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiCenterOf")
    public JAXBElement<MultiPointPropertyType> createMultiCenterOf(MultiPointPropertyType value) {
        return new JAXBElement<MultiPointPropertyType>(_MultiCenterOf_QNAME, MultiPointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointArrayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "pointArrayProperty")
    public JAXBElement<PointArrayPropertyType> createPointArrayProperty(PointArrayPropertyType value) {
        return new JAXBElement<PointArrayPropertyType>(_PointArrayProperty_QNAME, PointArrayPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_Address")
    public JAXBElement<CIAddressType> createCIAddress(CIAddressType value) {
        return new JAXBElement<CIAddressType>(_CIAddress_QNAME, CIAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiPosition")
    public JAXBElement<MultiPointPropertyType> createMultiPosition(MultiPointPropertyType value) {
        return new JAXBElement<MultiPointPropertyType>(_MultiPosition_QNAME, MultiPointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSStereoMateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_StereoMate", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "DS_OtherAggregate")
    public JAXBElement<DSStereoMateType> createDSStereoMate(DSStereoMateType value) {
        return new JAXBElement<DSStereoMateType>(_DSStereoMate_QNAME, DSStereoMateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "position")
    public JAXBElement<PointPropertyType1> createPosition(PointPropertyType1 value) {
        return new JAXBElement<PointPropertyType1>(_Position_QNAME, PointPropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractImplicitGeometry", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometry")
    public JAXBElement<AbstractGeometryType> createAbstractImplicitGeometry(AbstractGeometryType value) {
        return new JAXBElement<AbstractGeometryType>(_AbstractImplicitGeometry_QNAME, AbstractGeometryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoPointPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "topoPointProperty")
    public JAXBElement<TopoPointPropertyType> createTopoPointProperty(TopoPointPropertyType value) {
        return new JAXBElement<TopoPointPropertyType>(_TopoPointProperty_QNAME, TopoPointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractValue", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<Object> createAbstractValue(Object value) {
        return new JAXBElement<Object>(_AbstractValue_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSolidType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiSolid", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricAggregate")
    public JAXBElement<MultiSolidType> createMultiSolid(MultiSolidType value) {
        return new JAXBElement<MultiSolidType>(_MultiSolid_QNAME, MultiSolidType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CylindricalCSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "cylindricalCS")
    public JAXBElement<CylindricalCSPropertyType> createcylindricalCS1(CylindricalCSPropertyType value) {
        return new JAXBElement<CylindricalCSPropertyType>(_cylindricalCS1_QNAME, CylindricalCSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CylindricalCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CylindricalCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<CylindricalCSType> createCylindricalCS(CylindricalCSType value) {
        return new JAXBElement<CylindricalCSType>(_CylindricalCS_QNAME, CylindricalCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDCoverageDescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_CoverageDescription", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractMD_ContentInformation")
    public JAXBElement<MDCoverageDescriptionType> createMDCoverageDescription(MDCoverageDescriptionType value) {
        return new JAXBElement<MDCoverageDescriptionType>(_MDCoverageDescription_QNAME, MDCoverageDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectedFacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "directedFace")
    public JAXBElement<DirectedFacePropertyType> createDirectedFace(DirectedFacePropertyType value) {
        return new JAXBElement<DirectedFacePropertyType>(_DirectedFace_QNAME, DirectedFacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDQResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractDQ_Result")
    public JAXBElement<AbstractDQResultType> createAbstractDQResult(AbstractDQResultType value) {
        return new JAXBElement<AbstractDQResultType>(_AbstractDQResult_QNAME, AbstractDQResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectPositionListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "posList")
    public JAXBElement<DirectPositionListType> createPosList(DirectPositionListType value) {
        return new JAXBElement<DirectPositionListType>(_PosList_QNAME, DirectPositionListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicFeatureCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "DynamicFeatureCollection", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "DynamicFeature")
    public JAXBElement<DynamicFeatureCollectionType> createDynamicFeatureCollection(DynamicFeatureCollectionType value) {
        return new JAXBElement<DynamicFeatureCollectionType>(_DynamicFeatureCollection_QNAME, DynamicFeatureCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspaceGeometryComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "AirspaceGeometryComponent")
    public JAXBElement<AirspaceGeometryComponentType> createAirspaceGeometryComponent(AirspaceGeometryComponentType value) {
        return new JAXBElement<AirspaceGeometryComponentType>(_AirspaceGeometryComponent_QNAME, AirspaceGeometryComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractDQPositionalAccuracyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "AbstractDQ_PositionalAccuracy", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_Element")
    public JAXBElement<AbstractDQPositionalAccuracyType> createAbstractDQPositionalAccuracy(AbstractDQPositionalAccuracyType value) {
        return new JAXBElement<AbstractDQPositionalAccuracyType>(_AbstractDQPositionalAccuracy_QNAME, AbstractDQPositionalAccuracyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "subject", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "target")
    public JAXBElement<TargetPropertyType> createSubject(TargetPropertyType value) {
        return new JAXBElement<TargetPropertyType>(_Subject_QNAME, TargetPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSInitiativeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DS_Initiative", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDS_Aggregate")
    public JAXBElement<DSInitiativeType> createDSInitiative(DSInitiativeType value) {
        return new JAXBElement<DSInitiativeType>(_DSInitiative_QNAME, DSInitiativeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthWithNilReasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "LengthWithNilReason")
    public JAXBElement<LengthWithNilReasonType> createLengthWithNilReason(LengthWithNilReasonType value) {
        return new JAXBElement<LengthWithNilReasonType>(_LengthWithNilReason_QNAME, LengthWithNilReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Null")
    public JAXBElement<List<String>> createNull(List<String> value) {
        return new JAXBElement<List<String>>(_Null_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_CoverageContentTypeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDCoverageContentTypeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDCoverageContentTypeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractCRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractSingleCRS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCRS")
    public JAXBElement<AbstractCRSType> createAbstractSingleCRS(AbstractCRSType value) {
        return new JAXBElement<AbstractCRSType>(_AbstractSingleCRS_QNAME, AbstractCRSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQTopologicalConsistencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_TopologicalConsistency", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_LogicalConsistency")
    public JAXBElement<DQTopologicalConsistencyType> createDQTopologicalConsistency(DQTopologicalConsistencyType value) {
        return new JAXBElement<DQTopologicalConsistencyType>(_DQTopologicalConsistency_QNAME, DQTopologicalConsistencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "methodFormula", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "formula")
    public JAXBElement<CodeType> createMethodFormula(CodeType value) {
        return new JAXBElement<CodeType>(_MethodFormula_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ScopeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDScopeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDScopeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalCSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "VerticalCS", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCoordinateSystem")
    public JAXBElement<VerticalCSType> createVerticalCS(VerticalCSType value) {
        return new JAXBElement<VerticalCSType>(_VerticalCS_QNAME, VerticalCSType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CICitationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_Citation")
    public JAXBElement<CICitationType> createCICitation(CICitationType value) {
        return new JAXBElement<CICitationType>(_CICitation_QNAME, CICitationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQFormatConsistencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_FormatConsistency", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_LogicalConsistency")
    public JAXBElement<DQFormatConsistencyType> createDQFormatConsistency(DQFormatConsistencyType value) {
        return new JAXBElement<DQFormatConsistencyType>(_DQFormatConsistency_QNAME, DQFormatConsistencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "members")
    public JAXBElement<ArrayAssociationType> createMembers(ArrayAssociationType value) {
        return new JAXBElement<ArrayAssociationType>(_Members_QNAME, ArrayAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDTopicCategoryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_TopicCategoryCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<MDTopicCategoryCodeType> createMDTopicCategoryCode(MDTopicCategoryCodeType value) {
        return new JAXBElement<MDTopicCategoryCodeType>(_MDTopicCategoryCode_QNAME, MDTopicCategoryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeRunwayVisualRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AerodromeRunwayVisualRange", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractObject")
    public JAXBElement<AerodromeRunwayVisualRangeType> createAerodromeRunwayVisualRange(AerodromeRunwayVisualRangeType value) {
        return new JAXBElement<AerodromeRunwayVisualRangeType>(_AerodromeRunwayVisualRange_QNAME, AerodromeRunwayVisualRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimeMeridianPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "primeMeridian")
    public JAXBElement<PrimeMeridianPropertyType> createPrimeMeridian(PrimeMeridianPropertyType value) {
        return new JAXBElement<PrimeMeridianPropertyType>(_PrimeMeridian_QNAME, PrimeMeridianPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDSecurityConstraintsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_SecurityConstraints", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "MD_Constraints")
    public JAXBElement<MDSecurityConstraintsType> createMDSecurityConstraints(MDSecurityConstraintsType value) {
        return new JAXBElement<MDSecurityConstraintsType>(_MDSecurityConstraints_QNAME, MDSecurityConstraintsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<AbstractSurfaceType> createAbstractSurface(AbstractSurfaceType value) {
        return new JAXBElement<AbstractSurfaceType>(_AbstractSurface_QNAME, AbstractSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractTimeComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractTimeComplex", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTimeObject")
    public JAXBElement<AbstractTimeComplexType> createAbstractTimeComplex(AbstractTimeComplexType value) {
        return new JAXBElement<AbstractTimeComplexType>(_AbstractTimeComplex_QNAME, AbstractTimeComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BSplineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "BSpline", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<BSplineType> createBSpline(BSplineType value) {
        return new JAXBElement<BSplineType>(_BSpline_QNAME, BSplineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeCloudForecastType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "AerodromeCloudForecast", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AerodromeCloudForecastType> createAerodromeCloudForecast(AerodromeCloudForecastType value) {
        return new JAXBElement<AerodromeCloudForecastType>(_AerodromeCloudForecast_QNAME, AerodromeCloudForecastType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Point", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<PointType1> createPoint1(PointType1 value) {
        return new JAXBElement<PointType1>(_Point1_QNAME, PointType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeodesicStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "GeodesicString", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<GeodesicStringType> createGeodesicString(GeodesicStringType value) {
        return new JAXBElement<GeodesicStringType>(_GeodesicString_QNAME, GeodesicStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractScalarValueList", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractValue")
    public JAXBElement<Object> createAbstractScalarValueList(Object value) {
        return new JAXBElement<Object>(_AbstractScalarValueList_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationParameterGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "OperationParameterGroup", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeneralOperationParameter")
    public JAXBElement<OperationParameterGroupType> createOperationParameterGroup(OperationParameterGroupType value) {
        return new JAXBElement<OperationParameterGroupType>(_OperationParameterGroup_QNAME, OperationParameterGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeodeticDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "geodeticDatum")
    public JAXBElement<GeodeticDatumPropertyType> creategeodeticDatum1(GeodeticDatumPropertyType value) {
        return new JAXBElement<GeodeticDatumPropertyType>(_geodeticDatum1_QNAME, GeodeticDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "engineeringDatumRef")
    public JAXBElement<EngineeringDatumPropertyType> createEngineeringDatumRef(EngineeringDatumPropertyType value) {
        return new JAXBElement<EngineeringDatumPropertyType>(_EngineeringDatumRef_QNAME, EngineeringDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "usesEngineeringDatum", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "engineeringDatum")
    public JAXBElement<EngineeringDatumPropertyType> createUsesEngineeringDatum(EngineeringDatumPropertyType value) {
        return new JAXBElement<EngineeringDatumPropertyType>(_UsesEngineeringDatum_QNAME, EngineeringDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EdgeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Edge", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractTopoPrimitive")
    public JAXBElement<EdgeType> createEdge(EdgeType value) {
        return new JAXBElement<EdgeType>(_Edge_QNAME, EdgeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "maximumValue")
    public JAXBElement<Double> createMaximumValue(Double value) {
        return new JAXBElement<Double>(_MaximumValue_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "sequenceNumber")
    public JAXBElement<Long> createSequenceNumber(Long value) {
        return new JAXBElement<Long>(_SequenceNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeneralOperationParameterPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "generalOperationParameter", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "parameter")
    public JAXBElement<AbstractGeneralOperationParameterPropertyType> createGeneralOperationParameter(AbstractGeneralOperationParameterPropertyType value) {
        return new JAXBElement<AbstractGeneralOperationParameterPropertyType>(_GeneralOperationParameter_QNAME, AbstractGeneralOperationParameterPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "remarks")
    public JAXBElement<String> createRemarks(String value) {
        return new JAXBElement<String>(_Remarks_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiGeometryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MultiGeometry", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricAggregate")
    public JAXBElement<MultiGeometryType> createMultiGeometry(MultiGeometryType value) {
        return new JAXBElement<MultiGeometryType>(_MultiGeometry_QNAME, MultiGeometryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SingleOperationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "singleOperationRef")
    public JAXBElement<SingleOperationPropertyType> createSingleOperationRef(SingleOperationPropertyType value) {
        return new JAXBElement<SingleOperationPropertyType>(_SingleOperationRef_QNAME, SingleOperationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRSPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "targetCRS")
    public JAXBElement<CRSPropertyType> createTargetCRS(CRSPropertyType value) {
        return new JAXBElement<CRSPropertyType>(_TargetCRS_QNAME, CRSPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gco", name = "Length", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "Measure")
    public JAXBElement<LengthType> createLength(LengthType value) {
        return new JAXBElement<LengthType>(_Length_QNAME, LengthType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Array", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<ArrayType> createArray(ArrayType value) {
        return new JAXBElement<ArrayType>(_Array_QNAME, ArrayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeOrNilReasonListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CategoryList", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractScalarValueList")
    public JAXBElement<CodeOrNilReasonListType> createCategoryList(CodeOrNilReasonListType value) {
        return new JAXBElement<CodeOrNilReasonListType>(_CategoryList_QNAME, CodeOrNilReasonListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DynamicFeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "DynamicFeature", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<DynamicFeatureType> createDynamicFeature(DynamicFeatureType value) {
        return new JAXBElement<DynamicFeatureType>(_DynamicFeature_QNAME, DynamicFeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringOrRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "MappingRule")
    public JAXBElement<StringOrRefType> createMappingRule(StringOrRefType value) {
        return new JAXBElement<StringOrRefType>(_MappingRule_QNAME, StringOrRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "targetDimensions")
    public JAXBElement<BigInteger> createTargetDimensions(BigInteger value) {
        return new JAXBElement<BigInteger>(_TargetDimensions_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDGeoreferenceableType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Georeferenceable", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "MD_GridSpatialRepresentation")
    public JAXBElement<MDGeoreferenceableType> createMDGeoreferenceable(MDGeoreferenceableType value) {
        return new JAXBElement<MDGeoreferenceableType>(_MDGeoreferenceable_QNAME, MDGeoreferenceableType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectedObservationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "DirectedObservation", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Observation")
    public JAXBElement<DirectedObservationType> createDirectedObservation(DirectedObservationType value) {
        return new JAXBElement<DirectedObservationType>(_DirectedObservation_QNAME, DirectedObservationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateSystemAxisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "CoordinateSystemAxis", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<CoordinateSystemAxisType> createCoordinateSystemAxis(CoordinateSystemAxisType value) {
        return new JAXBElement<CoordinateSystemAxisType>(_CoordinateSystemAxis_QNAME, CoordinateSystemAxisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIOnlineResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "CI_OnlineResource")
    public JAXBElement<CIOnlineResourceType> createCIOnlineResource(CIOnlineResourceType value) {
        return new JAXBElement<CIOnlineResourceType>(_CIOnlineResource_QNAME, CIOnlineResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DQQuantitativeResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "DQ_QuantitativeResult", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "AbstractDQ_Result")
    public JAXBElement<DQQuantitativeResultType> createDQQuantitativeResult(DQQuantitativeResultType value) {
        return new JAXBElement<DQQuantitativeResultType>(_DQQuantitativeResult_QNAME, DQQuantitativeResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSolidPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiSolidProperty")
    public JAXBElement<MultiSolidPropertyType> createMultiSolidProperty(MultiSolidPropertyType value) {
        return new JAXBElement<MultiSolidPropertyType>(_MultiSolidProperty_QNAME, MultiSolidPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_ProgressCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDProgressCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDProgressCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConventionalUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ConventionalUnit", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "UnitDefinition")
    public JAXBElement<ConventionalUnitType> createConventionalUnit(ConventionalUnitType value) {
        return new JAXBElement<ConventionalUnitType>(_ConventionalUnit_QNAME, ConventionalUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureOrNilReasonListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "QuantityList", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractScalarValueList")
    public JAXBElement<MeasureOrNilReasonListType> createQuantityList(MeasureOrNilReasonListType value) {
        return new JAXBElement<MeasureOrNilReasonListType>(_QuantityList_QNAME, MeasureOrNilReasonListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MDGeorectifiedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_Georectified", substitutionHeadNamespace = "http://www.isotc211.org/2005/gmd", substitutionHeadName = "MD_GridSpatialRepresentation")
    public JAXBElement<MDGeorectifiedType> createMDGeorectified(MDGeorectifiedType value) {
        return new JAXBElement<MDGeorectifiedType>(_MDGeorectified_QNAME, MDGeorectifiedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "defaultCodeSpace")
    public JAXBElement<String> createDefaultCodeSpace(String value) {
        return new JAXBElement<String>(_DefaultCodeSpace_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractRingPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "exterior")
    public JAXBElement<AbstractRingPropertyType> createExterior(AbstractRingPropertyType value) {
        return new JAXBElement<AbstractRingPropertyType>(_Exterior_QNAME, AbstractRingPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "Dictionary", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Definition")
    public JAXBElement<DictionaryType> createDictionary(DictionaryType value) {
        return new JAXBElement<DictionaryType>(_Dictionary_QNAME, DictionaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPECIType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "SPECI", substitutionHeadNamespace = "http://schemas.wmo.int/iwxxm/2.1", substitutionHeadName = "MeteorologicalAerodromeObservationReport")
    public JAXBElement<SPECIType> createSPECI(SPECIType value) {
        return new JAXBElement<SPECIType>(_SPECI_QNAME, SPECIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGeometryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGeometry", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGML")
    public JAXBElement<AbstractGeometryType> createAbstractGeometry(AbstractGeometryType value) {
        return new JAXBElement<AbstractGeometryType>(_AbstractGeometry_QNAME, AbstractGeometryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeListValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "MD_DatatypeCode", substitutionHeadNamespace = "http://www.isotc211.org/2005/gco", substitutionHeadName = "CharacterString")
    public JAXBElement<CodeListValueType> createMDDatatypeCode(CodeListValueType value) {
        return new JAXBElement<CodeListValueType>(_MDDatatypeCode_QNAME, CodeListValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "direction")
    public JAXBElement<DirectionPropertyType> createDirection(DirectionPropertyType value) {
        return new JAXBElement<DirectionPropertyType>(_Direction_QNAME, DirectionPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractGriddedSurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractGriddedSurface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractParametricCurveSurface")
    public JAXBElement<AbstractGriddedSurfaceType> createAbstractGriddedSurface(AbstractGriddedSurfaceType value) {
        return new JAXBElement<AbstractGriddedSurfaceType>(_AbstractGriddedSurface_QNAME, AbstractGriddedSurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiSurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "multiExtentOf")
    public JAXBElement<MultiSurfacePropertyType> createMultiExtentOf(MultiSurfacePropertyType value) {
        return new JAXBElement<MultiSurfacePropertyType>(_MultiExtentOf_QNAME, MultiSurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EngineeringDatumPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "engineeringDatum")
    public JAXBElement<EngineeringDatumPropertyType> createengineeringDatum1(EngineeringDatumPropertyType value) {
        return new JAXBElement<EngineeringDatumPropertyType>(_engineeringDatum1_QNAME, EngineeringDatumPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "AbstractScalarValue", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractValue")
    public JAXBElement<Object> createAbstractScalarValue(Object value) {
        return new JAXBElement<Object>(_AbstractScalarValue_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeOrdinalEraType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "TimeOrdinalEra")
    public JAXBElement<TimeOrdinalEraType> createTimeOrdinalEra(TimeOrdinalEraType value) {
        return new JAXBElement<TimeOrdinalEraType>(_TimeOrdinalEra_QNAME, TimeOrdinalEraType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EXVerticalExtentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isotc211.org/2005/gmd", name = "EX_VerticalExtent")
    public JAXBElement<EXVerticalExtentType> createEXVerticalExtent(EXVerticalExtentType value) {
        return new JAXBElement<EXVerticalExtentType>(_EXVerticalExtent_QNAME, EXVerticalExtentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePropertyType1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "extentOf")
    public JAXBElement<SurfacePropertyType1> createExtentOf(SurfacePropertyType1 value) {
        return new JAXBElement<SurfacePropertyType1>(_ExtentOf_QNAME, SurfacePropertyType1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociationRoleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "abstractAssociationRole")
    public JAXBElement<AssociationRoleType> createAbstractAssociationRole(AssociationRoleType value) {
        return new JAXBElement<AssociationRoleType>(_AbstractAssociationRole_QNAME, AssociationRoleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityExtentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "QuantityExtent", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractValue")
    public JAXBElement<QuantityExtentType> createQuantityExtent(QuantityExtentType value) {
        return new JAXBElement<QuantityExtentType>(_QuantityExtent_QNAME, QuantityExtentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcByCenterPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "ArcByCenterPoint", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<ArcByCenterPointType> createArcByCenterPoint(ArcByCenterPointType value) {
        return new JAXBElement<ArcByCenterPointType>(_ArcByCenterPoint_QNAME, ArcByCenterPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "elevation", scope = ElevatedSurfaceType.class)
    public JAXBElement<ValDistanceVerticalType> createElevatedSurfaceTypeElevation(ValDistanceVerticalType value) {
        return new JAXBElement<ValDistanceVerticalType>(_ElevatedSurfaceTypeElevation_QNAME, ValDistanceVerticalType.class, ElevatedSurfaceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "verticalAccuracy", scope = ElevatedSurfaceType.class)
    public JAXBElement<ValDistanceType> createElevatedSurfaceTypeVerticalAccuracy(ValDistanceType value) {
        return new JAXBElement<ValDistanceType>(_ElevatedSurfaceTypeVerticalAccuracy_QNAME, ValDistanceType.class, ElevatedSurfaceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeOrganisationDesignatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "designator", scope = UnitTimeSliceType.class)
    public JAXBElement<CodeOrganisationDesignatorType> createUnitTimeSliceTypeDesignator(CodeOrganisationDesignatorType value) {
        return new JAXBElement<CodeOrganisationDesignatorType>(_UnitTimeSliceTypeDesignator_QNAME, CodeOrganisationDesignatorType.class, UnitTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitTimeSliceType.Extension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "extension", scope = UnitTimeSliceType.class)
    public JAXBElement<UnitTimeSliceType.Extension> createUnitTimeSliceTypeExtension(UnitTimeSliceType.Extension value) {
        return new JAXBElement<UnitTimeSliceType.Extension>(_UnitTimeSliceTypeExtension_QNAME, UnitTimeSliceType.Extension.class, UnitTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "name", scope = UnitTimeSliceType.class)
    public JAXBElement<TextNameType> createUnitTimeSliceTypeName(TextNameType value) {
        return new JAXBElement<TextNameType>(_UnitTimeSliceTypeName_QNAME, TextNameType.class, UnitTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "type", scope = UnitTimeSliceType.class)
    public JAXBElement<CodeUnitType> createUnitTimeSliceTypeType(CodeUnitType value) {
        return new JAXBElement<CodeUnitType>(_UnitTimeSliceTypeType_QNAME, CodeUnitType.class, UnitTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistanceWithNilReasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "depthOfDeposit", scope = AerodromeRunwayStateType.class)
    public JAXBElement<DistanceWithNilReasonType> createAerodromeRunwayStateTypeDepthOfDeposit(DistanceWithNilReasonType value) {
        return new JAXBElement<DistanceWithNilReasonType>(_AerodromeRunwayStateTypeDepthOfDeposit_QNAME, DistanceWithNilReasonType.class, AerodromeRunwayStateType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SigConvectiveCloudTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "cloudType", scope = CloudLayerType.class)
    public JAXBElement<SigConvectiveCloudTypeType> createCloudLayerTypeCloudType(SigConvectiveCloudTypeType value) {
        return new JAXBElement<SigConvectiveCloudTypeType>(_CloudLayerTypeCloudType_QNAME, SigConvectiveCloudTypeType.class, CloudLayerType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeAirportHeliportDesignatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "designator", scope = AirportHeliportTimeSliceType.class)
    public JAXBElement<CodeAirportHeliportDesignatorType> createAirportHeliportTimeSliceTypeDesignator(CodeAirportHeliportDesignatorType value) {
        return new JAXBElement<CodeAirportHeliportDesignatorType>(_UnitTimeSliceTypeDesignator_QNAME, CodeAirportHeliportDesignatorType.class, AirportHeliportTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportHeliportTimeSliceType.Extension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "extension", scope = AirportHeliportTimeSliceType.class)
    public JAXBElement<AirportHeliportTimeSliceType.Extension> createAirportHeliportTimeSliceTypeExtension(AirportHeliportTimeSliceType.Extension value) {
        return new JAXBElement<AirportHeliportTimeSliceType.Extension>(_UnitTimeSliceTypeExtension_QNAME, AirportHeliportTimeSliceType.Extension.class, AirportHeliportTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeIATAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "designatorIATA", scope = AirportHeliportTimeSliceType.class)
    public JAXBElement<CodeIATAType> createAirportHeliportTimeSliceTypeDesignatorIATA(CodeIATAType value) {
        return new JAXBElement<CodeIATAType>(_AirportHeliportTimeSliceTypeDesignatorIATA_QNAME, CodeIATAType.class, AirportHeliportTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "name", scope = AirportHeliportTimeSliceType.class)
    public JAXBElement<TextNameType> createAirportHeliportTimeSliceTypeName(TextNameType value) {
        return new JAXBElement<TextNameType>(_UnitTimeSliceTypeName_QNAME, TextNameType.class, AirportHeliportTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeICAOType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "locationIndicatorICAO", scope = AirportHeliportTimeSliceType.class)
    public JAXBElement<CodeICAOType> createAirportHeliportTimeSliceTypeLocationIndicatorICAO(CodeICAOType value) {
        return new JAXBElement<CodeICAOType>(_AirportHeliportTimeSliceTypeLocationIndicatorICAO_QNAME, CodeICAOType.class, AirportHeliportTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "fieldElevation", scope = AirportHeliportTimeSliceType.class)
    public JAXBElement<ValDistanceVerticalType> createAirportHeliportTimeSliceTypeFieldElevation(ValDistanceVerticalType value) {
        return new JAXBElement<ValDistanceVerticalType>(_AirportHeliportTimeSliceTypeFieldElevation_QNAME, ValDistanceVerticalType.class, AirportHeliportTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElevatedPointPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "ARP", scope = AirportHeliportTimeSliceType.class)
    public JAXBElement<ElevatedPointPropertyType> createAirportHeliportTimeSliceTypeARP(ElevatedPointPropertyType value) {
        return new JAXBElement<ElevatedPointPropertyType>(_AirportHeliportTimeSliceTypeARP_QNAME, ElevatedPointPropertyType.class, AirportHeliportTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthWithNilReasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "verticalVisibility", scope = AerodromeObservedCloudsType.class)
    public JAXBElement<LengthWithNilReasonType> createAerodromeObservedCloudsTypeVerticalVisibility(LengthWithNilReasonType value) {
        return new JAXBElement<LengthWithNilReasonType>(_AerodromeObservedCloudsTypeVerticalVisibility_QNAME, LengthWithNilReasonType.class, AerodromeObservedCloudsType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "designator", scope = RunwayTimeSliceType.class)
    public JAXBElement<TextDesignatorType> createRunwayTimeSliceTypeDesignator(TextDesignatorType value) {
        return new JAXBElement<TextDesignatorType>(_UnitTimeSliceTypeDesignator_QNAME, TextDesignatorType.class, RunwayTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportHeliportPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "associatedAirportHeliport", scope = RunwayTimeSliceType.class)
    public JAXBElement<AirportHeliportPropertyType> createRunwayTimeSliceTypeAssociatedAirportHeliport(AirportHeliportPropertyType value) {
        return new JAXBElement<AirportHeliportPropertyType>(_RunwayTimeSliceTypeAssociatedAirportHeliport_QNAME, AirportHeliportPropertyType.class, RunwayTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeRunwayType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "type", scope = RunwayTimeSliceType.class)
    public JAXBElement<CodeRunwayType> createRunwayTimeSliceTypeType(CodeRunwayType value) {
        return new JAXBElement<CodeRunwayType>(_UnitTimeSliceTypeType_QNAME, CodeRunwayType.class, RunwayTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "horizontalAccuracy", scope = SurfaceType.class)
    public JAXBElement<ValDistanceType> createSurfaceTypeHorizontalAccuracy(ValDistanceType value) {
        return new JAXBElement<ValDistanceType>(_SurfaceTypeHorizontalAccuracy_QNAME, ValDistanceType.class, SurfaceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "elevation", scope = ElevatedPointType.class)
    public JAXBElement<ValDistanceVerticalType> createElevatedPointTypeElevation(ValDistanceVerticalType value) {
        return new JAXBElement<ValDistanceVerticalType>(_ElevatedSurfaceTypeElevation_QNAME, ValDistanceVerticalType.class, ElevatedPointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "verticalAccuracy", scope = ElevatedPointType.class)
    public JAXBElement<ValDistanceType> createElevatedPointTypeVerticalAccuracy(ValDistanceType value) {
        return new JAXBElement<ValDistanceType>(_ElevatedSurfaceTypeVerticalAccuracy_QNAME, ValDistanceType.class, ElevatedPointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspaceVolumePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "theAirspaceVolume", scope = AirspaceGeometryComponentType.class)
    public JAXBElement<AirspaceVolumePropertyType> createAirspaceGeometryComponentTypeTheAirspaceVolume(AirspaceVolumePropertyType value) {
        return new JAXBElement<AirspaceVolumePropertyType>(_AirspaceGeometryComponentTypeTheAirspaceVolume_QNAME, AirspaceVolumePropertyType.class, AirspaceGeometryComponentType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeteorologicalAerodromeObservationRecordType.Cloud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "cloud", scope = MeteorologicalAerodromeObservationRecordType.class)
    public JAXBElement<MeteorologicalAerodromeObservationRecordType.Cloud> createMeteorologicalAerodromeObservationRecordTypeCloud(MeteorologicalAerodromeObservationRecordType.Cloud value) {
        return new JAXBElement<MeteorologicalAerodromeObservationRecordType.Cloud>(_MeteorologicalAerodromeObservationRecordTypeCloud_QNAME, MeteorologicalAerodromeObservationRecordType.Cloud.class, MeteorologicalAerodromeObservationRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "lowerLimitReference", scope = AirspaceVolumeType.class)
    public JAXBElement<CodeVerticalReferenceType> createAirspaceVolumeTypeLowerLimitReference(CodeVerticalReferenceType value) {
        return new JAXBElement<CodeVerticalReferenceType>(_AirspaceVolumeTypeLowerLimitReference_QNAME, CodeVerticalReferenceType.class, AirspaceVolumeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "horizontalProjection", scope = AirspaceVolumeType.class)
    public JAXBElement<SurfacePropertyType> createAirspaceVolumeTypeHorizontalProjection(SurfacePropertyType value) {
        return new JAXBElement<SurfacePropertyType>(_AirspaceVolumeTypeHorizontalProjection_QNAME, SurfacePropertyType.class, AirspaceVolumeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "upperLimit", scope = AirspaceVolumeType.class)
    public JAXBElement<ValDistanceVerticalType> createAirspaceVolumeTypeUpperLimit(ValDistanceVerticalType value) {
        return new JAXBElement<ValDistanceVerticalType>(_AirspaceVolumeTypeUpperLimit_QNAME, ValDistanceVerticalType.class, AirspaceVolumeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "lowerLimit", scope = AirspaceVolumeType.class)
    public JAXBElement<ValDistanceVerticalType> createAirspaceVolumeTypeLowerLimit(ValDistanceVerticalType value) {
        return new JAXBElement<ValDistanceVerticalType>(_AirspaceVolumeTypeLowerLimit_QNAME, ValDistanceVerticalType.class, AirspaceVolumeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "upperLimitReference", scope = AirspaceVolumeType.class)
    public JAXBElement<CodeVerticalReferenceType> createAirspaceVolumeTypeUpperLimitReference(CodeVerticalReferenceType value) {
        return new JAXBElement<CodeVerticalReferenceType>(_AirspaceVolumeTypeUpperLimitReference_QNAME, CodeVerticalReferenceType.class, AirspaceVolumeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "horizontalAccuracy", scope = PointType.class)
    public JAXBElement<ValDistanceType> createPointTypeHorizontalAccuracy(ValDistanceType value) {
        return new JAXBElement<ValDistanceType>(_SurfaceTypeHorizontalAccuracy_QNAME, ValDistanceType.class, PointType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeCloudForecastPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.wmo.int/iwxxm/2.1", name = "cloud", scope = MeteorologicalAerodromeTrendForecastRecordType.class)
    public JAXBElement<AerodromeCloudForecastPropertyType> createMeteorologicalAerodromeTrendForecastRecordTypeCloud(AerodromeCloudForecastPropertyType value) {
        return new JAXBElement<AerodromeCloudForecastPropertyType>(_MeteorologicalAerodromeObservationRecordTypeCloud_QNAME, AerodromeCloudForecastPropertyType.class, MeteorologicalAerodromeTrendForecastRecordType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GridLimitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "limits", scope = GridType.class)
    public JAXBElement<GridLimitsType> createGridTypeLimits(GridLimitsType value) {
        return new JAXBElement<GridLimitsType>(_GridTypeLimits_QNAME, GridLimitsType.class, GridType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "axisName", scope = GridType.class)
    public JAXBElement<String> createGridTypeAxisName(String value) {
        return new JAXBElement<String>(_GridTypeAxisName_QNAME, String.class, GridType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.opengis.net/gml/3.2", name = "axisLabels", scope = GridType.class)
    public JAXBElement<List<String>> createGridTypeAxisLabels(List<String> value) {
        return new JAXBElement<List<String>>(_GridTypeAxisLabels_QNAME, ((Class) List.class), GridType.class, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "elevation", scope = ElevatedCurveType.class)
    public JAXBElement<ValDistanceVerticalType> createElevatedCurveTypeElevation(ValDistanceVerticalType value) {
        return new JAXBElement<ValDistanceVerticalType>(_ElevatedSurfaceTypeElevation_QNAME, ValDistanceVerticalType.class, ElevatedCurveType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "verticalAccuracy", scope = ElevatedCurveType.class)
    public JAXBElement<ValDistanceType> createElevatedCurveTypeVerticalAccuracy(ValDistanceType value) {
        return new JAXBElement<ValDistanceType>(_ElevatedSurfaceTypeVerticalAccuracy_QNAME, ValDistanceType.class, ElevatedCurveType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "horizontalAccuracy", scope = CurveType.class)
    public JAXBElement<ValDistanceType> createCurveTypeHorizontalAccuracy(ValDistanceType value) {
        return new JAXBElement<ValDistanceType>(_SurfaceTypeHorizontalAccuracy_QNAME, ValDistanceType.class, CurveType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeAirspaceDesignatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "designator", scope = AirspaceTimeSliceType.class)
    public JAXBElement<CodeAirspaceDesignatorType> createAirspaceTimeSliceTypeDesignator(CodeAirspaceDesignatorType value) {
        return new JAXBElement<CodeAirspaceDesignatorType>(_UnitTimeSliceTypeDesignator_QNAME, CodeAirspaceDesignatorType.class, AirspaceTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspaceTimeSliceType.Extension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "extension", scope = AirspaceTimeSliceType.class)
    public JAXBElement<AirspaceTimeSliceType.Extension> createAirspaceTimeSliceTypeExtension(AirspaceTimeSliceType.Extension value) {
        return new JAXBElement<AirspaceTimeSliceType.Extension>(_UnitTimeSliceTypeExtension_QNAME, AirspaceTimeSliceType.Extension.class, AirspaceTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeYesNoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "designatorICAO", scope = AirspaceTimeSliceType.class)
    public JAXBElement<CodeYesNoType> createAirspaceTimeSliceTypeDesignatorICAO(CodeYesNoType value) {
        return new JAXBElement<CodeYesNoType>(_AirspaceTimeSliceTypeDesignatorICAO_QNAME, CodeYesNoType.class, AirspaceTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "name", scope = AirspaceTimeSliceType.class)
    public JAXBElement<TextNameType> createAirspaceTimeSliceTypeName(TextNameType value) {
        return new JAXBElement<TextNameType>(_UnitTimeSliceTypeName_QNAME, TextNameType.class, AirspaceTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeAirspaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "type", scope = AirspaceTimeSliceType.class)
    public JAXBElement<CodeAirspaceType> createAirspaceTimeSliceTypeType(CodeAirspaceType value) {
        return new JAXBElement<CodeAirspaceType>(_UnitTimeSliceTypeType_QNAME, CodeAirspaceType.class, AirspaceTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspaceGeometryComponentPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "geometryComponent", scope = AirspaceTimeSliceType.class)
    public JAXBElement<AirspaceGeometryComponentPropertyType> createAirspaceTimeSliceTypeGeometryComponent(AirspaceGeometryComponentPropertyType value) {
        return new JAXBElement<AirspaceGeometryComponentPropertyType>(_AirspaceTimeSliceTypeGeometryComponent_QNAME, AirspaceGeometryComponentPropertyType.class, AirspaceTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextDesignatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "designator", scope = RunwayDirectionTimeSliceType.class)
    public JAXBElement<TextDesignatorType> createRunwayDirectionTimeSliceTypeDesignator(TextDesignatorType value) {
        return new JAXBElement<TextDesignatorType>(_UnitTimeSliceTypeDesignator_QNAME, TextDesignatorType.class, RunwayDirectionTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "magneticBearing", scope = RunwayDirectionTimeSliceType.class)
    public JAXBElement<ValBearingType> createRunwayDirectionTimeSliceTypeMagneticBearing(ValBearingType value) {
        return new JAXBElement<ValBearingType>(_RunwayDirectionTimeSliceTypeMagneticBearing_QNAME, ValBearingType.class, RunwayDirectionTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValBearingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "trueBearing", scope = RunwayDirectionTimeSliceType.class)
    public JAXBElement<ValBearingType> createRunwayDirectionTimeSliceTypeTrueBearing(ValBearingType value) {
        return new JAXBElement<ValBearingType>(_RunwayDirectionTimeSliceTypeTrueBearing_QNAME, ValBearingType.class, RunwayDirectionTimeSliceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.aixm.aero/schema/5.1.1", name = "usedRunway", scope = RunwayDirectionTimeSliceType.class)
    public JAXBElement<RunwayPropertyType> createRunwayDirectionTimeSliceTypeUsedRunway(RunwayPropertyType value) {
        return new JAXBElement<RunwayPropertyType>(_RunwayDirectionTimeSliceTypeUsedRunway_QNAME, RunwayPropertyType.class, RunwayDirectionTimeSliceType.class, value);
    }

}
