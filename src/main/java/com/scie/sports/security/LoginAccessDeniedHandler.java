package com.scie.sports.security;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginAccessDeniedHandler implements AccessDeniedHandler {
	@Override
	public void handle (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException {
		httpServletResponse.setContentType("application/json;charset=utf-8");
		httpServletResponse.setStatus(300);
		httpServletResponse.getWriter().write("msg: \"Access Denied\"");
	}
}
