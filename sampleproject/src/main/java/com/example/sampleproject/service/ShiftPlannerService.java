package com.example.sampleproject.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

@Service
public class ShiftPlannerService {

	public String calculateNoAnalysts(int mstc, int astc, int nstc, int noa) {

		if (mstc > 0 & astc > 0 & nstc > 0 & noa > 0) {
			int totalTickets = mstc + astc + nstc;
			float perAnalystTickets = totalTickets / noa;
     
			int morningShiftAnalysts=(int) (mstc/perAnalystTickets);
			int afterNoonShiftAnalysts=(int) (astc/perAnalystTickets);
			int nightShiftAnalysts=(int) (nstc/perAnalystTickets);
			int leftOutAnalysts=noa-(morningShiftAnalysts+afterNoonShiftAnalysts+nightShiftAnalysts);
			int m =  mstc % (int)perAnalystTickets;
			int a = astc % (int)perAnalystTickets;
			int n =  nstc % (int)perAnalystTickets;
			int[] temp= {m,a,n};
			//Arrays.sort(temp,Collections.reverseOrder());
			
			if(leftOutAnalysts>0) {
				
				for(int i=0;i<leftOutAnalysts;i++) {
					for(int j=temp.length;j==0;j--) {
						
						
						
					}
					
				}
				
			}

			return "Morning Shift Analysts: " + morningShiftAnalysts + " After Noon Shift Analysts: "
					+ afterNoonShiftAnalysts + " Night Shift Analysts: " + nightShiftAnalysts;

		} else {
			return "Incorrect Data Entered";
		}
	}

}
