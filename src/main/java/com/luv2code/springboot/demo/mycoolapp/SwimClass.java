package com.luv2code.springboot.demo.mycoolapp;

public class SwimClass implements Coach{

    public SwimClass() {System.out.println("In Constructor:"+getClass().getSimpleName());}

    @Override
    public String getEverydayWorkout() {
        return "swim and go deep";
    }
}
