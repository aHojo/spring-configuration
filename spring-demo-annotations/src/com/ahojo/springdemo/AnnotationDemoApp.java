package com.ahojo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

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
