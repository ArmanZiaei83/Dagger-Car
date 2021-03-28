package com.example.dagger_car;

import javax.inject.Inject;

public class Chair {

    private int numberOfChairs;
    private String size; //Like 2*5*6 meter;

    @Inject
    public Chair(int numberOfChairs, String size) {
        this.numberOfChairs = numberOfChairs;
        this.size = size;
    }
}
