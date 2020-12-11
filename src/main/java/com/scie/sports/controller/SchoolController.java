package com.scie.sports.controller;

import com.scie.sports.pojo.School;
import com.scie.sports.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SchoolController {
	final
	SchoolService schoolService;

	public SchoolController (SchoolService schoolService) {
		this.schoolService = schoolService;
	}

	@GetMapping("/school/{id}")
	public ResponseEntity<Map<String, Object>> getSchoolAndImgById(@PathVariable int id) {
		return new ResponseEntity<>(schoolService.getSchoolAndImgById(id), HttpStatus.OK);
	}
	@GetMapping("/school")
	public ResponseEntity<List<School>> getSchool() {
		return new ResponseEntity<>(schoolService.getSchool(), HttpStatus.OK);
	}
}
