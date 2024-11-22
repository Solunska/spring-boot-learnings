package com.project.springcoredemo;

import org.springframework.stereotype.Component;

// The Component annotation marks the class as a Spring bean and makes it available for Dependency Injection
@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
