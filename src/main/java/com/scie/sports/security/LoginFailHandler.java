package com.scie.sports.security;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class LoginFailHandler implements AuthenticationFailureHandler {
	@Override
	public void onAuthenticationFailure (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException {
		httpServletResponse.setContentType("application/json;charset=utf-8");
		httpServletResponse.setStatus(500);
		if (e instanceof UsernameNotFoundException || e instanceof BadCredentialsException) {
			httpServletResponse.getWriter().write("{ \"msg\": \"Incorrect username or password\" }");
		} else {
			httpServletResponse.getWriter().write("{ \"msg\": \"Unknown Error\" }");
		}
	}
}
