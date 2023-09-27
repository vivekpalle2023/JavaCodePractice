package com.example.sampleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sampleproject.model.AnalystShiftAllocation;
import com.example.sampleproject.model.ShiftPlannerDetails;
import com.example.sampleproject.response.APIResponse;
import com.example.sampleproject.service.ShiftAllocationService;
import com.example.sampleproject.model.AnalystsDetails;
import java.util.HashMap;
import java.util.Optional;

@RestController
@RequestMapping("/hello")
public class ShiftAllocationController {
	
	@Autowired
	ShiftAllocationService service;
	
		
	@PostMapping("/getcountofanalystsperShift")
	public ResponseEntity<APIResponse> getCountOfAnalystsPerShift(@RequestBody AnalystShiftAllocation s)
	{
		Optional<ShiftPlannerDetails> data= Optional.ofNullable(service.getAnalystsCount(s));
		APIResponse response=new APIResponse(201,data,"","Success");
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/getshiftdetails")
	public ResponseEntity<APIResponse> getShiftdetails(@RequestBody ShiftPlannerDetails s2)
	{
		HashMap<AnalystsDetails, String> hm=service.shiftAssignment(s2.getApacAnalystsCount(),
				s2.getEocAnalystsCount(),s2.getAocAnalystsCount(),s2.getShiftDuration());
		
		return null;
		
	}
	
	

}
