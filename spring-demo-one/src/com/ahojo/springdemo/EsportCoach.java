package com.ahojo.springdemo;

public class EsportCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Play games all day";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
