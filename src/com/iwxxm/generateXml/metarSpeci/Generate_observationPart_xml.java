package com.iwxxm.generateXml.metarSpeci;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.iwxxm.common.CodeAirportHeliportDesignatorType;
import com.iwxxm.metarSpeci.AbstractTimeComplexType;
import com.iwxxm.metarSpeci.AbstractTimeObjectType;
import com.iwxxm.metarSpeci.AerodromeHorizontalVisibilityPropertyType;
import com.iwxxm.metarSpeci.AerodromeHorizontalVisibilityType;
import com.iwxxm.metarSpeci.AerodromeObservedCloudsPropertyType;
import com.iwxxm.metarSpeci.AerodromeObservedCloudsType;
import com.iwxxm.metarSpeci.AerodromePresentWeatherType;
import com.iwxxm.metarSpeci.AerodromeRunwayVisualRangePropertyType;
import com.iwxxm.metarSpeci.AerodromeRunwayVisualRangeType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindPropertyType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindType;
import com.iwxxm.metarSpeci.AerodromeWindShearPropertyType;
import com.iwxxm.metarSpeci.AerodromeWindShearType;
import com.iwxxm.metarSpeci.AirportHeliportTimeSliceType;
import com.iwxxm.metarSpeci.AirportHeliportType;
import com.iwxxm.metarSpeci.AngleType;
import com.iwxxm.metarSpeci.CloudLayerType;
import com.iwxxm.metarSpeci.CodeICAOType;
import com.iwxxm.metarSpeci.FeaturePropertyType;
import com.iwxxm.metarSpeci.LengthType;
import com.iwxxm.metarSpeci.METARPropertyType;
import com.iwxxm.metarSpeci.METARType;
import com.iwxxm.metarSpeci.MeasureType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportPropertyType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportType;
import com.iwxxm.metarSpeci.OMObservationPropertyType;
import com.iwxxm.metarSpeci.OMObservationType;
import com.iwxxm.metarSpeci.OMProcessPropertyType;
import com.iwxxm.metarSpeci.ObjectFactory;
import com.iwxxm.metarSpeci.ReferenceType;
import com.iwxxm.metarSpeci.RunwayDirectionPropertyType;
import com.iwxxm.metarSpeci.RunwayDirectionPropertyType1;
import com.iwxxm.metarSpeci.SpeedType;
import com.iwxxm.metarSpeci.TextNameType;
import com.iwxxm.metarSpeci.TimeInstantPropertyType;
import com.iwxxm.metarSpeci.TimeInstantType;
import com.iwxxm.metarSpeci.TimeObjectPropertyType;
import com.iwxxm.metarSpeci.TimePositionType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType.Cloud;

public class Generate_observationPart_xml {
     
	Map<String, String> map;
	MeteorologicalAerodromeObservationReportType METAR;
	
