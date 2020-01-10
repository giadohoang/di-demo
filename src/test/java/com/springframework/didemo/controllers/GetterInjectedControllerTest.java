package com.springframework.didemo.controllers;

import services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Controller
public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}
