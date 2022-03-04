package com.ahojo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// This is the annotation, so we don't have to make a bean in the context.xml
//@Component("thatEsportCoach")

// Because we didn't pass a name, the beanid is now esportCoach, note the lowercase first letter
@Component
//@Scope("prototype")
public class EsportCoach implements Coach{

    @Autowired
    @Qualifier("randomeFortuneService") // Only need this if multiple classes implement the FortuneService interface
    private FortuneService fortuneService;

    // Define a default constructor
    public EsportCoach() {
        System.out.println("EsportCoach >> inside the default Constructor");
    }
    // Finds a class that implements the FortuneService interface
//    @Autowired
//    public EsportCoach(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }@Autowired
//    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
//
//        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
//
//        fortuneService = theFortuneService;
//    }
    // define a setter method
//    @Autowired
//    public void setFortuneService(FortuneService theFortuneService) {
//        System.out.println(">> inside setFortuneSever setter--");
//        fortuneService = theFortuneService;
//
//    }
//    @Autowired
//    public void doSomeCrazySetting(FortuneService theFortuneService) {
//        System.out.println(">> inside doSomeCrazySetting setter--");
//        fortuneService = theFortuneService;
//
//    }
    @Override
    public String getDailyWorkout() {
        return "Play league of legends";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // Define an init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> EsportCoach: inside the init method doMyStartupStuff");
    }
    // define a destroy method
    @PreDestroy
    public void doMyDestroyStuff(){
        System.out.println(">> EsportCoach: inside the destroy method doMyDestroyStuff");
    }
}
