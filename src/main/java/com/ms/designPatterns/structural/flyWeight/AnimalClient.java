package com.ms.designPatterns.structural.flyWeight;

public class AnimalClient {

    public static void main(String[] args){
        Animal cat=AnimalFactory.getCat( "misti" );
        cat.printAnimalAttribute();

        Animal dog=AnimalFactory.getCat( "bruno" );
        cat.printAnimalAttribute();

        Animal cow=AnimalFactory.getCat( "radha" );
        cat.printAnimalAttribute();

    }
}
