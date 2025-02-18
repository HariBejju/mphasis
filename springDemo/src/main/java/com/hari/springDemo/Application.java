package com.hari.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hari.springDemo.Car;
import com.hari.springDemo.Engine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        // Load Spring Configuration File
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Get Car Bean from Spring Container
        Car myCar = (Car) context.getBean("car");

        // Call the method to show details
        myCar.showCarDetails();

        // Close context
        
    }

}
