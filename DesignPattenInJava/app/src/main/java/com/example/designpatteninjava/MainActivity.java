package com.example.designpatteninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatteninjava.model.ObjectPool;
import com.example.designpatteninjava.model.Robot;
import com.example.designpatteninjava.model.RobotsPool;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //create object poling
        // is a software creational design pattern that uses a set of initialized objects kept
        // ready to use – a "pool" – rather than allocating and destroying them on demand.
        ObjectPool robotsPool = new RobotsPool();

        Robot firstRobot = (Robot) robotsPool.create();
        Robot secondRobot = (Robot) robotsPool.create();

        robotsPool.checkOut(firstRobot);

        Robot thirdRobot = (Robot) robotsPool.checkIn();

    }
}