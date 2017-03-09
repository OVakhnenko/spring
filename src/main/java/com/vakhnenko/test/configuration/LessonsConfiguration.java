package com.vakhnenko.test.configuration;

import com.vakhnenko.test.services.GreetingService;
import com.vakhnenko.test.services.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LessonsConfiguration {
    @Bean
    GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}