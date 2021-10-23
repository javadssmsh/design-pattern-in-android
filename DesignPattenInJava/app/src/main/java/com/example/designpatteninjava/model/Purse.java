package com.example.designpatteninjava.model;

public class Purse extends Store {
    private Colour colour;

    public Purse(Colour colour){
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        System.out.println("The colour of the purse is " + colour.toString());
        return colour;
    }
}
