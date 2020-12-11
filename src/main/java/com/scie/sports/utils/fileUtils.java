package com.scie.sports.utils;

import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public class fileUtils {
	public static String getFileName(MultipartFile file) {
		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
		String fileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + suffix;
		return fileName;
	}
}
