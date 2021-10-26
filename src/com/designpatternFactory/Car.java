package com.designpatternFactory;

public class Car implements Vehicle{

    @Override
    public void speed() {
        System.out.println("speed is 150 kmph");
    }

    @Override
    public void color() {
       System.out.println("color is red");
    }
}
