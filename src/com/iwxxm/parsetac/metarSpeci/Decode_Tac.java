package com.iwxxm.parsetac.metarSpeci;

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

	
	public String Fetch_observation_part(String content) {
		String[] result = null;
		if (content.contains("BECMG")||content.contains("NOSIG=")||content.contains("TEMPO")) {
			result=content.split("BECMG|NOSIG=|TEMPO");
		}
		String observation=result[0].trim();
		return observation;						
	}
	
	
	public String[] Fetch_trendForecast_part(String content) {
		String[] result = null;
		if (content.contains("BECMG")||content.contains("NOSIG=")||content.contains("TEMPO")) {
			result=content.split("BECMG|NOSIG=|TEMPO");
		}
		String observation=result[0].trim();
		String trendForecast=content.replaceAll(observation, "").trim();
		String [] temp1=trendForecast.split(" ");
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		for (int i = 0; i < temp1.length; i++) {
			if (temp1[i].equals("BECMG")||temp1[i].equals("TEMPO")||temp1[i].equals("NOSIG=")) {
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
	
	
	
    public String[] Split_observation_part(String[] result) {
    	String [] group=new String[13];
    	int tag=0;
    	
    	for (int i = 0; i < group.length; i++) {
			group[i]=" ";
		}
    	
    	
    	
    	group[0]=" "+result[0];
    	group[1]=" "+result[1];
    	group[2]=" "+result[2];
    
    	
    	
    	for(int i=3;i<result.length;i++) {
    		if (Pattern.matches("^.*MPS$", result[i])||Pattern.matches("^\\d*V\\d*$", result[i])) {
				group[3]=group[3]+result[i]+" ";    			
			}else if (result[i].equals("CAVOK")||Pattern.matches("^\\d\\d\\d\\d$", result[i])) {
				group[4]=group[4]+result[i]+" ";
			}else if (Pattern.matches("^R\\d\\d/\\d\\d\\d\\d[UND]$", result[i])) {
				group[5]=group[5]+result[i]+" ";
			}else if (Pattern.matches("^\\+([A-Z][A-Z])*$|^\\-([A-Z][A-Z])*$|^VC([A-Z][A-Z])*$|^([A-Z][A-Z])*$",result[i])
					&&(!Pattern.matches("^RE([A-Z][A-Z])*$", result[i]))
					&&(!Pattern.matches("^(TKOF|LDG|ALL)$", result[i]))
					&&(!Pattern.matches("^NOSIG=$|^BECMG$|^TEMPO$", result[i]))){
				group[6]=group[6]+result[i]+" ";			    
			}else if (Pattern.matches("^(FEW|SCT|BKN|OVC)\\d\\d\\d.*", result[i])
					||Pattern.matches("^VV\\d\\d\\d$", result[i])) {
				group[7]=group[7]+result[i]+" ";	
			}else if (Pattern.matches("^(M|)\\d\\d/(M|)\\d\\d$", result[i])) {
				group[8]=group[8]+result[i]+" ";	
			}else if (Pattern.matches("^(Q|A)\\d\\d\\d\\d$", result[i])) {
				group[9]=group[9]+result[i]+" ";		
			}else if (Pattern.matches("^RE([A-Z][A-Z])*$", result[i])) {
				group[10]=group[10]+result[i]+" ";
			}else if (Pattern.matches("^WS$|^(TKOF|LDG|ALL)$|^RWY.*$",result[i])) {
				group[11]=group[11]+result[i]+" ";
			}else if (Pattern.matches("^NOSIG=$",result[i])) {
				group[12]=group[12]+result[i]+" ";
			}else if (Pattern.matches("^BECMG$|^TEMPO$",result[i])) {
				group[12]=group[12]+result[i]+" ";
				tag=i;
					for (int j = tag+1; j <result.length; j++) {
						group[12]=group[12]+result[j]+" ";				
					}
		    		
		    		
				
			} 		
    	}
 
    	

    	
    	
    	
    	
    	
    	
		return group;
    	
    	

    }
    
    

	
	
	
	

}
