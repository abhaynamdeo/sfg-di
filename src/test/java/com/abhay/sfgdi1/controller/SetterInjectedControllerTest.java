package com.abhay.sfgdi1.controller;

import com.abhay.sfgdi1.service.ConstructorGreeterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new SetterInjectedController();

        controller.setGreeterService(new ConstructorGreeterService());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}