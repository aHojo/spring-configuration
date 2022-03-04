package com.ahojo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        // check if they are the same bean
        // Default scope for a bean is singleton - same object when creating new ones
        boolean result = (theCoach == alphaCoach);
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for thCoach: " + theCoach);
        System.out.println("\nMemory location for thCoach: " + alphaCoach + "\n");


        Coach theCoachProtoScope = context.getBean("myCoachProto", Coach.class);
        Coach alphaCoachProtoScope = context.getBean("myCoachProto", Coach.class);
        // check if they are the same bean
        // Default scope for a bean is singleton - same object when creating new ones
        boolean result_proto = (theCoachProtoScope == alphaCoachProtoScope);
        System.out.println("\nPointing to the same object: " + result_proto);
        System.out.println("\nMemory location for thCoach: " + theCoachProtoScope);
        System.out.println("\nMemory location for thCoach: " + alphaCoachProtoScope + "\n");

        // close the context
        context.close();
    }
}
