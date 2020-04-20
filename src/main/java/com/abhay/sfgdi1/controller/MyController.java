package com.abhay.sfgdi1.controller;

import com.abhay.sfgdi1.service.GreeterService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreeterService greeterService;

    public MyController(GreeterService greeterService) {
        this.greeterService = greeterService;
    }

    public String sayHello() {
        return greeterService.greeting();
    }
}
