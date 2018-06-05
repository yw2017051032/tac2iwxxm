package com.iwxxm.test;

import java.util.ArrayList;
import java.util.Map;
import com.iwxxm.parsexml.metarSpeci.Observation;
import com.iwxxm.parsexml.metarSpeci.TrendForecast;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xml_location="E:\\test.xml";
		Observation observation=new Observation(xml_location);
		Map<String, String>result1=observation.getInformation();
		System.out.println(result1);
		
		TrendForecast trendForecast=new TrendForecast(xml_location);
		ArrayList<Map<String,String>>result2=trendForecast.getInformation();
		System.out.println(result2);
		

	}

}
