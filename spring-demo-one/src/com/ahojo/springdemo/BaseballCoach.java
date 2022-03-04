package com.ahojo.springdemo;

public class BaseballCoach implements Coach{

    // define a private field
    private final FortuneService fortuneService;
    // get constructor
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {

        // use fortune service to get a fortune
        return fortuneService.getFortune();
    }
}
