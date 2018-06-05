package com.iwxxm.parsexml.metarSpeci;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBElement;

import com.iwxxm.metarSpeci.AerodromeCloudForecastType.Layer;
import com.iwxxm.metarSpeci.AerodromeObservedCloudsType;
import com.iwxxm.metarSpeci.AerodromePresentWeatherType;
import com.iwxxm.metarSpeci.AerodromeRunwayVisualRangePropertyType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationRecordType.Cloud;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportType;
import com.iwxxm.metarSpeci.ObjectFactory;
import com.iwxxm.metarSpeci.TimeInstantType;
import com.iwxxm.metarSpeci.TimeObjectPropertyType;

public class JAXBExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			File file = new File("E:\\test.xml");
			ObjectFactory metarob = new ObjectFactory();
			MeteorologicalAerodromeObservationReportType METAR=metarob.createMETARType();
			MeteorologicalAerodromeObservationReportType metar= (MeteorologicalAerodromeObservationReportType)JAXB.unmarshal(file, METAR.getClass());
			System.out.println(metar);
			Map<String, String> observation=new HashMap<String, String>();
		   	
			
		    //��ȡphenomenonTimeʱ����Ϣ
			TimeObjectPropertyType timeObjectProperty= metar.getObservation().getOMObservation().getPhenomenonTime();
			JAXBElement<TimeInstantType> element=(JAXBElement<TimeInstantType>) timeObjectProperty.getAbstractTimeObject();
			if (element!=null) {
				String phenomenonTime=element.getValue().getTimePosition().getValue().toString();
				observation.put("phenomenonTime", phenomenonTime);
			}
			
			
			
			//��ȡresultTimeʱ����Ϣ
			String resultTime=metar.getObservation().getOMObservation().getResultTime().getTimeInstant().getTimePosition().getValue().toString();
			observation.put("resultTime", resultTime);
			
			
			//��ȡ�������ִ�����Ϣ
			String aerodrome=metar.getObservation().getOMObservation().getFeatureOfInterest().getAbstractFeature().getValue().getId();
			observation.put("aerodrome", aerodrome);
			
			
			MeteorologicalAerodromeObservationRecordType result=(MeteorologicalAerodromeObservationRecordType)metar.getObservation().getOMObservation().getResult();
			if (result!=null) {
				
				//��ȡ�¶���Ϣ
				if (result.getAirTemperature()!=null) {
					Double  airTemperature=result.getAirTemperature().getValue();
					observation.put("airTemperature", airTemperature.toString());
				}
			
				
				
				//��ȡ¶����Ϣ
				if (result.getDewpointTemperature()!=null) {
					Double dewpointTemperature=result.getDewpointTemperature().getValue();
					observation.put("dewpointTemperature", dewpointTemperature.toString());
				}
				
				
				
				//��ȡ����ѹǿ
				if (result.getQnh()!=null) {
					Double qnh=result.getQnh().getValue();
					observation.put("qnh", qnh.toString());
				}
				
				
				
				//��ȡ�����AerodromeSurfaceWind
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
				
				
				//��ȡ�ܼ���AerodromeHorizontalVisibility
				if (result.getVisibility().getAerodromeHorizontalVisibility()!=null) {
							Double prevailingVisibility=result.getVisibility().getAerodromeHorizontalVisibility().getPrevailingVisibility().getValue();
							observation.put("prevailingVisibility",prevailingVisibility.toString());	
					}
				
				//��ȡCloudAndVisibilityOK
				if (result.isCloudAndVisibilityOK()) {
					observation.put("isCloudAndVisibilityOK", "true");
				}else {
					observation.put("isCloudAndVisibilityOK", "false");
				}
				
				
				//��ȡ�ܵ��ӳ�AerodromeRunwayVisualRange
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
				
				
				//��ȡ��������AerodromePresentWeather
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
				
				
				//��ȡ�Ʋ�����AerodromeObservedClouds
				Cloud cloud=result.getCloud().getValue();
				Iterator<com.iwxxm.metarSpeci.AerodromeObservedCloudsType.Layer> layers=cloud.getAerodromeObservedClouds().getLayer().iterator();
				String CloudLayers="";
				while (layers.hasNext()) {
					AerodromeObservedCloudsType.Layer layer = (AerodromeObservedCloudsType.Layer) layers.next();
					String CloudLayer=layer.getCloudLayer().getAmount().getHref();
					CloudLayers=CloudLayers+CloudLayer+" ";
				}
				if (!CloudLayers.equals("")) {
					observation.put("CloudLayer",CloudLayers.trim());
				}
				
				
				
				
			}
			
			
			
			System.out.println(observation);
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
