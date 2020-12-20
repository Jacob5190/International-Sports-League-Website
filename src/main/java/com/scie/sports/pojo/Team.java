package com.scie.sports.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "teams")
@Data
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "school_id")
	private int schoolId;

	@Column(name = "sport_id")
	private int sportId;

	@Column(name = "division")
	private int division;

	@Column(name = "total_event")
	private int totalEvent;

	@Column(name = "win")
	private int win;

	@Column(name = "draw")
	private int draw;

	@Column(name = "lost")
	private int lost;

	@Column(name = "score")
	private int score;

	@Column(name = "age_group")
	private int ageGroup;

	@Column(name = "gender_group")
	private String genderGroup;
}
