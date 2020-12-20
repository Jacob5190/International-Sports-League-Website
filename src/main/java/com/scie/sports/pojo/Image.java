package com.scie.sports.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "images")
@Data
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

	@Column(name = "sport_id")
	private Integer sportId;

	@Column(name = "is_selected")
	private boolean isSelected;
}
