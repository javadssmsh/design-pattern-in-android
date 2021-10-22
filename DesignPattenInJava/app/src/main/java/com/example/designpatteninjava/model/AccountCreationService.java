package com.example.designpatteninjava.model;

public class AccountCreationService {
    private int ID;
    private String name;
    private String email;
    private Long amount;

    public AccountCreationService(int ID, String name, String email, Long amount){
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public void createAccount(){
        System.out.println("Account has been created");
    }
}
