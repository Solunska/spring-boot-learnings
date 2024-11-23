package com.project.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor: " + this.getClass().getSimpleName());
    }

    // define our init method
    @PostConstruct
    public void doMyStartup() {
        System.out.println("In doMyStartup(): " + this.getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doMyCleanup() {
        System.out.println("In doMyCleanup(): " + this.getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
