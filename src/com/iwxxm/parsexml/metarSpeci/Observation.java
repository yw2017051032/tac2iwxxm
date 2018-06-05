package com.iwxxm.parsexml.metarSpeci;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBElement;

import com.iwxxm.generateXml.metarSpeci.Generate_observationPart_xml;
import com.iwxxm.metarSpeci.AerodromeObservedCloudsType;
import com.iwxxm.metarSpeci.AerodromePresentWeatherType;
import com.iwxxm.metarSpeci.AerodromeRunwayVisualRangePropertyType;
import com.iwxxm.metarSpeci.AerodromeWindShearPropertyType;
import com.iwxxm.metarSpeci.AerodromeWindShearType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportType;
import com.iwxxm.metarSpeci.ObjectFactory;
import com.iwxxm.metarSpeci.TimeInstantType;
import com.iwxxm.metarSpeci.TimeObjectPropertyType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType.Cloud;

public class Observation {
	private String xml_location;

	public Observation(String xml_location) {
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
		
		Map<String, String> observation=new HashMap<String, String>();
		try {
			
			File file = new File(this.getXml_location());
			ObjectFactory metarob = new ObjectFactory();
			MeteorologicalAerodromeObservationReportType METAR=metarob.createMETARType();
			MeteorologicalAerodromeObservationReportType metar= (MeteorologicalAerodromeObservationReportType)JAXB.unmarshal(file, METAR.getClass());
			System.out.println(metar);
			
		   	
			
		    //获取phenomenonTime时间信息
			TimeObjectPropertyType timeObjectProperty= metar.getObservation().getOMObservation().getPhenomenonTime();
			JAXBElement<TimeInstantType> element=(JAXBElement<TimeInstantType>) timeObjectProperty.getAbstractTimeObject();
			if (element!=null) {
				String phenomenonTime=element.getValue().getTimePosition().getValue().toString();
				observation.put("phenomenonTime", phenomenonTime);
			}
			
			
			
			//获取resultTime时间信息
			String resultTime=metar.getObservation().getOMObservation().getResultTime().getTimeInstant().getTimePosition().getValue().toString();
			observation.put("resultTime", resultTime);
			
			
			//获取机场四字代码信息
			String aerodrome=metar.getObservation().getOMObservation().getFeatureOfInterest().getAbstractFeature().getValue().getId();
			observation.put("aerodrome", aerodrome);
			
			
			MeteorologicalAerodromeObservationRecordType result=(MeteorologicalAerodromeObservationRecordType)metar.getObservation().getOMObservation().getResult();
			if (result!=null) {
				
				//获取温度信息
				if (result.getAirTemperature()!=null) {
					Double  airTemperature=result.getAirTemperature().getValue();
					observation.put("airTemperature", airTemperature.toString());
				}
			
				
				
				//获取露点信息
				if (result.getDewpointTemperature()!=null) {
					Double dewpointTemperature=result.getDewpointTemperature().getValue();
					observation.put("dewpointTemperature", dewpointTemperature.toString());
				}
				
				
				
				//获取大气压强
				if (result.getQnh()!=null) {
					Double qnh=result.getQnh().getValue();
					observation.put("qnh", qnh.toString());
				}
				
				
				
				//获取地面风AerodromeSurfaceWind
				if (result.getSurfaceWind().getAerodromeSurfaceWind().getMeanWindSpeed()!=null) {
					Double meanWindDirection=result.getSurfaceWind().getAerodromeSurfaceWind().getMeanWindSpeed().getValue();
					observation.put("meanWindSpeed", meanWindDirection.toString());	
				}
				if (result.getSurfaceWind().getAerodromeSurfaceWind().getMeanWindDirection()!=null) {
					Double meanWindDirection=result.getSurfaceWind().getAerodromeSurfaceWind().getMeanWindDirection().getValue();
					observation.put("meanWindDirection", meanWindDirection.toString());	
				}
				if (result.getSurfaceWind().getAerodromeSurfaceWind().getWindGustSpeed()!=null) {
					Double windGustSpeed=result.getSurfaceWind().getAerodromeSurfaceWind().getWindGustSpeed().getValue();
					observation.put("windGustSpeed", windGustSpeed.toString());
				}
				if (result.getSurfaceWind().getAerodromeSurfaceWind().isVariableWindDirection()) {
					observation.put("variableWindDirection","True");
				}else {
					observation.put("variableWindDirection","False");
				}
				
				
				//获取能见度AerodromeHorizontalVisibility
				if (result.getVisibility().getAerodromeHorizontalVisibility()!=null) {
							Double prevailingVisibility=result.getVisibility().getAerodromeHorizontalVisibility().getPrevailingVisibility().getValue();
							observation.put("prevailingVisibility",prevailingVisibility.toString());	
					}
				
				//获取CloudAndVisibilityOK
				if (result.isCloudAndVisibilityOK()) {
					observation.put("isCloudAndVisibilityOK", "true");
				}else {
					observation.put("isCloudAndVisibilityOK", "false");
				}
				
				
				//获取跑道视程AerodromeRunwayVisualRange
				Iterator<AerodromeRunwayVisualRangePropertyType> rvrs=result.getRvr().iterator();
               	String meanRVRs="";
				while (rvrs.hasNext()) {
					AerodromeRunwayVisualRangePropertyType aerodromeRunwayVisualRangePropertyType = (AerodromeRunwayVisualRangePropertyType) rvrs
							.next();
					Double meanRVR=aerodromeRunwayVisualRangePropertyType.getAerodromeRunwayVisualRange().getMeanRVR().getValue();
					meanRVRs=meanRVRs+meanRVR+" ";    		
				}
				if (!meanRVRs.equals("")) {
					observation.put("meanRVR", meanRVRs.trim());
				}
				
				
				//获取天气现象AerodromePresentWeather
				Iterator<AerodromePresentWeatherType> Presentweathers=result.getPresentWeather().iterator();
				String presentWeathers="";
				while (Presentweathers.hasNext()) {
					AerodromePresentWeatherType aerodromePresentWeatherType = (AerodromePresentWeatherType) Presentweathers
							.next();
					 int length=aerodromePresentWeatherType.getHref().length();
					 presentWeathers=presentWeathers+aerodromePresentWeatherType.getHref().substring(length-2, length)+" ";
					
				}
				if (!presentWeathers.equals("")) {
					observation.put("presentWeather", presentWeathers.trim());
				}
				
				
				//获取云层现象AerodromeObservedClouds
				Cloud cloud=result.getCloud().getValue();
				Iterator<com.iwxxm.metarSpeci.AerodromeObservedCloudsType.Layer> layers=cloud.getAerodromeObservedClouds().getLayer().iterator();
				String CloudLayers="";
				if (cloud!=null) {
					while (layers.hasNext()) {
						AerodromeObservedCloudsType.Layer layer = (AerodromeObservedCloudsType.Layer) layers.next();
						String CloudLayer=layer.getCloudLayer().getAmount().getHref();
						CloudLayers=CloudLayers+CloudLayer+" ";
					}
					if (!CloudLayers.equals("")) {
						observation.put("CloudLayer",CloudLayers.trim());
					}
				}
				
				
				//获取风切变WindShear
			AerodromeWindShearPropertyType aerodromeWindShearProperty=result.getWindShear();
			if (aerodromeWindShearProperty!=null) {
				if (aerodromeWindShearProperty.getAerodromeWindShear().isAllRunways()) {
					observation.put("allRunways", "true");
				}else {
					observation.put("allRunways", "false");
				}
				if (aerodromeWindShearProperty.getAerodromeWindShear().getRunway().size()>0) {
					observation.put("runway", aerodromeWindShearProperty.getAerodromeWindShear().getRunway().toString());
				}
				
			}
			
				
				
				
				
				
			}
			
			
			
//			System.out.println(observation);
			
			
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
      return observation;
	
	
	}	

}
