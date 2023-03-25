package com.luv2code.springcoredemo.common;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach {
   @Override
    public String getDailyWorkout(){
       return "Practice fast bowling for 15 minutes :-)";
   }
}
