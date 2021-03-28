package com.example.dagger_car;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private Engine engine;
    private Chair chair;

    @Inject
    public Car(Engine engine, Chair chair) {
        this.engine = engine;
        this.chair = chair;
    }

    public void drive(){
        System.out.println("Driving . . . ");
    }
}
