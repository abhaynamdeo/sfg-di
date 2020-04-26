package com.abhay.sfgdi1;

import com.abhay.sfgdi1.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDi1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDi1Application.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		I18NController i18NController = (I18NController) ctx.getBean("i18NController");

		JokesController jokesController = (JokesController) ctx.getBean("jokesController");

		System.out.println("----------- JOKE");
		System.out.println(jokesController.getJoke());

		System.out.println("----------- PROFILE");
		System.out.println(i18NController.sayHello());

		System.out.println("------------ PRIMARY");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("------- Property Injection");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.sayHello());

		System.out.println("------- Setter Injection");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.sayHello());

		System.out.println("------- Constructor Injection");

		ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");

		System.out.println(contructorInjectedController.sayHello());

	}



}
