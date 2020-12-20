package com.scie.sports.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "documents")
@Data
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
}
