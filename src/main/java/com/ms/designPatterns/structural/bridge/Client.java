package com.ms.designPatterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class Client {

     public static void main(String[] args){

         List<LivingThings> livingThingsList=new ArrayList<>();

         LivingThings dog=new Dog("Dog", new LandBreatingImplementor());
         LivingThings fish=new Dog("Fish", new WaterBreathingImplementor());
         LivingThings bananaTree=new Dog("Banana Tree", new TreeBreathingImplementor());
         livingThingsList.add(dog);
         livingThingsList.add(fish);
         livingThingsList.add(bananaTree);

         livingThingsList.forEach( livingThings -> {
             System.out.println("I am : "+ livingThings.name);
             livingThings.breatingImplementor.breath();
         });


     }
}
