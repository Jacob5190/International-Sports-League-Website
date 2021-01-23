package com.scie.sports.service;

import com.scie.sports.pojo.Team;

import java.util.List;

public interface TeamService {
	List<Team> getTeam(int schoolId, int sportId);
	List<Team> getTeamBySchoolId(int schoolId);
	Team getTeamById(int teamId);
	List<Team> getTeamByDivision(int division);
	List<Team> getTeamByAgeGenderDivision(int age, String gender, int division);
	void createTeam(String name, int schoolId, int sportId, int division, String gender, int ageGroup);
	void deleteTeam(int id);
}
