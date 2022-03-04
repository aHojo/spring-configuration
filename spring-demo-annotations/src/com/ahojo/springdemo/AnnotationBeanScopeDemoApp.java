package com.ahojo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        // load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        Coach theCoach = context.getBean("esportCoach", Coach.class);
        Coach theCoachSecond = context.getBean("esportCoach", Coach.class);
        //'

        boolean result = (theCoach == theCoachSecond);

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for theCoach: " + theCoach);
        System.out.println("\nMemory location for theCoachSecond: " + theCoachSecond);
    }
}

