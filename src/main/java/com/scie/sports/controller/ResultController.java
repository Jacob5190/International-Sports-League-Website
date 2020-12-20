package com.scie.sports.controller;

import com.scie.sports.pojo.Result;
import com.scie.sports.service.ResultService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ResultController {
	final
	ResultService resultService;

	public ResultController (ResultService resultService) {
		this.resultService = resultService;
	}

	@GetMapping("/result/age/{age}/gender/{gender}/division/{division}")
	public ResponseEntity<List<Result>> getResults(@PathVariable int age, @PathVariable String gender, @PathVariable int division){
		return new ResponseEntity<>(resultService.getResultByAgeGenderDivision(age, gender, division), HttpStatus.OK);
	}
}
