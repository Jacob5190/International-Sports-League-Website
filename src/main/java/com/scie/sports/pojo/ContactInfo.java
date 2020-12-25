package com.scie.sports.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "contact_info")
@Data
public class ContactInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "name")
	private String name;

	@Column(name = "school")
	private String school;

	@Column(name = "extra")
	private String extra;
}
