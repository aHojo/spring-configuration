package com.ahojo.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
//        Coach theCoach = context.getBean("thatEsportCoach", Coach.class);
        Coach theCoach = context.getBean("esportCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // Call the daily fortune
        System.out.println(theCoach.getDailyFortune());

        // close container
        context.close();
    }
}
