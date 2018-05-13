package com.iwxxm.generateXml.taf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.iwxxm.taf.AerodromeAirTemperatureForecastPropertyType;
import com.iwxxm.taf.AerodromeAirTemperatureForecastType;
import com.iwxxm.taf.AerodromeCloudForecastPropertyType;
import com.iwxxm.taf.AerodromeCloudForecastType;
import com.iwxxm.taf.AerodromeForecastWeatherType;
import com.iwxxm.taf.AerodromeSurfaceWindForecastPropertyType;
import com.iwxxm.taf.AerodromeSurfaceWindForecastType;
import com.iwxxm.taf.AirportHeliportTimeSlicePropertyType;
import com.iwxxm.taf.AirportHeliportTimeSliceType;
import com.iwxxm.taf.AirportHeliportType;
import com.iwxxm.taf.AngleType;
import com.iwxxm.taf.CloudAmountReportedAtAerodromeType;
import com.iwxxm.taf.CloudLayerPropertyType;
import com.iwxxm.taf.CloudLayerType;
import com.iwxxm.taf.CodeAirportHeliportDesignatorType;
import com.iwxxm.taf.CodeICAOType;
import com.iwxxm.taf.DistanceWithNilReasonType;
import com.iwxxm.taf.FeaturePropertyType;
import com.iwxxm.taf.LengthType;
import com.iwxxm.taf.MeasureType;
import com.iwxxm.taf.MeteorologicalAerodromeForecastRecordType;
import com.iwxxm.taf.OMProcessPropertyType;
import com.iwxxm.taf.ObjectFactory;
import com.iwxxm.taf.ReferenceType;
import com.iwxxm.taf.SpeedType;
import com.iwxxm.taf.TAFType;
import com.iwxxm.taf.TextNameType;
import com.iwxxm.taf.TimeInstantPropertyType;
import com.iwxxm.taf.TimeInstantType;
import com.iwxxm.taf.TimeObjectPropertyType;
import com.iwxxm.taf.TimePositionType;



public class Generate_baseForecast_xml {
     
	Map<String, String> map;
	TAFType TAF;
	
