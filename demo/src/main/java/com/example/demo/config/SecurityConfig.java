package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) {
        try {
        httpSecurity.csrf(csr -> csr.disable())
                .authorizeHttpRequests((request) -> {
                    request.requestMatchers("/register").permitAll()
                            .anyRequest().authenticated();
                });
            return httpSecurity.build();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}