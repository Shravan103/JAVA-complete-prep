package com.example.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//	@Configuration: This class contains bean definitions (configuration). 
//					Please read it when creating the IoC container.
@Configuration
public class AppConfig {
//	@Bean: The object returned by this method should become a Spring bean.
    @Bean
    public Sim sim() {

        return new Jio();

    }

}

//	Bean Name : sim
//	Bean Type : Sim
//	Bean Object : Jio