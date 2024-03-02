package com.ms.designPatterns.behavioral.Strategy;

public class StrategyEngine {

    public static void main(String[] args){
        Vehicle vehicle1=new OffRoadVehicle();
        Vehicle vehicle2=new PasangerVehicle();
        Vehicle vehicle3=new SportVehicle();

        vehicle1.drive();
        vehicle2.drive();
        vehicle3.drive();

    }
}
