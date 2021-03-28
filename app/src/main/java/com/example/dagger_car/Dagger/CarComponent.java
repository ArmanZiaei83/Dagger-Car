package com.example.dagger_car.Dagger;

import com.example.dagger_car.Car;
import com.example.dagger_car.MainActivity;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
