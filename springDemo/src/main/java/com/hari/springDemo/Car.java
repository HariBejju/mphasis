package com.hari.springDemo;

public class Car {
    private Engine engine;

    // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void showCarDetails() {
        System.out.println("Car has " + engine);
    }
}