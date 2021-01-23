package com.scie.sports.service.impl;

import com.scie.sports.pojo.Image;
import com.scie.sports.dao.ImageDAO;
import com.scie.sports.service.ImageService;
import com.scie.sports.utils.fileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
	final
	ImageDAO imageDAO;
	@Value("${prop.image.upload-folder}")
	private String UPLOAD_FOLDER;

	public ImageServiceImpl (ImageDAO imageDAO) {
		this.imageDAO = imageDAO;
	}

	@Override
	public List<Image> selectAll (String type) {
		return imageDAO.findByImageType(type);
	}

	@Override
	public List<Image> getImageBySportId (int sportId) {
		return imageDAO.findBySportId(sportId);
	}

	@Override
	public Image getImageById (int id) {
		return (imageDAO.findById(id).isPresent()) ? imageDAO.findById(id).get() : null;
	}

	@Override
	public Image uploadImage (MultipartFile file, String type, int sportId) {
		if (file == null) {
			return null;
		}
		String savePath = UPLOAD_FOLDER;
		File savePathFile = new File(savePath);
		if (! savePathFile.exists()) {
			savePathFile.mkdir();
		}
		String fileName = fileUtils.getFileName(file);
		try {
			String path = savePath + fileName;
			file.transferTo(new File(path));
			Image i = new Image();
			i.setPath(path);
			i.setFileName(fileName);
			i.setImageType(type);
			i.setSportId(sportId != 0 ? sportId : null);
			return imageDAO.save(i);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}


	@Override
	public void deleteImage (int id) {
		String imagePath = getImageById(id).getPath();
		File imageFile = new File(imagePath);
		imageFile.delete();
		imageDAO.deleteById(id);
	}
}
