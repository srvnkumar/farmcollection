package com.example.devteam.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())
                .authorizeRequests(requests -> requests
                        .antMatchers("/farmname/**/**/**","/cropdetails/**")
                        .permitAll()
                       // .antMatchers("**/**").permitAll()
                        .anyRequest().authenticated());
		// TODO Auto-generated method stub
		//super.configure(http);
	}
	
//	 @Override
//	    public void configure(WebSecurity web) {
//	        web.ignoring().antMatchers("/farmname", "/cropdetails");
//	    }

}
