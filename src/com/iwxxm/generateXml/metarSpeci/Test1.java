package com.iwxxm.generateXml.metarSpeci;

import java.io.File;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.iwxxm.common.AirportHeliportTimeSlicePropertyType;
import com.iwxxm.common.CodeAirportHeliportDesignatorType;
import com.iwxxm.metarSpeci.AerodromeHorizontalVisibilityPropertyType;
import com.iwxxm.metarSpeci.AerodromeHorizontalVisibilityType;
import com.iwxxm.metarSpeci.AerodromeObservedCloudsPropertyType;
import com.iwxxm.metarSpeci.AerodromeObservedCloudsType;
import com.iwxxm.metarSpeci.AerodromePresentWeatherType;
import com.iwxxm.metarSpeci.AerodromeRecentWeatherType;
import com.iwxxm.metarSpeci.AerodromeRunwayStatePropertyType;
import com.iwxxm.metarSpeci.AerodromeRunwayVisualRangePropertyType;
import com.iwxxm.metarSpeci.AerodromeRunwayVisualRangeType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindPropertyType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindType;
import com.iwxxm.metarSpeci.AirportHeliportTimeSliceType;
import com.iwxxm.metarSpeci.AirportHeliportType;
import com.iwxxm.metarSpeci.AngleType;
import com.iwxxm.metarSpeci.CloudLayerPropertyType;
import com.iwxxm.metarSpeci.CloudLayerType;
import com.iwxxm.metarSpeci.CodeICAOType;
import com.iwxxm.metarSpeci.FeaturePropertyType;
import com.iwxxm.metarSpeci.LengthType;
import com.iwxxm.metarSpeci.LengthWithNilReasonType;
import com.iwxxm.metarSpeci.METARPropertyType;
import com.iwxxm.metarSpeci.METARType;
import com.iwxxm.metarSpeci.MeasureType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType.Cloud;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportPropertyType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportType;
import com.iwxxm.metarSpeci.OMObservationPropertyType;
import com.iwxxm.metarSpeci.OMObservationType;
import com.iwxxm.metarSpeci.OMProcessPropertyType;
import com.iwxxm.metarSpeci.ObjectFactory;
import com.iwxxm.metarSpeci.ReferenceType;
import com.iwxxm.metarSpeci.SpeedType;
import com.iwxxm.metarSpeci.TextNameType;
import com.iwxxm.metarSpeci.TimeInstantPropertyType;
import com.iwxxm.metarSpeci.TimeInstantType;
import com.iwxxm.metarSpeci.TimeObjectPropertyType;
import com.iwxxm.metarSpeci.TimePositionType;
import com.iwxxm.parsetac.metarSpeci.Decode_Tac;
import com.iwxxm.parsetac.metarSpeci.Extract1;
public class Test1 {

	private static final Class MeteorologicalAerodromeObservationReportType = null;

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		String content1="METAR YUDO 221630Z 24004MPS 0600 R12/1000U DZ FG SCT010 OVC020 17/16 Q1018 "
				+ "BECMG TL1700 0800 FG BECMG AT1800 9999 NSW";
		Decode_Tac parse_Tac=new Decode_Tac(content1); 
		String observation=parse_Tac.Fetch_observation_part(content1);
        String observation_group[]=parse_Tac.Split_observation_part(observation.split(" "));
        String trendForecast[]=parse_Tac.Fetch_trendForecast_part(content1);
        System.out.println("observation_part分组情况:");
        for (int i = 0; i < observation_group.length; i++) {
        	System.out.println("observation第"+(i)+"组为:"+observation_group[i].trim());
		}
        Extract1 extract1=new Extract1(observation_group);
		Map<String, String> map1=extract1.parse_observation();
		System.out.println(map1);
		
		ObjectFactory metar = new ObjectFactory();
		MeteorologicalAerodromeObservationRecordType MeteorologicalAerodromeObservationRecord=metar.createMeteorologicalAerodromeObservationRecordType();
		com.iwxxm.common.ObjectFactory common=new com.iwxxm.common.ObjectFactory();
		
		
		MeasureType airTemperature=metar.createMeasureType();
		airTemperature.setUom("Cel");
		airTemperature.setValue(Double.parseDouble(map1.get("airTemperature")));
		MeteorologicalAerodromeObservationRecord.setAirTemperature(airTemperature);
		MeasureType dewpointTemperature=metar.createMeasureType();
		dewpointTemperature.setUom("Cel");
		dewpointTemperature.setValue(Double.parseDouble(map1.get("dewpointTemperature")));
		MeteorologicalAerodromeObservationRecord.setDewpointTemperature(dewpointTemperature);
		MeasureType qnh=metar.createMeasureType();
		qnh.setUom("hPa");
		qnh.setValue(Double.parseDouble(map1.get("qnh").substring(1)));
		MeteorologicalAerodromeObservationRecord.setQnh(qnh);
		
		
		
