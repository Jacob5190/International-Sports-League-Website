package com.scie.sports.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

public class UserDetailsImpl implements UserDetails, Serializable {
	private String username;
	private String password;
	private Set<? extends GrantedAuthority> authorities;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities () {
		return this.authorities;
	}

	@Override
	public String getPassword () {
		return this.password;
	}

	@Override
	public String getUsername () {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired () {
		return true;
	}

	@Override
	public boolean isAccountNonLocked () {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired () {
		return true;
	}

	@Override
	public boolean isEnabled () {
		return true;
	}

	public void setUsername (String username) {
		this.username = username;
	}

	public void setPassword (String password) {
		this.password = password;
	}

	public void setAuthorities (Set<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}
}
