package com.scie.sports.pojo;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "calendar_event")
public class CalendarEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "start_date", columnDefinition = "DATE")
	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name = "title")
	private String title;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public String getTitle () {
		return title;
	}

	public void setTitle (String title) {
		this.title = title;
	}
}
