package com.scie.sports.controller;

import com.scie.sports.pojo.CalendarEvent;
import com.scie.sports.service.CalendarEventService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class CalendarEventController {
	final
	CalendarEventService calendarEventService;

	public CalendarEventController (CalendarEventService calendarEventService) {
		this.calendarEventService = calendarEventService;
	}

	@GetMapping ("/calendar-event")
	public ResponseEntity<List<CalendarEvent>> getCalendarEvent () {
		return new ResponseEntity<>(calendarEventService.selectAll(), HttpStatus.OK);
	}

	@PostMapping("/calendar-event")
	public ResponseEntity<Void> uploadCalendarEvent(@RequestParam(name = "date") String date, @RequestParam(name = "title") String title) throws ParseException {
		calendarEventService.updateEvent(date, title);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@DeleteMapping("/calendar-event/{id}")
	public ResponseEntity<Void> deleteCalendarEvent(@PathVariable int id) {
		calendarEventService.deleteEvent(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