		AerodromeSurfaceWindPropertyType aerodromeSurfaceWindProperty=metar.createAerodromeSurfaceWindPropertyType();
		AngleType angle=metar.createAngleType();
		SpeedType speed=metar.createSpeedType();
		AerodromeSurfaceWindType aerodromeSurfaceWind=metar.createAerodromeSurfaceWindType();
		angle.setValue(240);
		angle.setUom("deg");
		aerodromeSurfaceWind.setMeanWindDirection(angle);
		speed.setValue(4);
		speed.setUom("m/s");
		aerodromeSurfaceWind.setMeanWindSpeed(speed);
		aerodromeSurfaceWind.setVariableWindDirection(Boolean.getBoolean(map1.get("variableWindDirection")));
		aerodromeSurfaceWindProperty.setAerodromeSurfaceWind(aerodromeSurfaceWind);
		MeteorologicalAerodromeObservationRecord.setSurfaceWind(aerodromeSurfaceWindProperty);
		
		
		
		
		AerodromeHorizontalVisibilityPropertyType aerodromeHorizontalVisibilityProperty=metar.createAerodromeHorizontalVisibilityPropertyType();
		AerodromeHorizontalVisibilityType aerodromeHorizontalVisibility=metar.createAerodromeHorizontalVisibilityType();
		LengthType length=metar.createLengthType();
		length.setValue(Double.parseDouble(map1.get("prevailingVisibility")));
		length.setUom("m");
		aerodromeHorizontalVisibility.setPrevailingVisibility(length);
		aerodromeHorizontalVisibilityProperty.setAerodromeHorizontalVisibility(aerodromeHorizontalVisibility);
		MeteorologicalAerodromeObservationRecord.setVisibility(aerodromeHorizontalVisibilityProperty);
		MeteorologicalAerodromeObservationRecord.setCloudAndVisibilityOK(false);
		
		
		
		AerodromeRunwayVisualRangePropertyType aerodromeRunwayVisualRangeProperty=metar.createAerodromeRunwayVisualRangePropertyType();
		AerodromeRunwayVisualRangeType aerodromeRunwayVisualRange=metar.createAerodromeRunwayVisualRangeType();
		LengthType length2=metar.createLengthType();
		length2.setValue(100);
		length2.setUom("m");
		aerodromeRunwayVisualRange.setMeanRVR(length2);
		aerodromeRunwayVisualRangeProperty.setAerodromeRunwayVisualRange(aerodromeRunwayVisualRange);
		MeteorologicalAerodromeObservationRecord.getRvr().add(aerodromeRunwayVisualRangeProperty);
		
		
		
		AerodromePresentWeatherType aerodromePresentWeather=metar.createAerodromePresentWeatherType();
		aerodromePresentWeather.setHref(map1.get("presentWeather"));
		MeteorologicalAerodromeObservationRecord.getPresentWeather().add(aerodromePresentWeather);
		
		
        //设置云Cloud
		MeteorologicalAerodromeObservationRecordType.Cloud cloud = metar.createMeteorologicalAerodromeObservationRecordTypeCloud();		
		AerodromeObservedCloudsType aerodromeObservedClouds=metar.createAerodromeObservedCloudsType();
		AerodromeObservedCloudsType.Layer layer=metar.createAerodromeObservedCloudsTypeLayer();
		AerodromeObservedCloudsPropertyType aerodromeObservedCloudsPropert=metar.createAerodromeObservedCloudsPropertyType();		
		com.iwxxm.metarSpeci.CloudAmountReportedAtAerodromeType cloudAmountReportedAtAerodrome=metar.createCloudAmountReportedAtAerodromeType();
		com.iwxxm.metarSpeci.DistanceWithNilReasonType distanceWithNilReason=metar.createDistanceWithNilReasonType();
		com.iwxxm.metarSpeci.CloudLayerType cloudLayer=metar.createCloudLayerType();
	    cloudAmountReportedAtAerodrome.setHref(map1.get("CloudLayer"));
	    distanceWithNilReason.setValue(1000);
	    distanceWithNilReason.setUom("[ft_i]");
		cloudLayer.setAmount(cloudAmountReportedAtAerodrome);
		cloudLayer.setBase(distanceWithNilReason);
		layer.setCloudLayer(cloudLayer);
		aerodromeObservedClouds.getLayer().add(layer);
		cloud.setAerodromeObservedClouds(aerodromeObservedClouds);
		JAXBElement<Cloud> cElement1=new JAXBElement(new QName("","iwxxm:cloud"), cloud.getClass(), cloud);
		MeteorologicalAerodromeObservationRecord.setCloud(cElement1);
	    
	    
		
		//设置PhenomenonTime
		TimeObjectPropertyType timeObjectProperty1=metar.createTimeObjectPropertyType();
		TimeInstantPropertyType timeInstantProperty1=metar.createTimeInstantPropertyType();
		TimeInstantType timeInstant1=metar.createTimeInstantType();
		TimePositionType timePosition1=metar.createTimePositionType();
		timePosition1.getValue().add(map1.get("time"));
		timeInstant1.setTimePosition(timePosition1);
		timeInstantProperty1.setTimeInstant(timeInstant1);
		JAXBElement<TimeInstantType> cElement2=new JAXBElement(new QName("","gml:TimeInstantType"), timeInstantProperty1.getClass(), timeInstantProperty1);
		timeObjectProperty1.setAbstractTimeObject(cElement2);
		
		
		
        
		//设置ResultTime
		TimeInstantPropertyType timeInstantProperty=metar.createTimeInstantPropertyType();
		TimeInstantType timeInstant=metar.createTimeInstantType();
		TimePositionType timePosition=metar.createTimePositionType();
		timePosition.getValue().add("2012-08-22T16:40:00Z");
		timeInstant.setTimePosition(timePosition);
		timeInstantProperty.setTimeInstant(timeInstant);
		
		
		
