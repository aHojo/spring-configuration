package com.ahojo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve the bean
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());


        // let's call fortune server - dependency injection - injected with the bean in applicationContext.xml
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}




