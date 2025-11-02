package com.ms.designPatterns.behavioral.CoR.Logger;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super.nextLogProcessor=nextLogProcessor;
    }

    public void log(String level, String message){
        if(level.equals("error")){
            System.out.println(level+ " : "+message);
        }else{
            System.out.println("Not error log");
            super.log(level,message);
        }
    }
}
