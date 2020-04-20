package com.abhay.sfgdi1.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreeterService{

    @Override
    public String greeting() {
        return "Hello from Primary";
    }
}
