package com.iwxxm.parsexml.taf;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBElement;

import com.iwxxm.taf.AerodromeAirTemperatureForecastPropertyType;
import com.iwxxm.taf.AerodromeCloudForecastPropertyType;
import com.iwxxm.taf.AerodromeForecastWeatherType;
import com.iwxxm.taf.AerodromeSurfaceWindForecastPropertyType;
import com.iwxxm.taf.MeteorologicalAerodromeForecastRecordType;
import com.iwxxm.taf.OMObservationPropertyType;
import com.iwxxm.taf.ObjectFactory;
import com.iwxxm.taf.TAFType;
import com.iwxxm.taf.TimeInstantType;
import com.iwxxm.taf.AerodromeCloudForecastType.Layer;

public class ChangeForecast {

	private String xml_location;

	public ChangeForecast(String xml_location) {
	    // TODO Auto-generated constructor stub
		this.xml_location=xml_location;
		
	}
	
	public String getXml_location() {
		return xml_location;
	}
    
	
	public void setXml_location(String xml_location) {
		this.xml_location = xml_location;
	}
	
	public ArrayList<Map<String, String>> getInformation() {
		
		ArrayList<Map<String, String>> result=new ArrayList<Map<String, String>>();
		
		try {

				File file = new File(this.getXml_location());
				ObjectFactory tafOb = new ObjectFactory();
			    TAFType TAF=tafOb.createTAFType();	 
				TAFType taf = (TAFType)JAXB.unmarshal(file, TAF.getClass());
				System.out.println(taf);
				
						  
			      //��ȡChangeForecast���������Ϣ
			      java.util.List<OMObservationPropertyType>  changeForecast=taf.getChangeForecast();
		          for (Iterator iterator = changeForecast.iterator(); iterator.hasNext();) {
					OMObservationPropertyType omObservationProperty = (OMObservationPropertyType) iterator.next();
					MeteorologicalAerodromeForecastRecordType 	meteorologicalAerodromeForecastRecord= (MeteorologicalAerodromeForecastRecordType) omObservationProperty.getOMObservation().getResult();
					Map<String, String> ChangeForecast=new HashMap<String, String>();
					
					//��ȡchangeIndicator
					String changeIndicator=meteorologicalAerodromeForecastRecord.getChangeIndicator().value();
					ChangeForecast.put("changeIndicator", changeIndicator);
					
					//��ȡ�¶���Ϣ
					java.util.List<AerodromeAirTemperatureForecastPropertyType> temperature=meteorologicalAerodromeForecastRecord.getTemperature();
					for (Iterator iterator2 = temperature.iterator(); iterator2.hasNext();) {
						AerodromeAirTemperatureForecastPropertyType aerodromeAirTemperatureForecastPropertyType = (AerodromeAirTemperatureForecastPropertyType) iterator2
								.next();
						aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperature();
						if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperature()!=null) {
							Double	maximumAirTemperature=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperature().getValue();
							ChangeForecast.put("maximumAirTemperature", maximumAirTemperature.toString());
						}
						if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperatureTime()!=null) {
							java.util.List<String>	maximumAirTemperatureTime=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMaximumAirTemperatureTime().getTimeInstant().getTimePosition().getValue();
							ChangeForecast.put("maximumAirTemperatureTime", maximumAirTemperatureTime.toString());
							}
						if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperature()!=null) {
							Double	maximumAirTemperature=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperature().getValue();
							ChangeForecast.put("minimumAirTemperature", maximumAirTemperature.toString());
							}
						if (aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperatureTime()!=null) {
							java.util.List<String>	minimumAirTemperatureTime=aerodromeAirTemperatureForecastPropertyType.getAerodromeAirTemperatureForecast().getMinimumAirTemperatureTime().getTimeInstant().getTimePosition().getValue();
							ChangeForecast.put("minimumAirTemperatureTime", minimumAirTemperatureTime.toString());
							}								
					}
					
