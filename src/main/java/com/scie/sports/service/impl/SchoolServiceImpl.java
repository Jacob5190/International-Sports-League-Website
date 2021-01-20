package com.scie.sports.service.impl;

import com.scie.sports.pojo.Image;
import com.scie.sports.pojo.School;
import com.scie.sports.dao.ImageDAO;
import com.scie.sports.dao.SchoolDAO;
import com.scie.sports.service.ImageService;
import com.scie.sports.service.SchoolService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SchoolServiceImpl implements SchoolService {
	final
	SchoolDAO schoolDAO;
	final
	ImageService imageService;

	public SchoolServiceImpl (SchoolDAO schoolDAO, ImageService imageService) {
		this.schoolDAO = schoolDAO;
		this.imageService = imageService;
	}

	@Override
	public Map<String, Object> getSchoolAndImgById (int id) {
		Map<String, Object> map = new HashMap<String, Object>(2);
		School school = schoolDAO.findById(id).get();
		Image image = imageService.getImageById(school.getImageId());
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

	@Override
	public void uploadSchool (String name, String alias, String link, MultipartFile image) {
		int imageId = imageService.uploadImage(image, "school", 0).getId();
		School school = new School();
		school.setName(name);
		school.setAlias(alias);
		school.setSchoolLink(link);
		school.setImageId(imageId);
		school = schoolDAO.save(school);
		System.out.println(school);
	}
}
