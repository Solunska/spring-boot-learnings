package com.project.springcoredemo.common;

import org.springframework.stereotype.Component;

// The Component annotation marks the class as a Spring bean and makes it available for Dependency Injection
@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
