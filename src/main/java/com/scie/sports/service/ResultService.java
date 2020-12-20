package com.scie.sports.service;

import com.scie.sports.pojo.Result;

import java.util.List;

public interface ResultService {
	List<Result> getResultByAgeGenderDivision (int age, String gender, int division);
}
