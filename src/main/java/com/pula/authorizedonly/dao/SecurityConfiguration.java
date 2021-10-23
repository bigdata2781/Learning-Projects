package com.pula.authorizedonly.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	AbstractPreAuthenticatedProcessingFilter filter;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.addFilterAfter(filter, AbstractPreAuthenticatedProcessingFilter.class).authorizeRequests()
				.antMatchers("/static/**").permitAll().antMatchers("/").permitAll().antMatchers("/blogs").access("hasRole('ADMIN')").anyRequest().authenticated()
				;
	}
}
