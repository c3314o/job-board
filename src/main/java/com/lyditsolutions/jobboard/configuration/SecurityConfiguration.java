package com.lyditsolutions.jobboard.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    private AccessDeniedHandler accessDeniedHandler;

    @Autowired
    public SecurityConfiguration(AccessDeniedHandler accessDeniedHandler) {
        this.accessDeniedHandler = accessDeniedHandler;
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity

                .authorizeRequests().antMatchers("/").permitAll().and()
                .authorizeRequests().antMatchers("/console/**").permitAll()
                .and()
                .authorizeRequests().antMatchers("/api/job-board/**").hasAnyRole("NORMAL_USER")
                .and()
                .authorizeRequests().antMatchers("/api/job-board-admin/**").hasAnyRole("ADMIN_USER")
                .and()
                .formLogin().loginPage("/login").permitAll()
                .and()
                .logout().permitAll()
                .and()
                .exceptionHandling().accessDeniedHandler(accessDeniedHandler);
        ;

        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
    }

}