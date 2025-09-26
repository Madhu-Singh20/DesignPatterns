package com.ms.designPatterns.structural.decorator.car;

public class decoratorEngine {

    public static void main(String[] args){
        PetrolAutometicCar petrolAutometicCar=new PetrolAutometicCar(new PetrolCar());
        System.out.println("Petrol automatic car price : "+ petrolAutometicCar.cost());

        PetrolAutometicBackCamCar petrolAutometicBackCamCar=new PetrolAutometicBackCamCar(new PetrolAutometicCar(new PetrolCar()));
        System.out.println("Petrol automatic car price : "+petrolAutometicBackCamCar.cost());
    }
}