	public Generate_observationPart_xml(MeteorologicalAerodromeObservationReportType METAR,Map<String, String> map) {
		// TODO Auto-generated constructor stub
		this.METAR=METAR;
		this.map=map;
		
	}
	
	
	public void generate_xml() throws ParseException {
		
		ObjectFactory metar = new ObjectFactory();
		MeteorologicalAerodromeObservationRecordType MeteorologicalAerodromeObservationRecord=metar.createMeteorologicalAerodromeObservationRecordType();		
		
		//设置温度
	    if (map.get("airTemperature")!=null) {
	    	MeasureType airTemperature=metar.createMeasureType();
			airTemperature.setUom("Cel");
			airTemperature.setValue(Double.parseDouble(map.get("airTemperature")));
			MeteorologicalAerodromeObservationRecord.setAirTemperature(airTemperature);
		}
	    
	    //设置露点
		if (map.get("dewpointTemperature")!=null) {
			MeasureType dewpointTemperature=metar.createMeasureType();
			dewpointTemperature.setUom("Cel");
			dewpointTemperature.setValue(Double.parseDouble(map.get("dewpointTemperature")));
			MeteorologicalAerodromeObservationRecord.setDewpointTemperature(dewpointTemperature);
		}
		
		//设置大气压强
		if (map.get("qnh")!=null) {
			MeasureType qnh=metar.createMeasureType();
			qnh.setUom("hPa");
			qnh.setValue(Double.parseDouble(map.get("qnh").substring(1)));
			MeteorologicalAerodromeObservationRecord.setQnh(qnh);
		}
		
		
		
		//设置地面风AerodromeSurfaceWind
		AerodromeSurfaceWindPropertyType aerodromeSurfaceWindProperty=metar.createAerodromeSurfaceWindPropertyType();
		AngleType angle=metar.createAngleType();
		SpeedType speed=metar.createSpeedType();
		AerodromeSurfaceWindType aerodromeSurfaceWind=metar.createAerodromeSurfaceWindType();
		if (map.get("meanWindDirection")!=null) {
			angle.setValue(Double.parseDouble(map.get("meanWindDirection")));
			angle.setUom("deg");
			aerodromeSurfaceWind.setMeanWindDirection(angle);
		}		
		if (map.get("meanWindSpeed")!=null) {
			speed.setValue(Double.parseDouble(map.get("meanWindSpeed")));
			speed.setUom("m/s");
			aerodromeSurfaceWind.setMeanWindSpeed(speed);
		}		
		if (map.get("windGustSpeed")!=null) {
			SpeedType GustSpeed=metar.createSpeedType();
			GustSpeed.setValue(Double.parseDouble(map.get("GustSpeed")));
			GustSpeed.setUom("m/s");
			aerodromeSurfaceWind.setWindGustSpeed(GustSpeed);
		}		
		if (map.get("variableWindDirection")!=null) {
			aerodromeSurfaceWind.setVariableWindDirection(Boolean.getBoolean(map.get("variableWindDirection")));
		}
		aerodromeSurfaceWindProperty.setAerodromeSurfaceWind(aerodromeSurfaceWind);
		MeteorologicalAerodromeObservationRecord.setSurfaceWind(aerodromeSurfaceWindProperty);
		
		
		
		//设置能见度AerodromeHorizontalVisibility
		if (map.get("prevailingVisibility")!=null) {
		AerodromeHorizontalVisibilityPropertyType aerodromeHorizontalVisibilityProperty=metar.createAerodromeHorizontalVisibilityPropertyType();
		AerodromeHorizontalVisibilityType aerodromeHorizontalVisibility=metar.createAerodromeHorizontalVisibilityType();
		LengthType length=metar.createLengthType();
		if (map.get("prevailingVisibility").equals("CAVOK")) {
			length.setValue(9999);
			length.setUom("m");
		}else {
			length.setValue(Double.parseDouble(map.get("prevailingVisibility")));
			length.setUom("m");
		}
		
		aerodromeHorizontalVisibility.setPrevailingVisibility(length);
		aerodromeHorizontalVisibilityProperty.setAerodromeHorizontalVisibility(aerodromeHorizontalVisibility);
		MeteorologicalAerodromeObservationRecord.setVisibility(aerodromeHorizontalVisibilityProperty);
		}
		
		//设置CloudAndVisibilityOK
		if (map.get("prevailingVisibility")!=null&&map.get("prevailingVisibility").equals("CAVOK")) {
			MeteorologicalAerodromeObservationRecord.setCloudAndVisibilityOK(true);
		} else {
			MeteorologicalAerodromeObservationRecord.setCloudAndVisibilityOK(false);
		}
		
		
		
		//设置跑道视程AerodromeRunwayVisualRange
		if (map.get("meanRVR")!=null) {
			AerodromeRunwayVisualRangePropertyType aerodromeRunwayVisualRangeProperty=metar.createAerodromeRunwayVisualRangePropertyType();
			AerodromeRunwayVisualRangeType aerodromeRunwayVisualRange=metar.createAerodromeRunwayVisualRangeType();
			LengthType length2=metar.createLengthType();
			length2.setValue(Double.parseDouble(map.get("meanRVR")));
			length2.setUom("m");
			aerodromeRunwayVisualRange.setMeanRVR(length2);
			aerodromeRunwayVisualRangeProperty.setAerodromeRunwayVisualRange(aerodromeRunwayVisualRange);
			MeteorologicalAerodromeObservationRecord.getRvr().add(aerodromeRunwayVisualRangeProperty);
		}
		
		
		
		//设置天气现象AerodromePresentWeather
		if (map.get("presentWeather")!=null) {
			String[] temp=map.get("presentWeather").split(" ");			
			for (String string : temp) {
				AerodromePresentWeatherType aerodromePresentWeather=metar.createAerodromePresentWeatherType();
				string="http://codes.wmo.int/306/4678/"+string;
				aerodromePresentWeather.setHref(string);
				MeteorologicalAerodromeObservationRecord.getPresentWeather().add(aerodromePresentWeather);
			}
			
		}
		
		
		//设置云层现象AerodromeObservedClouds
        if (map.get("CloudLayer")!=null) {
        	
        	MeteorologicalAerodromeObservationRecordType.Cloud cloud = metar.createMeteorologicalAerodromeObservationRecordTypeCloud();		
    		AerodromeObservedCloudsType aerodromeObservedClouds=metar.createAerodromeObservedCloudsType();
    		String[] temp=map.get("CloudLayer").split(" ");
    		for (String string : temp) { 			
        		AerodromeObservedCloudsType.Layer layer=metar.createAerodromeObservedCloudsTypeLayer();
        		AerodromeObservedCloudsPropertyType aerodromeObservedCloudsPropert=metar.createAerodromeObservedCloudsPropertyType();		
    			com.iwxxm.metarSpeci.CloudAmountReportedAtAerodromeType cloudAmountReportedAtAerodrome=metar.createCloudAmountReportedAtAerodromeType();
        		com.iwxxm.metarSpeci.DistanceWithNilReasonType distanceWithNilReason=metar.createDistanceWithNilReasonType();
    			CloudLayerType cloudLayer=metar.createCloudLayerType();
        	    cloudAmountReportedAtAerodrome.setHref(string);
        	    distanceWithNilReason.setValue(Double.parseDouble(string.substring(3,6))*100);
        	    distanceWithNilReason.setUom("[ft_i]");
        		cloudLayer.setAmount(cloudAmountReportedAtAerodrome);
        		cloudLayer.setBase(distanceWithNilReason);
        		layer.setCloudLayer(cloudLayer);
        		aerodromeObservedClouds.getLayer().add(layer);
        		
			}
    		cloud.setAerodromeObservedClouds(aerodromeObservedClouds);
    		JAXBElement<Cloud> cElement1=new JAXBElement(new QName("","iwxxm:cloud"), cloud.getClass(), cloud);
    		MeteorologicalAerodromeObservationRecord.setCloud(cElement1);
    		
		}
        
        
        //设置AerodromeWindShear
        AerodromeWindShearPropertyType aerodromeWindShearProperty=metar.createAerodromeWindShearPropertyType();
        AerodromeWindShearType aerodromeWindShear=metar.createAerodromeWindShearType();
        RunwayDirectionPropertyType1 runwayDirectionProperty=metar.createRunwayDirectionPropertyType1();
        if (map.get("allRunways")!=null) {
        	aerodromeWindShear.setAllRunways(Boolean.valueOf(map.get("allRunways")));
        	runwayDirectionProperty.setHref(map.get("runway"));
        	aerodromeWindShear.getRunway();
        	aerodromeSurfaceWindProperty.setAerodromeSurfaceWind(aerodromeSurfaceWind);
        	MeteorologicalAerodromeObservationRecord.setWindShear(aerodromeWindShearProperty);
		}
        
        
		
	    
	    
		    //设置PhenomenonTime
        	TimeObjectPropertyType timeObjectProperty1=metar.createTimeObjectPropertyType();
    		TimeInstantPropertyType timeInstantProperty1=metar.createTimeInstantPropertyType();
    		TimeInstantType timeInstant1=metar.createTimeInstantType();
    		TimePositionType timePosition1=metar.createTimePositionType();
    		if (map.get("time")!=null) {
    			timePosition1.getValue().add(map.get("time"));
    			timeInstant1.setTimePosition(timePosition1);
        		timeInstantProperty1.setTimeInstant(timeInstant1);
        	 	JAXBElement<TimeInstantType> cElement2=new JAXBElement(new QName("","gml:TimeInstant"), timeInstant1.getClass(), timeInstant1);
        		timeObjectProperty1.setAbstractTimeObject(cElement2);
			}
    		
    		
		
		
		
		
		
		//设置ResultTime
		TimeInstantPropertyType timeInstantProperty=metar.createTimeInstantPropertyType();
		TimeInstantType timeInstant=metar.createTimeInstantType();
		TimePositionType timePosition=metar.createTimePositionType();
		if (map.get("time")!=null) {
			String phenomenonTime=map.get("time");
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
			Date date=formatter.parse(phenomenonTime);
			Date ResultDate = new Date(date .getTime() + 600000);
			timePosition.getValue().add(formatter.format(ResultDate));
			timeInstant.setTimePosition(timePosition);
			timeInstantProperty.setTimeInstant(timeInstant);
		}
		
		
		
		
		
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
		com.iwxxm.metarSpeci.CodeAirportHeliportDesignatorType codeAirportHeliportDesignator=metar.createCodeAirportHeliportDesignatorType();
		codeAirportHeliportDesignator.setValue(map.get("aerodrome"));
		JAXBElement<CodeAirportHeliportDesignatorType> cElement5=new JAXBElement(new QName("","aixm:designator"), codeAirportHeliportDesignator.getClass(), codeAirportHeliportDesignator);
		airportHeliportTimeSlice.getRest().add(cElement5);
		TextNameType textName=metar.createTextNameType();
		textName.setValue("DONLON/INTERNATIONAL");
		JAXBElement<TextNameType> cElement6=new JAXBElement(new QName("","aixm:name"), textName.getClass(), textName);
		airportHeliportTimeSlice.getRest().add(cElement6);
		CodeICAOType codeICAO=metar.createCodeICAOType();
		codeICAO.setValue(map.get("aerodrome"));
		JAXBElement<CodeICAOType> cElement4=new JAXBElement(new QName("","aixm:locationIndicatorICAO"), codeICAO.getClass(), codeICAO);
		airportHeliportTimeSlice.getRest().add(cElement4);
		airportHeliportTimeSliceProperty.setAirportHeliportTimeSlice(airportHeliportTimeSlice);
		airportHeliport.getTimeSlice().add(airportHeliportTimeSliceProperty);
		airportHeliport.setId(map.get("aerodrome"));
				
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
		METAR.setObservation(omObservationProperty);
		METAR.setAutomatedStation(false);
		String id=map.get("featureType").toLowerCase()+'-'+map.get("aerodrome")+'-'+map.get("time").replaceAll("-|T|:","");
		METAR.setId(id);
		METAR.setAutomatedStation(false);
		
		
		
		
	}
	
	
	
	
}
