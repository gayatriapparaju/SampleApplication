package com.example.SampleApplication.Controller;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Service;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http 
		.csrf() 
		.disable()
		.authorizeRequests()
		.antMatchers("/**").hasAnyRole("USER")
		.and()
		.formLogin().loginPage("/login").permitAll();
    }
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		  auth.inMemoryAuthentication()
		  .withUser("krishna").password("{noop}krishna").roles("USER").and()
		  .withUser("naveen").password("{noop}naveen").roles("USER");
	}
	

}
