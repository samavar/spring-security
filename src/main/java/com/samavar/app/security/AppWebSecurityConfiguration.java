package com.samavar.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class AppWebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth
            // enable in memory based authentication with a user named "user" and "admin"
            .inMemoryAuthentication().withUser("user").password("password").roles("USER")
                            .and().withUser("admin").password("password").roles("USER", "ADMIN");
    }
	
	
	protected void configure(HttpSecurity http) throws Exception {

		http
			.authorizeRequests()
				.anyRequest().authenticated()
				.and()
			.formLogin().and()
			.httpBasic();
	}
}
