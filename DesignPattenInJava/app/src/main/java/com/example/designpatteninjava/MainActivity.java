package com.example.designpatteninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatteninjava.model.Bag;
import com.example.designpatteninjava.model.Blue;
import com.example.designpatteninjava.model.Purse;
import com.example.designpatteninjava.model.Red;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //create object
        //The Bridge pattern is especially useful when dealing with cross-platform apps,
        // supporting multiple types of database servers or working with several API providers of
        // a certain kind (for example, cloud platforms, social networks, etc.)

        Bag redBag = new Bag(new Red());
        Bag blueBag = new Bag(new Blue());

        Purse redPurse = new Purse(new Red());
        Purse bluePurse = new Purse(new Blue());

        redBag.getColour();
        blueBag.getColour();

        redPurse.getColour();
        bluePurse.getColour();

    }
}