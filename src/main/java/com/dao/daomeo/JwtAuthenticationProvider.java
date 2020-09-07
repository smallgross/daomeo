package com.dao.daomeo;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.dao.daomeo.service.UserServerice;

public class JwtAuthenticationProvider extends DaoAuthenticationProvider {

	public JwtAuthenticationProvider(UserServerice userServerice) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return false;
	}

}
