package com.ms.designPatterns.structural.bridge;

public class Fish extends LivingThings{

    public Fish(String name, BreatingImplementor breatingImplementor) {
        super.name=name;
        super.breatingImplementor=breatingImplementor;
    }

}
