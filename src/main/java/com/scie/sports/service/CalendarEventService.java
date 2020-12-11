package com.scie.sports.service;


import com.scie.sports.pojo.CalendarEvent;

import java.text.ParseException;
import java.util.List;

public interface CalendarEventService {
	List<CalendarEvent> selectAll();
	void updateEvent(String date, String title) throws ParseException;
	void deleteEvent(int id);
}
