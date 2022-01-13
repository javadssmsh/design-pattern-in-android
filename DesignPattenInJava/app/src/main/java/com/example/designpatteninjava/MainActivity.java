package com.example.designpatteninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designpatteninjava.model.Human;
import com.example.designpatteninjava.model.Robot;
import com.example.designpatteninjava.model.WorkManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //composite design pattern
        //It allows you to have a tree structure and ask each node in the tree structure to perform a task

        Human human = new Human();
        human.setName("John");
        human.setDepartment("HR");

        Robot robot = new Robot();
        robot.setName("R2D2");
        robot.setDepartment("Manufacturing");

        WorkManager workManager = new WorkManager();
        workManager.add(human);
        workManager.add(robot);
        System.out.println(workManager);
    }
}