package com.ms.designPatterns.behavioral.CoR.Logger;

public abstract class LogProcessor {

    LogProcessor nextLogProcessor;

    public void log(String level, String message){
        if(nextLogProcessor!=null){
            System.out.println("Going for next logger "+ nextLogProcessor.getClass().getName());
            nextLogProcessor.log(level,message);
        }
    }
}
