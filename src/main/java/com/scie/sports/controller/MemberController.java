package com.scie.sports.controller;

import com.scie.sports.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MemberController {
	final
	MemberService memberService;

	public MemberController (MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping("/member/positions/teamId/{teamId}")
	public ResponseEntity<List<String>> listPosition(@PathVariable int teamId) {
		return new ResponseEntity<>(memberService.listPosition(teamId), HttpStatus.OK);
	}
	@GetMapping("/member/coach/teamId/{teamId}")
	public ResponseEntity<Map<String, Object>> listCoach(@PathVariable int teamId) {
		return new ResponseEntity<>(memberService.listCoach(teamId), HttpStatus.OK);
	}
	@GetMapping("/member/teamId/{teamId}")
	public ResponseEntity<Map<String, Object>> listMember(@PathVariable int teamId) {
		return new ResponseEntity<>(memberService.listMember(teamId), HttpStatus.OK);
	}
}
