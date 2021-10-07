package com.example.designpatteninjava.model;

public class Laptop implements Computer {
    @Override
    public void compute() {
        System.out.println("Laptop computes");
    }
}
