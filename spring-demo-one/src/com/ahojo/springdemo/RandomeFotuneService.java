package com.ahojo.springdemo;

import java.util.Random;

public class RandomeFotuneService implements  FortuneService {
    private String[] fortunes = new String[]{"Coding is cool", "Java is ok I guess", "All coding is cool!"};

    @Override
    public String getFortune() {
        return fortunes[new Random().nextInt(fortunes.length)];
    }


}
