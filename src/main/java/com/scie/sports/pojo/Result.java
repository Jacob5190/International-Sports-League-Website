package com.scie.sports.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Result")
@Data
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "team1_id")
	private int team1Id;

	@Column(name = "team1_score")
	private int team1Score;

	@Column(name = "team2_id")
	private int team2Id;

	@Column(name = "team2_score")
	private int team2Score;

	@Column(name = "age_group")
	private int ageGroup;

	@Column(name = "gender_group")
	private String genderGroup;

	@Column(name = "division")
	private int division;
}
