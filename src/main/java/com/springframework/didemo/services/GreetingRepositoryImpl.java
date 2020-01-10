package com.springframework.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service - new";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario - new";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo - Hauptgrußdienst - new";
    }
}
