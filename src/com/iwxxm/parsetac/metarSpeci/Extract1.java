package com.iwxxm.parsetac.metarSpeci;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Extract1 {
	String [] content;
	int length;
	
	
	public  Extract1(String [] content) {
		this.content=content;
		this.length=content.length;		
	}
	
	
	public Map<String, String> parse_observation() {
		Map<String, String> map=new HashMap<String, String>();
		
		    String featureType= null;
			if (!content[0].equals(" ")) {
			featureType=content[0].trim();
			map.put("featureType", featureType);
			}
			
			
			
			
			String aerodrome= null;
			if (!content[1].equals(" ")) {
			aerodrome=content[1].trim();
			map.put("aerodrome", aerodrome);
			}
			

			
			
			String  time= null;
			if (!content[2].equals(" ")) {
				Calendar    rightNow    =    Calendar.getInstance();     
		        Integer year = rightNow.get(Calendar.YEAR);   
		        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
		        content[2]=content[2].trim();
				String  day=content[2].substring(0,2);
				String  hours=content[2].substring(2,4);
				String  minutes=content[2].substring(4,6);
				//2012-08-22T16:30:00Z
				time=year+"-"+month+"-"+day+"T"+hours+":"+minutes+":00Z";
				map.put("time", time);	
			}
			
			
			
			
			
			String meanWindDirection= null;
			String meanWindSpeed= null;
			String windGustSpeed=null;
			String wind_uom=null;
			String extension=null;
			Boolean variableWindDirection=null;
			if (!content[3].equals(" ")) {
				String [] temp=content[3].split(" ");
				for (int i = 0; i < temp.length; i++) {
					if (Pattern.matches("^\\d\\d\\d\\d\\dMPS$", temp[i])) {
						variableWindDirection=false;
						meanWindDirection=temp[i].substring(0, 3);
						meanWindSpeed=temp[i].substring(3, 5);
						wind_uom=temp[i].substring(5);
						map.put("variableWindDirection", variableWindDirection.toString());
						map.put("meanWindDirection", meanWindDirection);
						map.put("meanWindSpeed", meanWindSpeed);
						map.put("wind_uom", wind_uom);
					} else if (Pattern.matches("^\\d\\d\\d\\d\\dG\\d\\dMPS$", temp[i])) {
						variableWindDirection=false;
						meanWindDirection=temp[i].substring(0, 3);
						meanWindSpeed=temp[i].substring(3, 5);
						windGustSpeed=temp[i].substring(6,8);
						wind_uom=temp[i].substring(8);
						map.put("variableWindDirection", variableWindDirection.toString());
						map.put("meanWindDirection", meanWindDirection);
						map.put("meanWindSpeed", meanWindSpeed);
						map.put("windGustSpeed",windGustSpeed);
						map.put("wind_uom", wind_uom);
					}else if (Pattern.matches("^\\d*V\\d*$", temp[i])){
						variableWindDirection=true;
						extension=temp[i];
						map.put("variableWindDirection", variableWindDirection.toString());
						map.put("extension", extension);
					}					
				}				
			}
			
			
			
			
			
			String prevailingVisibility= null;
			String uom="m";
			if (!content[4].equals(" ")) {
				prevailingVisibility=content[4];
				map.put("prevailingVisibility", prevailingVisibility);
				map.put("uom", uom);
			}
			
			
			
			
			
			
			String meanRVR= null;
			String designator= null;
			String pastTendency= null;
			if (!content[5].equals(" ")) {
				designator=content[5].substring(1,3);
				meanRVR=content[5].substring(5, 8);
				pastTendency=content[5].substring(8).trim();
				map.put("designator", designator);
				map.put("meanRVR", meanRVR);
				map.put("pastTendency", pastTendency);
			}
			
			
			
	        
			String	presentWeather =null;
			if (!content[6].equals(" ")) {
				presentWeather=content[6];
				map.put("presentWeather", presentWeather.trim());
			}
			
			
			
					
			
			String	CloudLayer =null;
			if (!content[7].equals(" ")) {
				CloudLayer=content[7];
				map.put("CloudLayer", CloudLayer.trim());
			}
			
			
			
			
			
			String airTemperature= null;
			String dewpointTemperature= null;
			if (!content[8].equals(" ")) {
				airTemperature=content[8].substring(0,content[8].indexOf("/")).trim();
				dewpointTemperature=content[8].substring(content[8].indexOf("/")+1).trim();
				 map.put("airTemperature", airTemperature);
		         map.put("dewpointTemperature", dewpointTemperature);
			}
           
			
			
			
            
			String qnh=null;
			if (!content[9].equals(" ")) {
				qnh=content[9].substring(1);
				map.put("qnh", qnh);
			}
			
			
			
			
			
			
			String recentWeather=null;
			if (!content[10].equals(" ")) {
				recentWeather=content[10];
				map.put("recentWeather", recentWeather);
			}
			
			
			
			
			
			Boolean allRunways=false;
			String runway=null;
			if (!content[11].equals(" ")) {
				if (content[11].contains("ALL RWY")) {
					allRunways=true;
				}else {
					runway=content[11].substring(content[11].indexOf("Y")+1);
				}
				map.put("allRunways", allRunways.toString());
				map.put("runway", runway);	
			}
			
			
			
			
			
			
			return map;
			
			
			
					
	}
	

	public void parse_trend_forcast() {
		   if (content[12].equals(" ")||content[12].equals("NOSIG=")) {
			   
			   return;
			
		}
		
	} 
	
	
	public String map2json(Map<String, String> map) {
		
		JsonObject observation=new JsonObject();
		
		observation.addProperty("featureType", map.get("featureType"));

		observation.addProperty("aerodrome", map.get("aerodrome"));
		
		observation.addProperty("time", map.get("time"));
		
		
		
		
		//JsonObject AerodromeSurfaceWind=new JsonObject();		
		JsonObject AerodromeSurfaceWind=new JsonObject();
		if (map.get("variableWindDirection")!=null) {
			AerodromeSurfaceWind.addProperty("variableWindDirection", map.get("variableWindDirection"));
		}
		if (map.get("meanWindDirection")!=null) {
			AerodromeSurfaceWind.addProperty("meanWindDirection", map.get("meanWindDirection"));
		}
		if (map.get("meanWindSpeed")!=null) {
			AerodromeSurfaceWind.addProperty("meanWindSpeed", map.get("meanWindSpeed"));
		}
		if (map.get("windGustSpeed")!=null) {
			AerodromeSurfaceWind.addProperty("windGustSpeed", map.get("windGustSpeed"));
		}
		if (map.get("extension")!=null) {
			AerodromeSurfaceWind.addProperty("extension", map.get("extension"));
		}
		if (map.get("wind_uom")!=null) {
			AerodromeSurfaceWind.addProperty("wind_uom", map.get("wind_uom"));
		}
		if (AerodromeSurfaceWind.has("variableWindDirection")) {
			observation.add("AerodromeSurfaceWindTrendForecast", AerodromeSurfaceWind);
		}
		
		
		
		
		
		JsonObject AerodromeHorizontalVisibility=new JsonObject();
		if (map.get("prevailingVisibility")!=null) {
			AerodromeHorizontalVisibility.addProperty("prevailingVisibility", map.get("prevailingVisibility"));
			AerodromeHorizontalVisibility.addProperty("uom", "m");
		}
		if (AerodromeHorizontalVisibility.has("prevailingVisibility")) {
			observation.add("AerodromeHorizontalVisibility", AerodromeHorizontalVisibility);
		}
		

		
//		map.put("meanRVR", meanRVR);
//		map.put("designator", designator);
//		map.put("pastTendency", pastTendency);		
		JsonObject AerodromeRunwayVisualRange=new JsonObject();
		if (map.get("meanRVR")!=null) {
			AerodromeRunwayVisualRange.addProperty("meanRVR", map.get("meanRVR"));		
		}
		if (map.get("designator")!=null) {
			AerodromeRunwayVisualRange.addProperty("designator", map.get("designator"));
		}
		if (map.get("pastTendency")!=null) {
			AerodromeRunwayVisualRange.addProperty("pastTendency",map.get("pastTendency"));
		}
		if (AerodromeRunwayVisualRange.has("meanRVR")||AerodromeRunwayVisualRange.has("designator")||AerodromeRunwayVisualRange.has("pastTendency")) {
			observation.add("AerodromeRunwayVisualRange", AerodromeRunwayVisualRange);
		}
		


		
     	//String	presentWeather = null;
		JsonArray array1=new JsonArray();			
		if (map.get("presentWeather")!=null) {
			String [] temp=map.get("presentWeather").split(" ");
			for (int i = 0; i < temp.length; i++) {
				JsonObject AerodromePresentWeather=new JsonObject();	
				String string = temp[i];
				AerodromePresentWeather.addProperty("presentWeather", string);
				array1.add(AerodromePresentWeather);
			}
			observation.add("AerodromePresentWeather", array1);
		}

		
		

		
		//String	CloudLayer = null;
		JsonArray array2=new JsonArray();		
		if (!map.get("CloudLayer").equals("")) {
			String [] temp=map.get("CloudLayer").split(" ");
			for (int i = 0; i < temp.length; i++) {
				JsonObject AerodromeObservedClouds=new JsonObject();
				String string = temp[i];
				AerodromeObservedClouds.addProperty("CloudLayer", string);
				array2.add(AerodromeObservedClouds);
			}
			observation.add("AerodromeObservedClouds",array2);
		}
		
		
		
		

		
//		String airTemperature= null;
//		String dewpointTemperature= null;
//		String qnh=null;
		if (map.get("airTemperature")!=null) {
			observation.addProperty("airTemperature", map.get("airTemperature"));
		}
		if (map.get("dewpointTemperature")!=null) {
			observation.addProperty("dewpointTemperature",map.get("dewpointTemperature"));
		}
		if (map.get("qnh")!=null) {
			observation.addProperty("qnh", map.get("qnh"));
		}
		

		
//		String recentWeather=null;
		JsonObject AerodromeRecentWeather=new JsonObject();
		if (map.get("recentWeather")!=null) {
			AerodromeRecentWeather.addProperty("recentWeather", map.get("recentWeather"));
		}
		if (AerodromeRecentWeather.has("recentWeather")) {
			observation.add("AerodromeRecentWeather", AerodromeRecentWeather);
		}

		
//		Boolean allRunways=false;
//		String runway=null;
		JsonObject AerodromeWindShear=new JsonObject();
		if (map.get("allRunways")!=null) {
			AerodromeWindShear.addProperty("allRunways", map.get("allRunways"));			
		}
		if (map.get("runway")!=null) {
			AerodromeWindShear.addProperty("runway", map.get("runway"));
		}
		if (AerodromeWindShear.has("allRunways")||AerodromeWindShear.has("runway")) {
			observation.add("AerodromeWindShear", AerodromeWindShear);
		}
		
		
		
		String target=observation.toString();
		
		return target;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
