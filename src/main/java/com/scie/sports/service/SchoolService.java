package com.scie.sports.service;

import com.scie.sports.pojo.School;

import java.util.List;
import java.util.Map;

public interface SchoolService {
	Map<String, Object> getSchoolAndImgById (int id);
	List<School> getSchool ();
	School getSchoolById(int id) ;
}
