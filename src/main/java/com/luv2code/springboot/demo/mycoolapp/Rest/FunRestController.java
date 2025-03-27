package com.luv2code.springboot.demo.mycoolapp.Rest;

import com.luv2code.springboot.demo.mycoolapp.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
 //Define a private field for the dependency

   //field injection with autowired annotation-injection automatically set on the controller without constructor/setter
   //@Autowired
   private Coach myCoach;
   //private Coach myAnotherCoach;

//Constructor injection
    @Autowired
    //public FunRestController(@Qualifier ("baseballCoach") Coach theCouch,
      //                       @Qualifier("baseballCoach") Coach theMyAnotherCoach)

    public FunRestController(@Qualifier ("swimClass") Coach theCouch)
    {
        System.out.println("In Constructor:"+getClass().getSimpleName());
       myCoach = theCouch;
       //myAnotherCoach=theMyAnotherCoach;
    }

    /* Setter Injection
    @Autowired
    public void setCoach(Coach theCouch){
    myCoach = theCouch;
    }
     */

    @GetMapping("/dailyworkout")
    public String getEverydayWorkout()
    {
        return myCoach.getEverydayWorkout();
    }
   /* @GetMapping("/check")
    public boolean check()
    {
        return myCoach == myAnotherCoach;
    }*/












    //exposing the endpoint to get the value from the application.properties file

    @Value("${coach.name}")
    public String coachName;

    @Value("${game.name}")
    public String gameName;


    @GetMapping("/games")
    public String gamesname()
    {
        //return coachName;
        return gameName + " " +coachName;

    }
    // expose "/" endpoint for returning Hello world
    @GetMapping("/hi")

        public String SayHello()
    {
            return "Hi VeenaAlanMelina ";
    }

    @GetMapping("/workout")
    public String SayWorkout()
    {
        return "i ran hard";
    }


}