		//设置om:type
		ReferenceType type=metar.createReferenceType();
		type.setHref("http://codes.wmo.int/49-2/observation-type/iwxxm/2.1/MeteorologicalAerodromeObservation");
		
		
		
		
		//设置om:procedure
		OMProcessPropertyType omProcessProperty=metar.createOMProcessPropertyType();
		omProcessProperty.setAny(null);
		omProcessProperty.setHref("#p-49-2-metar");
		
		
		
		
		
		//设置om:observedProperty 
		ReferenceType observedProperty=metar.createReferenceType();
		observedProperty.setHref("http://codes.wmo.int/49-2/observable-property/MeteorologicalAerodromeObservation");
		
		
		
		
		//设置机场地理位置信息om:featureOfInterest
		FeaturePropertyType featureProperty=metar.createFeaturePropertyType();
		
		AirportHeliportType airportHeliport=metar.createAirportHeliportType();
		com.iwxxm.metarSpeci.AirportHeliportTimeSlicePropertyType airportHeliportTimeSliceProperty=metar.createAirportHeliportTimeSlicePropertyType();
		AirportHeliportTimeSliceType airportHeliportTimeSlice=metar.createAirportHeliportTimeSliceType();
		airportHeliportTimeSlice.setInterpretation("SNAPSHOT");
		CodeICAOType codeICAO=metar.createCodeICAOType();
		codeICAO.setValue(map1.get("aerodrome"));
		JAXBElement<CodeICAOType> cElement4=new JAXBElement(new QName("","aixm:locationIndicatorICAO"), codeICAO.getClass(), codeICAO);
		airportHeliportTimeSlice.getRest().add(cElement4);
	    com.iwxxm.metarSpeci.CodeAirportHeliportDesignatorType codeAirportHeliportDesignator=metar.createCodeAirportHeliportDesignatorType();
	    codeAirportHeliportDesignator.setValue(map1.get("aerodrome"));
	    JAXBElement<CodeAirportHeliportDesignatorType> cElement5=new JAXBElement(new QName("","aixm:designator"), codeAirportHeliportDesignator.getClass(), codeAirportHeliportDesignator);
	    airportHeliportTimeSlice.getRest().add(cElement5);
	    TextNameType textName=metar.createTextNameType();
	    textName.setValue("DONLON/INTERNATIONAL");
	    JAXBElement<TextNameType> cElement6=new JAXBElement(new QName("","aixm:designator"), textName.getClass(), textName);
	    airportHeliportTimeSlice.getRest().add(cElement6);   
	    airportHeliportTimeSliceProperty.setAirportHeliportTimeSlice(airportHeliportTimeSlice);
		airportHeliport.getTimeSlice().add(airportHeliportTimeSliceProperty);
		airportHeliport.setId(map1.get("aerodrome"));
		
		JAXBElement<AirportHeliportType>cElement7=new JAXBElement(new QName("","aixm:AirportHeliport"), airportHeliport.getClass(),airportHeliport);
		featureProperty.setAbstractFeature(cElement7);
		
		
		
		//整体结构装填
		OMObservationPropertyType omObservationProperty=metar.createOMObservationPropertyType();
		OMObservationType omObservation=metar.createOMObservationType();
		omObservation.setType(type);
		omObservation.setPhenomenonTime(timeObjectProperty1);
		omObservation.setResultTime(timeInstantProperty);
		omObservation.setProcedure(omProcessProperty);
		omObservation.setResult(MeteorologicalAerodromeObservationRecord);
		omObservation.setObservedProperty(observedProperty);
		omObservation.setFeatureOfInterest(featureProperty);
		omObservationProperty.setOMObservation(omObservation);
		MeteorologicalAerodromeObservationReportPropertyType meteorologicalAerodromeObservationReportProperty=metar.createMeteorologicalAerodromeObservationReportPropertyType();
		METARPropertyType METARProperty=metar.createMETARPropertyType();
		METARType METAR=metar.createMETARType();
		METAR.setObservation(omObservationProperty);
		METAR.setAutomatedStation(false);
		METAR.setId("metar-YUDO-20120822163000Z");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    

	    JAXBContext context = JAXBContext.newInstance("com.iwxxm.metarSpeci");
	 //   File file = new File("metar.xml");
	    Marshaller marshaller = context.createMarshaller();//创建编组
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//设置编组属性，使得输出的XML文档进行格式化（提供缩进）
		System.out.println("***********************");
		marshaller.marshal( new JAXBElement(new QName("","iwxxm:METAR"),METAR.getClass(),METAR),System.out);
		
		
		
		
		
	}

}
