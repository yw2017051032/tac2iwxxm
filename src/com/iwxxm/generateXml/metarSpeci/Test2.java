package com.iwxxm.generateXml.metarSpeci;

import java.awt.List;
import java.io.File;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.iwxxm.common.CodeAirportHeliportDesignatorType;
import com.iwxxm.metarSpeci.AerodromeCloudForecastPropertyType;
import com.iwxxm.metarSpeci.AerodromeCloudForecastType;
import com.iwxxm.metarSpeci.AerodromeForecastWeatherType;
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
import com.iwxxm.metarSpeci.AerodromeSurfaceWindTrendForecastPropertyType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindTrendForecastType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindType;
import com.iwxxm.metarSpeci.AirportHeliportTimeSliceType;
import com.iwxxm.metarSpeci.AirportHeliportType;
import com.iwxxm.metarSpeci.AngleType;
import com.iwxxm.metarSpeci.CloudAmountReportedAtAerodromeType;
import com.iwxxm.metarSpeci.CloudLayerPropertyType;
import com.iwxxm.metarSpeci.CloudLayerType;
import com.iwxxm.metarSpeci.CodeICAOType;
import com.iwxxm.metarSpeci.DistanceWithNilReasonType;
import com.iwxxm.metarSpeci.FeaturePropertyType;
import com.iwxxm.metarSpeci.ForecastChangeIndicatorType;
import com.iwxxm.metarSpeci.LengthType;
import com.iwxxm.metarSpeci.LengthWithNilReasonType;
import com.iwxxm.metarSpeci.METARPropertyType;
import com.iwxxm.metarSpeci.METARType;
import com.iwxxm.metarSpeci.MeasureType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType.Cloud;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportPropertyType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeTrendForecastRecordPropertyType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeTrendForecastRecordType;
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
import com.iwxxm.metarSpeci.TimePeriodPropertyType;
import com.iwxxm.metarSpeci.TimePeriodType;
import com.iwxxm.metarSpeci.TimePositionType;
import com.iwxxm.parsetac.metarSpeci.Decode_Tac;
import com.iwxxm.parsetac.metarSpeci.Extract1;
import com.iwxxm.parsetac.metarSpeci.Extract2;
public class Test2 {

	private static final Class MeteorologicalAerodromeObservationReportType = null;

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		String content1="METAR YUDO 221630Z 24004MPS 0600 R12/1000U DZ FG SCT010 OVC020 17/16 Q1018 "
				+ "BECMG TL1700 0800 FG BECMG AT1800 9999 NSW";
		Decode_Tac parse_Tac=new Decode_Tac(content1); 
		String observation=parse_Tac.Fetch_observation_part(content1);
        String observation_group[]=parse_Tac.Split_observation_part(observation.split(" "));
        String trendForecast[]=parse_Tac.Fetch_trendForecast_part(content1);
        System.out.println("trendForecast_part分组情况:");		
		
        
        ArrayList<HashMap<String, String>> arrayList1=new ArrayList<>();
        for (int i = 0; i < trendForecast.length; i++) {
			System.out.println("trendForecast第"+(i)+"组为:"+trendForecast[i].trim());
			Extract2 extract2=new Extract2(trendForecast[i].split(" "));
			HashMap<String, String> map2=(HashMap<String, String>) extract2.parse_trend_forcast();
			System.out.println("trendForecast_part生成的key/value对:");
			System.out.println(map2);
			arrayList1.add(map2);
		}
		
        
        
           ObjectFactory metar = new ObjectFactory();
           METARType METAR=metar.createMETARType();
     
