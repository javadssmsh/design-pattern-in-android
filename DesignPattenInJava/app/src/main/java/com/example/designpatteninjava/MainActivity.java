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


        //
        ComputerFactory computerFactory = new ComputerFactory();

        Computer phone = computerFactory.getComputer("Phone");
        phone.compute();

        Computer laptop = computerFactory.getComputer("Laptop");
        laptop.compute();

        Computer smartTV = computerFactory.getComputer("SmartTV");
        smartTV.compute();

    }
}