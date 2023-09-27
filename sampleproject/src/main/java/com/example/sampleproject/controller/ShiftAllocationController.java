package com.example.sampleproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sampleproject.model.ShiftDivision;
import com.example.sampleproject.response.APIResponse;
import com.example.sampleproject.service.ShiftPlannerService;

@RestController
@RequestMapping("/hello")
public class ShiftDivisionController {
	
	@Autowired
	ShiftPlannerService service;
	
		
	@PostMapping("/GetDetails")
	public ResponseEntity<APIResponse> getDetails(@RequestBody ShiftDivision s)
	{

		String data= service.calculateNoAnalysts(s.getMorningShiftTicketCount(),
													s.getAfterNoonShiftTicketCount(),
													s.getNightShiftTicketCount(),
													s.getNoOfAnalysts());
	
		APIResponse response=new APIResponse(201,data,"","Success");
		
		return ResponseEntity.ok(response);
		
	}
	
	

}
