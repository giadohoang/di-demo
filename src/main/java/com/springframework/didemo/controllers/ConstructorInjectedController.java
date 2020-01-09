package com.springframework.didemo.controllers;

import com.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    //Qualifier on following line find be bean that is created from ConstructorGreetingService with "lower case"
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
