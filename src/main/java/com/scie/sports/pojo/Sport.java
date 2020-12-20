package com.scie.sports.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Sports")
@Data
public class Sport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
}
