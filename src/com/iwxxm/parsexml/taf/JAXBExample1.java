package com.iwxxm.parsexml.taf;


import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.bind.JAXB;
import com.iwxxm.taf.AbstractFeatureType;
import com.iwxxm.taf.AerodromeAirTemperatureForecastPropertyType;
import com.iwxxm.taf.AerodromeCloudForecastPropertyType;
import com.iwxxm.taf.AerodromeCloudForecastType.Layer;
import com.iwxxm.taf.AerodromeForecastWeatherType;
import com.iwxxm.taf.AerodromeSurfaceWindForecastPropertyType;
import com.iwxxm.taf.AirportHeliportType;
import com.iwxxm.taf.MeteorologicalAerodromeForecastRecordType;
import com.iwxxm.taf.OMObservationPropertyType;
import com.iwxxm.taf.ObjectFactory;
import com.iwxxm.taf.TAFType;
import com.iwxxm.taf.TimeInstantPropertyType;
import com.iwxxm.taf.TimeInstantType;
import com.iwxxm.taf.TimePeriodPropertyType;
import com.iwxxm.taf.TimePositionType;

public class JAXBExample1 {
	public static void main(String[] args) {

	 try {

		File file = new File("E:\\test.xml");
		ObjectFactory tafOb = new ObjectFactory();
	    TAFType TAF=tafOb.createTAFType();	 
		TAFType taf = (TAFType)JAXB.unmarshal(file, TAF.getClass());
		System.out.println(taf);
		Map<String, String> BaseForecast=new HashMap<String, String>();
		
		
		//获取时间信息
		TimeInstantPropertyType timeInstantPropertyType=taf.getIssueTime();
		Iterator<String>iterable1=(Iterator<String>)timeInstantPropertyType.getTimeInstant().getTimePosition().getValue().iterator();
		while (iterable1.hasNext()) {
			String string = (String) iterable1.next();
			System.out.println(string);
			BaseForecast.put("issueTime", string);
		}
		TimePeriodPropertyType  timePeriodPropertyType=taf.getValidTime();
		Iterator<String>iterable2=(Iterator<String>)timePeriodPropertyType.getTimePeriod().
				getBeginPosition().getValue().iterator();
		Iterator<String>iterable3=(Iterator<String>)timePeriodPropertyType.getTimePeriod().
				getEndPosition().getValue().iterator();
		while (iterable2.hasNext()) {
			String string = (String) iterable2.next();
			System.out.println(string);
			BaseForecast.put("validBeginTime", string);
		}
		while (iterable3.hasNext()) {
			String string = (String) iterable3.next();
			System.out.println(string);
			BaseForecast.put("validEndTime", string);
		}
		
		
		
		//获取机场四字代码信息
		AbstractFeatureType abstractFeatureType=taf.getBaseForecast().getOMObservation().getFeatureOfInterest().
				getAbstractFeature().getValue();
		String aerodrome=abstractFeatureType.getId();
		BaseForecast.put("aerodrome", aerodrome);
		
		 
		 
		 //获取BaseForecast部分相关信息
		 OMObservationPropertyType omObservationPropertyType=taf.getBaseForecast();
		 MeteorologicalAerodromeForecastRecordType 	meteorologicalAerodromeForecastRecord= (MeteorologicalAerodromeForecastRecordType) omObservationPropertyType.getOMObservation().getResult();
		 //获取气温相关信息
		 Iterator<AerodromeAirTemperatureForecastPropertyType>iterable4=(Iterator<AerodromeAirTemperatureForecastPropertyType>)meteorologicalAerodromeForecastRecord.getTemperature().iterator();
		 while (iterable4.hasNext()) {
			AerodromeAirTemperatureForecastPropertyType aerodromeAirTemperatureForecastPropertyType = (AerodromeAirTemperatureForecastPropertyType) iterable4
					.next();
			if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperature()!=null) {
			Double	maximumAirTemperature=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperature().getValue();
			BaseForecast.put("maximumAirTemperature", maximumAirTemperature.toString());
			}
			if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperatureTime()!=null) {
				java.util.List<String>	maximumAirTemperatureTime=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperatureTime().getTimeInstant().getTimePosition().getValue();
				BaseForecast.put("maximumAirTemperatureTime", maximumAirTemperatureTime.toString());
				}
			if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperature()!=null) {
				Double	maximumAirTemperature=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperature().getValue();
				BaseForecast.put("minimumAirTemperature", maximumAirTemperature.toString());
				}
			if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperatureTime()!=null) {
				java.util.List<String>	minimumAirTemperatureTime=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperatureTime().getTimeInstant().getTimePosition().getValue();
				BaseForecast.put("minimumAirTemperatureTime", minimumAirTemperatureTime.toString());
				}			
		}	
	   //获取地面风相关信息
	   AerodromeSurfaceWindForecastPropertyType aerodromeSurfaceWindForecastProperty=meteorologicalAerodromeForecastRecord.getSurfaceWind();
	   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindDirection()!=null) {
		   Double MeanWindDirection=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindDirection().getValue();
		   System.out.println(MeanWindDirection);
		   BaseForecast.put("meanWindDirection", MeanWindDirection.toString());
	    }
	   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindSpeed()!=null) {
		  Double MeanWindSpeed=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindSpeed().getValue();
		  System.out.println(MeanWindSpeed);
		  BaseForecast.put("meanWindSpeed", MeanWindSpeed.toString());
	    }
	   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getWindGustSpeed()!=null) {
			  Double WindGustSpeed=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getWindGustSpeed().getValue();
			  System.out.println(WindGustSpeed);
			  BaseForecast.put("windGustSpeed", WindGustSpeed.toString());
	   }
	   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().isVariableWindDirection()) {
		   BaseForecast.put("variableWindDirection","True");
	   }else {
		BaseForecast.put("variableWindDirection", "False");
	  }
	  //获取能见度AerodromeHorizontalVisibility相关信息 
	   if (meteorologicalAerodromeForecastRecord.getPrevailingVisibility()!=null) {
		   Double prevailingVisibility=meteorologicalAerodromeForecastRecord.getPrevailingVisibility().getValue();
		   System.out.println(prevailingVisibility);
		   BaseForecast.put("prevailingVisibility", prevailingVisibility.toString());
	}
	 //获取属性CloudAndVisibilityOK值
	   if (meteorologicalAerodromeForecastRecord.isCloudAndVisibilityOK()) {
		BaseForecast.put("CAVOK","true");
	} else {
        BaseForecast.put("CAVOK","false");
	}
	   //获取预报天气现象AerodromeForecastWeather相关信息
	   java.util.List<AerodromeForecastWeatherType> aerodromeForecastWeather=meteorologicalAerodromeForecastRecord.getWeather();
	   String weather="";
	   for (Iterator iterator = aerodromeForecastWeather.iterator(); iterator.hasNext();) {
		AerodromeForecastWeatherType aerodromeForecastWeatherType = (AerodromeForecastWeatherType) iterator.next();
		weather=weather+aerodromeForecastWeatherType.getHref()+" ";
		System.out.println(weather);
		 BaseForecast.put("weather",weather);
	}
	 //获取云层现象AerodromeObservedClouds相关信息
	  AerodromeCloudForecastPropertyType aerodromeCloudForecastProperty=meteorologicalAerodromeForecastRecord.getCloud();
	  java.util.List<Layer>layer=aerodromeCloudForecastProperty.getAerodromeCloudForecast().getLayer();
	  String cloudlayer="";
	  for (Iterator iterator = layer.iterator(); iterator.hasNext();) {
		Layer layer2 = (Layer) iterator.next();
		cloudlayer=cloudlayer+layer2.getCloudLayer().getAmount().getHref()+" ";
		
	} 
	  System.out.println(cloudlayer);
	  BaseForecast.put("CloudLayer", cloudlayer); 
	  System.out.println(BaseForecast);
	  

	  
	
			
			
			
			
			
			
			
			
			
			
			   
	  
	  
	  
	  
	  
	  
	  
		 
	  } catch (Exception e) {
		e.printStackTrace();
	  }

	}
}
