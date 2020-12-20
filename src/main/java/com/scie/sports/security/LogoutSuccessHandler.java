package com.scie.sports.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class LogoutSuccessHandler implements org.springframework.security.web.authentication.logout.LogoutSuccessHandler {
	@Override
	public void onLogoutSuccess (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException {
		httpServletResponse.setContentType("application/json;charset=utf-8");
		httpServletResponse.setStatus(200);
		httpServletResponse.getWriter().write("{ \"msg\": \"Logout Success\" }");
	}
}
