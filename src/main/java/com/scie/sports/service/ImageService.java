package com.scie.sports.service;

import com.scie.sports.pojo.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {
	List<Image> selectAll (String type);
	List<Image> getImageBySportId (int sportId);
	Image getImageById (int id);
	Image uploadImage(MultipartFile file, String type, int sportId);
	void deleteImage (int id);
}
