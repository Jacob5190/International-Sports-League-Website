package com.scie.sports.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "schools")
@Data
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
}
