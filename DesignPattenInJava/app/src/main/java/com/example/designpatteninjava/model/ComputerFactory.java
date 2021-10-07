package com.example.designpatteninjava.model;

public class ComputerFactory {

    public Computer getComputer(String computerType){
        if(computerType.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        else if(computerType.equalsIgnoreCase("Phone")){
            return new Phone();
        }
        else if(computerType.equalsIgnoreCase("SmartTV")){
            return new SmartTv();
        }

        return null;
    }
}
