package com.iwxxm.generateXmlReport;

import java.sql.Time;
import java.text.ParseException;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import com.iwxxm.generateXml.metarSpeci.Generate_metarSpeciReport_xml;
import com.iwxxm.generateXml.metarSpeci.Generate_observationPart_xml;
import com.iwxxm.generateXml.metarSpeci.Generate_trendForecastPart_xml;
import com.iwxxm.generateXml.taf.Generate_tafReport_xml;
import com.iwxxm.metarSpeci.MeteorologicalAerodromeObservationReportType;
import com.iwxxm.metarSpeci.ObjectFactory;
import com.iwxxm.parsetac.metarSpeci.Decode_Tac;
import com.iwxxm.parsetac.metarSpeci.Extract1;

public class GenerateXmlReport {

	String tac;
	String strFile;
	
	public String getStrFile() {
		return strFile;
	}



	public void setStrFile(String strFile) {
		this.strFile = strFile;
	}



	public String getTac() {
		return tac;
	}



	public void setTac(String tac) {
		this.tac = tac;
	}



	public GenerateXmlReport(String tac,String strFile) {
	
		// TODO Auto-generated constructor stub
		this.tac=tac;
		this.strFile=strFile;
	}
	
	
	
	 public void generateXmlReport() throws ParseException, JAXBException {
		
		if (tac.contains("METAR")||tac.contains("SPECI")) {
			
			Generate_metarSpeciReport_xml xml=new Generate_metarSpeciReport_xml(tac,strFile);
			xml.generate_metarSpeciReport_xml();
			
			
		}else if (tac.contains("TAF")) {
			
			Generate_tafReport_xml xml=new Generate_tafReport_xml(tac,strFile);
			xml.generate_tafReport_xml();
			
			
			
		}
		
		
		
		
	}
	
	
	
}
