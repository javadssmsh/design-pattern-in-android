package com.example.designpatteninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.designpatteninjava.model.OnlineStoreAccount;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "builder";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // create your builder object
        // The builder pattern is a design pattern that allows for the step-by-step creation of
        // complex objects using the correct sequence of actions. The construction is controlled
        // by a director object that only needs to know the type of object it is to create.
        OnlineStoreAccount javadShirkhani = new OnlineStoreAccount.Builder(1L)
                .withName("javad")
                .withAddress("tehran center")
                .withBudget(100L)
                .withDiscount(2L)
                .build();

        Log.d(TAG, " javad shirkhani name is :  " + javadShirkhani.getName());
    }
}