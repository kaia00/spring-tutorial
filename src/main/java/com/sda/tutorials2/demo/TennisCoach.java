package com.sda.tutorials2.demo;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Tennis coach";
    }
}
