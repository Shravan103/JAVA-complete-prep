package com.example.ioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan: Go to this package and look for classes marked with @Component.
@ComponentScan(basePackages = "com.example.ioc")
public class AppConfig {

}

//There is NO @Bean
//Because Spring will automatically discover classes using: @ComponentScan