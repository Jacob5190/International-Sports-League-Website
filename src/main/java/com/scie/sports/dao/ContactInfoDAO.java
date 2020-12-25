package com.scie.sports.dao;

import com.scie.sports.pojo.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInfoDAO extends JpaRepository<ContactInfo, Integer> {
}
