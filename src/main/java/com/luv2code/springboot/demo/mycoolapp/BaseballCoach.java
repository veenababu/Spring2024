package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//each time object is created when bean is injected
public class BaseballCoach implements Coach{

  public BaseballCoach() {System.out.println("In Constructor:"+getClass().getSimpleName());}

    @Override
    public String getEverydayWorkout() {
        return "run for life";
    }
}
