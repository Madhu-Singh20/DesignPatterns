package com.ms.designPatterns.structural.bridge;

public class Tree extends LivingThings{

    public Tree(String name, BreatingImplementor breatingImplementor) {
        super.name=name;
        super.breatingImplementor=breatingImplementor;
    }

}
