package com.ms.designPatterns.behavioral.ChainOfResponsibility.Logger;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super.nextLogProcessor=nextLogProcessor;
    }

    public void log(String level, String message){
        if(level.equals("info")){
            System.out.println(level+ " : "+message);
        }else{
            System.out.println("Not info log");
            super.log(level,message);
        }
    }
}
