package com.abhay.sfgdi1.controller;

import com.abhay.sfgdi1.service.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propertyGreeterService")
    public GreeterService greeterService;

    public String sayHello() {
        return greeterService.greeting();
    }
}
