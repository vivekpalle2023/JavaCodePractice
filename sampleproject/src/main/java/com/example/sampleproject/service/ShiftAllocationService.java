package com.example.sampleproject.service;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.LinkedHashMap;


import org.springframework.stereotype.Service;

@Service
public class ShiftPlannerService {

	public String calculateNoAnalysts(int mstc, int astc, int nstc, int noa) {
		
		if (mstc > 0 | astc > 0 | nstc > 0) {
			int totalTickets = mstc + astc + nstc;
			float perAnalystTickets = totalTickets / noa;
			int morningShiftAnalysts = (int) (mstc / perAnalystTickets);
			int afterNoonShiftAnalysts = (int) (astc / perAnalystTickets);
			int nightShiftAnalysts = (int) (nstc / perAnalystTickets);
			int leftOutAnalysts = noa - (morningShiftAnalysts + afterNoonShiftAnalysts + nightShiftAnalysts);
			HashMap<String, Integer> rA = new HashMap<>();
			rA.put("morning", mstc % (int) perAnalystTickets);
			rA.put("afternoon", astc % (int) perAnalystTickets);
			rA.put("night", nstc % (int) perAnalystTickets);

			//Ordering the remainder values in descending order to assign shift to leftOutAnalysts 
			HashMap<String, Integer> temp = rA.entrySet().stream()
					.sorted((i1, i2) -> i2.getValue().compareTo(i1.getValue())).collect(Collectors
							.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
			
			for (Map.Entry<String, Integer> en : temp.entrySet()) {
			
				if (leftOutAnalysts > 0) {
				switch (en.getKey()) {	
				case "morning":
					morningShiftAnalysts = morningShiftAnalysts + 1;
					break;
				case "afternoon":
					afterNoonShiftAnalysts = afterNoonShiftAnalysts + 1;
					break;
				case "night":
					nightShiftAnalysts = nightShiftAnalysts + 1;
					break;}
				leftOutAnalysts = leftOutAnalysts - 1;
				}
			}

		return "Morning Shift Analysts: " + morningShiftAnalysts + " After Noon Shift Analysts: "
					+ afterNoonShiftAnalysts + " Night Shift Analysts: " + nightShiftAnalysts;
		} else {
			return "In Correct Data Entered";
		}
	}

}
