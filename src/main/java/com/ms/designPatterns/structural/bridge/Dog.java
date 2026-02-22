package com.ms.designPatterns.structural.bridge;

public class Dog extends LivingThings{

    public Dog(String name, BreatingImplementor breatingImplementor) {
        super.name= name;
        super.breatingImplementor=breatingImplementor;
    }
}
