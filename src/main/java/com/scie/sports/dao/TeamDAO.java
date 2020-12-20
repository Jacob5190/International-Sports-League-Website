package com.scie.sports.dao;

import com.scie.sports.pojo.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamDAO extends JpaRepository<Team, Integer> {
	@Query (nativeQuery = true, value = "select distinct division from teams")
	List<String> listDivision();
	List<Team> findByAgeGroupAndGenderGroupAndDivision (int ageGroup, String genderGroup, int division);
	List<Team> findBySchoolIdAndSportIdOrderByDivision (int schoolId, int sportId);
	List<Team> findByDivision (int division);
}
