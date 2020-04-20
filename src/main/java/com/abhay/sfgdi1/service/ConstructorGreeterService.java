package com.abhay.sfgdi1.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
public class ConstructorGreeterService implements GreeterService{
    @Override
    public String greeting() {
        return "Hello World - Constructor / PRIMARY";
    }
}
