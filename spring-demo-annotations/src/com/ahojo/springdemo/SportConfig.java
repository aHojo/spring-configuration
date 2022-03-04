package com.ahojo.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.ahojo.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    //define a bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }
    // define a bean for our boardgame class and inject dependency
    @Bean
    public Coach boardGameCoach(){
        return new BoardGameCoach(sadFortuneService()); // sadFortuneService is the bean id on the method above  - this is injecting the dependency.
    }
}
