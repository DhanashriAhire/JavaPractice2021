package com.designpatternFactory;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle oj=VehicleFactory.getVehicle("car");
          oj.speed();
          oj.color();

          Vehicle oj2=VehicleFactory.getVehicle("bike");
          oj2.speed();
          oj2.color();

    }
}
