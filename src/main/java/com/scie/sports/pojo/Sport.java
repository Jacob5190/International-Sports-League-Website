package com.scie.sports.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Sports")
public class Sport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}
}
