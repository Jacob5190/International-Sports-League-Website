package com.scie.sports.service.impl;

import com.scie.sports.pojo.Image;
import com.scie.sports.pojo.Member;
import com.scie.sports.dao.ImageDAO;
import com.scie.sports.dao.MemberDAO;
import com.scie.sports.service.MemberService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MemberServiceImpl implements MemberService {
	final
	MemberDAO memberDAO;
	final
	ImageDAO imageDAO;

	public MemberServiceImpl (MemberDAO memberDAO, ImageDAO imageDAO) {
		this.memberDAO = memberDAO;
		this.imageDAO = imageDAO;
	}

	@Override
	public List<String> listPosition (int teamId) {
		return memberDAO.listPosition(teamId);
	}

	@Override
	public Map<String, Object> listCoach (int teamId) {
		List<Member> coaches = memberDAO.findByIsCoachTrueAndTeamId(teamId);
		List<Image> images = new ArrayList<>();
		for (Member coach : coaches) {
			images.add((coach.getImageId()!=null)?imageDAO.findById(coach.getImageId()).get():null);
		}
		Map<String, Object> map = new HashMap();
		map.put("coaches", coaches);
		map.put("images", images);
		return map;
	}

	@Override
	public Map<String, Object> listMember (int teamId) {
		List<Member> members = memberDAO.findByIsCoachFalseAndTeamId(teamId);
		List<Image> images = new ArrayList<>();
		for (Member member : members) {
			images.add((member.getImageId()!=null)?imageDAO.findById(member.getImageId()).get():null);
		}
		Map<String, Object> map = new HashMap();
		map.put("members", members);
		map.put("images", images);
		return map;
	}

}
