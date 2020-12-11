package com.scie.sports.service.impl;

import com.scie.sports.pojo.CalendarEvent;
import com.scie.sports.dao.CalendarEventDAO;
import com.scie.sports.service.CalendarEventService;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class CalendarEventServiceImpl implements CalendarEventService {
	final
	CalendarEventDAO calendarEventDAO;

	public CalendarEventServiceImpl (CalendarEventDAO calendarEventDAO) {
		this.calendarEventDAO = calendarEventDAO;
	}

	@Override
	public List<CalendarEvent> selectAll () {
		return calendarEventDAO.findAll();
	}

	@Override
	public void updateEvent (String date, String title) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse(date);
		CalendarEvent event = new CalendarEvent();
		event.setDate(d);
		event.setTitle(title);
		calendarEventDAO.save(event);
	}

	@Override
	public void deleteEvent (int id) {
		calendarEventDAO.deleteById(id);
	}
}
