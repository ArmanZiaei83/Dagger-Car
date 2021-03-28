package com.example.dagger_car;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger_car.Dagger.CarComponent;
import com.example.dagger_car.Dagger.DaggerCarComponent;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {

    CarComponent component;
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerCarComponent.create();

        car = component.getCar();
        car.drive();
    }
}