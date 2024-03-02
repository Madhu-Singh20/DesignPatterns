package com.ms.designPatterns.structural.proxy;

public class RealSubject implements Subject{

    @Override
    public void method() {
        System.out.println("Hi I am main subject class");

    }
}
