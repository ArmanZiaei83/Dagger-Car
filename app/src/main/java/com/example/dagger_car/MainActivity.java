package com.example.dagger_car;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger_car.Dagger.CarComponent;
import com.example.dagger_car.Dagger.DaggerCarComponent;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity {

    @Inject Car car;
    CarComponent component;

//    Normal Injection:
//    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Normal Injection:
        component = DaggerCarComponent.create();

        component.inject(this);
        car.drive();
//        car = component.getCar();
//        car.drive();
    }
}