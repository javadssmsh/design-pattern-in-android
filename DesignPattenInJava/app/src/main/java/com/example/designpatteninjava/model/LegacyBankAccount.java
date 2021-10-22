package com.example.designpatteninjava.model;

public class LegacyBankAccount {
    private int ID;
    private String name;

    public LegacyBankAccount(int ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

}
