package com.ahojo.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomeFortuneService implements  FortuneService {

    private final String[] data = {
            "Win the game",
            "lose the game",
            "the game was a tie"
    };

    // create a random number generator
    private final Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        return data[index];
    }
}
