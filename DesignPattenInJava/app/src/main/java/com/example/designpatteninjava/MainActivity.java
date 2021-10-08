


package com.example.designpatteninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // the singleton pattern is a software design pattern that restricts the instantiation of a class to one "single" instance
        //create singleton object
        Logger logger = Logger.getInstance();
        logger.logMessageStart();
        logger.logMessageStop();

    }
}