package com.example.dagger_car.Dagger;

import com.example.dagger_car.Car;

import dagger.Component;


@Component
public interface CarComponent {
    Car getCar();
}
