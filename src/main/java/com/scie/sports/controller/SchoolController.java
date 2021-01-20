package com.scie.sports.controller;

import com.scie.sports.pojo.School;
import com.scie.sports.service.SchoolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
	@PostMapping("/admin/school")
	public ResponseEntity<Void> uploadSchool(@RequestParam(name = "name") String name,
	                                         @RequestParam(name = "alias") String alias,
	                                         @RequestParam(name = "link") String link,
	                                         @RequestParam(name = "image") MultipartFile image) {
		schoolService.uploadSchool(name, alias, link, image);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/admin/school/{id}")
	public ResponseEntity<Void> deleteSchool (@PathVariable int id) {
		schoolService.deleteSchool(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
