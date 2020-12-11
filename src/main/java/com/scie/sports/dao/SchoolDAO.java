package com.scie.sports.dao;

import com.scie.sports.pojo.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDAO extends JpaRepository<School, Integer> {
}
