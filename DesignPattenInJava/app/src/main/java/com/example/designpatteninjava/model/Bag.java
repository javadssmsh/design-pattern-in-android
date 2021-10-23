package com.example.designpatteninjava.model;

public class Bag extends Store {
    private Colour colour;

    public Bag(Colour colour){
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        System.out.println("The colour of the bag is " + colour.toString());
        return colour;
    }
}
