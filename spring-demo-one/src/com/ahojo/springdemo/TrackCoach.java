package com.ahojo.springdemo;

public class TrackCoach implements Coach {
    FortuneService fortuneService;

    public TrackCoach(FortuneService thefortuneService) {
        fortuneService = thefortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it!";
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside init doMyStartupStuff");
    }
    // add a destroy method
    public void doMyDestroyStuff() {
        System.out.println("TrackCoach: inside init doMyDestroyStuff");
    }
}
