package com.ms.designPatterns.behavioral.Strategy.drivingStrategy;

public class PasangerVehicle extends Vehicle{

    public PasangerVehicle() {
        super( new NormalDriveStrategy() );
    }
}
