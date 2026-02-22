package com.ms.designPatterns.structural.bridge;

public class LandBreatingImplementor implements BreatingImplementor{

    @Override
    public void breath() {
        System.out.println("Breath through lungs");
    }

}
