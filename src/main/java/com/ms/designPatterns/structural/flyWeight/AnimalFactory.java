package com.ms.designPatterns.structural.flyWeight;

import java.util.HashMap;

public class AnimalFactory {

    private static final HashMap<String,Animal> animalMap=new HashMap<>();

    public static Animal getCat(String name){
       String key=name+"-CAT";
       Animal cat=animalMap.get( key );
       if(cat!=null){
           return cat;
       }else{
           cat=new Cat();
           cat.setName( name );
           animalMap.put( name, cat);
       }
       return cat;
    }

    public static Animal getDog(String name){
        String key=name+"-DOG";
        Animal dog=animalMap.get( key );
        if(dog!=null){
            return dog;
        }else{
            dog=new Dog();
            dog.setName( name );
            animalMap.put( name, dog);
        }
        return dog;
    }

    public static Animal getCow(String name){
        String key=name+"-COW";
        Animal cow=animalMap.get( key );
        if(cow!=null){
            return cow;
        }else{
            cow=new Cow();
            cow.setName( name );
            animalMap.put( name, cow);
        }
        return cow;
    }
}
