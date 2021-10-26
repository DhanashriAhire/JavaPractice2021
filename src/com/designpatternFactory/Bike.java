package com.designpatternFactory;

public class Bike implements Vehicle {

    @Override
    public void speed() {
        System.out.println("speed is 200 kmh");
    }

    @Override
    public void color() {
     System.out.println("color is white");
    }
}
