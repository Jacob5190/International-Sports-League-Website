package com.scie.sports.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
	@Override
	public UserDetails loadUserByUsername (String s) throws UsernameNotFoundException {
		UserDetailsImpl userDetails = new UserDetailsImpl();
		userDetails.setUsername(s);
		userDetails.setPassword(new BCryptPasswordEncoder().encode("admin"));
		Set<GrantedAuthority> authoritySet = new HashSet<>();
		GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_ADMIN");
		authoritySet.add(authority);
		userDetails.setAuthorities(authoritySet);
		return userDetails;
	}
}
