package com.ms.lld.handleNullObject;

public class VehicleFactory {

    public Vehicle getVehicle(String type){
        if(type.equals("car")){
            return new Car();
        }
        return new  NullVehicle();
    }
}
