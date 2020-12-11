package com.scie.sports.pojo;

import javax.persistence.*;

@Entity
@Table(name = "documents")
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "path")
	private String path;

	@Column(name = "file_name")
	private String fileName;

	@Column(name = "original_file_name")
	private String originalFileName;

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

	public String getOriginalFileName () {
		return originalFileName;
	}

	public void setOriginalFileName (String originalFileName) {
		this.originalFileName = originalFileName;
	}
}
