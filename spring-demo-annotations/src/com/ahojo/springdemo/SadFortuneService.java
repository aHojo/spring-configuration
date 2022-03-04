package com.ahojo.springdemo;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today you will lose the game!";
    }
}
