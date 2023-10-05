package com.example.sampleproject.service;


import org.springframework.stereotype.Service;


@Service
public class ShiftPlannerService {
	

	
	public String calculateNoAnalysts(int mstc, int astc, int nstc, int noa)
	{		

		if(mstc>0 & astc>0 & nstc>0 & noa>0 ) {
				 int totalTickets=mstc+astc+nstc;
				 float perAnalystTickets= totalTickets/noa;
				 
				 int morningShiftAnalysts=(int) (mstc/perAnalystTickets);
				 int afterNoonShiftAnalysts=(int) (astc/perAnalystTickets);
				 int nightShiftAnalysts=(int) (nstc/perAnalystTickets);
				 
				return "Morning Shift Analysts: " + morningShiftAnalysts +
						" After Noon Shift Analysts: " + afterNoonShiftAnalysts +
						" Night Shift Analysts: " + nightShiftAnalysts;
				
		}
		else {
			return "Incorrect Data Entered";
		}
		}
	
	

}
