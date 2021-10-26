package com.designpatternFactory;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType){
        Vehicle oj=null;
        if(vehicleType.equalsIgnoreCase("car"))
            oj=new Car();
        else if(vehicleType.equalsIgnoreCase("bike"))
             oj=new Bike();
        return oj;
    }
}
