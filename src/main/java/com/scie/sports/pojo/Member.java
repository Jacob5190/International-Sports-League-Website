package com.scie.sports.pojo;

import javax.persistence.*;

@Entity
@Table(name = "members")
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

	public Integer getImageId () {
		return imageId;
	}

	public void setImageId (Integer imageId) {
		this.imageId = imageId;
	}

	public boolean isCoach () {
		return isCoach;
	}

	public void setCoach (boolean coach) {
		isCoach = coach;
	}

	public String getPosition () {
		return position;
	}

	public void setPosition (String position) {
		this.position = position;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public int getTeamId () {
		return teamId;
	}

	public void setTeamId (int teamId) {
		this.teamId = teamId;
	}

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}
}
