package com.eleos.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

//    public FormLoginConfigurer<HttpSecurity> httpSecurity() throws Exception{
//        return httpSecurity()
//                .authorizeRequests()
//                .antMatchers("/**")
//                .authenticated()
//                .and()
//                .formLogin();
//
//    }

    public void configure (HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/public/**").permitAll()
                .anyRequest().authenticated();
    }


}






























