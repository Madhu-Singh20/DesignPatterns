package com.ms.designPatterns.structural.flyWeight.robot;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    public static Map<String, IRobot> robotMap=new HashMap<>();

    public static IRobot createRobot(String type){

        if(robotMap.containsKey(type)){
            return robotMap.get(type);
        }else {
            if(type.equals("human")){
                Sprites humanSprite=new Sprites();
                HumanoidRobot humanoidRobot=new HumanoidRobot(type,humanSprite );
                robotMap.put("human", humanoidRobot);
                return humanoidRobot;
            } else if (type.equals("dog")) {
                Sprites dogSprite=new Sprites();
                HumanoidRobot dogRobot=new HumanoidRobot(type,dogSprite );
                robotMap.put("dog", dogRobot);
                return dogRobot;
            }
        }
        return null;
    }
}
