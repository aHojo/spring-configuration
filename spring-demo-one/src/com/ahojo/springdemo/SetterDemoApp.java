package com.ahojo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrienve been from spring container

        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
//        CricketCoach: inside no-arg constructor
//        CricketCoach: inside setter method - setFortuneService
//        Practice fast bowling for 15 minutes
//        Today is your lucky day!
        // Call our new methods to get the literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());
        // close the context
        context.close();
    }
}
