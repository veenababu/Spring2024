package com.luv2code.springboot.demo.mycoolapp;


import org.springframework.stereotype.Component;

@Component
public class CricketClass implements Coach {

    @Override
    public String getEverydayWorkout() {
        return "run 10k steps";
    }
}
