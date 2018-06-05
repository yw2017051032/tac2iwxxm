package com.iwxxm.parsexml.metarSpeci;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.iwxxm.metarSpeci.AerodromeCloudForecastPropertyType;
import com.iwxxm.metarSpeci.AerodromeCloudForecastType.Layer;
import com.iwxxm.metarSpeci.AerodromeForecastWeatherType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindForecastPropertyType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindTrendForecastPropertyType;
import com.iwxxm.metarSpeci.AerodromeSurfaceWindTrendForecastType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeTrendForecastRecordType;
import com.iwxxm.metarSpeci.OMObservationPropertyType;
import com.iwxxm.metarSpeci.ObjectFactory;
import com.iwxxm.metarSpeci.TimeInstantType;
import com.iwxxm.metarSpeci.TimePeriodType;

public class JAXBExample2 {
	public static void main(String[] args) {

	 try {

		File file = new File("E:\\test.xml");
		ObjectFactory metarob = new ObjectFactory();
		MeteorologicalAerodromeObservationReportType METAR=metarob.createMETARType();
		MeteorologicalAerodromeObservationReportType metar= (MeteorologicalAerodromeObservationReportType)JAXB.unmarshal(file, METAR.getClass());
		System.out.println(metar);
		
		ArrayList<Map<String, String>> result=new ArrayList<Map<String, String>>();
		
		
		
		
		
		
		 
	  

	  
	       //获取ChangeForecast部分相关信息
	      java.util.List<OMObservationPropertyType>  trendForecast=metar.getTrendForecast();
          for (Iterator iterator = trendForecast.iterator(); iterator.hasNext();) {
			OMObservationPropertyType omObservationProperty = (OMObservationPropertyType) iterator.next();
			MeteorologicalAerodromeTrendForecastRecordType 	meteorologicalAerodromeTrendForecastRecord= (MeteorologicalAerodromeTrendForecastRecordType) omObservationProperty.getOMObservation().getResult();
			Map<String, String> TrendForecast=new HashMap<String, String>();
			
			//获取changeIndicator
			String changeIndicator=meteorologicalAerodromeTrendForecastRecord.getChangeIndicator().name();
			TrendForecast.put("changeIndicator", changeIndicator);
			
			
			
			//获取地面风AerodromeSurfaceWind相关信息
			 AerodromeSurfaceWindTrendForecastPropertyType aerodromeSurfaceWindForecastProperty=meteorologicalAerodromeTrendForecastRecord.getSurfaceWind();
			 if ( aerodromeSurfaceWindForecastProperty!=null) {
				 if ( aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindTrendForecast().getValue().getMeanWindSpeed()!=null) {
					 
					  Double meanWindDirection=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindTrendForecast().getValue().getMeanWindSpeed().getValue(); 
					   
					   TrendForecast.put("meanWindDirection", meanWindDirection.toString());
				    }
				   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindTrendForecast().getValue().getMeanWindSpeed()!=null) {
					  Double MeanWindSpeed=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindTrendForecast().getValue().getMeanWindSpeed().getValue();
					  TrendForecast.put("meanWindSpeed", MeanWindSpeed.toString());
				    }
				   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindTrendForecast().getValue().getWindGustSpeed()!=null) {
						  Double WindGustSpeed=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindTrendForecast().getValue().getWindGustSpeed().getValue();
						  TrendForecast.put("windGustSpeed", WindGustSpeed.toString());
				   }
			}
			   
			   
			 //获取能见度AerodromeHorizontalVisibility相关信息 
			   if (meteorologicalAerodromeTrendForecastRecord.getPrevailingVisibility()!=null) {
				   Double prevailingVisibility=meteorologicalAerodromeTrendForecastRecord.getPrevailingVisibility().getValue();
				   TrendForecast.put("prevailingVisibility", prevailingVisibility.toString());
			}
			 //获取属性CloudAndVisibilityOK值
			   if (meteorologicalAerodromeTrendForecastRecord.isCloudAndVisibilityOK()) {
				   TrendForecast.put("CAVOK","true");
			} else {
				TrendForecast.put("CAVOK","false");
			}
			 //获取预报天气现象AerodromeForecastWeather相关信息
			   java.util.List<AerodromeForecastWeatherType> aerodromeForecastWeather=meteorologicalAerodromeTrendForecastRecord.getForecastWeather();
			   String weather="";
			   for (Iterator iterator1 = aerodromeForecastWeather.iterator(); iterator1.hasNext();) {
				AerodromeForecastWeatherType aerodromeForecastWeatherType = (AerodromeForecastWeatherType) iterator1.next();
				weather=weather+aerodromeForecastWeatherType.getHref()+" ";
			}
			   TrendForecast.put("forecastWeather",weather);
			 //获取云层现象AerodromeObservedClouds相关信息
			  JAXBElement<AerodromeCloudForecastPropertyType> aerodromeCloudForecastProperty1=meteorologicalAerodromeTrendForecastRecord.getCloud();
			  if (aerodromeCloudForecastProperty1!=null) {
				  java.util.List<Layer>layer1=aerodromeCloudForecastProperty1.getValue().getAerodromeCloudForecast().getLayer();
				  String cloudlayer="";
				  for (Iterator iterator1 = layer1.iterator(); iterator1.hasNext();) {
					Layer layer2 = (Layer) iterator1.next();
					cloudlayer=cloudlayer+layer2.getCloudLayer().getAmount().getHref()+" ";
					
				} 
				  TrendForecast.put("CloudLayer", cloudlayer);
			}
			   
			  
			 //获得结果时间resultTime
			 if (omObservationProperty.getOMObservation().getResultTime()!=null) {
				 String resultTime=omObservationProperty.getOMObservation().getResultTime().getTimeInstant().getTimePosition().getValue().toString();
				 TrendForecast.put("resultTime", resultTime);
			}
			 //获得有效时间段validTime
			 if (omObservationProperty.getOMObservation().getValidTime()!=null) {
				String validBeginTime=omObservationProperty.getOMObservation().getValidTime().getTimePeriod().getBeginPosition().getValue().toString();
				TrendForecast.put("validBeginTime", validBeginTime);
				String validEndTime=omObservationProperty.getOMObservation().getValidTime().getTimePeriod().getEndPosition().getValue().toString();
				TrendForecast.put("validEndTime", validEndTime);	
			}
			 
			 JAXBElement<TimePeriodType> element=(JAXBElement<TimePeriodType>)omObservationProperty.getOMObservation().getPhenomenonTime().getAbstractTimeObject();
			if (element!=null) {
				String BeginTime=element.getValue().getBeginPosition().getValue().toString();
				TrendForecast.put("beginTime", BeginTime);
				String EndTime=element.getValue().getEndPosition().getValue().toString();
				TrendForecast.put("endTime", EndTime);
				
			}
			
			
			  System.out.println(TrendForecast);
			
			  result.add(TrendForecast);
			
			
			
			
			
			
			
		}	   
	  
	  
	   System.out.println(result);
	  
	  
	  
	  
		 
	  } catch (Exception e) {
		e.printStackTrace();
	  }

	}
}
