package com.scie.sports.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
	final
	UserDetailsServiceImpl userDetailsService;

	public CustomAuthenticationProvider (UserDetailsServiceImpl userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	@Override
	public Authentication authenticate (Authentication authentication) throws AuthenticationException {
		String username = (String) authentication.getPrincipal();
		String password = (String) authentication.getCredentials();
		UserDetails userDetails = userDetailsService.loadUserByUsername(username);
		if (!new BCryptPasswordEncoder().matches(password, userDetails.getPassword())) {
			throw new BadCredentialsException("Incorrect username or password");
		}
		return new UsernamePasswordAuthenticationToken(username, password, userDetails.getAuthorities());
	}

	@Override
	public boolean supports (Class<?> aClass) {
		return true;
	}
}
