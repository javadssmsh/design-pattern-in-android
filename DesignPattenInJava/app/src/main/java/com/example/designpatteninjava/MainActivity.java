package com.example.designpatteninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatteninjava.model.Computer;
import com.example.designpatteninjava.model.ComputerFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //In the Factory pattern, we create an object without exposing the creation logic to the
        // client and the client uses the same common interface to create a new type of object.
        ComputerFactory computerFactory = new ComputerFactory();

        Computer phone = computerFactory.getComputer("Phone");
        phone.compute();

        Computer laptop = computerFactory.getComputer("Laptop");
        laptop.compute();

        Computer smartTV = computerFactory.getComputer("SmartTV");
        smartTV.compute();

    }
}