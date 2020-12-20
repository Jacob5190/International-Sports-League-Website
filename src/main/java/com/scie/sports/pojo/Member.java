package com.scie.sports.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "members")
@Data
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "team_id")
	private int teamId;

	@Column(name = "name")
	private String name;

	@Column(name = "position")
	private String position;

	@Column(name = "is_coach")
	private boolean isCoach;

	@Column(name = "image_id")
	private Integer imageId;
}
