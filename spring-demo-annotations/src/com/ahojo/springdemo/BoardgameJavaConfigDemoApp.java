package com.ahojo.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardgameJavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
//        Coach theCoach = context.getBean("thatEsportCoach", Coach.class);
//        Coach theCoach = context.getBean("boardGameCoach", Coach.class);

        // Not using the interface so we have access to our getter methods
        BoardGameCoach theCoach = context.getBean("boardGameCoach", BoardGameCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // Call the daily fortune
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        // close container
        context.close();
    }
}
