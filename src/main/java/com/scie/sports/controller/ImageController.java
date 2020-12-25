package com.scie.sports.controller;

import com.scie.sports.pojo.Image;
import com.scie.sports.service.ImageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@RestController
public class ImageController {
	final
	ImageService imageService;

	public ImageController (ImageService imageService) {
		this.imageService = imageService;
	}

	@PostMapping("/admin/image")
	public void uploadImage(@RequestParam(name = "file") MultipartFile file) {
		imageService.uploadGalleryImage(file);
	}

	@GetMapping("/image")
	public ResponseEntity<List<Image>> getImage() {
		return new ResponseEntity<>(imageService.selectAll("gallery"), HttpStatus.OK);
	}

	@GetMapping("/image/{id}")
	public ResponseEntity<Image> getImageById(@PathVariable int id) {
		return new ResponseEntity<>(imageService.getImageById(id), HttpStatus.OK);
	}
	@DeleteMapping("/admin/image/{id}")
	public ResponseEntity<Void> deleteImage(@PathVariable int id) {
		imageService.deleteGalleryImage(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
