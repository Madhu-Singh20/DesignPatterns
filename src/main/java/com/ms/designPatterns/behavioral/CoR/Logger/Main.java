package com.ms.designPatterns.behavioral.CoR.Logger;

public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));

        logProcessor.log("debug", "this is debug log");
        logProcessor.log("error", "this is error log");
        //logProcessor.log("info", "this is info log");
    }


}
