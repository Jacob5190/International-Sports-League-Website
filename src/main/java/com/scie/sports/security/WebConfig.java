package com.scie.sports.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter {
	final
	LoginEntryPoint loginEntryPoint;

	final
	LogoutSuccessHandler logoutSuccessHandler;

	final
	LoginSuccessHandler loginSuccessHandler;

	final
	LoginFailHandler loginFailHandler;

	final
	CustomAuthenticationProvider customAuthenticationProvider;

	final
	LoginAccessDeniedHandler loginAccessDeniedHandler;

	public WebConfig (LoginEntryPoint loginEntryPoint, LogoutSuccessHandler logoutSuccessHandler, LoginSuccessHandler loginSuccessHandler, LoginFailHandler loginFailHandler, CustomAuthenticationProvider customAuthenticationProvider, LoginAccessDeniedHandler loginAccessDeniedHandler) {
		this.loginEntryPoint = loginEntryPoint;
		this.logoutSuccessHandler = logoutSuccessHandler;
		this.loginSuccessHandler = loginSuccessHandler;
		this.loginFailHandler = loginFailHandler;
		this.customAuthenticationProvider = customAuthenticationProvider;
		this.loginAccessDeniedHandler = loginAccessDeniedHandler;
	}

	@Override
	protected void configure (HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/admin/**").authenticated();
		http.authorizeRequests().anyRequest().permitAll();
		http.httpBasic().authenticationEntryPoint(loginEntryPoint);
		http.formLogin().successHandler(loginSuccessHandler).failureHandler(loginFailHandler);
		http.logout().logoutSuccessHandler(logoutSuccessHandler).permitAll();
		http.exceptionHandling().accessDeniedHandler(loginAccessDeniedHandler);
		http.csrf().disable();
	}

	@Override
	protected void configure (AuthenticationManagerBuilder auth) {
		auth.authenticationProvider(customAuthenticationProvider);
	}
}
