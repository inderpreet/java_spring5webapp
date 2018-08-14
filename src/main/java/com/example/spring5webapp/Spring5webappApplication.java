package com.example.spring5webapp;

import com.example.spring5webapp.controllers.DependencyInjectionController;
import com.example.spring5webapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {

		// Test App context
		String test;
		ApplicationContext ctx =  SpringApplication.run(Spring5webappApplication.class, args);

		System.out.println("\n\n\nStarted up...");
		MyController controller = (MyController) ctx.getBean("myController");
		test = controller.hello();
		System.out.println("\nTesting Bean Context:");
		System.out.println(test);

		// Test Dependency Injection in Springboot
		System.out.println("\n\nTesting Dependency Injection:");
		DependencyInjectionController diController = (DependencyInjectionController) ctx.getBean("dependencyInjectionController");
		System.out.println(diController.sayHello());

		System.out.println("\n\n***********  Test Ends ************\n");
	}
}
