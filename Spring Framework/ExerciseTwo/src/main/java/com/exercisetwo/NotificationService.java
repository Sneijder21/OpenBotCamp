package com.exercisetwo;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){
        System.out.println("Greeting by NotifacationService");
    }
    public String printGreeting(){
        return "Hi Guys OpenBotcamp, im starting to learn spring boot";
    }
}
