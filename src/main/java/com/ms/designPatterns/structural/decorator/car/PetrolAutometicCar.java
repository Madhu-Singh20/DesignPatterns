package com.ms.designPatterns.structural.decorator.car;

public class PetrolAutometicCar extends CarWithFeatures{

    private BaseCar baseCar;

    public PetrolAutometicCar(BaseCar baseCar) {
        this.baseCar = baseCar;
    }

    @Override
    double cost() {
        return baseCar.cost()+100;
    }
}
