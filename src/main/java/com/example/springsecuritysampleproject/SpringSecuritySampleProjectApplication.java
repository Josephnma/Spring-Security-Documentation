package com.example.springsecuritysampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@EnableWebSecurity
@SpringBootApplication
public class SpringSecuritySampleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecuritySampleProjectApplication.class, args);
    }

}
