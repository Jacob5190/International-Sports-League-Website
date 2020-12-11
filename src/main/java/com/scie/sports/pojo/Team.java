package com.scie.sports.pojo;

import javax.persistence.*;

@Entity
@Table(name = "teams")
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
	private String ageGroup;

	@Column(name = "gender_group")
	private String genderGroup;

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

	public int getSchoolId () {
		return schoolId;
	}

	public void setSchoolId (int schoolId) {
		this.schoolId = schoolId;
	}

	public int getSportId () {
		return sportId;
	}

	public void setSportId (int sportId) {
		this.sportId = sportId;
	}

	public int getDivision () {
		return division;
	}

	public void setDivision (int division) {
		this.division = division;
	}

	public int getTotalEvent () {
		return totalEvent;
	}

	public void setTotalEvent (int totalEvent) {
		this.totalEvent = totalEvent;
	}

	public int getWin () {
		return win;
	}

	public void setWin (int win) {
		this.win = win;
	}

	public int getDraw () {
		return draw;
	}

	public void setDraw (int draw) {
		this.draw = draw;
	}

	public int getLost () {
		return lost;
	}

	public void setLost (int lost) {
		this.lost = lost;
	}

	public int getScore () {
		return score;
	}

	public void setScore (int score) {
		this.score = score;
	}

	public String getAgeGroup () {
		return ageGroup;
	}

	public void setAgeGroup (String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getGenderGroup () {
		return genderGroup;
	}

	public void setGenderGroup (String genderGroup) {
		this.genderGroup = genderGroup;
	}
}
