package com.scie.sports.service.impl;

import com.scie.sports.pojo.Document;
import com.scie.sports.dao.DocumentDAO;
import com.scie.sports.service.DocumentService;
import com.scie.sports.utils.fileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {
	final
	DocumentDAO documentDAO;
	@Value("${prop.document.upload-folder}")
	private String UPLOAD_FOLDER;

	public DocumentServiceImpl (DocumentDAO documentDAO) {
		this.documentDAO = documentDAO;
	}

	@Override
	public List<Document> selectAll () {
		return documentDAO.findAll();
	}

	@Override
	public String upload (MultipartFile file) {
		if (file == null) {
			return "File null exception";
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
			Document d = new Document();
			d.setPath(path);
			d.setFileName(fileName);
			d.setOriginalFileName(file.getOriginalFilename());
			documentDAO.save(d);
			return "File upload success";
		} catch (IOException e) {
			e.printStackTrace();
			return "File save exception";
		}
	}

	@Override
	public void deleteDocument (int id) {
		documentDAO.deleteById(id);
	}
}
