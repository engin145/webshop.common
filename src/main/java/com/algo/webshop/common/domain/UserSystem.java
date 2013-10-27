package com.algo.webshop.common.domain;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserSystem implements UserDetails{

	private static final long serialVersionUID = -7731905177255306299L;
	
	private String username;
	private String password;
	private Collection<GrantedAuthority> authorities;
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAuthorities(String roles){
		this.authorities = new HashSet<GrantedAuthority>();
		for (final String role : roles.split(",")) {
			if (role != null && !"".equals(role.trim())) {
				GrantedAuthority grandAuthority = new GrantedAuthority() {
					private static final long serialVersionUID = -3006475436760929456L;

					public String getAuthority() {
						return role.trim();
					}
				};
				this.authorities.add(grandAuthority);
			}
		}
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
