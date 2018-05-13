package com.iwxxm.parsetac.metarSpeci;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Extract2 {
	String[]  content;
	int length;
	
	
	public  Extract2(String[]  content) {
		this.content=content;
		this.length=content.length;		
	}
	
	


	

	public Map<String, String> parse_trend_forcast() {
		Map<String, String> map=new HashMap<String, String>();
		   if (content[0].equals(" ")||content[0].equals("NOSIG=")) {
			   return map;
			
		}else if (content[0].equals("BECMG")) {
			String changeIndicator="BECOMING";
			map.put("changeIndicator", changeIndicator);
		}else if (content[0].equals("TEMPO")) {
			String changeIndicator="TEMPORARY_FLUCTUATIONS";
			map.put("changeIndicator", changeIndicator);
		}
		   
		   String	forecastWeather ="";
		   String	CloudLayer ="";
		   for (int i = 1; i < content.length; i++) {
			   if (Pattern.matches("^FM\\d\\d\\d\\d$", content[i])) {
				   Calendar    rightNow    =    Calendar.getInstance();     
			        Integer year = rightNow.get(Calendar.YEAR);   
			        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
			        Integer day=rightNow.get(Calendar.DAY_OF_MONTH);
			        content[i]=content[i].trim();
					String  hours=content[i].substring(2,4);
					String  minutes=content[i].substring(4,6);
					//2012-08-22T16:30:00Z
					String beginTime=year+"-"+month+"-"+day+"T"+hours+":"+minutes+":00Z";
					map.put("beginTime", beginTime);	
			}else if (Pattern.matches("^TL\\d\\d\\d\\d$", content[i])) {
				    Calendar    rightNow    =    Calendar.getInstance();     
			        Integer year = rightNow.get(Calendar.YEAR);   
			        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
			        Integer day=rightNow.get(Calendar.DAY_OF_MONTH);
			        content[i]=content[i].trim();
					String  hours=content[i].substring(2,4);
					String  minutes=content[i].substring(4,6);
					//2012-08-22T16:30:00Z
					String endTime=year+"-"+month+"-"+day+"T"+hours+":"+minutes+":00Z";
					map.put("endTime", endTime);
			}else if (Pattern.matches("^AT\\d\\d\\d\\d$", content[i])) {
				    Calendar    rightNow    =    Calendar.getInstance();     
			        Integer year = rightNow.get(Calendar.YEAR);   
			        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
			        Integer day=rightNow.get(Calendar.DAY_OF_MONTH);
			        content[i]=content[i].trim();
					String  hours=content[i].substring(2,4);
					String  minutes=content[i].substring(4,6);
					//2012-08-22T16:30:00Z
					String atTime=year+"-"+month+"-"+day+"T"+hours+":"+minutes+":00Z";
					map.put("atTime", atTime);
			}else if (Pattern.matches("^\\d\\d\\d\\d\\dMPS$",  content[i])||Pattern.matches("^\\d\\d\\d\\d\\dG\\d\\dMPS$",  content[i])||
					Pattern.matches("^\\d*V\\d*$",  content[i])) {
				String meanWindDirection= null;
				String meanWindSpeed= null;
				String windGustSpeed=null;
				String wind_uom=null;
				String extension=null;
				Boolean variableWindDirection=null;
				    if (!content[i].equals(" ")) { 
						   if (Pattern.matches("^\\d\\d\\d\\d\\dMPS$", content[i])) {
							    variableWindDirection=false;
								meanWindDirection=content[i].substring(0, 3);
								meanWindSpeed=content[i].substring(3, 5);
								wind_uom=content[i].substring(5);
								map.put("variableWindDirection", variableWindDirection.toString());
								map.put("meanWindDirection", meanWindDirection);
								map.put("meanWindSpeed", meanWindSpeed);
								map.put("wind_uom", wind_uom);
						 } else if (Pattern.matches("^\\d\\d\\d\\d\\dG\\d\\dMPS$", content[i])){
							    variableWindDirection=false;
								meanWindDirection=content[i].substring(0, 3);
								meanWindSpeed=content[i].substring(3, 5);
								windGustSpeed=content[i].substring(6,8);
								wind_uom=content[i].substring(8);
								map.put("variableWindDirection", variableWindDirection.toString());
								map.put("meanWindDirection", meanWindDirection);
								map.put("meanWindSpeed", meanWindSpeed);
								map.put("windGustSpeed",windGustSpeed);
								map.put("wind_uom", wind_uom);
						}else if (Pattern.matches("^\\d*V\\d*$", content[i])) {
							    variableWindDirection=true;
							    extension=content[i];
							    map.put("variableWindDirection", variableWindDirection.toString());
							    map.put("extension", extension);
						}					
									
				}
				   
				
			}else if (content[i].equals("CAVOK")||Pattern.matches("^\\d\\d\\d\\d$", content[i])) {
				String prevailingVisibility= null;
				String uom="m";
				if (!content[i].equals(" ")) {
					prevailingVisibility=content[i];
					
				}
				map.put("prevailingVisibility", prevailingVisibility);
				map.put("uom", uom);	
			}else if (Pattern.matches("^\\+([A-Z][A-Z])*$|^\\-([A-Z][A-Z])*$|^VC([A-Z][A-Z])*$|^([A-Z][A-Z])*$",content[i])
					&&(!Pattern.matches("^RE([A-Z][A-Z])*$", content[i]))
					&&(!Pattern.matches("^(TKOF|LDG|ALL)$", content[i]))
					&&(!Pattern.matches("^NOSIG=$|^BECMG$|^TEMPO$", content[i]))) {
				
				if (!content[i].equals(" ")) {
					forecastWeather=forecastWeather+content[i]+" ";
					map.put("forecastWeather", forecastWeather.trim());
				}
				
			}else if (Pattern.matches("^(FEW|SCT|BKN)\\d\\d\\d.*", content[i])
					||Pattern.matches("^VV\\d\\d\\d$", content[i])) {
				
				if (!content[i].equals(" ")) {
					CloudLayer=CloudLayer+content[i]+" ";
					map.put("CloudLayer", CloudLayer.trim());
				}
				
			}else if (Pattern.matches("^WS$|^(TKOF|LDG|ALL)$|^RWY.*$",content[i])) {
				Boolean allRunways=false;
				String runway=null;
				if (!content[i].equals(" ")) {
					if (content[i].contains("ALL RWY")) {
						allRunways=true;
					}else {
						runway=content[i].substring(content[i].indexOf("Y")+1);
					}
				}
				map.put("allRunways", allRunways.toString());
				map.put("runway", runway);
			}else if (Pattern.matches("^NSW$|^NSC$", content[i])) {
				        forecastWeather=content[i];
				map.put("forecastWeather", forecastWeather);
			}
			   
			
		}
		   
		   return map;
	} 
	
	
	public String map2json(Map<String, String> map) {
		
		JsonObject trendForecast=new JsonObject();
		
		
		trendForecast.addProperty("changeIndicator", map.get("changeIndicator"));
		
				
		JsonObject beginTime=new JsonObject();
		if (map.get("beginTime")!=null) {	
			trendForecast.addProperty("beginTime", map.get("beginTime"));
		}
		
		
	
		if (map.get("endTime")!=null) {
			trendForecast.addProperty("endTime", map.get("endTime"));
		}
		
		
		
		
		if (map.get("atTime")!=null) {
			trendForecast.addProperty("atTime", map.get("atTime"));

		}
		
		
		
		
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
			trendForecast.add("AerodromeSurfaceWind", AerodromeSurfaceWind);
		}

						
		JsonObject AerodromeHorizontalVisibility=new JsonObject();
		if (map.get("prevailingVisibility")!=null) {
			AerodromeHorizontalVisibility.addProperty("prevailingVisibility", map.get("prevailingVisibility"));
			AerodromeHorizontalVisibility.addProperty("uom", "m");
		}
		if (AerodromeHorizontalVisibility.has("prevailingVisibility")) {
			trendForecast.add("AerodromeHorizontalVisibility", AerodromeHorizontalVisibility);
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
			trendForecast.add("AerodromeRunwayVisualRange", AerodromeRunwayVisualRange);
		}
		


		
     	//String	presentWeather = null;
//		JsonObject AerodromePresentWeather=new JsonObject();
//		if (map.get("presentWeather")!=null) {
//			AerodromePresentWeather.addProperty("presentWeather", map.get("presentWeather"));
//		}
//		if (AerodromePresentWeather.has("presentWeather")) {
//			trendForecast.add("AerodromePresentWeather", AerodromePresentWeather);
//		}		
		JsonArray array1=new JsonArray();
		if (map.get("presentWeather")!=null) {
			String [] temp=map.get("presentWeather").split(" ");
			for (int i = 0; i < temp.length; i++) {						
				String string = temp[i];
				JsonObject AerodromePresentWeather=new JsonObject();
				AerodromePresentWeather.addProperty("presentWeather", string);
				array1.add(AerodromePresentWeather);
			}
			trendForecast.add("AerodromePresentWeather", array1);
			
		}
		
		
		
		//String	CloudLayer = null;
//		JsonObject AerodromeObservedClouds=new JsonObject();
//		if (map.get("CloudLayer")!=null) {
//			AerodromeObservedClouds.addProperty("CloudLayer", map.get("CloudLayer"));
//		}
//		if (AerodromeObservedClouds.has("CloudLayer")) {
//			trendForecast.add("AerodromeObservedClouds",AerodromeObservedClouds);
//		}
		JsonArray array2=new JsonArray();	
		if (map.get("CloudLayer")!=null) {
			String [] temp=map.get("CloudLayer").split(" ");
			for (int i = 0; i < temp.length; i++) {
				String string = temp[i];
				JsonObject AerodromeObservedClouds=new JsonObject();
				AerodromeObservedClouds.addProperty("CloudLayer", string);
				array2.add(AerodromeObservedClouds);
			}
			trendForecast.add("AerodromeObservedClouds",array2);
		}
		
		
		
//		String airTemperature= null;
//		String dewpointTemperature= null;
//		String qnh=null;
		if (map.get("airTemperature")!=null) {
			trendForecast.addProperty("airTemperature", map.get("airTemperature"));
		}
		if (map.get("dewpointTemperature")!=null) {
			trendForecast.addProperty("dewpointTemperature",map.get("dewpointTemperature"));
		}
		if (map.get("qnh")!=null) {
			trendForecast.addProperty("qnh", map.get("qnh"));
		}
		

		
//		String recentWeather=null;
		JsonObject AerodromeRecentWeather=new JsonObject();
		if (map.get("recentWeather")!=null) {
			AerodromeRecentWeather.addProperty("recentWeather", map.get("recentWeather"));
		}
		if (AerodromeRecentWeather.has("recentWeather")) {
			trendForecast.add("AerodromeRecentWeather", AerodromeRecentWeather);
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
			trendForecast.add("AerodromeWindShear", AerodromeWindShear);
		}
		
		
		
		JsonObject forecastWeather=new JsonObject();
		if (map.get("forecastWeather")!=null) {
			forecastWeather.addProperty("forecastWeather", map.get("forecastWeather"));
		}
		if (forecastWeather.has("forecastWeather")) {
			trendForecast.add("forecastWeather", forecastWeather);
		}
		
		
		String target=trendForecast.toString();
		
		return target;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
