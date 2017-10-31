package com.shepherds.programming.challenge.config;

/**
 * Created by youssefsiblini on 30/10/2017.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.shepherds.programming.challenge")
@EnableWebMvc
public class AppConfig {
}