	public Generate_baseForecast_xml(TAFType TAF,Map<String, String> map) {
		// TODO Auto-generated constructor stub
		this.TAF=TAF;
		this.map=map;
		
	}
	
	
	void generate_xml() throws ParseException {
		
		ObjectFactory tafOb = new ObjectFactory();
	//	com.iwxxm.common.ObjectFactory common=new com.iwxxm.common.ObjectFactory();
		MeteorologicalAerodromeForecastRecordType 	meteorologicalAerodromeForecastRecord=tafOb.createMeteorologicalAerodromeForecastRecordType();	
	//	System.out.println(map);
		
		
		//设置温度
		AerodromeAirTemperatureForecastPropertyType aerodromeAirTemperatureForecastProperty=tafOb.createAerodromeAirTemperatureForecastPropertyType();
		AerodromeAirTemperatureForecastType airTemperature=tafOb.createAerodromeAirTemperatureForecastType();
		if (map.get("maximumAirTemperature")!=null) { 	
			MeasureType measureType1=tafOb.createMeasureType();
			measureType1.setValue(Double.parseDouble(map.get("maximumAirTemperature")));
			measureType1.setUom("Cel");
	    	airTemperature.setMaximumAirTemperature(measureType1);
		}
		if (map.get("maximumAirTemperatureTime")!=null) { 	
			TimeInstantPropertyType timeInstantProperty=tafOb.createTimeInstantPropertyType();
			TimeInstantType timeInstant=tafOb.createTimeInstantType();
			TimePositionType timePosition=tafOb.createTimePositionType();
			timePosition.getValue().add(map.get("maximumAirTemperatureTime"));
			timeInstant.setTimePosition(timePosition);
			timeInstantProperty.setTimeInstant(timeInstant);
	    	airTemperature.setMaximumAirTemperatureTime(timeInstantProperty);
		}
		if (map.get("minimumAirTemperature")!=null) { 	
			MeasureType measureType2=tafOb.createMeasureType();
			measureType2.setValue(Double.parseDouble(map.get("minimumAirTemperature")));
			measureType2.setUom("Cel");
	    	airTemperature.setMaximumAirTemperature(measureType2);
		}
		if (map.get("minimumAirTemperatureTime")!=null) { 	
			TimeInstantPropertyType timeInstantProperty=tafOb.createTimeInstantPropertyType();
			TimeInstantType timeInstant=tafOb.createTimeInstantType();
			TimePositionType timePosition=tafOb.createTimePositionType();
			timePosition.getValue().add(map.get("minimumAirTemperatureTime"));
			timeInstant.setTimePosition(timePosition);
			timeInstantProperty.setTimeInstant(timeInstant);
	    	airTemperature.setMaximumAirTemperatureTime(timeInstantProperty);
		}
		aerodromeAirTemperatureForecastProperty.setAerodromeAirTemperatureForecast(airTemperature);
		meteorologicalAerodromeForecastRecord.getTemperature().add(aerodromeAirTemperatureForecastProperty);


		
		
		
		//设置地面风AerodromeSurfaceWind
		AerodromeSurfaceWindForecastPropertyType aerodromeSurfaceWindForecastProperty=tafOb.createAerodromeSurfaceWindForecastPropertyType();
		AerodromeSurfaceWindForecastType aerodromeSurfaceWindForecast=tafOb.createAerodromeSurfaceWindForecastType();
		AngleType angle=tafOb.createAngleType();
		SpeedType speed=tafOb.createSpeedType();
		if (map.get("meanWindDirection")!=null) {
			angle.setValue(Double.parseDouble(map.get("meanWindDirection")));
			angle.setUom("deg");
			aerodromeSurfaceWindForecast.setMeanWindDirection(angle);
		}		
		if (map.get("meanWindSpeed")!=null) {
			speed.setValue(Double.parseDouble(map.get("meanWindSpeed")));
			speed.setUom("m/s");
			aerodromeSurfaceWindForecast.setMeanWindSpeed(speed);
		}		
		if (map.get("windGustSpeed")!=null) {
			SpeedType GustSpeed=tafOb.createSpeedType();
			GustSpeed.setValue(Double.parseDouble(map.get("GustSpeed")));
			GustSpeed.setUom("m/s");
			aerodromeSurfaceWindForecast.setWindGustSpeed(GustSpeed);
		}		
		if (map.get("variableWindDirection")!=null) {
			aerodromeSurfaceWindForecast.setVariableWindDirection(Boolean.getBoolean(map.get("variableWindDirection")));
		}
		aerodromeSurfaceWindForecastProperty.setAerodromeSurfaceWindForecast(aerodromeSurfaceWindForecast);;
		meteorologicalAerodromeForecastRecord.setSurfaceWind(aerodromeSurfaceWindForecastProperty);
		
		
		
		//设置能见度AerodromeHorizontalVisibility
		if (map.get("prevailingVisibility")!=null) {
		LengthType length=tafOb.createLengthType();
		if (map.get("prevailingVisibility").equals("CAVOK")) {
			length.setValue(9999);
			length.setUom("m");
		}else {
			length.setValue(Double.parseDouble(map.get("prevailingVisibility")));
			length.setUom("m");
		}
		meteorologicalAerodromeForecastRecord.setPrevailingVisibility(length);
		
		}
		
		
		
		//设置属性CloudAndVisibilityOK
		if (map.get("prevailingVisibility")!=null&&map.get("prevailingVisibility").equals("CAVOK")) {
			meteorologicalAerodromeForecastRecord.setCloudAndVisibilityOK(true);
		} else {
			meteorologicalAerodromeForecastRecord.setCloudAndVisibilityOK(false);
		}
		
		
				
		//设置预报天气现象AerodromeForecastWeather
		if (map.get("weather")!=null) {
			String[] temp=map.get("weather").split(" ");			
			for (String string : temp) {
				AerodromeForecastWeatherType aerodromeForecastWeather=tafOb.createAerodromeForecastWeatherType();
				string="http://codes.wmo.int/306/4678/"+string;
				aerodromeForecastWeather.setHref(string);
				meteorologicalAerodromeForecastRecord.getWeather().add(aerodromeForecastWeather);
			}
			
		}
		
		
		
		//设置云层现象AerodromeObservedClouds
        if (map.get("CloudLayer")!=null) {
        	
        	AerodromeCloudForecastPropertyType  cloud = tafOb.createAerodromeCloudForecastPropertyType();		
    		AerodromeCloudForecastType aerodromeCloudForecast=tafOb.createAerodromeCloudForecastType();
    		String[] temp=map.get("CloudLayer").split(" ");
    		for (String string : temp) { 			
    			AerodromeCloudForecastType.Layer layer=tafOb.createAerodromeCloudForecastTypeLayer();
    			CloudLayerPropertyType cloudLayerProperty=tafOb.createCloudLayerPropertyType();
    			CloudLayerType cloudLayer=tafOb.createCloudLayerType();
    		    CloudAmountReportedAtAerodromeType cloudAmountReportedAtAerodrome=tafOb.createCloudAmountReportedAtAerodromeType();
        		DistanceWithNilReasonType distanceWithNilReason=new DistanceWithNilReasonType();
        	    cloudAmountReportedAtAerodrome.setHref(string);
        	    distanceWithNilReason.setValue(Double.parseDouble(string.substring(3,6))*100);
        	    distanceWithNilReason.setUom("[ft_i]");
        		cloudLayer.setAmount(cloudAmountReportedAtAerodrome);
        		cloudLayer.setBase(distanceWithNilReason);
        		layer.setCloudLayer(cloudLayer);
        		aerodromeCloudForecast.getLayer().add(layer);
        		
			}
    		cloud.setAerodromeCloudForecast(aerodromeCloudForecast);
    		meteorologicalAerodromeForecastRecord.setCloud(cloud);    		
		}
		
	    
	    
		    //设置issueTime
        //	TimeObjectPropertyType timeObjectProperty1=tafOb.createTimeObjectPropertyType();
    		TimeInstantPropertyType timeInstantProperty1=tafOb.createTimeInstantPropertyType();
    		TimeInstantType timeInstant1=tafOb.createTimeInstantType();
    		TimePositionType timePosition1=tafOb.createTimePositionType();
    		if (map.get("issueTime")!=null) {
    			timePosition1.getValue().add(map.get("issueTime"));
    			timeInstant1.setTimePosition(timePosition1);
        		timeInstantProperty1.setTimeInstant(timeInstant1);
//        		JAXBElement<TimeInstantPropertyType> cElement2=new JAXBElement(new QName("","gml:TimeInstantType"), timeInstantProperty1.getClass(), timeInstantProperty1);
//        		timeObjectProperty1.setAbstractTimeObject(cElement2);
			}
    		
    		
		
    		
		    //设置validTime
    		com.iwxxm.taf.TimePeriodPropertyType timePeriodProperty=tafOb.createTimePeriodPropertyType();
    	    com.iwxxm.taf.TimePeriodType timePeriod=tafOb.createTimePeriodType();
     		TimePositionType timePosition2=tafOb.createTimePositionType();
    		if (map.get("validBeginTime")!=null) {
    			timePosition1.getValue().add(map.get("validBeginTime"));
    			timePeriod.setBeginPosition(timePosition1);
    		}
    		TimePositionType timePosition3=tafOb.createTimePositionType();
    		if (map.get("validEndTime")!=null) {
    			timePosition2.getValue().add(map.get("validEndTime"));
    			timePeriod.setEndPosition(timePosition3);
    		}
    		timePeriodProperty.setTimePeriod(timePeriod);

		   
		
		    
		  //设置om:type
    		ReferenceType type=tafOb.createReferenceType();
			type.setHref("http://codes.wmo.int/49-2/observation-type/iwxxm/2.1/MeteorologicalAerodromeObservation");
			
			
			//设置om:procedure
			OMProcessPropertyType omProcessProperty=tafOb.createOMProcessPropertyType();
			omProcessProperty.setAny(null);
			omProcessProperty.setHref("#p-49-2-taf");
			
			
			//设置om:observedProperty
			ReferenceType observedProperty=tafOb.createReferenceType();
			observedProperty.setHref("http://codes.wmo.int/49-2/observable-property/MeteorologicalAerodromeObservation");
		
		    
			//设置机场地理位置信息om:featureOfInterest
			FeaturePropertyType featureProperty=tafOb.createFeaturePropertyType();					
			AirportHeliportType airportHeliport=tafOb.createAirportHeliportType();
			AirportHeliportTimeSlicePropertyType airportHeliportTimeSliceProperty=tafOb.createAirportHeliportTimeSlicePropertyType();
			AirportHeliportTimeSliceType airportHeliportTimeSlice=tafOb.createAirportHeliportTimeSliceType();
			airportHeliportTimeSlice.setInterpretation("SNAPSHOT");
			com.iwxxm.taf.CodeAirportHeliportDesignatorType codeAirportHeliportDesignator=tafOb.createCodeAirportHeliportDesignatorType();
			codeAirportHeliportDesignator.setValue(map.get("aerodrome"));
			JAXBElement<CodeAirportHeliportDesignatorType> cElement5=new JAXBElement(new QName("","aixm:designator"), codeAirportHeliportDesignator.getClass(), codeAirportHeliportDesignator);
			airportHeliportTimeSlice.getRest().add(cElement5);
			com.iwxxm.taf.TextNameType textName=tafOb.createTextNameType();
			textName.setValue("DONLON/INTERNATIONAL");
			JAXBElement<TextNameType> cElement6=new JAXBElement(new QName("","aixm:name"), textName.getClass(), textName);
			CodeICAOType codeICAO=tafOb.createCodeICAOType();
			codeICAO.setValue(map.get("aerodrome"));
			JAXBElement<CodeICAOType> cElement4=new JAXBElement(new QName("","aixm:locationIndicatorICAO"), codeICAO.getClass(), codeICAO);
			airportHeliportTimeSlice.getRest().add(cElement4);
			airportHeliportTimeSlice.getRest().add(cElement6);   
			airportHeliportTimeSliceProperty.setAirportHeliportTimeSlice(airportHeliportTimeSlice);
			airportHeliport.getTimeSlice().add(airportHeliportTimeSliceProperty);
			airportHeliport.setId(map.get("aerodrome"));
					
			JAXBElement<com.iwxxm.taf.AirportHeliportType>cElement7=new JAXBElement(new QName("","aixm:AirportHeliport"), airportHeliport.getClass(),airportHeliport);
			featureProperty.setAbstractFeature(cElement7);
			
			

			//整体结构装填
			com.iwxxm.taf.OMObservationPropertyType omObservationProperty=tafOb.createOMObservationPropertyType();
			com.iwxxm.taf.OMObservationType omObservation=tafOb.createOMObservationType();
			omObservation.setType(type);
			omObservation.setProcedure(omProcessProperty);
			omObservation.setResult(meteorologicalAerodromeForecastRecord);
			omObservation.setObservedProperty(observedProperty);
			omObservation.setFeatureOfInterest(featureProperty);
			omObservationProperty.setOMObservation(omObservation);
			TAF.setBaseForecast(omObservationProperty);
			String id=map.get("featureType").toLowerCase()+'-'+map.get("aerodrome")+'-'+map.get("validBeginTime").replaceAll("-|T|:","");
			TAF.setId(id);
			TAF.setIssueTime(timeInstantProperty1);
			TAF.setValidTime(timePeriodProperty);
		
		
		
	}
	
	
	
	
}
