package com.iwxxm.generateXml.taf;

import java.io.File;
import java.text.ParseException;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.iwxxm.parsetac.taf.Decode_Tac;
import com.iwxxm.parsetac.taf.Extract1;
import com.iwxxm.taf.ObjectFactory;
import com.iwxxm.taf.TAFType;

public class Generate_tafReport_xml {

	String tac;
	
	String strFile;
	
	public Generate_tafReport_xml(String tac,String strFile) {
		// TODO Auto-generated constructor stub
		
		this.tac=tac;
		this.strFile=strFile;
		
	}
	
	
	public void generate_tafReport_xml() throws ParseException, JAXBException {
		
		Decode_Tac parse_Tac=new Decode_Tac(tac); 
		String baseForecast=parse_Tac.Fetch_baseForecast_part(tac);
        String baseForecast_group[]=parse_Tac.Setgroup(baseForecast.split(" "));
        String changeForecast[]=parse_Tac.Fetch_changeForecast_part(tac);
        
        Extract1 extract1=new Extract1(baseForecast_group);
		Map<String, String> map1=extract1.parse_baseForecast();
		
		
        
        ObjectFactory tafOb = new ObjectFactory();
        TAFType TAF=tafOb.createTAFType();
        
        
        Generate_baseForecast_xml generate_baseForecast_xml=new Generate_baseForecast_xml(TAF, map1);
		generate_baseForecast_xml.generate_xml();
		
		String BaseForecastTime=map1.get("issueTime");
	    Generate_changeForecast_xml generate_changeForecast_xml=new Generate_changeForecast_xml(changeForecast,TAF,BaseForecastTime);
	    generate_changeForecast_xml.generate_xml();
        
        
        //JAXBContext context = JAXBContext.newInstance("com.iwxxm.taf");
	    JAXBContext context = JAXBContext.newInstance(TAF.getClass());
	   	Marshaller marshaller = context.createMarshaller();//创建编组
	   	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//设置编组属性，使得输出的XML文档进行格式化（提供缩进）
	   	System.out.println("TAC2XML结果：");
	   	marshaller.marshal( new JAXBElement(new QName("","iwxxm:TAF"),TAF.getClass(),TAF),System.out);
	   	if (strFile!=null) {
			File file = new File(strFile);
			marshaller.marshal( new JAXBElement(new QName("","iwxxm:TAF"),TAF.getClass(),TAF),file);
			System.out.println("生成xml文档于:");
			System.out.println(strFile);
			}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) throws JAXBException, ParseException {
		
		String content1="TAF YUDO 151800Z 1600/1618 13005MPS 9000 BKN020 BECMG 1606/1608 SCT015CB BKN020 TEMPO "
				+ "1608/1612 17006G12MPS 1000 TSRA SCT010CB BKN020 FM161230 15004MPS 9999 BKN020";
		Decode_Tac parse_Tac=new Decode_Tac(content1); 
		String baseForecast=parse_Tac.Fetch_baseForecast_part(content1);
        String baseForecast_group[]=parse_Tac.Setgroup(baseForecast.split(" "));
        String changeForecast[]=parse_Tac.Fetch_changeForecast_part(content1);
        
        Extract1 extract1=new Extract1(baseForecast_group);
		Map<String, String> map1=extract1.parse_baseForecast();
		
		
        
        ObjectFactory tafOb = new ObjectFactory();
        TAFType TAF=tafOb.createTAFType();
        
        
        Generate_baseForecast_xml generate_baseForecast_xml=new Generate_baseForecast_xml(TAF, map1);
		generate_baseForecast_xml.generate_xml();
		
		String BaseForecastTime=map1.get("issueTime");
	    Generate_changeForecast_xml generate_changeForecast_xml=new Generate_changeForecast_xml(changeForecast,TAF,BaseForecastTime);
	    generate_changeForecast_xml.generate_xml();
        
        
        JAXBContext context = JAXBContext.newInstance("com.iwxxm.taf");
	   	//  File file = new File("D:\\metar.xml");
	   	Marshaller marshaller = context.createMarshaller();//创建编组
	   	marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);//设置编组属性，使得输出的XML文档进行格式化（提供缩进）
	   	System.out.println("TAC2XML结果：");
	   	marshaller.marshal( new JAXBElement(new QName("","iwxxm:TAF"),TAF.getClass(),TAF),System.out);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
