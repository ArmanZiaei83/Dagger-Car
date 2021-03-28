package com.example.dagger_car;

import javax.inject.Inject;

public class Engine {

    private String speed;
    private String cylinders;
    private String brand;

    @Inject
    public Engine(String speed, String cylinders, String brand) {
        this.speed = speed;
        this.cylinders = cylinders;
        this.brand = brand;
    }
}
