package com.iwxxm.generateXml.metarSpeci;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.iwxxm.metarSpeci.AerodromeCloudForecastPropertyType;
import com.iwxxm.metarSpeci.AerodromeCloudForecastType;
import com.iwxxm.metarSpeci.AerodromeForecastWeatherType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindTrendForecastPropertyType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindTrendForecastType;
import com.iwxxm.metarSpeci.AngleType;
import com.iwxxm.metarSpeci.CloudAmountReportedAtAerodromeType;
import com.iwxxm.metarSpeci.CloudLayerType;
import com.iwxxm.metarSpeci.DistanceWithNilReasonType;
import com.iwxxm.metarSpeci.ForecastChangeIndicatorType;
import com.iwxxm.metarSpeci.LengthType;
import com.iwxxm.metarSpeci.METARType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeTrendForecastRecordPropertyType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeTrendForecastRecordType;
import com.iwxxm.metarSpeci.OMObservationPropertyType;
import com.iwxxm.metarSpeci.OMObservationType;
import com.iwxxm.metarSpeci.OMProcessPropertyType;
import com.iwxxm.metarSpeci.ObjectFactory;
import com.iwxxm.metarSpeci.ReferenceType;
import com.iwxxm.metarSpeci.SpeedType;
import com.iwxxm.metarSpeci.TimeInstantPropertyType;
import com.iwxxm.metarSpeci.TimeInstantType;
import com.iwxxm.metarSpeci.TimeObjectPropertyType;
import com.iwxxm.metarSpeci.TimePeriodPropertyType;
import com.iwxxm.metarSpeci.TimePeriodType;
import com.iwxxm.metarSpeci.TimePositionType;
import com.iwxxm.parsetac.metarSpeci.Extract2;

public class Generate_trendForecastPart_xml {
	String[] trendForecast;
	MeteorologicalAerodromeObservationReportType TYPE;
	String ObservationTime; 
	
	
	public Generate_trendForecastPart_xml(MeteorologicalAerodromeObservationReportType METAR,String[] trendForecast,String ObservationTime) {
		// TODO Auto-generated constructor stub
		this.TYPE=METAR;
		this.trendForecast=trendForecast;
		this.ObservationTime=ObservationTime;
	}
	
