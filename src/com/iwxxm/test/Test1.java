package com.iwxxm.test;
import java.text.ParseException;

import javax.xml.bind.JAXBException;

import com.iwxxm.generateXmlReport.GenerateXmlReport;

public class Test1 {

	public static void main(String[] args) throws ParseException, JAXBException {
		// TODO Auto-generated method stub
		
		String tac1="METAR YUDO 221630Z 24004MPS 0600 R12/1000U DZ FG SCT010 OVC020 17/16 Q1018 "
				+ "BECMG TL1700 0800 FG BECMG AT1800 9999 NSW";
		
		String tac2="METAR ZGSZ 141230Z 03002MPS 010V070 9999 -SHRA FEW010 FEW020CB BKN033 24/23 Q1011 RESHRA NOSIG=";
		
		
		String tac3="TAF YUDO 151800Z 1600/1618 13005MPS 9000 BKN020 BECMG 1606/1608 SCT015CB BKN020 TEMPO "
				+ "1608/1612 17006G12MPS 1000 TSRA SCT010CB BKN020 FM161230 15004MPS 9999 BKN020"; 
		
		
		String tac4="SPECI YUDO 151115Z 05025G37KT 3000 1200NE+TSRA BKN005CB 25/22 Q1008 TEMPO TL1200 0600 "
				+"BECMG AT1200 8000 NSW NSC";
		
		
		//生成的xml文档名称及绝对路径
		String strFile="E:\\test.xml";
		GenerateXmlReport test1=new GenerateXmlReport(tac1,strFile);
		test1.generateXmlReport();
		

	}

}