					//��ȡ�����AerodromeSurfaceWind�����Ϣ
					 AerodromeSurfaceWindForecastPropertyType aerodromeSurfaceWindForecastProperty=meteorologicalAerodromeForecastRecord.getSurfaceWind();
					 if (aerodromeSurfaceWindForecastProperty!=null) {
						 if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindDirection()!=null) {
							   Double MeanWindDirection=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindDirection().getValue();
							   ChangeForecast.put("meanWindDirection", MeanWindDirection.toString());
						    }
						   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindSpeed()!=null) {
							  Double MeanWindSpeed=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getMeanWindSpeed().getValue();
							  ChangeForecast.put("meanWindSpeed", MeanWindSpeed.toString());
						    }
						   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getWindGustSpeed()!=null) {
								  Double WindGustSpeed=aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().getWindGustSpeed().getValue();
								  ChangeForecast.put("windGustSpeed", WindGustSpeed.toString());
						   }
						   if (aerodromeSurfaceWindForecastProperty.getAerodromeSurfaceWindForecast().isVariableWindDirection()) {
							   ChangeForecast.put("variableWindDirection","true");
						   }else {
							   ChangeForecast.put("variableWindDirection", "false");
						  }
					}
					  
					 //��ȡ�ܼ���AerodromeHorizontalVisibility�����Ϣ 
					   if (meteorologicalAerodromeForecastRecord.getPrevailingVisibility()!=null) {
						   Double prevailingVisibility=meteorologicalAerodromeForecastRecord.getPrevailingVisibility().getValue();
						   ChangeForecast.put("prevailingVisibility", prevailingVisibility.toString());
					}
					   
					 //��ȡ����CloudAndVisibilityOKֵ
					   if (meteorologicalAerodromeForecastRecord.isCloudAndVisibilityOK()) {
						   ChangeForecast.put("CAVOK","true");
					} else {
						ChangeForecast.put("CAVOK","false");
					}
					   
					 //��ȡԤ����������AerodromeForecastWeather�����Ϣ
					   java.util.List<AerodromeForecastWeatherType> aerodromeForecastWeather=meteorologicalAerodromeForecastRecord.getWeather();
					   String weather="";
					   if (aerodromeForecastWeather!=null) {
						   for (Iterator iterator1 = aerodromeForecastWeather.iterator(); iterator1.hasNext();) {
								AerodromeForecastWeatherType aerodromeForecastWeatherType = (AerodromeForecastWeatherType) iterator1.next();
								weather=weather+aerodromeForecastWeatherType.getHref()+" ";
							}
							   ChangeForecast.put("weather",weather.trim());
					}
					   
					 //��ȡ�Ʋ�����AerodromeObservedClouds�����Ϣ
					  AerodromeCloudForecastPropertyType aerodromeCloudForecastProperty1=meteorologicalAerodromeForecastRecord.getCloud();
					  java.util.List<Layer>layer1=aerodromeCloudForecastProperty1.getAerodromeCloudForecast().getLayer();
					  String cloudlayer="";
					  for (Iterator iterator1 = layer1.iterator(); iterator1.hasNext();) {
						Layer layer2 = (Layer) iterator1.next();
						cloudlayer=cloudlayer+layer2.getCloudLayer().getAmount().getHref()+" ";
						
					} 
					  ChangeForecast.put("CloudLayer", cloudlayer.trim());  
					  //��ȡissueTime
					  Object object=omObservationProperty.getOMObservation().getPhenomenonTime().getAbstractTimeObject();
					  if ( object instanceof JAXBElement<?>) {
						  JAXBElement<TimeInstantType> element= (JAXBElement<TimeInstantType>) object;
						  String issueTime=element.getValue().getTimePosition().getValue().toString();
						  ChangeForecast.put("issueTime",issueTime);
					}
					 //��ý��ʱ��resultTime
					 if (omObservationProperty.getOMObservation().getResultTime()!=null) {
						 String resultTime=omObservationProperty.getOMObservation().getResultTime().getTimeInstant().getTimePosition().getValue().toString();
						 ChangeForecast.put("resultTime", resultTime);
					}
					 //�����Чʱ���validTime
					 if (omObservationProperty.getOMObservation().getValidTime()!=null) {
						String validBeginTime=omObservationProperty.getOMObservation().getValidTime().getTimePeriod().getBeginPosition().getValue().toString();
						ChangeForecast.put("validBeginTime", validBeginTime);
						String validEndTime=omObservationProperty.getOMObservation().getValidTime().getTimePeriod().getEndPosition().getValue().toString();
						ChangeForecast.put("validEndTime", validEndTime);	
					}
					
					
					
					
					  result.add(ChangeForecast);
					
					
					
					
					
					
					
				}	   
			  
			  
			  
			  
			  
				 
			  } catch (Exception e) {
				e.printStackTrace();
			  }
		
		
		return result;
	}
	
}
