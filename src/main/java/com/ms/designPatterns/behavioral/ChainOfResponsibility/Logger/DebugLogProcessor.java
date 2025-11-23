package com.ms.designPatterns.behavioral.ChainOfResponsibility.Logger;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super.nextLogProcessor=nextLogProcessor;
    }

    public void log(String level, String message){
        if(level.equals("debug")){
            System.out.println(level+ " : "+message);
        }else{
            System.out.println("Not debug log");
            super.log(level,message);
        }
    }
}
