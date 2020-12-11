package com.scie.sports.service;

import com.scie.sports.pojo.Sport;

import java.util.List;

public interface SportService {
	List<Sport> getInvitationSport ();
	Sport getSportById (int id);
}
