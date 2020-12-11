package com.scie.sports.pojo;

import javax.persistence.*;

@Entity
@Table(name = "schools")
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "image_id")
	private int imageId;

	@Column(name = "school_link")
	private String schoolLink;

	@Column(name = "alias")
	private String alias;

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public int getImageId () {
		return imageId;
	}

	public void setImageId (int imageId) {
		this.imageId = imageId;
	}

	public String getSchoolLink () {
		return schoolLink;
	}

	public void setSchoolLink (String schoolLink) {
		this.schoolLink = schoolLink;
	}

	public String getAlias () {
		return alias;
	}

	public void setAlias (String alias) {
		this.alias = alias;
	}
}
