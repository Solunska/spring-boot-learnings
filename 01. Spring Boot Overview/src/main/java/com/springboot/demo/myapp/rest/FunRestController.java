package com.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${student.name}")
    private String name;

    @Value("${student.surname}")
    private String surname;

    // expose "/" endpoint that will return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "This is a workout";
    }

    @GetMapping("/studentInfo")
    public String getTeamInfo() {
        return "Name: " + name + " " + surname;
    }
}
