package com.iwxxm.parsetac.metarSpeci;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content1="METAR YUDO 221630Z 24004MPS 0600 R12/1000U DZ FG SCT010 OVC020 17/16 Q1018 "
				+ "BECMG TL1700 0800 FG BECMG AT1800 9999 NSW";
		String content2="METAR ZGSZ 141230Z 03002MPS 010V070 9999 -SHRA FEW010 FEW020CB BKN033 24/23 Q1011 RESHRA NOSIG=";

		
		Decode_Tac parse_Tac=new Decode_Tac(content1); 
		String observation=parse_Tac.Fetch_observation_part(content1);
        String observation_group[]=parse_Tac.Split_observation_part(observation.split(" "));
        String trendForecast[]=parse_Tac.Fetch_trendForecast_part(content1);
    
        System.out.println("observation_part分组情况:");
        for (int i = 0; i < observation_group.length; i++) {
        	System.out.println("observation第"+(i)+"组为:"+observation_group[i].trim());
		}
        Extract1 extract1=new Extract1(observation_group);
		Map<String, String> map1=extract1.parse_observation();
		System.out.println("observation_part生成的key/value对:");
		System.out.println(map1);
		String target1=extract1.map2json(map1);
		System.out.println("observation_part生成json结构:");
		System.out.println(target1);
		
		
		
		System.out.println();
		System.out.println("trendForecast_part分组情况:");		
		for (int i = 0; i < trendForecast.length; i++) {
			System.out.println("trendForecast第"+(i)+"组为:"+trendForecast[i].trim());
			Extract2 extract2=new Extract2(trendForecast[i].split(" "));
			HashMap<String, String> map2=(HashMap<String, String>) extract2.parse_trend_forcast();
			System.out.println("trendForecast_part生成的key/value对:");
			System.out.println(map2);
			String target2=extract2.map2json(map2);
			System.out.println("trendForecast第"+(i)+"组生成json结构:");
			System.out.println(target2);
			System.out.println();
		}
		
		

	}

}
