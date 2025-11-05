package com.ms.lld.HandleNullObject;

public class VehicleFactory {

    public Vehicle getVehicle(String type){
        if(type.equals("car")){
            return new Car();
        }
        return new  NullVehicle();
    }
}
