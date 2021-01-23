package com.scie.sports.dao;

import com.scie.sports.pojo.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageDAO extends JpaRepository<Image, Integer> {
	List<Image> findByImageType(String type);
	List<Image> findBySportId(int sportId);
}
