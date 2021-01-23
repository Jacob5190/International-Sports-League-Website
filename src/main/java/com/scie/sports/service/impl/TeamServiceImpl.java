package com.scie.sports.service.impl;

import com.scie.sports.pojo.Team;
import com.scie.sports.dao.TeamDAO;
import com.scie.sports.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService{
	final
	TeamDAO teamDAO;

	public TeamServiceImpl (TeamDAO teamDAO) {
		this.teamDAO = teamDAO;
	}

	@Override
	public List<Team> getTeam (int schoolId, int sportId) {
		return teamDAO.findBySchoolIdAndSportIdOrderByDivision(schoolId, sportId);
	}

	@Override
	public List<Team> getTeamBySchoolId (int schoolId) {
		return teamDAO.findBySchoolId(schoolId);
	}

	@Override
	public Team getTeamById (int teamId) {
		return (teamDAO.findById(teamId).isPresent()) ? teamDAO.findById(teamId).get() : null;
	}

	@Override
	public List<Team> getTeamByDivision (int division) {
		return teamDAO.findByDivision(division);
	}

	@Override
	public List<Team> getTeamByAgeGenderDivision (int age, String gender, int division) {
		return teamDAO.findByAgeGroupAndGenderGroupAndDivision(age, gender, division);
	}

	@Override
	public void createTeam (String name, int schoolId, int sportId, int division, String gender, int ageGroup) {
		Team team = new Team();
		team.setName(name);
		team.setSchoolId(schoolId);
		team.setAgeGroup(ageGroup);
		team.setDivision(division);
		team.setGenderGroup(gender);
		team.setSportId(sportId);
		team = teamDAO.save(team);
		System.out.println(team);
	}

	@Override
	public void deleteTeam (int id) {
		teamDAO.deleteById(id);
	}
}
