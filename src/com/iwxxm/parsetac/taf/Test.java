package com.iwxxm.parsetac.taf;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content1="TAF YUDO 151800Z 1600/1618 13005MPS 9000 BKN020 BECMG 1606/1608 SCT015CB BKN020 TEMPO "
				+ "1608/1612 17006G12MPS 1000 TSRA SCT010CB BKN020 FM161230 15004MPS 9999 BKN020";

		
		Decode_Tac parse_Tac=new Decode_Tac(content1); 
		String baseForecast=parse_Tac.Fetch_baseForecast_part(content1);
        String baseForecast_group[]=parse_Tac.Setgroup(baseForecast.split(" "));
        String changeForecast[]=parse_Tac.Fetch_changeForecast_part(content1);
        
        System.out.println("baseForecast_part分组情况:");
        for (int i = 0; i < baseForecast_group.length; i++) {
        	System.out.println("baseForecast第"+(i)+"组为:"+baseForecast_group[i].trim());
		}
        Extract1 extract=new Extract1(baseForecast_group);
		Map<String, String> map1=extract.parse_baseForecast();
		System.out.println("baseForecast_part生成的key/value对:");
		System.out.println(map1);
		String target1=extract.map2json(map1);
		System.out.println("baseForecast_part生成json结构:");
		System.out.println(target1);
		
		
		System.out.println();
		System.out.println("changeForecast_part分组情况:");	
		for (int i = 0; i < changeForecast.length; i++) {
			System.out.println("changeForecast第"+(i)+"组为:"+changeForecast[i].trim());
			Extract2 extract2=new Extract2(changeForecast[i].split(" "));
			HashMap<String, String> map2=(HashMap<String, String>) extract2.parse_changeForecast();
			System.out.println("changeForecast_part生成的key/value对:");
			System.out.println(map2);
			String target2=extract2.map2json(map2);
			System.out.println("changeForecast第"+(i)+"组生成json结构:");
			System.out.println(target2);
			System.out.println();
		}
		
		

	}

}
