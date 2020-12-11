package com.scie.sports.service;

import com.scie.sports.pojo.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {
	List<Image> selectAll (String type);
	Image getImageById (int id);
	String uploadGalleryImage (MultipartFile file);
	void deleteGalleryImage (int id);
}
