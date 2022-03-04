package com.ahojo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from the spring container


        Coach theCoachProtoScope = context.getBean("myCoachProto", Coach.class);

        System.out.println(theCoachProtoScope.getDailyWorkout());
        // close the context
        context.close();
    }
}
