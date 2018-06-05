package com.iwxxm.test;

import java.util.ArrayList;
import java.util.Map;
import com.iwxxm.parsexml.taf.BaseForecast;
import com.iwxxm.parsexml.taf.ChangeForecast;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xml_location="E:\\test.xml";
		BaseForecast baseForecast=new BaseForecast(xml_location);
		Map<String, String>result1=baseForecast.getInformation();
		System.out.println(result1);
		
		ChangeForecast changeForecast=new ChangeForecast(xml_location);
		ArrayList<Map<String,String>>result2=changeForecast.getInformation();
		System.out.println(result2);
		

	}

}
