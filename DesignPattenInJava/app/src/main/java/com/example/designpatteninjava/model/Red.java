package com.example.designpatteninjava.model;

public class Red implements Colour {
    @Override
    public String toString() {
        return getClass().getName().toLowerCase();
    }
}
