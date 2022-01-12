package com.example.designpatteninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.designpatteninjava.model.Blue;
import com.example.designpatteninjava.model.BlueFilter;
import com.example.designpatteninjava.model.Filter;
import com.example.designpatteninjava.model.Purse;
import com.example.designpatteninjava.model.Red;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Purse redPurse = new Purse(new Red());
        Purse bluePurse = new Purse(new Blue());
        Purse anotherBluePurse = new Purse(new Blue());
        Purse yetAnotherBluePurse = new Purse(new Blue());

        List<Purse> purses = new ArrayList<>();
        purses.add(redPurse);
        purses.add(bluePurse);
        purses.add(anotherBluePurse);
        purses.add(yetAnotherBluePurse);

        Filter blueFilter = new BlueFilter();

        List<Purse> bluePurses = blueFilter.meetFilter(purses);
        for(Purse purse : bluePurses){
            System.out.println("The purse from this list is: " + purse.getColour().getClass().getName().toLowerCase());
            Log.d("javad_shirkhani", "The purse from this list is: " + purse.getColour().getClass().getName().toLowerCase());
        }

    }
}