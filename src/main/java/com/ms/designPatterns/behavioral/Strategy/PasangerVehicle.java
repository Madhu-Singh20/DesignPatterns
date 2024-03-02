package com.ms.designPatterns.behavioral.Strategy;

public class PasangerVehicle extends Vehicle{

    public PasangerVehicle() {
        super( new NormalDriveStrategy() );
    }
}
