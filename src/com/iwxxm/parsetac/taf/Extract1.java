package com.iwxxm.parsetac.taf;

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
	
	
	public Map<String, String> parse_baseForecast() {
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
			

			
			
			String  issueTime= null;
			if (!content[2].equals(" ")) {
				Calendar    rightNow    =    Calendar.getInstance();     
		        Integer year = rightNow.get(Calendar.YEAR);   
		        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
		        content[2]=content[2].trim();
				String  day=content[2].substring(0,2);
				String  hours=content[2].substring(2,4);
				String  minutes=content[2].substring(4,6);
				//2012-08-22T16:30:00Z
				issueTime=year+"-"+month+"-"+day+"T"+hours+":"+minutes+":00Z";
				map.put("issueTime", issueTime);
			}
			
			
			
			
			String  validBeginTime= null;
			if (!content[3].equals(" ")) {
				Calendar    rightNow    =    Calendar.getInstance();     
		        Integer year = rightNow.get(Calendar.YEAR);   
		        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
		        content[3]=content[3].trim();
				String  day=content[3].substring(0,2);
				String  hours=content[3].substring(2,4);
				validBeginTime=year+"-"+month+"-"+day+"T"+hours+":00:00Z";
				map.put("validBeginTime", validBeginTime);
			}
		
			
			
			
			String  validEndTime= null;
			if (!content[3].equals(" ")) {
				Calendar    rightNow    =    Calendar.getInstance();     
		        Integer year = rightNow.get(Calendar.YEAR);   
		        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
		        content[3]=content[3].trim();
				String  day=content[3].substring(5,7);
				String  hours=content[3].substring(7);
				validEndTime=year+"-"+month+"-"+day+"T"+hours+":00:00Z";
				map.put("validEndTime", validEndTime);
			}
			
			
			
			
			
			String meanWindDirection= null;
			String meanWindSpeed= null;
			String windGustSpeed=null;
			String wind_uom=null;
			String extension=null;
			Boolean variableWindDirection=null;
			if (!content[4].equals(" ")) {
				String [] temp=content[4].split(" ");
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
			if (!content[5].equals(" ")) {
				prevailingVisibility=content[5];
				map.put("prevailingVisibility", prevailingVisibility);
				map.put("uom", uom);				
			}
			
			
			
			
			
			
//			String meanRVR= null;
//			String designator= null;
//			String pastTendency= null;
//			if (!content[5].equals(" ")) {
//				designator=content[5].substring(1,3);
//				meanRVR=content[5].substring(5, 8);
//				pastTendency=content[5].substring(8).trim();
//				
//			}
//			map.put("designator", designator);
//			map.put("meanRVR", meanRVR);
//			map.put("pastTendency", pastTendency);
			
			
	        
			String	weather =null;
			if (!content[6].equals(" ")) {
				weather=content[6];
				map.put("weather", weather.trim());
			}
			
			
			
			
			
			String	CloudLayer =null;
			if (!content[7].equals(" ")) {
				CloudLayer=content[7];
				map.put("CloudLayer", CloudLayer.trim());
			}
			
			
			
			
			String maximumAirTemperature= null;
			String maximumAirTemperatureTime=null;
			String minimumAirTemperature= null;
			String minimumAirTemperatureTime= null;
			if (!content[8].equals(" ")) {
				String[] temp=content[8].trim().split(" ");
				for (int i = 0; i < temp.length; i++) {
					if (Pattern.matches("^TX\\d\\d/\\d\\d$", temp[i])) {
						maximumAirTemperature=temp[i].substring(2,4);
						Calendar    rightNow    =    Calendar.getInstance();     
				        Integer year = rightNow.get(Calendar.YEAR);   
				        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
				    	String  day=content[3].substring(0,2);
						String  hours=temp[i].substring(5,7);
						maximumAirTemperatureTime=year+"-"+month+"-"+day+"T"+hours+":00:00Z";
					}else if (Pattern.matches("^TN\\d\\d/\\d\\d$", temp[i])) {
						minimumAirTemperature=temp[i].substring(2,4);
						Calendar    rightNow    =    Calendar.getInstance();     
				        Integer year = rightNow.get(Calendar.YEAR);   
				        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
				    	String  day=content[3].substring(0,2);
						String  hours=temp[i].substring(5,7);
						minimumAirTemperatureTime=year+"-"+month+"-"+day+"T"+hours+":00:00Z";
					}
				}
				 map.put("maximumAirTemperature", maximumAirTemperature);
		         map.put("maximumAirTemperatureTime", maximumAirTemperatureTime);
		         map.put("minimumAirTemperature", minimumAirTemperature);
		         map.put("minimumAirTemperatureTime",minimumAirTemperatureTime);
			}
           
			
			
			
            
			String ice=null;
			if (!content[9].equals(" ")) {
				ice=content[9].substring(1);
				map.put("ice", ice);
			}
			
			
			
			
			
			
			String bump=null;
			if (!content[10].equals(" ")) {
				bump=content[10];
				map.put("bump", bump);
			}
						
			
			return map;
			
			
			
					
	}
	

	public void parse_changeForecast() {
		   if (content[12].equals(" ")||content[12].equals("NOSIG=")) {
			   
			   return;
			
		}
		
	} 
	
	
	public String map2json(Map<String, String> map) {
		
		JsonObject baseForecast=new JsonObject();
		baseForecast.addProperty("featureType", map.get("featureType"));
			
		baseForecast.addProperty("aerodrome", map.get("aerodrome"));
		
		baseForecast.addProperty("issueTime", map.get("issueTime"));

		baseForecast.addProperty("validBeginTime", map.get("validBeginTime"));
		
		baseForecast.addProperty("validEndTime", map.get("validEndTime"));
		
		
		JsonObject AerodromeSurfaceWindTrendForecast=new JsonObject();
		if (map.get("variableWindDirection")!=null) {
			AerodromeSurfaceWindTrendForecast.addProperty("variableWindDirection", map.get("variableWindDirection"));
		}
		if (map.get("meanWindDirection")!=null) {
			AerodromeSurfaceWindTrendForecast.addProperty("meanWindDirection", map.get("meanWindDirection"));
		}
		if (map.get("meanWindSpeed")!=null) {
			AerodromeSurfaceWindTrendForecast.addProperty("meanWindSpeed", map.get("meanWindSpeed"));
		}
		if (map.get("windGustSpeed")!=null) {
			AerodromeSurfaceWindTrendForecast.addProperty("windGustSpeed", map.get("windGustSpeed"));
		}
		if (map.get("extension")!=null) {
			AerodromeSurfaceWindTrendForecast.addProperty("extension", map.get("extension"));
		}
		if (map.get("wind_uom")!=null) {
			AerodromeSurfaceWindTrendForecast.addProperty("wind_uom", map.get("wind_uom"));
		}
		if (AerodromeSurfaceWindTrendForecast.has("variableWindDirection")) {
			baseForecast.add("AerodromeSurfaceWindTrendForecast", AerodromeSurfaceWindTrendForecast);
		}
		
		
		
		
		
		JsonObject AerodromeHorizontalVisibility=new JsonObject();
		if (map.get("prevailingVisibility")!=null) {
			baseForecast.addProperty("prevailingVisibility", map.get("prevailingVisibility"));
		}
		

		



		
     	//String	presentWeather = null;
		JsonArray array1=new JsonArray();		
		if (map.get("weather")!=null) {
			String [] temp=map.get("weather").split(" ");
			for (int i = 0; i < temp.length; i++) {
				String string = temp[i];
				JsonObject AerodromeForecastWeather=new JsonObject();	
				AerodromeForecastWeather.addProperty("weather", string);
				array1.add(AerodromeForecastWeather);
			}
			baseForecast.add("AerodromeForecastWeather", array1);
			
		}
		
		
		
		//String	CloudLayer = null;
		JsonArray array2=new JsonArray();		
		if (map.get("CloudLayer")!=null) {
			String [] temp=map.get("CloudLayer").split(" ");
			for (int i = 0; i < temp.length; i++) {
				String string = temp[i];
				JsonObject AerodromeCloudForecast=new JsonObject();
				AerodromeCloudForecast.addProperty("CloudLayer", string);
				array2.add(AerodromeCloudForecast);
			}
			baseForecast.add("AerodromeCloudForecast",array2);
		}
		
		
		
//		String maximumAirTemperature= null;
//		String maximumAirTemperatureTime=null;
//		String minimumAirTemperature= null;
//		String minimumAirTemperatureTime= null;
		JsonObject AerodromeAirTemperatureForecast=new JsonObject();
		if (map.get("maximumAirTemperature")!=null) {
			AerodromeAirTemperatureForecast.addProperty("maximumAirTemperature", map.get("maximumAirTemperature"));
		}
		if (map.get("maximumAirTemperatureTime")!=null) {
			AerodromeAirTemperatureForecast.addProperty("maximumAirTemperatureTime",map.get("maximumAirTemperatureTime"));
		}
		if (map.get("minimumAirTemperature")!=null) {
			AerodromeAirTemperatureForecast.addProperty("minimumAirTemperature", map.get("minimumAirTemperature"));
		}
		if (map.get("minimumAirTemperatureTime")!=null) {
			AerodromeAirTemperatureForecast.addProperty("minimumAirTemperatureTime", map.get("minimumAirTemperatureTime"));
		}
		if (AerodromeAirTemperatureForecast.has("maximumAirTemperature")||AerodromeAirTemperatureForecast.has("maximumAirTemperatureTime")||
            AerodromeAirTemperatureForecast.has("minimumAirTemperature")||AerodromeAirTemperatureForecast.has("minimumAirTemperatureTime")) {
			baseForecast.add("AerodromeAirTemperatureForecast", AerodromeAirTemperatureForecast);
		}



		
		JsonObject ice=new JsonObject();
		if (map.get("ice")!=null) {
			ice.addProperty("ice", map.get("ice"));			
		}
		if (ice.has("ice")) {
			baseForecast.add("ice", ice);
		}
		
		JsonObject bump=new JsonObject();
		if (map.get("bump")!=null) {
			bump.addProperty("bump", map.get("bump"));			
		}
		if (bump.has("bump")) {
			baseForecast.add("bump",bump);
		}
		
		
		
		String target=baseForecast.toString();
		
		return target;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
