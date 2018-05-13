package com.iwxxm.parsetac.taf;

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
	
	


	

	public Map<String, String> parse_changeForecast() {
		Map<String, String> map=new HashMap<String, String>();
		   if (content[0].equals(" ")||content[0].equals("NOSIG=")) {
			   return map;
			
		}else if (content[0].equals("BECMG")) {
			String changeIndicator="BECOMING";
			map.put("changeIndicator", changeIndicator);
		}else if (content[0].equals("TEMPO")) {
			String changeIndicator="TEMPORARY_FLUCTUATIONS";
			map.put("changeIndicator", changeIndicator);
		}else if (content[0].contains("PROB")) {
			String changeIndicator="PROBILITY";
			map.put("changeIndicator", changeIndicator);
		}else if (content[0].contains("FM")) {
			String changeIndicator="FROM";
			map.put("changeIndicator", changeIndicator);
		}
		   
		   String	weather ="";
		   
		   String	CloudLayer ="";
		   
		   for (int i = 0; i < content.length; i++) {
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
			}else if (Pattern.matches("^\\d\\d\\d\\d/\\d\\d\\d\\d$", content[i])||Pattern.matches("^\\d\\d\\d\\d\\d\\d$", content[i])) {
				String  validBeginTime= null;
				String  validEndTime= null;
				Calendar    rightNow    =    Calendar.getInstance();     
		        Integer year = rightNow.get(Calendar.YEAR);   
		        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
		        content[i]=content[i].trim();
				String  day1=content[i].substring(0,2);
				String  hours1=content[i].substring(2,4);
				validBeginTime=year+"-"+month+"-"+day1+"T"+hours1+":00:00Z";
				String  day2=content[i].substring(5,7);
				String  hours2=content[i].substring(7);
				validEndTime=year+"-"+month+"-"+day2+"T"+hours2+":00:00Z";
				map.put("validBeginTime", validBeginTime);
				map.put("validEndTime", validEndTime);
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
					&&(!Pattern.matches("^NOSIG=$|^BECMG$|^TEMPO$|^PROB\\d\\d$", content[i]))) {
				
				if (!content[i].equals(" ")) {
					weather=weather+content[i]+" ";
					map.put("weather", weather.trim());
				}
				
			}else if (Pattern.matches("^(FEW|SCT|BKN)\\d\\d\\d.*", content[i])
					||Pattern.matches("^VV\\d\\d\\d$", content[i])) {
				
				if (!content[i].equals(" ")) {
					CloudLayer=CloudLayer+content[i]+" ";
					map.put("CloudLayer", CloudLayer.trim());
				}
				
			}else if (Pattern.matches("^^TX\\d\\d/\\d\\d$", content[i])) {
				String maximumAirTemperature= null;
				String maximumAirTemperatureTime=null;
				maximumAirTemperature=content[i].substring(2,4);
				Calendar    rightNow    =    Calendar.getInstance();     
		        Integer year = rightNow.get(Calendar.YEAR);   
		        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
		    	String  day=content[3].substring(0,2);
				String  hours=content[i].substring(5,7);
				maximumAirTemperatureTime=year+"-"+month+"-"+day+"T"+hours+":00:00Z";
				map.put("maximumAirTemperature", maximumAirTemperature);
	            map.put("maximumAirTemperatureTime", maximumAirTemperatureTime);
			}else if (Pattern.matches("^^TN\\d\\d/\\d\\d$", content[i])) {
				String minimumAirTemperature= null;
				String minimumAirTemperatureTime=null;
				minimumAirTemperature=content[i].substring(2,4);
				Calendar    rightNow    =    Calendar.getInstance();     
		        Integer year = rightNow.get(Calendar.YEAR);   
		        Integer month = rightNow.get(Calendar.MONTH)+1; //第一个月从0开始，所以得到月份＋1
		    	String  day=content[3].substring(0,2);
				String  hours=content[i].substring(5,7);
				minimumAirTemperatureTime=year+"-"+month+"-"+day+"T"+hours+":00:00Z";
				map.put("minimumAirTemperature", minimumAirTemperature);
	            map.put("minimumAirTemperatureTime", minimumAirTemperatureTime);
			}else if (Pattern.matches("^(Q|A)\\d\\d\\d\\d$", content[i])) {
				String qnh=null;
				if (!content[i].equals(" ")) {
					qnh=content[i].substring(1);				
				}
				map.put("qnh", qnh);
			}else if (Pattern.matches("^RE([A-Z][A-Z])*$", content[i])) {
				String recentWeather=null;
				if (!content[i].equals(" ")) {
					recentWeather=content[i];				
				}
				map.put("recentWeather", recentWeather);
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
				String forecastWeather=content[i];
				map.put("forecastWeather", forecastWeather);
			}
			   
			
		}
		   
		   return map;
	} 
	
	
	public String map2json(Map<String, String> map) {
		
		JsonObject changeForecast=new JsonObject();
		
		
		changeForecast.addProperty("changeIndicator", map.get("changeIndicator"));
		
		
		
			
		if (map.get("beginTime")!=null) {	
			changeForecast.addProperty("beginTime", map.get("beginTime"));
		}
		
		
		
		
		if (map.get("endTime")!=null) {
			changeForecast.addProperty("endTime", map.get("endTime"));
		}
		
		
		
		
		if (map.get("atTime")!=null) {
			changeForecast.addProperty("atTime", map.get("atTime"));
		}		
		if (map.get("validBeginTime")!=null) {
			changeForecast.addProperty("validBeginTime", map.get("validBeginTime"));
		}
		if (map.get("validEndTime")!=null) {
			changeForecast.addProperty("validEndTime", map.get("validEndTime"));
		}
		
		
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
			changeForecast.add("AerodromeSurfaceWind", AerodromeSurfaceWindTrendForecast);
		}

		

		if (map.get("prevailingVisibility")!=null) {
			changeForecast.addProperty("AerodromeHorizontalVisibility",map.get("prevailingVisibility"));
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
			changeForecast.add("AerodromeForecastWeather", array1);
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
			changeForecast.add("AerodromeCloudForecast",array2);
			
		}
		

		
//		String airTemperature= null;
//		String dewpointTemperature= null;
//		String qnh=null;
		if (map.get("airTemperature")!=null) {
			changeForecast.addProperty("airTemperature", map.get("airTemperature"));
		}
		if (map.get("dewpointTemperature")!=null) {
			changeForecast.addProperty("dewpointTemperature",map.get("dewpointTemperature"));
		}
		if (map.get("qnh")!=null) {
			changeForecast.addProperty("qnh", map.get("qnh"));
		}
		

		
//		String recentWeather=null;
		JsonObject AerodromeRecentWeather=new JsonObject();
		if (map.get("recentWeather")!=null) {
			AerodromeRecentWeather.addProperty("recentWeather", map.get("recentWeather"));
		}
		if (AerodromeRecentWeather.has("recentWeather")) {
			changeForecast.add("AerodromeRecentWeather", AerodromeRecentWeather);
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
			changeForecast.add("AerodromeWindShear", AerodromeWindShear);
		}
		
		
		
		JsonObject forecastWeather=new JsonObject();
		if (map.get("forecastWeather")!=null) {
			forecastWeather.addProperty("forecastWeather", map.get("forecastWeather"));
		}
		if (forecastWeather.has("forecastWeather")) {
			changeForecast.add("forecastWeather", forecastWeather);
		}
		
		
		String target=changeForecast.toString();
		
		return target;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
