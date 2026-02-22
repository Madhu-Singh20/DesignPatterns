package com.ms.designPatterns.structural.bridge;

public class TreeBreathingImplementor implements BreatingImplementor{

    @Override
    public void breath() {
        System.out.println("Breath through leafs");
    }

}
