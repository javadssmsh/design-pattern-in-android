package com.example.designpatteninjava.model;

import java.util.ArrayList;
import java.util.List;

//composite class
public class WorkManager implements Worker {
    private List<Human> humanEmployees = new ArrayList<>();
    private List<Robot> robotEmployees = new ArrayList<>();

    public void add(Worker worker){
        if(worker.getClass().getName().equalsIgnoreCase("human")){
            this.humanEmployees.add((Human) worker);
        }
        else{
            robotEmployees.add((Robot) worker);
        }
    }

    public void remove(Worker worker){
        if(worker.getClass().getName().equalsIgnoreCase("human")){
            this.humanEmployees.remove((Human) worker);
        }
        else{
            robotEmployees.remove((Robot) worker);
        }
    }

    public String toString(){
        return ("Humans workers are: " + humanEmployees + " and robot workers are: " + robotEmployees);
    }

    @Override
    public void performTask() {
        System.out.println(getClass().getName() + " performing a task!");
    }
}
