package com.project.springcoredemo.rest;

import com.project.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach myCoach2;

    @Autowired
    public DemoController(@Qualifier("trackCoach") Coach coach,
                          @Qualifier("trackCoach") Coach coach2) {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
        myCoach = coach;
        myCoach2 = coach2;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/checkbeanscope")
    public String checkBeanScope() {
        return "Comparing beans: coach == coach2, " + (myCoach == myCoach2);
    }
}
