package com.abhay.sfgdi1.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreeterService implements GreeterService{
    @Override
    public String greeting() {
        return "Hello World - Property";
    }
}
