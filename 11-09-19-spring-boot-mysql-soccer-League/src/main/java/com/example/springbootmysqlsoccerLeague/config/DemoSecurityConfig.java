package com.example.springbootmysqlsoccerLeague.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// add our users for in memory authentication
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("john").password("test123").roles("EMPLOYEE"))
			.withUser(users.username("mary").password("test123").roles("MANAGER"))
			.withUser(users.username("susan").password("test123").roles("ADMIN"));
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		System.out.println("security config initialized..!");
		http.authorizeRequests()
		.antMatchers("/").access("hasRole('EMPLOYEE') or hasRole('MANAGER') or hasRole('ADMIN')")
		.antMatchers("/leagues/list**").access("hasRole('EMPLOYEE') or hasRole('MANAGER') or hasRole('ADMIN')")
		.antMatchers("/leagues/showFormForUpdate/**").access("hasRole('MANAGER') or hasRole('ADMIN')")
		.antMatchers("/leagues/showFormForAdd/**").hasRole("ADMIN")
		.antMatchers("/leagues/delete/**").hasRole("ADMIN")
		.and()
		.formLogin()
		.loginPage("/showMyLoginPage")
		.loginProcessingUrl("/authenticateTheUser")
		.permitAll()
		.and()
		.logout().permitAll();
		
	}
	
}
