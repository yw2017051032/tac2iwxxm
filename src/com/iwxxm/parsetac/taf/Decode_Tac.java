package com.iwxxm.parsetac.taf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.regex.Pattern;

import javax.swing.GroupLayout.SequentialGroup;

public class Decode_Tac {
	String content;	
	
	
	
	
	public Decode_Tac(String content) {
		// TODO Auto-generated constructor stub
	   this.content=content;
		
	}

	
	public String Fetch_baseForecast_part(String content) {
		String[] result = null;
		if (content.contains("BECMG")||content.contains("NOSIG=")||content.contains("TEMPO")||content.contains("PROB")||content.contains("FM")) {
			result=content.split("BECMG|NOSIG=|TEMPO|PROB\\d\\d|FM\\d*");
		}
		String baseForecast=result[0].trim();
		return baseForecast;						
	}
	
	
	public String[] Fetch_changeForecast_part(String content) {
		String[] result = null;
		if (content.contains("BECMG")||content.contains("NOSIG=")||content.contains("TEMPO")||content.contains("PROB")||content.contains("FM")) {
			result=content.split("BECMG|NOSIG=|TEMPO|PROB\\d\\d|FM\\d*");
		}
		String baseForecast=result[0].trim();
		String changeForecast=content.replaceAll(baseForecast, "").trim();
		String [] temp1=changeForecast.split(" ");
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		for (int i = 0; i < temp1.length; i++) {
			if (temp1[i].equals("BECMG")||temp1[i].equals("TEMPO")||temp1[i].equals("NOSIG=")||temp1[i].contains("PROB")||temp1[i].contains("FM")) {
				list1.add(temp1[i]);
			}			
		}
		
		
		if (result.length>1) {
			for (int i = 1; i < result.length; i++) {
				String temp2=list1.get(i-1)+result[i];
				list2.add(temp2);
			}
		}
		 
		String[] trendForecast_array = list2.toArray(new String[list2.size()]);
		return trendForecast_array ;						
	}
	
	
	
	
	
	
	public String[] Split2(String content) {
		String[] result;
		result=content.split(" ");
		return result;						
	}
	
	
	
    public String[] Setgroup(String[] result) {
    	String [] group=new String[12];
    	int tag=0;
    	
    	for (int i = 0; i < group.length; i++) {
			group[i]=" ";
		}
    	
    	
    	
    	group[0]=" "+result[0];
    	group[1]=" "+result[1];
    	group[2]=" "+result[2];
    
    	
    	
    	for(int i=3;i<result.length;i++) {
    		if (Pattern.matches("^\\d\\d\\d\\d/\\d\\d\\d\\d$", result[i])||Pattern.matches("^\\d\\d\\d\\d\\d\\d$", result[i])) {
				group[3]=group[3]+result[i]+" ";    			
			}else if (Pattern.matches("^.*MPS$", result[i])||Pattern.matches("^\\d*V\\d*$", result[i])) {
				group[4]=group[4]+result[i]+" ";
			}else if (result[i].equals("CAVOK")||Pattern.matches("^\\d\\d\\d\\d$", result[i])) {
				group[5]=group[5]+result[i]+" ";
			}else if (Pattern.matches("^\\+([A-Z][A-Z])*$|^\\-([A-Z][A-Z])*$|^VC([A-Z][A-Z])*$|^([A-Z][A-Z])*$",result[i])
					&&(!Pattern.matches("^RE([A-Z][A-Z])*$", result[i]))
					&&(!Pattern.matches("^(TKOF|LDG|ALL)$", result[i]))
					&&(!Pattern.matches("^NOSIG=$|^BECMG$|^TEMPO$", result[i]))){
				group[6]=group[6]+result[i]+" ";			    
			}else if (Pattern.matches("^(FEW|SCT|BKN)\\d\\d\\d.*", result[i])
					||Pattern.matches("^VV\\d\\d\\d$", result[i])||Pattern.matches("^(SKC|NSC)$", result[i])) {
				group[7]=group[7]+result[i]+" ";	
			}else if (Pattern.matches("^TX\\d\\d/\\d\\dZ$|^TN\\d\\d/\\d\\dZ$", result[i])) {
				group[8]=group[8]+result[i]+" ";	
			}else if (Pattern.matches("^6\\d\\d\\d\\d\\d$|^60$", result[i])) {
				group[9]=group[9]+result[i]+" ";		
			}else if (Pattern.matches("^5\\d\\d\\d\\d\\d$|^50$", result[i])) {
				group[10]=group[10]+result[i]+" ";
			}else if (Pattern.matches("^WS$|^(TKOF|LDG|ALL)$|^RWY.*$",result[i])) {
				group[11]=group[11]+result[i]+" ";
			}		
    	}
 
    	

    	
    	
    	
    	
    	
    	
		return group;
    	
    	

    }
    
    

	
	
	
	

}
