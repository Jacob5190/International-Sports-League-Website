package com.scie.sports.pojo;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "path")
	private String path;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "image_type")
	private String imageType;

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public String getPath () {
		return path;
	}

	public void setPath (String path) {
		this.path = path;
	}

	public String getFileName () {
		return fileName;
	}

	public void setFileName (String fileName) {
		this.fileName = fileName;
	}

	public String getImageType () {
		return imageType;
	}

	public void setImageType (String imageType) {
		this.imageType = imageType;
	}
}
