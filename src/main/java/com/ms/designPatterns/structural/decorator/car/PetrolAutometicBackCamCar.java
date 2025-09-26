package com.ms.designPatterns.structural.decorator.car;

public class PetrolAutometicBackCamCar extends CarWithFeatures{

    BaseCar baseCar;

    public PetrolAutometicBackCamCar(BaseCar baseCar) {
        this.baseCar = baseCar;
    }


    @Override
    double cost() {
        return baseCar.cost()+ 200;
    }
}
