package com.scie.sports.controller;

import com.scie.sports.pojo.Sport;
import com.scie.sports.service.SportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SportController {
	final
	SportService sportService;

	public SportController (SportService sportService) {
		this.sportService = sportService;
	}

	@GetMapping("/sport")
	public ResponseEntity<List<Sport>> getInvitationSport() {
		return new ResponseEntity<>(sportService.getInvitationSport(), HttpStatus.OK);
	}
}
