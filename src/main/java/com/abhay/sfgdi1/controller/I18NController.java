package com.abhay.sfgdi1.controller;

import com.abhay.sfgdi1.service.GreeterService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    private final GreeterService greeterService;

    public I18NController(@Qualifier("i18nService") GreeterService greeterService) {
        this.greeterService = greeterService;
    }

    public String sayHello() {
        return greeterService.greeting();
    }
}
