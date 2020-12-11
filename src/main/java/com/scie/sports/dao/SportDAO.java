package com.scie.sports.dao;

import com.scie.sports.pojo.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SportDAO extends JpaRepository<Sport, Integer> {
	List<Sport> findByIdGreaterThan(int val);
}
