package com.scie.sports.dao;

import com.scie.sports.pojo.CalendarEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendarEventDAO extends JpaRepository<CalendarEvent, Integer> {
}
