package com.scie.sports.dao;

import com.scie.sports.pojo.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberDAO extends JpaRepository<Member, Integer> {
	@Query(nativeQuery = true, value = "select distinct position from members where team_id=:teamId and not is_coach")
	List<String> listPosition(@Param("teamId") int teamId);
	List<Member> findByIsCoachTrueAndTeamId(@Param("teamId") int teamId);
	List<Member> findByIsCoachFalseAndTeamId(@Param("teamId") int teamId);
}
