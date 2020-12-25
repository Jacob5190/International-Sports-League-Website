package com.scie.sports.service;

import com.scie.sports.pojo.Document;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface DocumentService {
	List<Document> selectAll();
	Document getDocumentById(int id);
	String upload(MultipartFile file);
	void deleteDocument(int id);
}
