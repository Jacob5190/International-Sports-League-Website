package com.scie.sports.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "calendar_event")
@Data
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
}