	public void generate_xml() throws JAXBException, ParseException {
		
		ArrayList<HashMap<String, String>> arrayList1=new ArrayList<>();
        for (int i = 0; i < trendForecast.length; i++) {
			Extract2 extract2=new Extract2(trendForecast[i].split(" "));
			HashMap<String, String> map=(HashMap<String, String>) extract2.parse_trend_forcast();
			arrayList1.add(map);
		//	System.out.println(map);
		}
        
		 ObjectFactory metar = new ObjectFactory();
   
      for (HashMap<String, String> map : arrayList1) {
      	if (map.get("changeIndicator")!=null&&(!map.get("changeIndicator").equals("NOSIG="))) {
			
		
  		
  		MeteorologicalAerodromeTrendForecastRecordType meteorologicalAerodromeTrendForecastRecord=metar.createMeteorologicalAerodromeTrendForecastRecordType();
  		
  		
      	
  		
  		
  		
  	    //设置forecastChangeIndicator
  		if (map.get("changeIndicator")!=null) {
  			ForecastChangeIndicatorType forecastChangeIndicator=ForecastChangeIndicatorType.fromValue(map.get("changeIndicator"));
  	  	  	meteorologicalAerodromeTrendForecastRecord.setChangeIndicator(forecastChangeIndicator); 	  	  	
		}
  		
		
  		
  		 		
  		//设置能见度prevailingVisibility
  		if (map.get("prevailingVisibility")!=null) {
  			LengthType length=metar.createLengthType();
  	  		length.setValue(Double.parseDouble(map.get("prevailingVisibility")));
  	  		length.setUom("m");
  	  		meteorologicalAerodromeTrendForecastRecord.setPrevailingVisibility(length);
  	  		if (map.get("prevailingVisibility").equals("CAVOK")||map.get("prevailingVisibility").equals("9999")) {
  	  		    meteorologicalAerodromeTrendForecastRecord.setCloudAndVisibilityOK(true);
			} else {
				meteorologicalAerodromeTrendForecastRecord.setCloudAndVisibilityOK(false);
			}
  	  		
		}
  		
  		
  		
  		
  		//设置预测天气ForecastWeather
  		if (map.get("forecastWeather")!=null) {
  			AerodromeForecastWeatherType aerodromeForecastWeather=metar.createAerodromeForecastWeatherType();
  			if (map.get("forecastWeather").equals("NSW")) {
				aerodromeForecastWeather.setRemoteSchema("http://codes.wmo.int/common/nil/nothingOfOperationalSignificance");
			}else {
				aerodromeForecastWeather.setHref(map.get("forecastWeather"));
			} 	  		
  	  		meteorologicalAerodromeTrendForecastRecord.getForecastWeather().add(aerodromeForecastWeather);
		}
  		
  		
  		
  		
  		//设置地面风SurfaceWind
  		AerodromeSurfaceWindTrendForecastPropertyType aerodromeSurfaceWindTrendForecastProperty=metar.createAerodromeSurfaceWindTrendForecastPropertyType();
  		AerodromeSurfaceWindTrendForecastType aerodromeSurfaceWindTrendForecast=metar.createAerodromeSurfaceWindTrendForecastType();
  		AngleType angle=metar.createAngleType();
  		SpeedType speed=metar.createSpeedType();
  		SpeedType GustSpeed=metar.createSpeedType();
  		if (map.get("meanWindDirection")!=null) {
			angle.setValue(Double.parseDouble(map.get("meanWindDirection")));
			angle.setUom("deg");
			aerodromeSurfaceWindTrendForecast.setMeanWindDirection(angle);
		}		
		if (map.get("meanWindSpeed")!=null) {
			speed.setValue(Double.parseDouble(map.get("meanWindSpeed")));
			speed.setUom("m/s");
			aerodromeSurfaceWindTrendForecast.setMeanWindSpeed(speed);
		}		
		if (map.get("windGustSpeed")!=null) {	
			GustSpeed.setValue(Double.parseDouble(map.get("GustSpeed")));
			GustSpeed.setUom("m/s");
			aerodromeSurfaceWindTrendForecast.setWindGustSpeed(GustSpeed);
		}		
		if (speed.getUom()!=null||GustSpeed.getUom()!=null) {
			JAXBElement<AerodromeSurfaceWindTrendForecastType> cElement1=new JAXBElement(new QName("","iwxxm:surfaceWind"), aerodromeSurfaceWindTrendForecast.getClass(),aerodromeSurfaceWindTrendForecast); 
	  		aerodromeSurfaceWindTrendForecastProperty.setAerodromeSurfaceWindTrendForecast(cElement1);
	  		meteorologicalAerodromeTrendForecastRecord.setSurfaceWind(aerodromeSurfaceWindTrendForecastProperty);
		}
  		
  		
  		
  		
  		//设置云Cloud
		if (map.get("CloudLayer")!=null) {
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
		}
  		
  		
  		
  		
  		
  		
  	    //现象持续时间phenomenonTime
		TimeObjectPropertyType timeObjectProperty1=metar.createTimeObjectPropertyType();
		TimePeriodPropertyType timePeriodProperty=metar.createTimePeriodPropertyType();
		TimePeriodType timePeriod=metar.createTimePeriodType();
		TimePositionType timePosition1=metar.createTimePositionType();
		if (map.get("atTime")!=null) {
			timePosition1.getValue().add(map.get("atTime"));
			timePeriod.setBeginPosition(timePosition1);
		}else if (map.get("beginTime")!=null) {
			timePosition1.getValue().add(map.get("atTime"));
			timePeriod.setBeginPosition(timePosition1);
		}else {
			timePosition1.getValue().add(ObservationTime);
			timePeriod.setBeginPosition(timePosition1);			
		}
		TimePositionType timePosition2=metar.createTimePositionType();
		if (map.get("atTime")!=null) {
			timePosition2.getValue().add(map.get("atTime"));
			timePeriod.setEndPosition(timePosition2);
		}else if(map.get("endTime")!=null){
			timePosition2.getValue().add(map.get("endTime"));
			timePeriod.setEndPosition(timePosition2);
		}		
		timePeriodProperty.setTimePeriod(timePeriod);
		JAXBElement<TimePeriodType> cElement3=new JAXBElement(new QName("","gml:TimePeriod"), timePeriod.getClass(), timePeriod);
		timeObjectProperty1.setAbstractTimeObject(cElement3);
	
		
		
		
		//观测结果时间resultTime
		TimeInstantPropertyType timeInstantProperty=metar.createTimeInstantPropertyType();
		TimeInstantType timeInstant=metar.createTimeInstantType();
		TimePositionType timePosition=metar.createTimePositionType();
		String phenomenonTime=ObservationTime;
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		Date date=formatter.parse(phenomenonTime);
		Date ResultDate = new Date(date .getTime() + 600000);
		timePosition.getValue().add(formatter.format(ResultDate));
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
		TYPE.getTrendForecast().add(omObservationProperty);
  	
      	}
  		
  		
  		
  		
  		
  		

      	
		}
		
            
	}
	
	
	
	
	
	

}
