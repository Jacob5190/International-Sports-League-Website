package com.scie.sports.controller;

import com.scie.sports.pojo.Document;
import com.scie.sports.service.DocumentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class DocumentController {
	final
	DocumentService documentService;

	public DocumentController (DocumentService documentService) {
		this.documentService = documentService;
	}

	@PostMapping("/document")
	public ResponseEntity<Void> uploadDocument(@RequestParam (name = "file") MultipartFile file) {
		documentService.upload(file);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/document")
	public ResponseEntity<List<Document>> getDocument() {
		return new ResponseEntity<>(documentService.selectAll(), HttpStatus.OK);
	}

	@DeleteMapping("/document/{id}")
	public ResponseEntity<Void> deleteDocument(@PathVariable int id) {
		documentService.deleteDocument(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
