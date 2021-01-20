package com.scie.sports.service;

import com.scie.sports.pojo.School;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Map;

public interface SchoolService {
	Map<String, Object> getSchoolAndImgById (int id);
	List<School> getSchool ();
	School getSchoolById(int id) ;
	void uploadSchool(String name, String alias, String link, MultipartFile image);
	void deleteSchool(int id);
}
