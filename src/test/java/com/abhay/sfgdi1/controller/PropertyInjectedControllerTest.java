package com.abhay.sfgdi1.controller;

import com.abhay.sfgdi1.service.ConstructorGreeterService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greeterService = new ConstructorGreeterService();
    }

    @Test
    void sayHello() {
        System.out.println( propertyInjectedController.sayHello());
    }
}