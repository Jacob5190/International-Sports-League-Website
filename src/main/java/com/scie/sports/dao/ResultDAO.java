package com.scie.sports.dao;

import com.scie.sports.pojo.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultDAO extends JpaRepository<Result, Integer> {
	List<Result> findByAgeGroupAndGenderGroupAndDivision(int ageGroup, String genderGroup, int division);
}
