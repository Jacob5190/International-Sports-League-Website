package com.scie.sports.controller;

import com.scie.sports.pojo.School;
import com.scie.sports.pojo.Sport;
import com.scie.sports.pojo.Team;
import com.scie.sports.service.SchoolService;
import com.scie.sports.service.SportService;
import com.scie.sports.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
	final
	TeamService teamService;
	final
	SchoolService schoolService;
	final
	SportService sportService;

	public TeamController (SchoolService schoolService, SportService sportService, TeamService teamService) {
		this.schoolService = schoolService;
		this.sportService = sportService;
		this.teamService = teamService;
	}
	@GetMapping("/team/schoolId/{schoolId}/sportId/{sportId}")
	public ResponseEntity<List<Team>> getTeam(@PathVariable int schoolId, @PathVariable int sportId) {
		return new ResponseEntity<>(teamService.getTeam(schoolId, sportId), HttpStatus.OK);
	}

	@GetMapping("/team/school/{schoolId}")
	public ResponseEntity<School> getSchoolById(@PathVariable int schoolId) {
		return new ResponseEntity<>(schoolService.getSchoolById(schoolId), HttpStatus.OK);
	}
	@GetMapping("/team/sport/{sportId}")
	public ResponseEntity<Sport> getSportById(@PathVariable int sportId) {
		return new ResponseEntity<>(sportService.getSportById(sportId), HttpStatus.OK);
	}
	@GetMapping("/team/{teamId}")
	public ResponseEntity<Team> getTeamById(@PathVariable int teamId) {
		return new ResponseEntity<>(teamService.getTeamById(teamId), HttpStatus.OK);
	}
	@GetMapping("/team/division/{division}")
	public ResponseEntity<List<Team>> getTeamByDivision(@PathVariable int division) {
		return new ResponseEntity<>(teamService.getTeamByDivision(division), HttpStatus.OK);
	}
}
