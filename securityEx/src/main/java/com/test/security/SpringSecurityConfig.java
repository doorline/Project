package com.test.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//������ ��ť��Ƽ ��� ������̼�
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	//WebSecurityConfigurerAdapter ���
	private AuthenticationProvider authenticationProvider;
	
	public SpringSecurityConfig(AuthenticationProvider authenticationProvider) {
		this.authenticationProvider = authenticationProvider;
	}

}
