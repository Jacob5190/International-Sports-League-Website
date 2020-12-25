package com.scie.sports.service;

import com.scie.sports.pojo.ContactInfo;
import java.util.List;

public interface ContactInfoService {
	List<ContactInfo> getContactInfo();
	ContactInfo getContactInfoById(int id);
	void updateContactInfo(ContactInfo contactInfo);
	void deleteContactInfo(int id);
	void createContactInfo(ContactInfo contactInfo);
}
