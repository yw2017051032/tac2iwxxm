package com.iwxxm.parsexml.taf;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.bind.JAXB;

import com.iwxxm.taf.AbstractFeatureType;
import com.iwxxm.taf.AerodromeAirTemperatureForecastPropertyType;
import com.iwxxm.taf.AerodromeCloudForecastPropertyType;
import com.iwxxm.taf.AerodromeForecastWeatherType;
import com.iwxxm.taf.AerodromeSurfaceWindForecastPropertyType;
import com.iwxxm.taf.MeteorologicalAerodromeForecastRecordType;
import com.iwxxm.taf.OMObservationPropertyType;
import com.iwxxm.taf.ObjectFactory;
import com.iwxxm.taf.TAFType;
import com.iwxxm.taf.TimeInstantPropertyType;
import com.iwxxm.taf.TimePeriodPropertyType;
import com.iwxxm.taf.AerodromeCloudForecastType.Layer;

public class BaseForecast {

	private String xml_location;

	public BaseForecast(String xml_location) {
	    // TODO Auto-generated constructor stub
		this.xml_location=xml_location;
		
	}
	
	public String getXml_location() {
		return xml_location;
	}
    
	
	public void setXml_location(String xml_location) {
		this.xml_location = xml_location;
	}
	
	public Map<String, String> getInformation() {
		
		Map<String, String> baseForecast=new HashMap<String, String>();
		try {

			File file = new File(this.getXml_location());
			ObjectFactory tafOb = new ObjectFactory();
		    TAFType TAF=tafOb.createTAFType();	 
			TAFType taf = (TAFType)JAXB.unmarshal(file, TAF.getClass());
			System.out.println(taf);
			
			
			//获取时间信息
			TimeInstantPropertyType timeInstantPropertyType=taf.getIssueTime();
			Iterator<String>iterable1=(Iterator<String>)timeInstantPropertyType.getTimeInstant().getTimePosition().getValue().iterator();
			while (iterable1.hasNext()) {
				String string = (String) iterable1.next();
				baseForecast.put("issueTime", string);
			}
			TimePeriodPropertyType  timePeriodPropertyType=taf.getValidTime();
			Iterator<String>iterable2=(Iterator<String>)timePeriodPropertyType.getTimePeriod().
					getBeginPosition().getValue().iterator();
			Iterator<String>iterable3=(Iterator<String>)timePeriodPropertyType.getTimePeriod().
					getEndPosition().getValue().iterator();
			while (iterable2.hasNext()) {
				String string = (String) iterable2.next();
				baseForecast.put("validBeginTime", string);
			}
			while (iterable3.hasNext()) {
				String string = (String) iterable3.next();
				baseForecast.put("validEndTime", string);
			}
			
			
			
			//获取机场四字代码信息
			AbstractFeatureType abstractFeatureType=taf.getBaseForecast().getOMObservation().getFeatureOfInterest().
					getAbstractFeature().getValue();
			String aerodrome=abstractFeatureType.getId();
			baseForecast.put("aerodrome", aerodrome);
			
			 
			 
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
				baseForecast.put("maximumAirTemperature", maximumAirTemperature.toString());
				}
				if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperatureTime()!=null) {
					java.util.List<String>	maximumAirTemperatureTime=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperatureTime().getTimeInstant().getTimePosition().getValue();
					baseForecast.put("maximumAirTemperatureTime", maximumAirTemperatureTime.toString());
					}
				if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperature()!=null) {
					Double	maximumAirTemperature=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperature().getValue();
					baseForecast.put("minimumAirTemperature", maximumAirTemperature.toString());
					}
				if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperatureTime()!=null) {
					java.util.List<String>	minimumAirTemperatureTime=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperatureTime().getTimeInstant().getTimePosition().getValue();
					baseForecast.put("minimumAirTemperatureTime", minimumAirTemperatureTime.toString());
					}			
			}
			 
			 
		   //获取地面风相关信息
		   AerodromeSurfaceWindForecastPropertyType aerodromeSurfaceWindForecastProperty=meteorologicalAerodromeForecastRecord.getSurfaceWind();
		   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindDirection()!=null) {
			   Double MeanWindDirection=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindDirection().getValue();
			   baseForecast.put("meanWindDirection", MeanWindDirection.toString());
		    }
		   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindSpeed()!=null) {
			  Double MeanWindSpeed=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindSpeed().getValue();
			  baseForecast.put("meanWindSpeed", MeanWindSpeed.toString());
		    }
		   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getWindGustSpeed()!=null) {
				  Double WindGustSpeed=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getWindGustSpeed().getValue();
				  baseForecast.put("windGustSpeed", WindGustSpeed.toString());
		   }
		   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().isVariableWindDirection()) {
			   baseForecast.put("variableWindDirection","true");
		   }else {
			baseForecast.put("variableWindDirection", "false");
		  }
		   
		   
		  //获取能见度AerodromeHorizontalVisibility相关信息 
		   if (meteorologicalAerodromeForecastRecord.getPrevailingVisibility()!=null) {
			   Double prevailingVisibility=meteorologicalAerodromeForecastRecord.getPrevailingVisibility().getValue();
			   baseForecast.put("prevailingVisibility", prevailingVisibility.toString());
		}
		   
		   
		 //获取属性CloudAndVisibilityOK值
		   if (meteorologicalAerodromeForecastRecord.isCloudAndVisibilityOK()) {
			baseForecast.put("CAVOK","true");
		} else {
	        baseForecast.put("CAVOK","false");
		}
		   
		   //获取预报天气现象AerodromeForecastWeather相关信息
		   java.util.List<AerodromeForecastWeatherType> aerodromeForecastWeather=meteorologicalAerodromeForecastRecord.getWeather();
		   String weather="";
		   if (aerodromeForecastWeather!=null) {
			   for (Iterator iterator = aerodromeForecastWeather.iterator(); iterator.hasNext();) {
					AerodromeForecastWeatherType aerodromeForecastWeatherType = (AerodromeForecastWeatherType) iterator.next();
					weather=weather+aerodromeForecastWeatherType.getHref()+" ";
					 baseForecast.put("weather",weather.trim());
				}
		}
		   
		   
		   
		 //获取云层现象AerodromeObservedClouds相关信息
		  AerodromeCloudForecastPropertyType aerodromeCloudForecastProperty=meteorologicalAerodromeForecastRecord.getCloud();
		  java.util.List<Layer>layer=aerodromeCloudForecastProperty.getAerodromeCloudForecast().getLayer();
		  String cloudlayer="";
		  for (Iterator iterator = layer.iterator(); iterator.hasNext();) {
			Layer layer2 = (Layer) iterator.next();
			cloudlayer=cloudlayer+layer2.getCloudLayer().getAmount().getHref()+" ";
			
		} 
		  baseForecast.put("CloudLayer", cloudlayer.trim()); 
	 
		  } catch (Exception e) {
			e.printStackTrace();
		  }
		
				
		return baseForecast;
		
		
	}
	
	
}
