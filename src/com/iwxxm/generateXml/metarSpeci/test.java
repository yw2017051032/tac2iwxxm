package com.iwxxm.generateXml.metarSpeci;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;



public class test {

	public static void main(String[] args) throws JAXBException, ParseException {
		// TODO Auto-generated method stub
//		ObjectFactory metar_observaion = new ObjectFactory();
//		AerodromeSurfaceWindPropertyType aerodromeSurfaceWindProperty=metar_observaion.createAerodromeSurfaceWindPropertyType();
//		JAXBContext context = JAXBContext.newInstance(aerodromeSurfaceWindProperty.getClass());
		
		
		String time="2010-11-20 11:10:10"; 
		  
		  Date date=null; 
		  SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		  date=formatter.parse(time); 
		  System.out.println(date); 
		  System.out.println(date.getTime());
          
	}

}
