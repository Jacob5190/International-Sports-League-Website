package com.scie.sports.controller;

import com.scie.sports.pojo.ContactInfo;
import com.scie.sports.service.ContactInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactInfoController {
	final
	ContactInfoService contactInfoService;

	public ContactInfoController (ContactInfoService contactInfoService) {
		this.contactInfoService = contactInfoService;
	}

	@GetMapping("/contact")
	public ResponseEntity<List<ContactInfo>> getContactInfo() {
		return new ResponseEntity<>(contactInfoService.getContactInfo(), HttpStatus.OK);
	}

	@GetMapping("/contact/{id}")
	public ResponseEntity<ContactInfo> getContactInfoById(@PathVariable int id) {
		return new ResponseEntity<>(contactInfoService.getContactInfoById(id), HttpStatus.OK);
	}

	@PostMapping("/admin/contact")
	public ResponseEntity<Void> createContactInfo(@RequestBody ContactInfo contactInfo) {
		contactInfoService.createContactInfo(contactInfo);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/admin/contact")
	public ResponseEntity<Void> updateContactInfo(@RequestBody ContactInfo contactInfo) {
		contactInfoService.updateContactInfo(contactInfo);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/admin/contact/{id}")
	public ResponseEntity<Void> deleteContactInfo(@PathVariable int id) {
		contactInfoService.deleteContactInfo(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
