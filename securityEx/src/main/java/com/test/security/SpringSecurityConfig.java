package com.test.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//스프링 시큐리티 사용 어노테이션
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	//WebSecurityConfigurerAdapter 상속
	private AuthenticationProvider authenticationProvider;
	
	public SpringSecurityConfig(AuthenticationProvider authenticationProvider) {
		this.authenticationProvider = authenticationProvider;
	}

}
