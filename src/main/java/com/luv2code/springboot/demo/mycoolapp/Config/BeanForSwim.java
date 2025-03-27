package com.luv2code.springboot.demo.mycoolapp.Config;

import com.luv2code.springboot.demo.mycoolapp.Coach;
import com.luv2code.springboot.demo.mycoolapp.SwimClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanForSwim {

    @Bean
    public Coach swimClass(){
        return new SwimClass();
    }
}
