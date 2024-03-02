package com.ms.designPatterns.structural.flyWeight;

public class Dog implements Animal{
    private String name;

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void printAnimalAttribute() {
        System.out.println("Animal name : "+name);
        System.out.println("Eyes : "+CommonSharable.eyes);
        System.out.println("Nose : "+CommonSharable.nose);
        System.out.println("legs : "+CommonSharable.legs);
        System.out.println("tail : "+CommonSharable.tail);
    }
}
