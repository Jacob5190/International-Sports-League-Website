package com.scie.sports.controller;

import com.scie.sports.pojo.School;
import com.scie.sports.pojo.Sport;
import com.scie.sports.pojo.Team;
import com.scie.sports.service.SchoolService;
import com.scie.sports.service.SportService;
import com.scie.sports.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping("/admin/team")
	public ResponseEntity<Void> createTeam(@RequestParam(name = "name") String name,
	                                       @RequestParam(name = "schoolId") int schoolId,
	                                       @RequestParam(name = "sportId") int sportId,
	                                       @RequestParam(name = "division") int division,
	                                       @RequestParam(name = "genderGroup") String gender,
	                                       @RequestParam(name = "ageGroup") int ageGroup) {
		teamService.createTeam(name, schoolId, sportId, division, gender, ageGroup);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/team/schoolId/{schoolId}/sportId/{sportId}")
	public ResponseEntity<List<Team>> getTeam(@PathVariable int schoolId, @PathVariable int sportId) {
		return new ResponseEntity<>(teamService.getTeam(schoolId, sportId), HttpStatus.OK);
	}

	@GetMapping("/team/schoolId/{schoolId}")
	public ResponseEntity<List<Team>> getTeamBySchoolId(@PathVariable int schoolId) {
		return new ResponseEntity<>(teamService.getTeamBySchoolId(schoolId), HttpStatus.OK);
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

	@GetMapping("/team/age/{age}/gender/{gender}/division/{division}")
	public ResponseEntity<List<Team>> getTeamByAgeGenderDivision(@PathVariable int age, @PathVariable String gender, @PathVariable int division) {
		return new ResponseEntity<>(teamService.getTeamByAgeGenderDivision(age, gender, division), HttpStatus.OK);
	}

	@DeleteMapping("/admin/team/{id}")
	public ResponseEntity<Void> deleteTeam(@PathVariable int id) {
		teamService.deleteTeam(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
