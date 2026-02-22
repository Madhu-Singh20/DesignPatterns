package com.ms.designPatterns.structural.bridge;

public class WaterBreathingImplementor implements BreatingImplementor{

    @Override
    public void breath() {
        System.out.println("Breath through fings");
    }

}
