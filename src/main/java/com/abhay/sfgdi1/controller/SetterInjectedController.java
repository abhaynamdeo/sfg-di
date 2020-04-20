package com.abhay.sfgdi1.controller;

import com.abhay.sfgdi1.service.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreeterService greeterService;


    public GreeterService getGreeterService() {
        return greeterService;
    }

    @Autowired
    @Qualifier("setterGreeterService")
    public void setGreeterService(GreeterService greeterService) {
        this.greeterService = greeterService;
    }

    public String sayHello() {
        return greeterService.greeting();
    }
}
