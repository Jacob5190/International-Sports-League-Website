package com.scie.sports.service;

import java.util.List;
import java.util.Map;

public interface MemberService {
	List<String> listPosition(int teamId);
	Map<String, Object> listCoach(int teamId);
	Map<String, Object> listMember(int teamId);
}
