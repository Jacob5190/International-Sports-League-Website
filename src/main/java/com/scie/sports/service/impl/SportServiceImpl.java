package com.scie.sports.service.impl;

import com.scie.sports.pojo.Sport;
import com.scie.sports.dao.SportDAO;
import com.scie.sports.service.SportService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SportServiceImpl implements SportService {
	final
	SportDAO sportDAO;

	public SportServiceImpl (SportDAO sportDAO) {
		this.sportDAO = sportDAO;
	}

	@Override
	public List<Sport> getInvitationSport () {
		return sportDAO.findByIdGreaterThan(3);
	}

	@Override
	public Sport getSportById (int id) {
		return (sportDAO.findById(id).isPresent()) ? sportDAO.findById(id).get() : null;
	}
}
