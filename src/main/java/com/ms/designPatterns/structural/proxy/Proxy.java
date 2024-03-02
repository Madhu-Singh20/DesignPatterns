package com.ms.designPatterns.structural.proxy;

public class Proxy extends RealSubject{

    public void method(){
        System.out.println("Hi I am proxy class");

        // authentication/security check
        System.out.println("Hi you have passed authentication and security. calling real subject");
        super.method();

    }
}
