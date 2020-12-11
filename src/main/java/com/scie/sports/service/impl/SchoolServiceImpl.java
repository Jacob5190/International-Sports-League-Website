package com.scie.sports.service.impl;

import com.scie.sports.pojo.Image;
import com.scie.sports.pojo.School;
import com.scie.sports.dao.ImageDAO;
import com.scie.sports.dao.SchoolDAO;
import com.scie.sports.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SchoolServiceImpl implements SchoolService {
	final
	SchoolDAO schoolDAO;
	final
	ImageDAO imageDAO;

	public SchoolServiceImpl (SchoolDAO schoolDAO, ImageDAO imageDAO) {
		this.schoolDAO = schoolDAO;
		this.imageDAO = imageDAO;
	}

	@Override
	public Map<String, Object> getSchoolAndImgById (int id) {
		Map<String, Object> map = new HashMap<String, Object>(2);
		School school = schoolDAO.findById(id).get();
		Image image = imageDAO.findById(school.getImageId()).get();
		map.put("schoolObj", school);
		map.put("imgObj", image);
		return map;
	}

	@Override
	public List<School> getSchool () {
		return schoolDAO.findAll();
	}

	@Override
	public School getSchoolById (int id) {
		return (schoolDAO.findById(id).isPresent())?schoolDAO.findById(id).get():null;
	}
}
