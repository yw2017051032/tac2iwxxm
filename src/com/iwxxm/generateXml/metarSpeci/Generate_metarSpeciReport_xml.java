package com.iwxxm.generateXml.metarSpeci;

import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.iwxxm.metarSpeci.METARType;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportType;
import com.iwxxm.metarSpeci.ObjectFactory;
import com.iwxxm.parsetac.metarSpeci.Decode_Tac;
import com.iwxxm.parsetac.metarSpeci.Extract1;
import com.iwxxm.parsetac.metarSpeci.Extract2;

public class Generate_metarSpeciReport_xml {
	
	String tac;
	String strFile;
	
	
	
	public Generate_metarSpeciReport_xml(String tac,String strFile) {
		// TODO Auto-generated constructor stub
		this.tac=tac;
		this.strFile=strFile;
	}
	
	
	public void generate_metarSpeciReport_xml() throws ParseException, JAXBException {
		
            if (tac.contains("METAR")) {
			
			Decode_Tac parse_Tac=new Decode_Tac(tac); 
			String observation=parse_Tac.Fetch_observation_part(tac);
	        String observation_group[]=parse_Tac.Split_observation_part(observation.split(" "));
	        String trendForecast[]=parse_Tac.Fetch_trendForecast_part(tac);
	        
	        Extract1 extract1=new Extract1(observation_group);
			Map<String, String> map1=extract1.parse_observation();
			
			
	        
	        ObjectFactory metar = new ObjectFactory();
	        MeteorologicalAerodromeObservationReportType METAR=metar.createMETARType();
	        
	        
	        Generate_observationPart_xml generate_observation_xml=new Generate_observationPart_xml(METAR, map1);
	        generate_observation_xml.generate_xml();
	        Generate_trendForecastPart_xml generate_trendForecast_xml=new Generate_trendForecastPart_xml(METAR, trendForecast, map1.get("time"));
	        generate_trendForecast_xml.generate_xml();
	        
	           
	        JAXBContext context = JAXBContext.newInstance(METAR.getClass());
	           //JAXBContext context = JAXBContext.newInstance("com.iwxxm.metarSpeci");
		   	  //  File file = new File("D:\\metar.xml");
		   	    Marshaller marshaller = context.createMarshaller();//创建编组
		   	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//设置编组属性，使得输出的XML文档进行格式化（提供缩进）
		   		System.out.println("TAC2XML结果：");
		   		marshaller.marshal( new JAXBElement(new QName("","iwxxm:METAR"),METAR.getClass(),METAR),System.out);
		   		if (strFile!=null) {
					File file = new File(strFile);
					marshaller.marshal( new JAXBElement(new QName("","iwxxm:METAR"),METAR.getClass(),METAR),file);
					System.out.println("生成xml文档于:");
					System.out.println(strFile);
					}
			
		}else if (tac.contains("SPECI")) {
			
			Decode_Tac parse_Tac=new Decode_Tac(tac); 
			String observation=parse_Tac.Fetch_observation_part(tac);
	        String observation_group[]=parse_Tac.Split_observation_part(observation.split(" "));
	        String trendForecast[]=parse_Tac.Fetch_trendForecast_part(tac);
	        
	        Extract1 extract1=new Extract1(observation_group);
			Map<String, String> map1=extract1.parse_observation();
			
			
	        
	        ObjectFactory metar = new ObjectFactory();
	        MeteorologicalAerodromeObservationReportType SPECI=metar.createSPECIType();
	        
	        
	        Generate_observationPart_xml generate_observation_xml=new Generate_observationPart_xml(SPECI, map1);
	        generate_observation_xml.generate_xml();
	        Generate_trendForecastPart_xml generate_trendForecast_xml=new Generate_trendForecastPart_xml(SPECI, trendForecast, map1.get("time"));
	        generate_trendForecast_xml.generate_xml();
	        
	        
	        JAXBContext context = JAXBContext.newInstance(SPECI.getClass());
	        //JAXBContext context = JAXBContext.newInstance("com.iwxxm.metarSpeci");
		   	  //  File file = new File("D:\\metar.xml");
		   	Marshaller marshaller = context.createMarshaller();//创建编组
		   	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//设置编组属性，使得输出的XML文档进行格式化（提供缩进）
		   	System.out.println("TAC2XML结果：");
		   	marshaller.marshal( new JAXBElement(new QName("","iwxxm:SPECI"),SPECI.getClass(),SPECI),System.out);			
		   	if (strFile!=null) {
			File file = new File(strFile);
			marshaller.marshal( new JAXBElement(new QName("","iwxxm:SPECI"),SPECI.getClass(),SPECI),file);
			System.out.println("生成xml文档于:");
			System.out.println(strFile);
			}
			
		}
		
	}
	
	
	
	
	

	public static void main(String[] args) throws JAXBException, ParseException {
		// TODO Auto-generated method stub

//		String content1="METAR YUDO 221630Z 24004MPS 0600 R12/1000U DZ FG SCT010 OVC020 17/16 Q1018 "
//				+ "BECMG TL1700 0800 FG BECMG AT1800 9999 NSW";
		
		String content1="METAR ZGSZ 141230Z 03002MPS 010V070 9999 -SHRA FEW010 FEW020CB BKN033 24/23 Q1011 RESHRA NOSIG=";
		Decode_Tac parse_Tac=new Decode_Tac(content1); 
		String observation=parse_Tac.Fetch_observation_part(content1);
        String observation_group[]=parse_Tac.Split_observation_part(observation.split(" "));
        String trendForecast[]=parse_Tac.Fetch_trendForecast_part(content1);
        
        Extract1 extract1=new Extract1(observation_group);
		Map<String, String> map1=extract1.parse_observation();
		
		
        
        ObjectFactory metar = new ObjectFactory();
        MeteorologicalAerodromeObservationReportType METAR=metar.createMETARType();
        
        
        Generate_observationPart_xml generate_observation_xml=new Generate_observationPart_xml(METAR, map1);
        generate_observation_xml.generate_xml();
        Generate_trendForecastPart_xml generate_trendForecast_xml=new Generate_trendForecastPart_xml(METAR, trendForecast, map1.get("time"));
        generate_trendForecast_xml.generate_xml();
        
        
            JAXBContext context = JAXBContext.newInstance("com.iwxxm.metarSpeci");
	   	  //  File file = new File("D:\\metar.xml");
	   	    Marshaller marshaller = context.createMarshaller();//创建编组
	   	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//设置编组属性，使得输出的XML文档进行格式化（提供缩进）
	   		System.out.println("TAC2XML结果：");
	   		marshaller.marshal( new JAXBElement(new QName("","iwxxm:METAR"),METAR.getClass(),METAR),System.out);
        
		
		
		
		
		
	}

}
