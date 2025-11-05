package com.ms.lld.HandleNullObject;

public class Main {

    public static void main(String[] args){
        VehicleFactory vehicleFactory=new VehicleFactory();
        Vehicle vehicle= vehicleFactory.getVehicle("bike");

        // no need to add null check here
        System.out.println("Vehicle seating capacity : "+ vehicle.getSeatingCapacity());
        System.out.println("Vehicle tank capacity : "+ vehicle.getTankCapacity());
    }

}
