package com.ms.designPatterns.behavioral.command.tv;

public class TV {

    private boolean on;

    public void turnOnTV(){
        this.on=true;
        System.out.println("TV turned ON");
    }

    public void turnOffTV(){
        this.on=false;
        System.out.println("TV turned OFF");
    }

}
