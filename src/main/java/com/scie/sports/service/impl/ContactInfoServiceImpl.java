package com.scie.sports.service.impl;

import com.scie.sports.dao.ContactInfoDAO;
import com.scie.sports.pojo.ContactInfo;
import com.scie.sports.service.ContactInfoService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactInfoServiceImpl implements ContactInfoService {
	final
	ContactInfoDAO contactInfoDAO;
	public ContactInfoServiceImpl (ContactInfoDAO contactInfoDAO) {
		this.contactInfoDAO = contactInfoDAO;
	}

	@Override
	public List<ContactInfo> getContactInfo () {
		return contactInfoDAO.findAll();
	}

	@Override
	public ContactInfo getContactInfoById (int id) {
		return contactInfoDAO.findById(id).isPresent() ? contactInfoDAO.findById(id).get() : null;
	}

	@Override
	public void updateContactInfo (ContactInfo contactInfo) {
		contactInfoDAO.save(contactInfo);
	}

	@Override
	public void deleteContactInfo (int id) {
		contactInfoDAO.deleteById(id);
	}

	@Override
	public void createContactInfo (ContactInfo contactInfo) {
		contactInfoDAO.save(contactInfo);
	}
}
