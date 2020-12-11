package com.scie.sports.dao;

import com.scie.sports.pojo.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentDAO extends JpaRepository<Document, Integer> {
}
