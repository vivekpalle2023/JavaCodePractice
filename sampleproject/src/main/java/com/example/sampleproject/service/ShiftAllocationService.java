package com.example.sampleproject.service;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sampleproject.model.AnalystsDetails;
import com.example.sampleproject.model.AnalystShiftAllocation;
import com.example.sampleproject.model.ShiftPlannerDetails;


@Service
public class ShiftAllocationService {

	enum ShiftType {
		APAC, EOC, AOC
	}

	
	public ShiftPlannerDetails getAnalystsCount(AnalystShiftAllocation s1) {
		ShiftPlannerDetails spd=new ShiftPlannerDetails();
		if (s1.getApacTickets() > 0 | s1.getEocTickets() > 0 | s1.getAocTickets() > 0) {
			try {
				int totalTickets = s1.getApacTickets() + s1.getEocTickets() + s1.getAocTickets();

				List<Integer> ticketCounts = Arrays.asList(s1.getApacTickets(), s1.getEocTickets(), s1.getAocTickets());

				int perAnalystTickets = totalTickets / s1.getNoOfAnalysts();

				// temporarily assigning list of Analysts to a shift
				List<Integer> listOfAnalysts = ticketCounts.stream().map(a -> a / perAnalystTickets)
						.collect(Collectors.toList());

				// Left over analysts who are not assigned to shift
				int leftOutAnalysts = s1.getNoOfAnalysts() - (listOfAnalysts.stream().mapToInt(b -> b).sum());

				HashMap<ShiftType, Integer> rA = new HashMap<>();

				rA.put(ShiftType.APAC, s1.getApacTickets() % (int) perAnalystTickets);
				rA.put(ShiftType.EOC, s1.getEocTickets() % (int) perAnalystTickets);
				rA.put(ShiftType.AOC, s1.getAocTickets() % (int) perAnalystTickets);

				// Ordering the remainder values in descending order to assign shift to
				// leftOutAnalysts
				HashMap<ShiftType, Integer> temp = rA.entrySet().stream()
						.sorted((i1, i2) -> i2.getValue().compareTo(i1.getValue())).collect(Collectors
								.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

				for (Map.Entry<ShiftType, Integer> en : temp.entrySet()) {
					if (leftOutAnalysts > 0) {
						switch (en.getKey()) {
						case APAC:
							listOfAnalysts.set(0, listOfAnalysts.get(0) + 1);
							break;
						case EOC:
							listOfAnalysts.set(1, listOfAnalysts.get(1) + 1);
							break;
						case AOC:
							listOfAnalysts.set(2, listOfAnalysts.get(2) + 1);
							break;
						}
						leftOutAnalysts = leftOutAnalysts - 1;
					}
				}
		
				spd.setApacAnalystsCount(listOfAnalysts.get(0));
				spd.setEocAnalystsCount(listOfAnalysts.get(1));
				spd.setAocAnalystsCount(listOfAnalysts.get(2));
			spd.setStatus("Analysts per Shift processed successfully!!");
				return spd;
			} 
			catch (ArithmeticException e) {
				spd.setStatus("unSuccessfull due to In Correct Data Entered");
			return spd;
			}
		} else {
			spd.setStatus("unSuccessfull due to In Correct Data Entered");
			return spd;
		}
	}

	public HashMap<AnalystsDetails, String> shiftAssignment(int apacAnalystCount, int eocAnalystsCount,
			int aocAnalystsCount, String shiftDuration) {

		ArrayList<AnalystsDetails> analystDetails = new ArrayList<>();
		analystDetails.add(new AnalystsDetails(1, "ABC", "2017-01-13", "ABC@dxc.com"));
		analystDetails.add(new AnalystsDetails(2, "DEF", "2018-01-13", "DEF@dxc.com"));
		analystDetails.add(new AnalystsDetails(3, "GHI", "2016-01-13", "GHI@dxc.com"));
		analystDetails.add(new AnalystsDetails(4, "JKL", "2019-01-13", "JKL@dxc.com"));
		analystDetails.add(new AnalystsDetails(5, "MNO", "2020-01-13", "MNO@dxc.com"));
		analystDetails.add(new AnalystsDetails(6, "PQR", "2017-01-13", "PQR@dxc.com"));
		analystDetails.add(new AnalystsDetails(7, "STU", "2021-01-13", "STU@dxc.com"));

		return null;

	}

}