        for (HashMap<String, String> map1 : arrayList1) {
        	
    		MeteorologicalAerodromeTrendForecastRecordPropertyType meteorologicalAerodromeTrendForecastRecordProperty=metar.createMeteorologicalAerodromeTrendForecastRecordPropertyType();
    		MeteorologicalAerodromeTrendForecastRecordType meteorologicalAerodromeTrendForecastRecord=metar.createMeteorologicalAerodromeTrendForecastRecordType();
    		
    		
        	
    		
    		
    		
    		//设置forecastChangeIndicator
    		ForecastChangeIndicatorType forecastChangeIndicator=ForecastChangeIndicatorType.fromValue(map1.get("changeIndicator"));
    		meteorologicalAerodromeTrendForecastRecord.setChangeIndicator(forecastChangeIndicator);
    		meteorologicalAerodromeTrendForecastRecord.setCloudAndVisibilityOK(false);
    		
    		
    		
    		//设置能见度prevailingVisibility
    		LengthType length=metar.createLengthType();
    		length.setValue(Double.parseDouble(map1.get("prevailingVisibility")));
    		length.setUom("m");
    		meteorologicalAerodromeTrendForecastRecord.setPrevailingVisibility(length);
    		
    		
    		
    		
    		AerodromeForecastWeatherType aerodromeForecastWeather=metar.createAerodromeForecastWeatherType();
    		aerodromeForecastWeather.setHref(map1.get("forecastWeather"));
    		meteorologicalAerodromeTrendForecastRecord.getForecastWeather().add(aerodromeForecastWeather);
    		
    		
    		
    		AerodromeSurfaceWindTrendForecastPropertyType aerodromeSurfaceWindTrendForecastProperty=metar.createAerodromeSurfaceWindTrendForecastPropertyType();
    		AerodromeSurfaceWindTrendForecastType aerodromeSurfaceWindTrendForecast=metar.createAerodromeSurfaceWindTrendForecastType();
    		AngleType angle=metar.createAngleType();
    		SpeedType speed=metar.createSpeedType();
    		angle.setValue(240);
    		angle.setUom("deg");
    		speed.setValue(4);
    		speed.setUom("m/s");
    		aerodromeSurfaceWindTrendForecast.setMeanWindDirection(angle);
    		aerodromeSurfaceWindTrendForecast.setMeanWindSpeed(speed);
    		JAXBElement<AerodromeSurfaceWindTrendForecastType> cElement1=new JAXBElement(new QName("","iwxxm:surfaceWind"), aerodromeSurfaceWindTrendForecast.getClass(),aerodromeSurfaceWindTrendForecast); 
    		aerodromeSurfaceWindTrendForecastProperty.setAerodromeSurfaceWindTrendForecast(cElement1);
    		meteorologicalAerodromeTrendForecastRecord.setSurfaceWind(aerodromeSurfaceWindTrendForecastProperty);
    		
    		
    		
    		
    		AerodromeCloudForecastPropertyType aerodromeCloudForecastProperty=metar.createAerodromeCloudForecastPropertyType();
    		AerodromeCloudForecastType aerodromeCloudForecast=metar.createAerodromeCloudForecastType();
    		AerodromeCloudForecastType.Layer layer=metar.createAerodromeCloudForecastTypeLayer();
    		CloudAmountReportedAtAerodromeType cloudAmountReportedAtAerodrome=metar.createCloudAmountReportedAtAerodromeType();
    		DistanceWithNilReasonType distanceWithNilReason=metar.createDistanceWithNilReasonType();
    		CloudLayerType cloudLayer=metar.createCloudLayerType();
    	    cloudAmountReportedAtAerodrome.setHref("http://codes.wmo.int/bufr4/codeflag/0-20-008/4");
    	    distanceWithNilReason.setValue(1000);
    	    distanceWithNilReason.setUom("[ft_i]");
    		cloudLayer.setAmount(cloudAmountReportedAtAerodrome);
    		cloudLayer.setBase(distanceWithNilReason);
    		layer.setCloudLayer(cloudLayer);
    		aerodromeCloudForecast.getLayer().add(layer);
    		aerodromeCloudForecastProperty.setAerodromeCloudForecast(aerodromeCloudForecast);
    		JAXBElement<AerodromeCloudForecastPropertyType> cElement2=new JAXBElement(new QName("","iwxxm:cloud"), aerodromeCloudForecastProperty.getClass(),aerodromeCloudForecastProperty); 
    		meteorologicalAerodromeTrendForecastRecord.setCloud(cElement2);
    		
    		
    		
    		
    		//现象持续时间phenomenonTime
    		TimeObjectPropertyType timeObjectProperty1=metar.createTimeObjectPropertyType();
    		TimePeriodPropertyType timePeriodProperty=metar.createTimePeriodPropertyType();
    		TimePeriodType timePeriod=metar.createTimePeriodType();
    		TimePositionType timePosition1=metar.createTimePositionType();
    		timePosition1.getValue().add("2012-08-22T16:30:00Z");
    		timePeriod.setBeginPosition(timePosition1);
    		TimePositionType timePosition2=metar.createTimePositionType();
    		timePosition2.getValue().add("2012-08-22T16:30:00Z");
    		timePeriod.setEndPosition(timePosition2);
    		timePeriodProperty.setTimePeriod(timePeriod);
    		JAXBElement<TimePeriodType> cElement3=new JAXBElement(new QName("","gml:TimePeriod"), timePeriodProperty.getClass(), timePeriodProperty);
    		timeObjectProperty1.setAbstractTimeObject(cElement3);
    		
    		
    		
    		
    		//观测结果时间resultTime
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
    		
    		
    		
    		
    	
    		
    		
    		//整体结构装填
    		OMObservationPropertyType omObservationProperty=metar.createOMObservationPropertyType();
    		OMObservationType omObservation=metar.createOMObservationType();
    		omObservation.setPhenomenonTime(timeObjectProperty1);
    		omObservation.setResultTime(timeInstantProperty);
    		omObservation.setType(type);
    		omObservation.setProcedure(omProcessProperty);
    		omObservation.setObservedProperty(observedProperty);
    		omObservation.setResult(meteorologicalAerodromeTrendForecastRecord);
    		omObservationProperty.setOMObservation(omObservation);
    	
    		
    		
    		
    		
    		METAR.getTrendForecast().add(omObservationProperty);
    		
    	
    		
    		
    		
    		
    		
    		
    		

        	
		}
		
            JAXBContext context = JAXBContext.newInstance("com.iwxxm.metarSpeci");
	   	  //  File file = new File("D:\\metar.xml");
	   	    Marshaller marshaller = context.createMarshaller();//创建编组
	   	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//设置编组属性，使得输出的XML文档进行格式化（提供缩进）
	   		System.out.println("***********************");
	   		marshaller.marshal( new JAXBElement(new QName("","iwxxm:METAR"),METAR.getClass(),METAR),System.out);
       
		
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    

	 
		
		
		
		
		
	}

}
