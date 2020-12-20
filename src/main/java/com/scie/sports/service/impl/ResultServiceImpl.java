package com.scie.sports.service.impl;

import com.scie.sports.dao.ResultDAO;
import com.scie.sports.pojo.Result;
import com.scie.sports.service.ResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
	final
	ResultDAO resultDAO;

	public ResultServiceImpl (ResultDAO resultDAO) {
		this.resultDAO = resultDAO;
	}

	@Override
	public List<Result> getResultByAgeGenderDivision (int age, String gender, int division) {
		return resultDAO.findByAgeGroupAndGenderGroupAndDivision(age, gender, division);
	}
}
