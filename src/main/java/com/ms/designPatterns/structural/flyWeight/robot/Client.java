package com.ms.designPatterns.structural.flyWeight.robot;

public class Client {

    public static void main(String[] args){
        RobotFactory robotFactory=new RobotFactory();

        IRobot humanRobo1=robotFactory.createRobot("human");
        humanRobo1.display(1,1);
        IRobot humanRobo2=robotFactory.createRobot("human");
        humanRobo2.display(1,2);

        IRobot dogRobo1=robotFactory.createRobot("dog");
        dogRobo1.display(2,1);
        IRobot dogRobo2=robotFactory.createRobot("dog");
        dogRobo2.display(2,2);

    }

}
